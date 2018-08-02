package com.wsw.management.utils;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExcelGenerator {

    public static String getLastMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        return sdf.format(m);
    }


    public static void generateExcel(List beanList, String name) {
        Map map = ProxyXML.proxyDocument(name);
        // 创建HSSFWorkbook对象(excel的文档对象)
        HSSFWorkbook wb = new HSSFWorkbook();
        // 建立新的sheet对象（excel的表单）
        String sheetName = (String) map.get("sheetName");
        HSSFSheet sheet = wb.createSheet(sheetName);
        HSSFRow row = sheet.createRow(0);

        //获取集合的长度,用来对应行数
        int listLength = beanList.size();
        //获取所对应的类
        String classPath = (String) map.get("classPath");
        Class clazz = null;
        try {
            clazz = Class.forName(classPath);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //循环生成每一行
        for (int k = 0; k < listLength; k++) {
            int i = 0;
            Object o = beanList.get(k);
            //在sheet里创建每一行
            HSSFRow row1 = sheet.createRow(1 + k);
            Map columns = (Map) map.get("columns");
            //设置表头
            Field[] fields = clazz.getDeclaredFields();
            for (Field f : fields) {
                // 创建单元格并设置单元格内容
                row.createCell(i).setCellValue(columns.get(f.getName()).toString());
                String methodName = "get" + f.getName().substring(0, 1).toUpperCase()
                        + f.getName().substring(1);
                Method m;
                try {
                    m = clazz.getMethod(methodName);
                    Object obj = m.invoke(o);
                    String value = null;
                    if (obj != null)
                        value = obj.toString();
                    row1.createCell(i).setCellValue(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i++;
            }
        }


        try {
            String fileName = sheetName + getLastMonth();
            String filePath = "./doc/" + fileName + ".xls";
            File file = new File(filePath);
            if (!file.exists()) {
                //先得到文件的上级目录，并创建上级目录，再创建文件
                file.getParentFile().mkdir();
                try {
                    //创建文件
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            FileOutputStream fos = new FileOutputStream(file);
            wb.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

package com.wsw.management.utils;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxyXML {
    private static Document xmlDoc;

    static {
        SAXReader reader = new SAXReader();
        try {
            File file = ResourceUtils.getFile("classpath:document.xml");
            xmlDoc = reader.read(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static  Map proxyDocument(String name){
        Map map = new HashMap();
        String nodesPath = "//document/class[@name= '" + name + "']";
        //获取该class节点对应element
        Element element= (Element) xmlDoc.selectSingleNode(nodesPath);
        //获取表名,存入map中
        String sheetName=element.attributeValue("sheetName");
        map.put("sheetName",sheetName);
        //获取类路径,存入map中
        String classPath=element.attributeValue("path");
        map.put("classPath",classPath);
        //获取所有property子节点
        List<Element> list = xmlDoc.selectNodes(nodesPath + "/property");
        //将所有列的信息放入集合columns中，再将其放入map中
        Map columns=new HashMap();
        for (Element e : list) {
            columns.put(e.attributeValue("name"), e.getText());
        }
        map.put("columns",columns);
        return  map;
    }
}

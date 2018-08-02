import com.wsw.management.domain.VisitorBean;
import com.wsw.management.utils.ExcelGenerator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {

    @Test
    public void  test (){
        List<VisitorBean> list=new ArrayList<>();
        VisitorBean v1=new VisitorBean();
        v1.setVisitor_h_id(12);
        v1.setVisitor_id(22);
        v1.setVisitor_id_number("12");
        v1.setVisitor_id_type("身份证");
        v1.setVisitor_m_id(1);
        v1.setVisitor_name("sq");

        VisitorBean v2 = new VisitorBean();
        v2.setVisitor_h_id(14);
        v2.setVisitor_id(23);
        v2.setVisitor_id_number("11");
        v2.setVisitor_id_type("身份证");
        v2.setVisitor_m_id(1);
        v2.setVisitor_name("hhs");

        list.add(v1);
        list.add(v2);
        ExcelGenerator.generateExcel(list,"visitor");
    }



}

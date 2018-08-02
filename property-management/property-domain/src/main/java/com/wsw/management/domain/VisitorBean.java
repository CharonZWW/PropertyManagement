package com.wsw.management.domain;

import java.sql.Timestamp;


public class VisitorBean {
    private int visitor_id;
    private int visitor_h_id;
    private int visitor_m_id;
    private Timestamp visitor_record_time;
    private String visitor_name;
    private String visitor_id_type;
    private String visitor_id_number;

    public int getVisitor_id() {
        return visitor_id;
    }

    public void setVisitor_id(int visitor_id) {
        this.visitor_id = visitor_id;
    }

    public int getVisitor_h_id() {
        return visitor_h_id;
    }

    public void setVisitor_h_id(int visitor_h_id) {
        this.visitor_h_id = visitor_h_id;
    }

    public int getVisitor_m_id() {
        return visitor_m_id;
    }

    public void setVisitor_m_id(int visitor_m_id) {
        this.visitor_m_id = visitor_m_id;
    }

    public Timestamp getVisitor_record_time() {
        return visitor_record_time;
    }

    public void setVisitor_record_time(Timestamp visitor_record_time) {
        this.visitor_record_time = visitor_record_time;
    }

    public String getVisitor_name() {
        return visitor_name;
    }

    public void setVisitor_name(String visitor_name) {
        this.visitor_name = visitor_name;
    }

    public String getVisitor_id_type() {
        return visitor_id_type;
    }

    public void setVisitor_id_type(String visitor_id_type) {
        this.visitor_id_type = visitor_id_type;
    }

    public String getVisitor_id_number() {
        return visitor_id_number;
    }

    public void setVisitor_id_number(String visitor_id_number) {
        this.visitor_id_number = visitor_id_number;
    }

    @Override
    public String toString() {
        return "VisitorBean{" +
                "visitor_id=" + visitor_id +
                ", visitor_h_id=" + visitor_h_id +
                ", visitor_m_id=" + visitor_m_id +
                ", visitor_record_time=" + visitor_record_time +
                ", visitor_name='" + visitor_name + '\'' +
                ", visitor_id_type='" + visitor_id_type + '\'' +
                ", visitor_id_number='" + visitor_id_number + '\'' +
                '}';
    }
}

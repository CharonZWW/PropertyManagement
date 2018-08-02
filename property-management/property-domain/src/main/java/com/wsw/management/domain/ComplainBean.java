package com.wsw.management.domain;

import java.sql.Timestamp;


public class ComplainBean {
    private int comlain_id;
    private int complain_a_id;
    private int complain_m_id;
    private String complain_content;
    private Timestamp complain_id;
    private String complain_status;


    public int getComlain_id() {
        return comlain_id;
    }

    public void setComlain_id(int comlain_id) {
        this.comlain_id = comlain_id;
    }

    public int getComplain_a_id() {
        return complain_a_id;
    }

    public void setComplain_a_id(int complain_a_id) {
        this.complain_a_id = complain_a_id;
    }

    public int getComplain_m_id() {
        return complain_m_id;
    }

    public void setComplain_m_id(int complain_m_id) {
        this.complain_m_id = complain_m_id;
    }

    public String getComplain_content() {
        return complain_content;
    }

    public void setComplain_content(String complain_content) {
        this.complain_content = complain_content;
    }

    public Timestamp getComplain_id() {
        return complain_id;
    }

    public void setComplain_id(Timestamp complain_id) {
        this.complain_id = complain_id;
    }

    public String getComplain_status() {
        return complain_status;
    }

    public void setComplain_status(String complain_status) {
        this.complain_status = complain_status;
    }


    @Override
    public String toString() {
        return "ComplainBean{" +
                "comlain_id=" + comlain_id +
                ", complain_a_id=" + complain_a_id +
                ", complain_m_id=" + complain_m_id +
                ", complain_content='" + complain_content + '\'' +
                ", complain_id=" + complain_id +
                ", complain_status='" + complain_status + '\'' +
                '}';
    }
}

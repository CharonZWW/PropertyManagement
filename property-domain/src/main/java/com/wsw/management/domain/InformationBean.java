package com.wsw.management.domain;

public class InformationBean {
    
    private int info_id;
    private int info_a_id;
    private int info_m_id;
    private String info_type;
    private String info_content;


    public int getInfo_id() {
        return info_id;
    }

    public void setInfo_id(int info_id) {
        this.info_id = info_id;
    }

    public int getInfo_a_id() {
        return info_a_id;
    }

    public void setInfo_a_id(int info_a_id) {
        this.info_a_id = info_a_id;
    }

    public int getInfo_m_id() {
        return info_m_id;
    }

    public void setInfo_m_id(int info_m_id) {
        this.info_m_id = info_m_id;
    }

    public String getInfo_type() {
        return info_type;
    }

    public void setInfo_type(String info_type) {
        this.info_type = info_type;
    }

    public String getInfo_content() {
        return info_content;
    }

    public void setInfo_content(String info_content) {
        this.info_content = info_content;
    }

    @Override
    public String toString() {
        return "InformationBean{" +
                "info_id=" + info_id +
                ", info_a_id=" + info_a_id +
                ", info_m_id=" + info_m_id +
                ", info_type='" + info_type + '\'' +
                ", info_content='" + info_content + '\'' +
                '}';
    }
}

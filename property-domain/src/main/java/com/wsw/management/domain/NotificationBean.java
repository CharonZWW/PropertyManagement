package com.wsw.management.domain;

import java.sql.Timestamp;


public class NotificationBean {
    private int noti_id;
    private int noti_m_id;
    private String noti_type;
    private String noti_content;
    private Timestamp noti_time;


    public int getNoti_id() {
        return noti_id;
    }

    public void setNoti_id(int noti_id) {
        this.noti_id = noti_id;
    }

    public int getNoti_m_id() {
        return noti_m_id;
    }

    public void setNoti_m_id(int noti_m_id) {
        this.noti_m_id = noti_m_id;
    }

    public String getNoti_type() {
        return noti_type;
    }

    public void setNoti_type(String noti_type) {
        this.noti_type = noti_type;
    }

    public String getNoti_content() {
        return noti_content;
    }

    public void setNoti_content(String noti_content) {
        this.noti_content = noti_content;
    }

    public Timestamp getNoti_time() {
        return noti_time;
    }

    public void setNoti_time(Timestamp noti_time) {
        this.noti_time = noti_time;
    }

    @Override
    public String toString() {
        return "NotificationBean{" +
                "noti_id=" + noti_id +
                ", noti_m_id=" + noti_m_id +
                ", noti_type='" + noti_type + '\'' +
                ", noti_content='" + noti_content + '\'' +
                ", noti_time=" + noti_time +
                '}';
    }
}

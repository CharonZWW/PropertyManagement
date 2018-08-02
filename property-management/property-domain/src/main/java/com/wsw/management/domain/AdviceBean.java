package com.wsw.management.domain;


import java.sql.Timestamp;


public class AdviceBean {
    private int advice_id;
    private int advice_a_id;
    private String advice_content;
    private Timestamp advice_time;

    public int getAdvice_id() {
        return advice_id;
    }

    public void setAdvice_id(int advice_id) {
        this.advice_id = advice_id;
    }

    public int getAdvice_a_id() {
        return advice_a_id;
    }

    public void setAdvice_a_id(int advice_a_id) {
        this.advice_a_id = advice_a_id;
    }

    public String getAdvice_content() {
        return advice_content;
    }

    public void setAdvice_content(String advice_content) {
        this.advice_content = advice_content;
    }

    public Timestamp getAdvice_time() {
        return advice_time;
    }

    public void setAdvice_time(Timestamp advice_time) {
        this.advice_time = advice_time;
    }
}

package com.wsw.management.domain;

import java.sql.Timestamp;

public class WaterFeePaymentBean {
    private int wf_id;
    private int wf_h_id;
    private double wf_amount;
    private Timestamp wf_time;

    public int getWf_id() {
        return wf_id;
    }

    public void setWf_id(int wf_id) {
        this.wf_id = wf_id;
    }

    public int getWf_h_id() {
        return wf_h_id;
    }

    public void setWf_h_id(int wf_h_id) {
        this.wf_h_id = wf_h_id;
    }

    public double getWf_amount() {
        return wf_amount;
    }

    public void setWf_amount(double wf_amount) {
        this.wf_amount = wf_amount;
    }

    public Timestamp getWf_time() {
        return wf_time;
    }

    public void setWf_time(Timestamp wf_time) {
        this.wf_time = wf_time;
    }

    @Override
    public String toString() {
        return "WaterFeePaymentBean{" +
                "wf_id=" + wf_id +
                ", wf_h_id=" + wf_h_id +
                ", wf_amount=" + wf_amount +
                ", wf_time=" + wf_time +
                '}';
    }
}

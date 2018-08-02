package com.wsw.management.domain;

import java.sql.Timestamp;


public class GarageManageFeePaymentBean {
    private int gmfp_id;
    private int gmfp_garage_number;
    private int gmfp_month;
    private Timestamp gmfp_time;
    private double gmfp_amount;


    public int getGmfp_id() {
        return gmfp_id;
    }

    public void setGmfp_id(int gmfp_id) {
        this.gmfp_id = gmfp_id;
    }

    public int getGmfp_garage_number() {
        return gmfp_garage_number;
    }

    public void setGmfp_garage_number(int gmfp_garage_number) {
        this.gmfp_garage_number = gmfp_garage_number;
    }

    public int getGmfp_month() {
        return gmfp_month;
    }

    public void setGmfp_month(int gmfp_month) {
        this.gmfp_month = gmfp_month;
    }

    public Timestamp getGmfp_time() {
        return gmfp_time;
    }

    public void setGmfp_time(Timestamp gmfp_time) {
        this.gmfp_time = gmfp_time;
    }

    public double getGmfp_amount() {
        return gmfp_amount;
    }

    public void setGmfp_amount(double gmfp_amount) {
        this.gmfp_amount = gmfp_amount;
    }

    @Override
    public String toString() {
        return "GarageManageFeePaymentBean{" +
                "gmfp_id=" + gmfp_id +
                ", gmfp_garage_number=" + gmfp_garage_number +
                ", gmfp_month=" + gmfp_month +
                ", gmfp_time=" + gmfp_time +
                ", gmfp_amount=" + gmfp_amount +
                '}';
    }
}

package com.wsw.management.domain;


import java.sql.Date;



public class GarageBean {
    private int garage_number;
    private int garage_h_id;
    private String garage_status;
    private Date garage_manageFeeExpireDate;

    public int getGarage_number() {
        return garage_number;
    }

    public void setGarage_number(int garage_number) {
        this.garage_number = garage_number;
    }

    public int getGarage_h_id() {
        return garage_h_id;
    }

    public void setGarage_h_id(int garage_h_id) {
        this.garage_h_id = garage_h_id;
    }

    public String getGarage_status() {
        return garage_status;
    }

    public void setGarage_status(String garage_status) {
        this.garage_status = garage_status;
    }

    public Date getGarage_manageFeeExpireDate() {
        return garage_manageFeeExpireDate;
    }

    public void setGarage_manageFeeExpireDate(Date garage_manageFeeExpireDate) {
        this.garage_manageFeeExpireDate = garage_manageFeeExpireDate;
    }

    @Override
    public String toString() {
        return "GarageBean{" +
                "garage_number=" + garage_number +
                ", garage_h_id=" + garage_h_id +
                ", garage_status='" + garage_status + '\'' +
                ", garage_manageFeeExpireDate=" + garage_manageFeeExpireDate +
                '}';
    }
}

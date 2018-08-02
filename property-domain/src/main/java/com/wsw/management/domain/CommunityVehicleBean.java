package com.wsw.management.domain;


import java.sql.Date;



public class CommunityVehicleBean {

    private String cv_plateNumber;
    private int cv_garage_number;
    private Date cv_expireDate;

    public String getCv_plateNumber() {
        return cv_plateNumber;
    }

    public void setCv_plateNumber(String cv_plateNumber) {
        this.cv_plateNumber = cv_plateNumber;
    }

    public int getCv_garage_number() {
        return cv_garage_number;
    }

    public void setCv_garage_number(int cv_garage_number) {
        this.cv_garage_number = cv_garage_number;
    }

    public Date getCv_expireDate() {
        return cv_expireDate;
    }

    public void setCv_expireDate(Date cv_expireDate) {
        this.cv_expireDate = cv_expireDate;
    }

    @Override
    public String toString() {
        return "CommunityVehicleBean{" +
                "cv_plateNumber='" + cv_plateNumber + '\'' +
                ", cv_garage_number=" + cv_garage_number +
                ", cv_expireDate=" + cv_expireDate +
                '}';
    }
}

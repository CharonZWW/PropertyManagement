package com.wsw.management.domain;

import java.sql.Date;


public class HouseBean {
    private int h_id;
    private int h_buildingNumber;
    private int h_unitNumber;
    private String h_roomNumber;
    private String h_holderName;
    private String h_contactNumber;
    private double h_area;
    private Double h_waterFee;
    private Date h_propertyFeeExpirationDate;

    public int getH_id() {
        return h_id;
    }

    public void setH_id(int h_id) {
        this.h_id = h_id;
    }

    public int getH_buildingNumber() {
        return h_buildingNumber;
    }

    public void setH_buildingNumber(int h_buildingNumber) {
        this.h_buildingNumber = h_buildingNumber;
    }

    public int getH_unitNumber() {
        return h_unitNumber;
    }

    public void setH_unitNumber(int h_unitNumber) {
        this.h_unitNumber = h_unitNumber;
    }

    public String getH_roomNumber() {
        return h_roomNumber;
    }

    public void setH_roomNumber(String h_roomNumber) {
        this.h_roomNumber = h_roomNumber;
    }

    public String getH_holderName() {
        return h_holderName;
    }

    public void setH_holderName(String h_holderName) {
        this.h_holderName = h_holderName;
    }

    public String getH_contactNumber() {
        return h_contactNumber;
    }

    public void setH_contactNumber(String h_contactNumber) {
        this.h_contactNumber = h_contactNumber;
    }

    public double getH_area() {
        return h_area;
    }

    public void setH_area(double h_area) {
        this.h_area = h_area;
    }

    public Double getH_waterFee() {
        return h_waterFee;
    }

    public void setH_waterFee(Double h_waterFee) {
        this.h_waterFee = h_waterFee;
    }

    public Date getH_propertyFeeExpirationDate() {
        return h_propertyFeeExpirationDate;
    }

    public void setH_propertyFeeExpirationDate(Date h_propertyFeeExpirationDate) {
        this.h_propertyFeeExpirationDate = h_propertyFeeExpirationDate;
    }

    @Override
    public String toString() {
        return "HouseBean{" +
                "h_id=" + h_id +
                ", h_buildingNumber=" + h_buildingNumber +
                ", h_unitNumber=" + h_unitNumber +
                ", h_roomNumber='" + h_roomNumber + '\'' +
                ", h_holderName='" + h_holderName + '\'' +
                ", h_contactNumber='" + h_contactNumber + '\'' +
                ", h_area=" + h_area +
                ", h_waterFee=" + h_waterFee +
                ", h_propertyFeeExpirationDate=" + h_propertyFeeExpirationDate +
                '}';
    }
}

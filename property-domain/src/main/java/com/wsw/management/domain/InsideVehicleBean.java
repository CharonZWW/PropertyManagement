package com.wsw.management.domain;

import java.sql.Timestamp;


public class InsideVehicleBean {
    private String iv_plateNumber;
    private Timestamp iv_entry_time;
    private String iv_type;

    public String getIv_plateNumber() {
        return iv_plateNumber;
    }

    public void setIv_plateNumber(String iv_plateNumber) {
        this.iv_plateNumber = iv_plateNumber;
    }

    public Timestamp getIv_entry_time() {
        return iv_entry_time;
    }

    public void setIv_entry_time(Timestamp iv_entry_time) {
        this.iv_entry_time = iv_entry_time;
    }

    public String getIv_type() {
        return iv_type;
    }

    public void setIv_type(String iv_type) {
        this.iv_type = iv_type;
    }


    @Override
    public String toString() {
        return "InsideVehicleBean{" +
                "iv_plateNumber='" + iv_plateNumber + '\'' +
                ", iv_entry_time=" + iv_entry_time +
                ", iv_type='" + iv_type + '\'' +
                '}';
    }
}

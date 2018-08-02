package com.wsw.management.domain;

import java.sql.Timestamp;


public class VehicleParkingRecordBean {
    private int vpr_id;
    private Timestamp vpr_entry_time;
    private Timestamp vpexit_time;
    private String vpr_plate_number;

    public int getVpr_id() {
        return vpr_id;
    }

    public void setVpr_id(int vpr_id) {
        this.vpr_id = vpr_id;
    }

    public Timestamp getVpr_entry_time() {
        return vpr_entry_time;
    }

    public void setVpr_entry_time(Timestamp vpr_entry_time) {
        this.vpr_entry_time = vpr_entry_time;
    }

    public Timestamp getVpexit_time() {
        return vpexit_time;
    }

    public void setVpexit_time(Timestamp vpexit_time) {
        this.vpexit_time = vpexit_time;
    }

    public String getVpr_plate_number() {
        return vpr_plate_number;
    }

    public void setVpr_plate_number(String vpr_plate_number) {
        this.vpr_plate_number = vpr_plate_number;
    }


    @Override
    public String toString() {
        return "VehicleParkingRecordBane{" +
                "vpr_id=" + vpr_id +
                ", vpr_entry_time=" + vpr_entry_time +
                ", vpexit_time=" + vpexit_time +
                ", vpr_plate_number='" + vpr_plate_number + '\'' +
                '}';
    }
}

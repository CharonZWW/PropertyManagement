package com.wsw.management.domain;

import java.sql.Timestamp;


public class TemporaryParkingFeeBean {

    private int tpf_id;
    private String tpf_plateNumber;
    private Timestamp tpf_entry_time;
    private Timestamp tpf_exit_time;
    private int tpf_fee;


    public int getTpf_id() {
        return tpf_id;
    }

    public void setTpf_id(int tpf_id) {
        this.tpf_id = tpf_id;
    }

    public String getTpf_plateNumber() {
        return tpf_plateNumber;
    }

    public void setTpf_plateNumber(String tpf_plateNumber) {
        this.tpf_plateNumber = tpf_plateNumber;
    }

    public Timestamp getTpf_entry_time() {
        return tpf_entry_time;
    }

    public void setTpf_entry_time(Timestamp tpf_entry_time) {
        this.tpf_entry_time = tpf_entry_time;
    }

    public Timestamp getTpf_exit_time() {
        return tpf_exit_time;
    }

    public void setTpf_exit_time(Timestamp tpf_exit_time) {
        this.tpf_exit_time = tpf_exit_time;
    }

    public int getTpf_fee() {
        return tpf_fee;
    }

    public void setTpf_fee(int tpf_fee) {
        this.tpf_fee = tpf_fee;
    }


    @Override
    public String toString() {
        return "TemporaryParkingFeeBean{" +
                "tpf_id=" + tpf_id +
                ", tpf_plateNumber='" + tpf_plateNumber + '\'' +
                ", tpf_entry_time=" + tpf_entry_time +
                ", tpf_exit_time=" + tpf_exit_time +
                ", tpf_fee=" + tpf_fee +
                '}';
    }
}

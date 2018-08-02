package com.wsw.management.domain;

public class ParkingMonthRentFeeBean {
    private int pmrf_id;
    private String pmrf_plateNumber;
    private int pmrf_month;
    private double pmrf_amount;

    public int getPmrf_id() {
        return pmrf_id;
    }

    public void setPmrf_id(int pmrf_id) {
        this.pmrf_id = pmrf_id;
    }

    public String getPmrf_plateNumber() {
        return pmrf_plateNumber;
    }

    public void setPmrf_plateNumber(String pmrf_plateNumber) {
        this.pmrf_plateNumber = pmrf_plateNumber;
    }

    public int getPmrf_month() {
        return pmrf_month;
    }

    public void setPmrf_month(int pmrf_month) {
        this.pmrf_month = pmrf_month;
    }

    public double getPmrf_amount() {
        return pmrf_amount;
    }

    public void setPmrf_amount(double pmrf_amount) {
        this.pmrf_amount = pmrf_amount;
    }

    @Override
    public String toString() {
        return "ParkingMonthRentFeeEntity{" +
                "pmrf_id=" + pmrf_id +
                ", pmrf_plateNumber='" + pmrf_plateNumber + '\'' +
                ", pmrf_month=" + pmrf_month +
                ", pmrf_amount=" + pmrf_amount +
                '}';
    }
}

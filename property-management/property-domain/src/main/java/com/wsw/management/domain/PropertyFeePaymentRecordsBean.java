package com.wsw.management.domain;

import java.sql.Date;


public class PropertyFeePaymentRecordsBean {
    private int pf_id;
    private int pf_h_id;
    private int pf_months;
    private Date pf_timestamp;
    private double pf_amount;


    public int getPf_id() {
        return pf_id;
    }

    public void setPf_id(int pf_id) {
        this.pf_id = pf_id;
    }

    public int getPf_h_id() {
        return pf_h_id;
    }

    public void setPf_h_id(int pf_h_id) {
        this.pf_h_id = pf_h_id;
    }

    public int getPf_months() {
        return pf_months;
    }

    public void setPf_months(int pf_months) {
        this.pf_months = pf_months;
    }

    public Date getPf_timestamp() {
        return pf_timestamp;
    }

    public void setPf_timestamp(Date pf_timestamp) {
        this.pf_timestamp = pf_timestamp;
    }

    public double getPf_amount() {
        return pf_amount;
    }

    public void setPf_amount(double pf_amount) {
        this.pf_amount = pf_amount;
    }

    @Override
    public String toString() {
        return "PropertyFeePaymentRecordsBean{" +
                "pf_id=" + pf_id +
                ", pf_h_id=" + pf_h_id +
                ", pf_months=" + pf_months +
                ", pf_timestamp=" + pf_timestamp +
                ", pf_amount=" + pf_amount +
                '}';
    }
}

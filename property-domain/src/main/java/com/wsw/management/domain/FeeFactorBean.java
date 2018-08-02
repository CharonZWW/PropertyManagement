package com.wsw.management.domain;

public class FeeFactorBean {
    private int fp_id;
    private String fp_fee_type;
    private double fp_fee_factor;

    public int getFp_id() {
        return fp_id;
    }

    public void setFp_id(int fp_id) {
        this.fp_id = fp_id;
    }

    public String getFp_fee_type() {
        return fp_fee_type;
    }

    public void setFp_fee_type(String fp_fee_type) {
        this.fp_fee_type = fp_fee_type;
    }

    public double getFp_fee_factor() {
        return fp_fee_factor;
    }

    public void setFp_fee_factor(double fp_fee_factor) {
        this.fp_fee_factor = fp_fee_factor;
    }


    @Override
    public String toString() {
        return "FeeFactorBean{" +
                "fp_id=" + fp_id +
                ", fp_fee_type='" + fp_fee_type + '\'' +
                ", fp_fee_factor=" + fp_fee_factor +
                '}';
    }
}
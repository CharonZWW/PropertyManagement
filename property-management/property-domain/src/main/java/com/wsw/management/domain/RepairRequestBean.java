package com.wsw.management.domain;

import java.sql.Timestamp;


public class RepairRequestBean {
    private int repair_id;
    private int repair_h_id;
    private int repair_m_id;
    private String repair_type;
    private String repair_problem_describe;
    private Timestamp repair_request_time;
    private Timestamp repair_response_time;
    private Timestamp repair_complete_time;
    private String repair_status;

    public int getRepair_id() {
        return repair_id;
    }

    public void setRepair_id(int repair_id) {
        this.repair_id = repair_id;
    }

    public int getRepair_h_id() {
        return repair_h_id;
    }

    public void setRepair_h_id(int repair_h_id) {
        this.repair_h_id = repair_h_id;
    }

    public int getRepair_m_id() {
        return repair_m_id;
    }

    public void setRepair_m_id(int repair_m_id) {
        this.repair_m_id = repair_m_id;
    }

    public String getRepair_type() {
        return repair_type;
    }

    public void setRepair_type(String repair_type) {
        this.repair_type = repair_type;
    }

    public String getRepair_problem_describe() {
        return repair_problem_describe;
    }

    public void setRepair_problem_describe(String repair_problem_describe) {
        this.repair_problem_describe = repair_problem_describe;
    }

    public Timestamp getRepair_request_time() {
        return repair_request_time;
    }

    public void setRepair_request_time(Timestamp repair_request_time) {
        this.repair_request_time = repair_request_time;
    }

    public Timestamp getRepair_response_time() {
        return repair_response_time;
    }

    public void setRepair_response_time(Timestamp repair_response_time) {
        this.repair_response_time = repair_response_time;
    }

    public Timestamp getRepair_complete_time() {
        return repair_complete_time;
    }

    public void setRepair_complete_time(Timestamp repair_complete_time) {
        this.repair_complete_time = repair_complete_time;
    }

    public String getRepair_status() {
        return repair_status;
    }

    public void setRepair_status(String repair_status) {
        this.repair_status = repair_status;
    }


    @Override
    public String toString() {
        return "RepairRequestBean{" +
                "repair_id=" + repair_id +
                ", repair_h_id=" + repair_h_id +
                ", repair_m_id=" + repair_m_id +
                ", repair_type='" + repair_type + '\'' +
                ", repair_problem_describe='" + repair_problem_describe + '\'' +
                ", repair_request_time=" + repair_request_time +
                ", repair_response_time=" + repair_response_time +
                ", repair_complete_time=" + repair_complete_time +
                ", repair_status='" + repair_status + '\'' +
                '}';
    }
}

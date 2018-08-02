package com.wsw.management.domain;


public class AccountBean {
    private int a_id;
    private int a_h_id;
    private String a_phoneNumber;
    private String a_password;

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public int getA_h_id() {
        return a_h_id;
    }

    public void setA_h_id(int a_h_id) {
        this.a_h_id = a_h_id;
    }

    public String getA_phoneNumber() {
        return a_phoneNumber;
    }

    public void setA_phoneNumber(String a_phoneNumber) {
        this.a_phoneNumber = a_phoneNumber;
    }

    public String getA_password() {
        return a_password;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
    }


    @Override
    public String toString() {
        return "AccountBean{" +
                "a_id=" + a_id +
                ", a_h_id=" + a_h_id +
                ", a_phoneNumber='" + a_phoneNumber + '\'' +
                ", a_password='" + a_password + '\'' +
                '}';
    }
}


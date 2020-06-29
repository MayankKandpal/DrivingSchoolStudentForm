package com.example.qodiegence_1;

public class example {
    String name;
    String phone;
    String address;
    String dob;
    String email;
    String license;
    String batch;
    String balance;
    String course;
    public example(){

    }

    public example(String name, String phone, String address, String dob, String email, String license, String batch, String balance, String course) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.license = license;
        this.batch = batch;
        this.balance = balance;
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getLicense() {
        return license;
    }

    public String getBatch() {
        return batch;
    }

    public String getBalance() {
        return balance;
    }
}

package com.cesde.cityscooter.domain;

import java.util.Date;
import java.util.List;

public class Booking {

    private int id;
    private Date date;
    private String status;
    private double price;

    public Booking() {
    }

    public Booking(int id, Date date, String status, double price) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
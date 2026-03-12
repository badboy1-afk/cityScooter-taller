package com.cesde.cityscooter.domain;

import java.util.List;

public class PickupPoint {

    private int id;
    private String name;
    private String location;
    private int capacity;

    public PickupPoint() {
    }

    public PickupPoint(int id, String location, String name, int capacity) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
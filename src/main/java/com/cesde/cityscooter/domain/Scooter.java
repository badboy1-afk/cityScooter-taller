package com.cesde.cityscooter.domain;

public class Scooter extends Vehicle {

    private int batteryLevel;
    private int autonomy;
    private double maxSpeed;
    private String status;
    private double latitude;
    private double longitude;
    private boolean isAvailable;

    public Scooter() {
    }

    public Scooter(int batteryLevel, int autonomy, double maxSpeed, String status, double latitude, double longitude, boolean isAvailable) {
        this.batteryLevel = batteryLevel;
        this.autonomy = autonomy;
        this.maxSpeed = maxSpeed;
        this.status = status;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isAvailable = isAvailable;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(int autonomy) {
        this.autonomy = autonomy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
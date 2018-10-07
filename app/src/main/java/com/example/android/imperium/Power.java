package com.example.android.imperium;

public class Power {
    private String power;
    private String name;
    private String status;
    private String ip;

    public Power() {
    }

    public Power(String power, String name, String status, String ip) {
        this.power = power;
        this.name = name;
        this.status = status;
        this.ip = ip;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}

package com.weather.model;


public class Weather {
    private double dayTemperature;
    private double nightTemperature;
    private String description;
    private String date;

    public double getDayTemperature() {
        return dayTemperature;
    }

    public void setDayTemperature(double dayTemperature) {
        this.dayTemperature = dayTemperature;
    }

    public double getNightTemperature() {
        return nightTemperature;
    }

    public void setNightTemperature(double nightTemperature) {
        this.nightTemperature = nightTemperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

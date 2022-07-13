package com.weather.model;


public class Weather {
    private final double dayTemperature;
    private final double nightTemperature;
    private final String description;
    private final String date;

    public Weather(double dayTemperature, double nightTemperature, String description, String date) {
        this.dayTemperature = dayTemperature;
        this.nightTemperature = nightTemperature;
        this.description = description;
        this.date = date;
    }

    public double getDayTemperature() {
        return dayTemperature;
    }

    public double getNightTemperature() {
        return nightTemperature;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

}

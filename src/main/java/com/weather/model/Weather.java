package com.weather.model;

import java.util.Date;

public class Weather {

    private Date date;
    private double temperature;
    private String city;

    public Weather() {}

    public Weather(Date date, double temperature, String city) {
        this.date = date;
        this.temperature = temperature;
        this.city = city;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Date: " + date + " temperature: " + temperature + " city: " + city;
    }
}

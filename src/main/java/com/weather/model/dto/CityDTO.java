package com.weather.model.dto;

public class CityDTO {

    private long id;
    private String name;
    private String country;
    private String timezone;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getTimezone() { return timezone; }
}

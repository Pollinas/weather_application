package com.weather.model.dto;

import java.util.List;

public class WeatherDTO {

    private CityDTO city;

    public CityDTO getCity() {
        return city;
    }

    public List<DailyWeatherDTO> getList() {
        return list;
    }

    private List<DailyWeatherDTO> list;


//    @Override
//    public String toString() {
//        //return "Date: " + date + " temperature: " + temperature + " city: " + city;
//    }
}

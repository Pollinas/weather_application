package com.weather.model.dto;

import java.util.List;

public class WeatherDTO {

    private CityDTO city;
    private List<DailyWeatherDTO> list;

    public CityDTO getCity() {
        return city;
    }

    public List<DailyWeatherDTO> getList() {
        return list;
    }
}

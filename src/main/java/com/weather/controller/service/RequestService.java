package com.weather.controller.service;

import com.weather.model.dto.WeatherDTO;

public interface RequestService {

    public WeatherDTO sendRequestToWeatherAPI(String cityName);
}

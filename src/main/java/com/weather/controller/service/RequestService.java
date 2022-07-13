package com.weather.controller.service;

import com.weather.model.dto.WeatherDTO;

public interface RequestService {

    WeatherDTO sendRequestToWeatherAPI(String cityName);
}

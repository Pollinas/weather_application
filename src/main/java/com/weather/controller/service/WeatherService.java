package com.weather.controller.service;

import com.weather.model.Weather;
import com.weather.model.dto.WeatherDTO;

import java.util.List;

public interface WeatherService {
    List<Weather> getWeather(String cityName);


}

package com.weather.controller.service;

import com.weather.model.Weather;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceImplTest {

    WeatherServiceImpl weatherService = new WeatherServiceImpl(new RequestWeatherMockService());

    @Test
    public void test(){
        List<Weather> berlin = weatherService.getWeather("Berlin");

        for(Weather weather: berlin){
            System.out.println(weather.getDescription());
            System.out.println(weather.getNightTemperature());
            System.out.println();
        }
    }
}
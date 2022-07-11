package com.weather.controller.service;

import com.weather.model.Weather;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WeatherServiceImplTest {

    WeatherServiceImpl weatherService = new WeatherServiceImpl(new RequestWeatherMockService());

    List<Weather> berlin = weatherService.getWeather("Berlin");
    @Test
    public void weatherServiceShouldHaveFiveResults(){
        assertEquals(5,berlin.size());
    }

    @Test
    public void firstResultShouldMatchDescriptionClearSky(){
        assertEquals("clear sky", berlin.get(0).getDescription());
    }

    @Test
    public void firstResultShouldMatchWeatherTemperatureOf27(){
        assertEquals(27.26, berlin.get(0).getDayTemperature());
    }
}
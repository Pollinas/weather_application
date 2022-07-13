package com.weather.controller.service;

import com.weather.model.Weather;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WeatherServiceImplTest {

    private final WeatherServiceImpl weatherService = new WeatherServiceImpl(new RequestWeatherMockService());

    @Test
    public void weatherServiceShouldHaveFiveResults() {
        List<Weather> weathers = weatherService.getWeather("Berlin");
        assertEquals(5, weathers.size());
    }

    @Test
    public void firstResultShouldMatchDescriptionClearSky() {
        List<Weather> weathers = weatherService.getWeather("Berlin");
        assertEquals("clear sky", weathers.get(0).getDescription());
    }

    @Test
    public void firstResultShouldMatchWeatherTemperatureOf27() {
        List<Weather> weathers = weatherService.getWeather("Berlin");
        assertEquals(27.26, weathers.get(0).getDayTemperature());
    }

}
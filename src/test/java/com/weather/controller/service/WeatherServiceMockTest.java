package com.weather.controller.service;


import com.weather.model.Weather;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherServiceMockTest {

    private WeatherService service = new WeatherServiceMock();

    @Test
    public void getWeatherShouldReturnResultsForOneCity() {
        List<Weather> result = service.getWeather("Berlin");

        assertEquals(5, result.size());
    }

    @Test void getWeatherShouldReturnTheGivenCity() {
        List<Weather> result = service.getWeather("Berlin");

        assertEquals("Berlin", result.get(0).getCity());
    }

}
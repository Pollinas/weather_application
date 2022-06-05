package com.weather.controller.service;

import com.weather.model.Weather;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class WeatherServiceMock implements WeatherService {
    private static Instant today = Instant.ofEpochMilli(123123123123L);

    private static List<Weather> weathers = Arrays.asList(
            new Weather(Date.from(today), 21.4, "Berlin"),
            new Weather(Date.from(today.plus(1, ChronoUnit.DAYS)), 21.4, "Berlin"),
            new Weather(Date.from(today.plus(2, ChronoUnit.DAYS)), 15.4, "Berlin"),
            new Weather(Date.from(today.plus(3, ChronoUnit.DAYS)), 87.6, "Berlin"),
            new Weather(Date.from(today.plus(4, ChronoUnit.DAYS)), 13, "Berlin"),
            new Weather(Date.from(today), 24.4, "Szczecin"),
            new Weather(Date.from(today.plus(1, ChronoUnit.DAYS)), 26.4, "Szczecin"),
            new Weather(Date.from(today.plus(2, ChronoUnit.DAYS)), 16.4, "Szczecin"),
            new Weather(Date.from(today.plus(3, ChronoUnit.DAYS)), 86.6, "Szczecin"),
            new Weather(Date.from(today.plus(4, ChronoUnit.DAYS)), 66, "Szczecin")
    );

    @Override
    public List<Weather> getWeather(String city) {
        return weathers.stream()
                .filter(x -> city.equals(x.getCity()))
                .collect(Collectors.toList());
    }
}

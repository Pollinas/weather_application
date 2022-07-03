package com.weather.controller.service;

import com.weather.model.Weather;
import com.weather.model.dto.DailyWeatherDTO;
import com.weather.model.dto.WeatherDTO;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class WeatherServiceImpl implements WeatherService {

    private static final int DAY_IN_MS = 1000 * 60 * 60 * 24;
    private static final SimpleDateFormat DATE_FORMAT_HOUR = new SimpleDateFormat("HH");
    private static final int NUMBER_OF_DAYS = 4;

    private RequestService requestWeatherService;

    public WeatherServiceImpl(RequestService requestWeatherService) {
        this.requestWeatherService = requestWeatherService;
    }

    @Override
    public List<Weather> getWeather(String cityName) {

        WeatherDTO weatherDTO = requestWeatherService.sendRequestToWeatherAPI(cityName);
        String timezone = weatherDTO.getCity().getTimezone();

        List<Weather> weathers = parseWeatherDTO(weatherDTO, timezone);

        return weathers;

    }

    private List<Weather> parseWeatherDTO(WeatherDTO weatherDTO, String timezone) {

        List<Weather> weathers = new ArrayList<>();
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");

        //getting the closest data to set values to the weather now
        Weather weatherNow = new Weather();
        weatherNow.setDayTemperature(weatherDTO.getList().get(0).getMain().getTemp());
        weatherNow.setDescription(weatherDTO.getList().get(0).getWeatherDescription().get(0).getDescription());
        weathers.add(weatherNow);

        //setting values to the weather objects for next four days
        for (int j = 0; j < NUMBER_OF_DAYS; j++) {
            Weather weather = new Weather();

            currentDate = new Date(currentDate.getTime() + DAY_IN_MS);
            String dayDateOnly = dateFormat.format(currentDate);

            for (DailyWeatherDTO dailyWeather : weatherDTO.getList()) {
                Date date = Date.from(Instant.ofEpochSecond(dailyWeather.getDt()));
                String dateOnly = dateFormat.format(date);
                DATE_FORMAT_HOUR.setTimeZone(TimeZone.getTimeZone(timezone));
                int hours = Integer.parseInt(DATE_FORMAT_HOUR.format(date));

                if (dayDateOnly.equals(dateOnly) && isNoon(hours)) {
                    weather.setDate(dateOnly);
                    weather.setDescription(dailyWeather.getWeatherDescription().get(0).getDescription());
                    weather.setDayTemperature(dailyWeather.getMain().getTemp());
                }
                if (dayDateOnly.equals(dateOnly) && isMidnight(hours)) {
                    weather.setNightTemperature(dailyWeather.getMain().getTemp());
                }
            }
            weathers.add(weather);
        }
        return weathers;
    }


    private boolean isMidnight(int hours) {
        return hours == 00;
    }

    private boolean isNoon(int hours) {
        return hours == 12;
    }


}

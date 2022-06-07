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
    private static final int NUMBER_OF_DAYS = 5;

    private RequestService requestWeatherService;

    public WeatherServiceImpl(RequestService requestWeatherService) {
        this.requestWeatherService = requestWeatherService;
    }

    @Override
    public List<Weather> getWeather(String cityName) {

        //wysłanie zapytania do API poprzez inny service
        WeatherDTO weatherDTO = requestWeatherService.JSONToModelConversion();

        String timezone = weatherDTO.getCity().getTimezone();

        //konwersja Weather DTO na listę 5 obiektów Weather;
        List<Weather> weathers = parseWeatherDTO(weatherDTO, timezone);

        //przesłanie tych obiektów do kontrolera MainWindowController
        return weathers;

    }

    private List<Weather> parseWeatherDTO(WeatherDTO weatherDTO, String timezone) {

        List<Weather> weathers = new ArrayList<>();
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");

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

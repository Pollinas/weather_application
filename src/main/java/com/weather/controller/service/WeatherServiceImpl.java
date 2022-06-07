package com.weather.controller.service;

import com.weather.model.Weather;
import com.weather.model.dto.WeatherDTO;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class WeatherServiceImpl implements WeatherService {

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

    public List<Weather> parseWeatherDTO(WeatherDTO weatherDTO, String timezone){

        List<Weather> weathers = new ArrayList<Weather>();

        Date currentDate = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MMM/yyyy");
        //String currentDateOnly = dateFormat.format(currentDate);
        Date dayOne = new Date(currentDate.getTime() + (1000 * 60 * 60 * 24));
        String dayOneDateOnly = dateFormat.format(dayOne);

        Date dayTwo = new Date(dayOne.getTime() + (1000 * 60 * 60 * 24));
        String dayTwoDateOnly = dateFormat.format(dayTwo);
        Date dayThree = new Date(dayTwo.getTime() + (1000 * 60 * 60 * 24));
        String dayThreeDateOnly = dateFormat.format(dayThree);
        Date dayFour = new Date(dayThree.getTime() + (1000 * 60 * 60 * 24));
        String dayFourDateOnly = dateFormat.format(dayFour);
        Date dayFive = new Date(dayFour.getTime() + (1000 * 60 * 60 * 24));
        String dayFiveDateOnly = dateFormat.format(dayFive);

        Weather weatherDayOne = new Weather();
        Weather weatherDayTwo = new Weather();
        Weather weatherDayThree = new Weather();
        Weather weatherDayFour = new Weather();
        Weather weatherDayFive = new Weather();
        weathers.add(weatherDayOne);
        weathers.add(weatherDayTwo);
        weathers.add(weatherDayThree);
        weathers.add(weatherDayFour);
        weathers.add(weatherDayFive);

        for (int i = 0; i < weatherDTO.getList().size(); i++) {

            Date date =
                    Date.from(Instant.ofEpochSecond(weatherDTO.getList().get(i).getDt()));
            String dateOnly = dateFormat.format(date);

            SimpleDateFormat isoFormat = new SimpleDateFormat("HH");
            isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
            //Calendar calendar = Calendar.getInstance();
            //calendar.setTime(date);
            //int hours = calendar.get(Calendar.HOUR_OF_DAY);
            int hours = Integer.parseInt(isoFormat.format(date));

            //check for day one
            if (dayOneDateOnly.equals(dateOnly) && hours == 12) {
                weatherDayOne.setDescription(weatherDTO.getList().get(i).getWeatherDescription().get(0).getDescription());
                weatherDayOne.setDayTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            if (dayOneDateOnly.equals(dateOnly) && hours == 00) {
                weatherDayOne.setNightTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            //check for day two
            if (dayTwoDateOnly.equals(dateOnly) && hours == 12) {
                weatherDayTwo.setDescription(weatherDTO.getList().get(i).getWeatherDescription().get(0).getDescription());
                weatherDayTwo.setDayTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            if (dayTwoDateOnly.equals(dateOnly) && hours == 00) {
                weatherDayTwo.setNightTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            //check for day three
            if (dayThreeDateOnly.equals(dateOnly) && hours == 12) {
                weatherDayThree.setDescription(weatherDTO.getList().get(i).getWeatherDescription().get(0).getDescription());
                weatherDayThree.setDayTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            if (dayThreeDateOnly.equals(dateOnly) && hours == 00) {
                weatherDayThree.setNightTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            //check for day four
            if (dayFourDateOnly.equals(dateOnly) && hours == 12) {
                weatherDayFour.setDescription(weatherDTO.getList().get(i).getWeatherDescription().get(0).getDescription());
                weatherDayFour.setDayTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            if (dayFourDateOnly.equals(dateOnly) && hours == 00) {
                weatherDayFour.setNightTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            //check for day five
            if (dayFiveDateOnly.equals(dateOnly) && hours == 12) {
                weatherDayFive.setDescription(weatherDTO.getList().get(i).getWeatherDescription().get(0).getDescription());
                weatherDayTwo.setDayTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            if (dayFiveDateOnly.equals(dateOnly) && hours == 00) {
                weatherDayFive.setNightTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

        }

        return weathers;

    }



}

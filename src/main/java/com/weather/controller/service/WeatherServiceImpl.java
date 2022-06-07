package com.weather.controller.service;

import com.weather.model.Weather;
import com.weather.model.dto.WeatherDTO;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class WeatherServiceImpl implements WeatherService {


    @Override
    public List<Weather> getWeather(String cityName) {

        //wysłanie zapytania do API poprzez inny service
        RequestService requestWeatherService = new RequestWeatherMockService();
        WeatherDTO weatherDTO = requestWeatherService.JSONToModelConversion();

        //konwersja Weather DTO na listę 5 obiektów Weather;
        List<Weather> weathers = parseWeatherDTO(weatherDTO);

        //przesłanie tych obiektów do kontrolera MainWindowController
        return weathers;

    }

    public List<Weather> parseWeatherDTO(WeatherDTO weatherDTO){

        List<Weather> weathers = new ArrayList<Weather>();

        Date currentDate = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MMM/yyyy");
        String currentDateOnly = dateFormat.format(currentDate);

        Date dayTwo = new Date(currentDate.getTime() + (1000 * 60 * 60 * 24));
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

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int hours = calendar.get(Calendar.HOUR_OF_DAY);

            //check for day one
            if (currentDateOnly.equals(dateOnly) && hours == 12) {
                weatherDayOne.setDescription(weatherDTO.getList().get(i).getWeatherDescription().get(0).getDescription());
                weatherDayOne.setDayTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            if (currentDateOnly.equals(dateOnly) && hours == 00) {

                weatherDayOne.setNightTemperature(weatherDTO.getList().get(i).getMain().getTemp());
            }

            //check for day two

            //check for day three

            //check for day four

            //check for day five



        }
        return weathers;

    }



}

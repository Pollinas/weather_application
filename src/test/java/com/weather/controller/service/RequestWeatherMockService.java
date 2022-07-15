package com.weather.controller.service;

import com.google.gson.Gson;
import com.weather.model.dto.WeatherDTO;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class RequestWeatherMockService implements RequestService {


    @Override
    public WeatherDTO sendRequestToWeatherAPI(String cityName) {

        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\48781\\IdeaProjects\\WeatherApp\\src\\test\\resources\\weather.json"));
            WeatherDTO weatherDTO = gson.fromJson(reader, WeatherDTO.class);
            reader.close();
            return weatherDTO;
        } catch (Exception e){
            e.printStackTrace();
        }
            return null;
    }

}

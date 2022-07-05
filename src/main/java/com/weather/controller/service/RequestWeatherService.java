package com.weather.controller.service;

import com.google.gson.Gson;
import com.weather.Config;
import com.weather.model.dto.WeatherDTO;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestWeatherService implements RequestService  {
    @Override
    public WeatherDTO sendRequestToWeatherAPI(String cityName) {

        String API_KEY = Config.getAPI_KEY();

        var client = HttpClient.newHttpClient();

        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(String.format("https://api.openweathermap.org/data/2.5/forecast?q=%s&appid=%s&units=metric", cityName, API_KEY)))
                .GET()
                .build();

        try {
            var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            WeatherDTO weatherDTO = new Gson().fromJson(response.body(), WeatherDTO.class);
            return weatherDTO;

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

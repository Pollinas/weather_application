package com.weather.controller.service;

import com.google.gson.Gson;
import com.weather.Config;
import com.weather.exception.IncorrectHttpClientException;
import com.weather.exception.MissingApiKeyException;
import com.weather.model.dto.WeatherDTO;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class RequestWeatherService implements RequestService  {

    private final Config config;
    private final HttpClient client;

    public RequestWeatherService(Config config, HttpClient client) {

        this.config = config;
        this.client = client;
    }

    @Override
    public WeatherDTO sendRequestToWeatherAPI(String cityName) {

        String API_KEY = getApiKey();

        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(String.format("https://api.openweathermap.org/data/2.5/forecast?q=%s&appid=%s&units=metric", URLEncoder.encode(cityName, StandardCharsets.UTF_8), API_KEY)))
                .GET()
                .build();

        HttpResponse<String> response;
        try {
            response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException | IOException e) {
            throw new IncorrectHttpClientException(e);
        }
        return new Gson().fromJson(response.body(), WeatherDTO.class);
    }

    private String getApiKey() {
        try {
            String key = config.getApiKey();
            if(key == null)
                throw new MissingApiKeyException("Missing API key for openweather API");
            return key;
        } catch (IOException e) {
            e.printStackTrace();
            throw new MissingApiKeyException("Missing API key for openweather API", e);
        }
    }

}

package com.weather.controller;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelTest {

    class Pogoda {
        public City city;
        public List<DailyWeather> list;
    }

    class DailyWeather {
        public long dt;
        public Temperature main;
        List <GeneralDescription> weather;
    }

    class City{
        public long id;
        public String name;
        public String country;
    }
    class Temperature{
        public double temp;
    }

    class GeneralDescription{
        public String description;
    }

    @Test
    public void testConversion() {
        Pogoda pogoda = new Gson().fromJson(json, Pogoda.class);
        assertEquals("Berlin", pogoda.city.name);
        assertEquals(300.29, pogoda.list.get(0).main.temp);
    }



    private static final String json = "\n" +
            "{\"cod\":\"200\",\"message\":0,\"cnt\":40,\"list\":[{\n" +
            "\"dt\": 1654452000,\n" +
            "\"main\": {\n" +
            "\"temp\": 300.29,\n" +
            "\"feels_like\": 299.97,\n" +
            "\"temp_min\": 297.28,\n" +
            "\"temp_max\": 300.29,\n" +
            "\"pressure\": 1004,\n" +
            "\"sea_level\": 1004,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 37,\n" +
            "\"temp_kf\": 3.01\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 800,\n" +
            "\"main\": \"Clear\",\n" +
            "\"description\": \"clear sky\",\n" +
            "\"icon\": \"01d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 0\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.88,\n" +
            "\"deg\": 106,\n" +
            "\"gust\": 8.8\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-05 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654462800,\n" +
            "\"main\": {\n" +
            "\"temp\": 297.96,\n" +
            "\"feels_like\": 297.65,\n" +
            "\"temp_min\": 293.3,\n" +
            "\"temp_max\": 297.96,\n" +
            "\"pressure\": 1007,\n" +
            "\"sea_level\": 1007,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 44,\n" +
            "\"temp_kf\": 4.66\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 802,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"scattered clouds\",\n" +
            "\"icon\": \"03n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 31\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.78,\n" +
            "\"deg\": 109,\n" +
            "\"gust\": 12.77\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-05 21:00:00\"\n" +
            "}],\"city\":{\"id\":2950159,\"name\":\"Berlin\",\"coord\":{\"lat\":52.5244,\"lon\":13.4105},\"country\":\"DE\",\"population\":1000000,\"timezone\":7200,\"sunrise\":1654397208,\"sunset\":1654456989}} ";
}

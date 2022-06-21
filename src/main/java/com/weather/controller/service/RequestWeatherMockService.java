package com.weather.controller.service;

import com.google.gson.Gson;
import com.weather.model.dto.WeatherDTO;


public class RequestWeatherMockService implements RequestService {


    @Override
    public WeatherDTO sendRequestToWeatherAPI(String cityName) {

        //here not sending API request but working with json String instead
        WeatherDTO weatherDTO = new Gson().fromJson(json, WeatherDTO.class);
        return weatherDTO;

    }

    private String json = "{\n" +
            "\"cod\": \"200\",\n" +
            "\"message\": 0,\n" +
            "\"cnt\": 40,\n" +
            "\"list\": [\n" +
            "{\n" +
            "\"dt\": 1655834400,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.83,\n" +
            "\"feels_like\": 23.29,\n" +
            "\"temp_min\": 23.07,\n" +
            "\"temp_max\": 23.83,\n" +
            "\"pressure\": 1003,\n" +
            "\"sea_level\": 1003,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 39,\n" +
            "\"temp_kf\": 0.76\n" +
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
            "\"speed\": 2.43,\n" +
            "\"deg\": 352,\n" +
            "\"gust\": 2.99\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-21 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655845200,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.81,\n" +
            "\"feels_like\": 21.2,\n" +
            "\"temp_min\": 17.78,\n" +
            "\"temp_max\": 21.81,\n" +
            "\"pressure\": 1006,\n" +
            "\"sea_level\": 1006,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 44,\n" +
            "\"temp_kf\": 4.03\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 800,\n" +
            "\"main\": \"Clear\",\n" +
            "\"description\": \"clear sky\",\n" +
            "\"icon\": \"01n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 6\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.86,\n" +
            "\"deg\": 93,\n" +
            "\"gust\": 6.29\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-21 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655856000,\n" +
            "\"main\": {\n" +
            "\"temp\": 18.24,\n" +
            "\"feels_like\": 17.53,\n" +
            "\"temp_min\": 15.45,\n" +
            "\"temp_max\": 18.24,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 54,\n" +
            "\"temp_kf\": 2.79\n" +
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
            "\"all\": 34\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.42,\n" +
            "\"deg\": 119,\n" +
            "\"gust\": 4.48\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-22 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655866800,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.24,\n" +
            "\"feels_like\": 13.39,\n" +
            "\"temp_min\": 14.24,\n" +
            "\"temp_max\": 14.24,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 64,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 804,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"overcast clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 92\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.94,\n" +
            "\"deg\": 120,\n" +
            "\"gust\": 2.92\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-22 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655877600,\n" +
            "\"main\": {\n" +
            "\"temp\": 18.13,\n" +
            "\"feels_like\": 17.36,\n" +
            "\"temp_min\": 18.13,\n" +
            "\"temp_max\": 18.13,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 52,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 804,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"overcast clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 88\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.12,\n" +
            "\"deg\": 163,\n" +
            "\"gust\": 1.38\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-22 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655888400,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.22,\n" +
            "\"feels_like\": 22.56,\n" +
            "\"temp_min\": 23.22,\n" +
            "\"temp_max\": 23.22,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 37,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 804,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"overcast clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 99\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.75,\n" +
            "\"deg\": 281,\n" +
            "\"gust\": 2.46\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-22 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655899200,\n" +
            "\"main\": {\n" +
            "\"temp\": 26.83,\n" +
            "\"feels_like\": 26.17,\n" +
            "\"temp_min\": 26.83,\n" +
            "\"temp_max\": 26.83,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 26,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 803,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"broken clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 58\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.1,\n" +
            "\"deg\": 284,\n" +
            "\"gust\": 2.76\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-22 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655910000,\n" +
            "\"main\": {\n" +
            "\"temp\": 27.5,\n" +
            "\"feels_like\": 26.49,\n" +
            "\"temp_min\": 27.5,\n" +
            "\"temp_max\": 27.5,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 23,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 5\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.86,\n" +
            "\"deg\": 308,\n" +
            "\"gust\": 2.76\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-22 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655920800,\n" +
            "\"main\": {\n" +
            "\"temp\": 25.37,\n" +
            "\"feels_like\": 24.75,\n" +
            "\"temp_min\": 25.37,\n" +
            "\"temp_max\": 25.37,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 30,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 2\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.84,\n" +
            "\"deg\": 341,\n" +
            "\"gust\": 3.3\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-22 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655931600,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.37,\n" +
            "\"feels_like\": 18.56,\n" +
            "\"temp_min\": 19.37,\n" +
            "\"temp_max\": 19.37,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 46,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 800,\n" +
            "\"main\": \"Clear\",\n" +
            "\"description\": \"clear sky\",\n" +
            "\"icon\": \"01n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 2\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.44,\n" +
            "\"deg\": 37,\n" +
            "\"gust\": 7.86\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-22 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655942400,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.04,\n" +
            "\"feels_like\": 15.45,\n" +
            "\"temp_min\": 16.04,\n" +
            "\"temp_max\": 16.04,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 67,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 801,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"few clouds\",\n" +
            "\"icon\": \"02n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 11\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.94,\n" +
            "\"deg\": 46,\n" +
            "\"gust\": 5.7\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-23 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655953200,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.71,\n" +
            "\"feels_like\": 14.14,\n" +
            "\"temp_min\": 14.71,\n" +
            "\"temp_max\": 14.71,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 73,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 803,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"broken clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 55\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.25,\n" +
            "\"deg\": 47,\n" +
            "\"gust\": 3.76\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-23 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655964000,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.2,\n" +
            "\"feels_like\": 18.66,\n" +
            "\"temp_min\": 19.2,\n" +
            "\"temp_max\": 19.2,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 57,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 802,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"scattered clouds\",\n" +
            "\"icon\": \"03d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 38\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.83,\n" +
            "\"deg\": 52,\n" +
            "\"gust\": 2.34\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-23 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655974800,\n" +
            "\"main\": {\n" +
            "\"temp\": 25.07,\n" +
            "\"feels_like\": 24.62,\n" +
            "\"temp_min\": 25.07,\n" +
            "\"temp_max\": 25.07,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 38,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 7\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.29,\n" +
            "\"deg\": 50,\n" +
            "\"gust\": 1.15\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-23 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655985600,\n" +
            "\"main\": {\n" +
            "\"temp\": 28.82,\n" +
            "\"feels_like\": 27.57,\n" +
            "\"temp_min\": 28.82,\n" +
            "\"temp_max\": 28.82,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1010,\n" +
            "\"humidity\": 27,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 6\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.19,\n" +
            "\"deg\": 55,\n" +
            "\"gust\": 0.99\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-23 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655996400,\n" +
            "\"main\": {\n" +
            "\"temp\": 29.51,\n" +
            "\"feels_like\": 27.99,\n" +
            "\"temp_min\": 29.51,\n" +
            "\"temp_max\": 29.51,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 24,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 4\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.05,\n" +
            "\"deg\": 88,\n" +
            "\"gust\": 1.94\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-23 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656007200,\n" +
            "\"main\": {\n" +
            "\"temp\": 27.32,\n" +
            "\"feels_like\": 26.71,\n" +
            "\"temp_min\": 27.32,\n" +
            "\"temp_max\": 27.32,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 32,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 4\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.75,\n" +
            "\"deg\": 92,\n" +
            "\"gust\": 4.47\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-23 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656018000,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.32,\n" +
            "\"feels_like\": 21.86,\n" +
            "\"temp_min\": 22.32,\n" +
            "\"temp_max\": 22.32,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 48,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 800,\n" +
            "\"main\": \"Clear\",\n" +
            "\"description\": \"clear sky\",\n" +
            "\"icon\": \"01n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 0\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.27,\n" +
            "\"deg\": 88,\n" +
            "\"gust\": 10.12\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-23 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656028800,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.94,\n" +
            "\"feels_like\": 19.43,\n" +
            "\"temp_min\": 19.94,\n" +
            "\"temp_max\": 19.94,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 55,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 800,\n" +
            "\"main\": \"Clear\",\n" +
            "\"description\": \"clear sky\",\n" +
            "\"icon\": \"01n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 0\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.55,\n" +
            "\"deg\": 106,\n" +
            "\"gust\": 9.51\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-24 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656039600,\n" +
            "\"main\": {\n" +
            "\"temp\": 18.51,\n" +
            "\"feels_like\": 18.04,\n" +
            "\"temp_min\": 18.51,\n" +
            "\"temp_max\": 18.51,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 62,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"speed\": 3.43,\n" +
            "\"deg\": 120,\n" +
            "\"gust\": 9.04\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-24 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656050400,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.15,\n" +
            "\"feels_like\": 22.85,\n" +
            "\"temp_min\": 23.15,\n" +
            "\"temp_max\": 23.15,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 51,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"speed\": 3.83,\n" +
            "\"deg\": 136,\n" +
            "\"gust\": 6.62\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-24 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656061200,\n" +
            "\"main\": {\n" +
            "\"temp\": 29.04,\n" +
            "\"feels_like\": 28.03,\n" +
            "\"temp_min\": 29.04,\n" +
            "\"temp_max\": 29.04,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 32,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 3\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.66,\n" +
            "\"deg\": 139,\n" +
            "\"gust\": 6.94\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-24 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656072000,\n" +
            "\"main\": {\n" +
            "\"temp\": 31.64,\n" +
            "\"feels_like\": 29.75,\n" +
            "\"temp_min\": 31.64,\n" +
            "\"temp_max\": 31.64,\n" +
            "\"pressure\": 1009,\n" +
            "\"sea_level\": 1009,\n" +
            "\"grnd_level\": 1004,\n" +
            "\"humidity\": 22,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 1\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.34,\n" +
            "\"deg\": 143,\n" +
            "\"gust\": 6.61\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-24 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656082800,\n" +
            "\"main\": {\n" +
            "\"temp\": 32.15,\n" +
            "\"feels_like\": 30.12,\n" +
            "\"temp_min\": 32.15,\n" +
            "\"temp_max\": 32.15,\n" +
            "\"pressure\": 1007,\n" +
            "\"sea_level\": 1007,\n" +
            "\"grnd_level\": 1002,\n" +
            "\"humidity\": 20,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 1\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.97,\n" +
            "\"deg\": 140,\n" +
            "\"gust\": 6.11\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-24 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656093600,\n" +
            "\"main\": {\n" +
            "\"temp\": 29.59,\n" +
            "\"feels_like\": 28.26,\n" +
            "\"temp_min\": 29.59,\n" +
            "\"temp_max\": 29.59,\n" +
            "\"pressure\": 1007,\n" +
            "\"sea_level\": 1007,\n" +
            "\"grnd_level\": 1002,\n" +
            "\"humidity\": 28,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 1\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.99,\n" +
            "\"deg\": 146,\n" +
            "\"gust\": 6.35\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-24 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656104400,\n" +
            "\"main\": {\n" +
            "\"temp\": 24.61,\n" +
            "\"feels_like\": 24.3,\n" +
            "\"temp_min\": 24.61,\n" +
            "\"temp_max\": 24.61,\n" +
            "\"pressure\": 1007,\n" +
            "\"sea_level\": 1007,\n" +
            "\"grnd_level\": 1003,\n" +
            "\"humidity\": 45,\n" +
            "\"temp_kf\": 0\n" +
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
            "\"all\": 27\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.64,\n" +
            "\"deg\": 124,\n" +
            "\"gust\": 11.17\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-24 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656115200,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.97,\n" +
            "\"feels_like\": 22.71,\n" +
            "\"temp_min\": 22.97,\n" +
            "\"temp_max\": 22.97,\n" +
            "\"pressure\": 1008,\n" +
            "\"sea_level\": 1008,\n" +
            "\"grnd_level\": 1003,\n" +
            "\"humidity\": 53,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 803,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"broken clouds\",\n" +
            "\"icon\": \"04n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 63\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.74,\n" +
            "\"deg\": 131,\n" +
            "\"gust\": 10.3\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-25 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656126000,\n" +
            "\"main\": {\n" +
            "\"temp\": 20.92,\n" +
            "\"feels_like\": 20.76,\n" +
            "\"temp_min\": 20.92,\n" +
            "\"temp_max\": 20.92,\n" +
            "\"pressure\": 1008,\n" +
            "\"sea_level\": 1008,\n" +
            "\"grnd_level\": 1003,\n" +
            "\"humidity\": 65,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 804,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"overcast clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 95\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 0.97,\n" +
            "\"deg\": 236,\n" +
            "\"gust\": 3.3\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-25 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656136800,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.44,\n" +
            "\"feels_like\": 22.41,\n" +
            "\"temp_min\": 22.44,\n" +
            "\"temp_max\": 22.44,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 64,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 803,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"broken clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 70\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.4,\n" +
            "\"deg\": 280,\n" +
            "\"gust\": 1.67\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-25 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656147600,\n" +
            "\"main\": {\n" +
            "\"temp\": 25.64,\n" +
            "\"feels_like\": 25.62,\n" +
            "\"temp_min\": 25.64,\n" +
            "\"temp_max\": 25.64,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 52,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 804,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"overcast clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 85\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.01,\n" +
            "\"deg\": 290,\n" +
            "\"gust\": 2.35\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.03,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-25 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656158400,\n" +
            "\"main\": {\n" +
            "\"temp\": 24.57,\n" +
            "\"feels_like\": 24.54,\n" +
            "\"temp_min\": 24.57,\n" +
            "\"temp_max\": 24.57,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 56,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 804,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"overcast clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 93\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3,\n" +
            "\"deg\": 264,\n" +
            "\"gust\": 3.38\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-25 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656169200,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.12,\n" +
            "\"feels_like\": 23.08,\n" +
            "\"temp_min\": 23.12,\n" +
            "\"temp_max\": 23.12,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 61,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 500,\n" +
            "\"main\": \"Rain\",\n" +
            "\"description\": \"light rain\",\n" +
            "\"icon\": \"10d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 100\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.62,\n" +
            "\"deg\": 285,\n" +
            "\"gust\": 6.05\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.34,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.21\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-25 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656180000,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.89,\n" +
            "\"feels_like\": 19.97,\n" +
            "\"temp_min\": 19.89,\n" +
            "\"temp_max\": 19.89,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 78,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 500,\n" +
            "\"main\": \"Rain\",\n" +
            "\"description\": \"light rain\",\n" +
            "\"icon\": \"10d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 100\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.78,\n" +
            "\"deg\": 306,\n" +
            "\"gust\": 8.16\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.94,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.79\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-25 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656190800,\n" +
            "\"main\": {\n" +
            "\"temp\": 18.16,\n" +
            "\"feels_like\": 18.43,\n" +
            "\"temp_min\": 18.16,\n" +
            "\"temp_max\": 18.16,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 92,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 501,\n" +
            "\"main\": \"Rain\",\n" +
            "\"description\": \"moderate rain\",\n" +
            "\"icon\": \"10n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 100\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.73,\n" +
            "\"deg\": 337,\n" +
            "\"gust\": 8.46\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.94,\n" +
            "\"rain\": {\n" +
            "\"3h\": 3.11\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-25 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656201600,\n" +
            "\"main\": {\n" +
            "\"temp\": 17.7,\n" +
            "\"feels_like\": 17.95,\n" +
            "\"temp_min\": 17.7,\n" +
            "\"temp_max\": 17.7,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 93,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 500,\n" +
            "\"main\": \"Rain\",\n" +
            "\"description\": \"light rain\",\n" +
            "\"icon\": \"10n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 96\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.9,\n" +
            "\"deg\": 357,\n" +
            "\"gust\": 4.32\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.82,\n" +
            "\"rain\": {\n" +
            "\"3h\": 1.36\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-26 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656212400,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.71,\n" +
            "\"feels_like\": 16.94,\n" +
            "\"temp_min\": 16.71,\n" +
            "\"temp_max\": 16.71,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 96,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 803,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"broken clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 66\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.85,\n" +
            "\"deg\": 308,\n" +
            "\"gust\": 3.42\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.25,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-26 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656223200,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.22,\n" +
            "\"feels_like\": 19.36,\n" +
            "\"temp_min\": 19.22,\n" +
            "\"temp_max\": 19.22,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 83,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 803,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"broken clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 82\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.27,\n" +
            "\"deg\": 330,\n" +
            "\"gust\": 3.64\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.23,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-26 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656234000,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.04,\n" +
            "\"feels_like\": 23.02,\n" +
            "\"temp_min\": 23.04,\n" +
            "\"temp_max\": 23.04,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 62,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 500,\n" +
            "\"main\": \"Rain\",\n" +
            "\"description\": \"light rain\",\n" +
            "\"icon\": \"10d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 89\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.76,\n" +
            "\"deg\": 352,\n" +
            "\"gust\": 3.56\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.25,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.11\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-26 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656244800,\n" +
            "\"main\": {\n" +
            "\"temp\": 24.9,\n" +
            "\"feels_like\": 24.86,\n" +
            "\"temp_min\": 24.9,\n" +
            "\"temp_max\": 24.9,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 54,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 500,\n" +
            "\"main\": \"Rain\",\n" +
            "\"description\": \"light rain\",\n" +
            "\"icon\": \"10d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 93\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.61,\n" +
            "\"deg\": 28,\n" +
            "\"gust\": 3.3\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.21,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.13\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-26 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656255600,\n" +
            "\"main\": {\n" +
            "\"temp\": 24.51,\n" +
            "\"feels_like\": 24.45,\n" +
            "\"temp_min\": 24.51,\n" +
            "\"temp_max\": 24.51,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 55,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 804,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"overcast clouds\",\n" +
            "\"icon\": \"04d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 97\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.69,\n" +
            "\"deg\": 40,\n" +
            "\"gust\": 3.26\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.15,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-26 15:00:00\"\n" +
            "}\n" +
            "],\n" +
            "\"city\": {\n" +
            "\"id\": 2950159,\n" +
            "\"name\": \"Berlin\",\n" +
            "\"coord\": {\n" +
            "\"lat\": 52.5244,\n" +
            "\"lon\": 13.4105\n" +
            "},\n" +
            "\"country\": \"DE\",\n" +
            "\"population\": 1000000,\n" +
            "\"timezone\": 7200,\n" +
            "\"sunrise\": 1655779381,\n" +
            "\"sunset\": 1655839987\n" +
            "}\n" +
            "}";

}

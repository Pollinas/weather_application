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
            "\"dt\": 1655650800,\n" +
            "\"main\": {\n" +
            "\"temp\": 30.56,\n" +
            "\"feels_like\": 30.49,\n" +
            "\"temp_min\": 30.16,\n" +
            "\"temp_max\": 30.56,\n" +
            "\"pressure\": 995,\n" +
            "\"sea_level\": 995,\n" +
            "\"grnd_level\": 1001,\n" +
            "\"humidity\": 41,\n" +
            "\"temp_kf\": 0.4\n" +
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
            "\"speed\": 7.06,\n" +
            "\"deg\": 306,\n" +
            "\"gust\": 7.76\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655661600,\n" +
            "\"main\": {\n" +
            "\"temp\": 27.81,\n" +
            "\"feels_like\": 28.08,\n" +
            "\"temp_min\": 22.31,\n" +
            "\"temp_max\": 27.81,\n" +
            "\"pressure\": 999,\n" +
            "\"sea_level\": 999,\n" +
            "\"grnd_level\": 1003,\n" +
            "\"humidity\": 48,\n" +
            "\"temp_kf\": 5.5\n" +
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
            "\"all\": 19\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.96,\n" +
            "\"deg\": 21,\n" +
            "\"gust\": 5.51\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.31,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.11\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655672400,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.19,\n" +
            "\"feels_like\": 21.01,\n" +
            "\"temp_min\": 16.51,\n" +
            "\"temp_max\": 21.19,\n" +
            "\"pressure\": 1006,\n" +
            "\"sea_level\": 1006,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 63,\n" +
            "\"temp_kf\": 4.68\n" +
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
            "\"all\": 47\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.96,\n" +
            "\"deg\": 31,\n" +
            "\"gust\": 6.45\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.29,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655683200,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.07,\n" +
            "\"feels_like\": 14.72,\n" +
            "\"temp_min\": 15.07,\n" +
            "\"temp_max\": 15.07,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 80,\n" +
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
            "\"all\": 37\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.01,\n" +
            "\"deg\": 53,\n" +
            "\"gust\": 2.88\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.29,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.22\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655694000,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.01,\n" +
            "\"feels_like\": 13.66,\n" +
            "\"temp_min\": 14.01,\n" +
            "\"temp_max\": 14.01,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 84,\n" +
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
            "\"all\": 44\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.42,\n" +
            "\"deg\": 17,\n" +
            "\"gust\": 2.26\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.26,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.1\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655704800,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.21,\n" +
            "\"feels_like\": 14.04,\n" +
            "\"temp_min\": 14.21,\n" +
            "\"temp_max\": 14.21,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 90,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 501,\n" +
            "\"main\": \"Rain\",\n" +
            "\"description\": \"moderate rain\",\n" +
            "\"icon\": \"10d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 72\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.47,\n" +
            "\"deg\": 4,\n" +
            "\"gust\": 3.09\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.93,\n" +
            "\"rain\": {\n" +
            "\"3h\": 4.49\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655715600,\n" +
            "\"main\": {\n" +
            "\"temp\": 13.92,\n" +
            "\"feels_like\": 13.77,\n" +
            "\"temp_min\": 13.92,\n" +
            "\"temp_max\": 13.92,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 92,\n" +
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
            "\"speed\": 2.45,\n" +
            "\"deg\": 344,\n" +
            "\"gust\": 3.36\n" +
            "},\n" +
            "\"visibility\": 7542,\n" +
            "\"pop\": 0.77,\n" +
            "\"rain\": {\n" +
            "\"3h\": 1.46\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655726400,\n" +
            "\"main\": {\n" +
            "\"temp\": 13.8,\n" +
            "\"feels_like\": 13.61,\n" +
            "\"temp_min\": 13.8,\n" +
            "\"temp_max\": 13.8,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 91,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 501,\n" +
            "\"main\": \"Rain\",\n" +
            "\"description\": \"moderate rain\",\n" +
            "\"icon\": \"10d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 100\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.52,\n" +
            "\"deg\": 318,\n" +
            "\"gust\": 3.89\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.98,\n" +
            "\"rain\": {\n" +
            "\"3h\": 3.57\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655737200,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.85,\n" +
            "\"feels_like\": 14.45,\n" +
            "\"temp_min\": 14.85,\n" +
            "\"temp_max\": 14.85,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 79,\n" +
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
            "\"speed\": 4.04,\n" +
            "\"deg\": 266,\n" +
            "\"gust\": 6.62\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.86,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.78\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655748000,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.03,\n" +
            "\"feels_like\": 14.42,\n" +
            "\"temp_min\": 15.03,\n" +
            "\"temp_max\": 15.03,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 70,\n" +
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
            "\"all\": 84\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.66,\n" +
            "\"deg\": 287,\n" +
            "\"gust\": 9.83\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.99,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.63\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655758800,\n" +
            "\"main\": {\n" +
            "\"temp\": 12.69,\n" +
            "\"feels_like\": 12,\n" +
            "\"temp_min\": 12.69,\n" +
            "\"temp_max\": 12.69,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 76,\n" +
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
            "\"all\": 21\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.72,\n" +
            "\"deg\": 288,\n" +
            "\"gust\": 11.58\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.94,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.91\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655769600,\n" +
            "\"main\": {\n" +
            "\"temp\": 11.55,\n" +
            "\"feels_like\": 10.98,\n" +
            "\"temp_min\": 11.55,\n" +
            "\"temp_max\": 11.55,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 85,\n" +
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
            "\"all\": 41\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.76,\n" +
            "\"deg\": 280,\n" +
            "\"gust\": 12.25\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.66,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-21 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655780400,\n" +
            "\"main\": {\n" +
            "\"temp\": 10.65,\n" +
            "\"feels_like\": 10.15,\n" +
            "\"temp_min\": 10.65,\n" +
            "\"temp_max\": 10.65,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 91,\n" +
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
            "\"all\": 36\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.26,\n" +
            "\"deg\": 277,\n" +
            "\"gust\": 11.95\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-21 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655791200,\n" +
            "\"main\": {\n" +
            "\"temp\": 13.2,\n" +
            "\"feels_like\": 12.59,\n" +
            "\"temp_min\": 13.2,\n" +
            "\"temp_max\": 13.2,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 77,\n" +
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
            "\"all\": 61\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.62,\n" +
            "\"deg\": 293,\n" +
            "\"gust\": 10.2\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-21 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655802000,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.75,\n" +
            "\"feels_like\": 18.9,\n" +
            "\"temp_min\": 19.75,\n" +
            "\"temp_max\": 19.75,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 43,\n" +
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
            "\"all\": 9\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.02,\n" +
            "\"deg\": 305,\n" +
            "\"gust\": 5.75\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-21 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655812800,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.37,\n" +
            "\"feels_like\": 22.62,\n" +
            "\"temp_min\": 23.37,\n" +
            "\"temp_max\": 23.37,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 33,\n" +
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
            "\"speed\": 5.03,\n" +
            "\"deg\": 288,\n" +
            "\"gust\": 6.9\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-21 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655823600,\n" +
            "\"main\": {\n" +
            "\"temp\": 24.42,\n" +
            "\"feels_like\": 23.65,\n" +
            "\"temp_min\": 24.42,\n" +
            "\"temp_max\": 24.42,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 28,\n" +
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
            "\"all\": 61\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.31,\n" +
            "\"deg\": 300,\n" +
            "\"gust\": 5.75\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-21 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655834400,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.94,\n" +
            "\"feels_like\": 21.16,\n" +
            "\"temp_min\": 21.94,\n" +
            "\"temp_max\": 21.94,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 37,\n" +
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
            "\"all\": 64\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.07,\n" +
            "\"deg\": 346,\n" +
            "\"gust\": 4.55\n" +
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
            "\"temp\": 16.87,\n" +
            "\"feels_like\": 16.15,\n" +
            "\"temp_min\": 16.87,\n" +
            "\"temp_max\": 16.87,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 59,\n" +
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
            "\"all\": 75\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.68,\n" +
            "\"deg\": 56,\n" +
            "\"gust\": 5.52\n" +
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
            "\"temp\": 14.89,\n" +
            "\"feels_like\": 14.16,\n" +
            "\"temp_min\": 14.89,\n" +
            "\"temp_max\": 14.89,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 66,\n" +
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
            "\"all\": 57\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.89,\n" +
            "\"deg\": 70,\n" +
            "\"gust\": 3.08\n" +
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
            "\"temp\": 13.9,\n" +
            "\"feels_like\": 13.12,\n" +
            "\"temp_min\": 13.9,\n" +
            "\"temp_max\": 13.9,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 68,\n" +
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
            "\"all\": 79\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.09,\n" +
            "\"deg\": 83,\n" +
            "\"gust\": 1.17\n" +
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
            "\"temp\": 17.88,\n" +
            "\"feels_like\": 17.13,\n" +
            "\"temp_min\": 17.88,\n" +
            "\"temp_max\": 17.88,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 54,\n" +
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
            "\"all\": 67\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.35,\n" +
            "\"deg\": 74,\n" +
            "\"gust\": 1.48\n" +
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
            "\"temp\": 23.16,\n" +
            "\"feels_like\": 22.52,\n" +
            "\"temp_min\": 23.16,\n" +
            "\"temp_max\": 23.16,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 38,\n" +
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
            "\"all\": 42\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 0.53,\n" +
            "\"deg\": 303,\n" +
            "\"gust\": 1.61\n" +
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
            "\"temp\": 25.95,\n" +
            "\"feels_like\": 25.95,\n" +
            "\"temp_min\": 25.95,\n" +
            "\"temp_max\": 25.95,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 27,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 801,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"few clouds\",\n" +
            "\"icon\": \"02d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 24\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.97,\n" +
            "\"deg\": 262,\n" +
            "\"gust\": 3.09\n" +
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
            "\"temp\": 26.81,\n" +
            "\"feels_like\": 26.09,\n" +
            "\"temp_min\": 26.81,\n" +
            "\"temp_max\": 26.81,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
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
            "\"all\": 5\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.12,\n" +
            "\"deg\": 293,\n" +
            "\"gust\": 3.22\n" +
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
            "\"temp\": 24.71,\n" +
            "\"feels_like\": 24.05,\n" +
            "\"temp_min\": 24.71,\n" +
            "\"temp_max\": 24.71,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 31,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 801,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"few clouds\",\n" +
            "\"icon\": \"02d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 20\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.36,\n" +
            "\"deg\": 351,\n" +
            "\"gust\": 3.19\n" +
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
            "\"temp\": 18.83,\n" +
            "\"feels_like\": 18.18,\n" +
            "\"temp_min\": 18.83,\n" +
            "\"temp_max\": 18.83,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 54,\n" +
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
            "\"speed\": 3.34,\n" +
            "\"deg\": 52,\n" +
            "\"gust\": 7.54\n" +
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
            "\"temp\": 16.3,\n" +
            "\"feels_like\": 15.74,\n" +
            "\"temp_min\": 16.3,\n" +
            "\"temp_max\": 16.3,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 67,\n" +
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
            "\"all\": 3\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.52,\n" +
            "\"deg\": 60,\n" +
            "\"gust\": 4.86\n" +
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
            "\"temp\": 14.95,\n" +
            "\"feels_like\": 14.43,\n" +
            "\"temp_min\": 14.95,\n" +
            "\"temp_max\": 14.95,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 74,\n" +
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
            "\"all\": 31\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.92,\n" +
            "\"deg\": 49,\n" +
            "\"gust\": 3.19\n" +
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
            "\"temp\": 18.74,\n" +
            "\"feels_like\": 18.18,\n" +
            "\"temp_min\": 18.74,\n" +
            "\"temp_max\": 18.74,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 58,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 801,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"few clouds\",\n" +
            "\"icon\": \"02d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 19\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.16,\n" +
            "\"deg\": 51,\n" +
            "\"gust\": 2.75\n" +
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
            "\"temp\": 24.71,\n" +
            "\"feels_like\": 24.23,\n" +
            "\"temp_min\": 24.71,\n" +
            "\"temp_max\": 24.71,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1010,\n" +
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
            "\"all\": 10\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.32,\n" +
            "\"deg\": 19,\n" +
            "\"gust\": 1.3\n" +
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
            "\"temp\": 28.49,\n" +
            "\"feels_like\": 27.37,\n" +
            "\"temp_min\": 28.49,\n" +
            "\"temp_max\": 28.49,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 28,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 801,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"few clouds\",\n" +
            "\"icon\": \"02d\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 11\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 0.8,\n" +
            "\"deg\": 324,\n" +
            "\"gust\": 1.53\n" +
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
            "\"temp\": 29.46,\n" +
            "\"feels_like\": 27.99,\n" +
            "\"temp_min\": 29.46,\n" +
            "\"temp_max\": 29.46,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 25,\n" +
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
            "\"speed\": 0.42,\n" +
            "\"deg\": 325,\n" +
            "\"gust\": 1.14\n" +
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
            "\"temp\": 27.29,\n" +
            "\"feels_like\": 26.69,\n" +
            "\"temp_min\": 27.29,\n" +
            "\"temp_max\": 27.29,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
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
            "\"speed\": 1.28,\n" +
            "\"deg\": 81,\n" +
            "\"gust\": 1.35\n" +
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
            "\"temp\": 21.92,\n" +
            "\"feels_like\": 21.5,\n" +
            "\"temp_min\": 21.92,\n" +
            "\"temp_max\": 21.92,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 51,\n" +
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
            "\"speed\": 2.81,\n" +
            "\"deg\": 79,\n" +
            "\"gust\": 5.77\n" +
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
            "\"temp\": 19.48,\n" +
            "\"feels_like\": 19.18,\n" +
            "\"temp_min\": 19.48,\n" +
            "\"temp_max\": 19.48,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1010,\n" +
            "\"humidity\": 65,\n" +
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
            "\"speed\": 3.33,\n" +
            "\"deg\": 102,\n" +
            "\"gust\": 8.61\n" +
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
            "\"temp\": 18.16,\n" +
            "\"feels_like\": 17.78,\n" +
            "\"temp_min\": 18.16,\n" +
            "\"temp_max\": 18.16,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1010,\n" +
            "\"humidity\": 67,\n" +
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
            "\"speed\": 2.89,\n" +
            "\"deg\": 113,\n" +
            "\"gust\": 6.54\n" +
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
            "\"temp\": 22.76,\n" +
            "\"feels_like\": 22.32,\n" +
            "\"temp_min\": 22.76,\n" +
            "\"temp_max\": 22.76,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 47,\n" +
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
            "\"speed\": 3.3,\n" +
            "\"deg\": 121,\n" +
            "\"gust\": 5.25\n" +
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
            "\"temp\": 28.95,\n" +
            "\"feels_like\": 28.02,\n" +
            "\"temp_min\": 28.95,\n" +
            "\"temp_max\": 28.95,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 33,\n" +
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
            "\"all\": 84\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.94,\n" +
            "\"deg\": 140,\n" +
            "\"gust\": 5.38\n" +
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
            "\"temp\": 32.07,\n" +
            "\"feels_like\": 30.39,\n" +
            "\"temp_min\": 32.07,\n" +
            "\"temp_max\": 32.07,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 25,\n" +
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
            "\"all\": 84\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.09,\n" +
            "\"deg\": 138,\n" +
            "\"gust\": 5.94\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-24 12:00:00\"\n" +
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
            "\"sunrise\": 1655606565,\n" +
            "\"sunset\": 1655667155\n" +
            "}\n" +
            "}";

}

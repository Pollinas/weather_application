package com.weather.controller.service;

import com.google.gson.Gson;
import com.weather.model.dto.WeatherDTO;


public class RequestWeatherMockService implements RequestService {


    @Override
    public WeatherDTO sendRequestToWeatherAPI(String cityName) {

        return new Gson().fromJson(json, WeatherDTO.class);

    }

    private static final String json = "{\n" +
            "\"cod\": \"200\",\n" +
            "\"message\": 0,\n" +
            "\"cnt\": 40,\n" +
            "\"list\": [\n" +
            "{\n" +
            "\"dt\": 1656849600,\n" +
            "\"main\": {\n" +
            "\"temp\": 27.26,\n" +
            "\"feels_like\": 26.95,\n" +
            "\"temp_min\": 27.26,\n" +
            "\"temp_max\": 28.65,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1012,\n" +
            "\"humidity\": 38,\n" +
            "\"temp_kf\": -1.39\n" +
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
            "\"speed\": 2.82,\n" +
            "\"deg\": 175,\n" +
            "\"gust\": 3.61\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-03 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656860400,\n" +
            "\"main\": {\n" +
            "\"temp\": 29.1,\n" +
            "\"feels_like\": 28.02,\n" +
            "\"temp_min\": 29.1,\n" +
            "\"temp_max\": 30.37,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1010,\n" +
            "\"humidity\": 31,\n" +
            "\"temp_kf\": -1.27\n" +
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
            "\"speed\": 1.98,\n" +
            "\"deg\": 164,\n" +
            "\"gust\": 4.48\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-03 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656871200,\n" +
            "\"main\": {\n" +
            "\"temp\": 26.73,\n" +
            "\"feels_like\": 26.58,\n" +
            "\"temp_min\": 26.73,\n" +
            "\"temp_max\": 26.73,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
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
            "\"all\": 35\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.09,\n" +
            "\"deg\": 305,\n" +
            "\"gust\": 6.98\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-03 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656882000,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.33,\n" +
            "\"feels_like\": 22,\n" +
            "\"temp_min\": 22.33,\n" +
            "\"temp_max\": 22.33,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
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
            "\"all\": 73\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.95,\n" +
            "\"deg\": 3,\n" +
            "\"gust\": 9.21\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-03 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656892800,\n" +
            "\"main\": {\n" +
            "\"temp\": 20.14,\n" +
            "\"feels_like\": 19.85,\n" +
            "\"temp_min\": 20.14,\n" +
            "\"temp_max\": 20.14,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1010,\n" +
            "\"humidity\": 63,\n" +
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
            "\"all\": 64\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.88,\n" +
            "\"deg\": 319,\n" +
            "\"gust\": 5.14\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.08,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-04 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656903600,\n" +
            "\"main\": {\n" +
            "\"temp\": 18.25,\n" +
            "\"feels_like\": 17.93,\n" +
            "\"temp_min\": 18.25,\n" +
            "\"temp_max\": 18.25,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1010,\n" +
            "\"humidity\": 69,\n" +
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
            "\"all\": 37\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.63,\n" +
            "\"deg\": 330,\n" +
            "\"gust\": 4.52\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.12,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-04 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656914400,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.25,\n" +
            "\"feels_like\": 18.98,\n" +
            "\"temp_min\": 19.25,\n" +
            "\"temp_max\": 19.25,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1012,\n" +
            "\"humidity\": 67,\n" +
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
            "\"all\": 35\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.31,\n" +
            "\"deg\": 307,\n" +
            "\"gust\": 7.06\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.23,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.21\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-04 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656925200,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.26,\n" +
            "\"feels_like\": 22.89,\n" +
            "\"temp_min\": 23.26,\n" +
            "\"temp_max\": 23.26,\n" +
            "\"pressure\": 1018,\n" +
            "\"sea_level\": 1018,\n" +
            "\"grnd_level\": 1013,\n" +
            "\"humidity\": 48,\n" +
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
            "\"speed\": 4.57,\n" +
            "\"deg\": 285,\n" +
            "\"gust\": 5.63\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-04 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656936000,\n" +
            "\"main\": {\n" +
            "\"temp\": 25.7,\n" +
            "\"feels_like\": 25.08,\n" +
            "\"temp_min\": 25.7,\n" +
            "\"temp_max\": 25.7,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1012,\n" +
            "\"humidity\": 29,\n" +
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
            "\"speed\": 5.01,\n" +
            "\"deg\": 271,\n" +
            "\"gust\": 6.59\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-04 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656946800,\n" +
            "\"main\": {\n" +
            "\"temp\": 26.48,\n" +
            "\"feels_like\": 26.48,\n" +
            "\"temp_min\": 26.48,\n" +
            "\"temp_max\": 26.48,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1012,\n" +
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
            "\"all\": 0\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.57,\n" +
            "\"deg\": 280,\n" +
            "\"gust\": 6.07\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-04 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656957600,\n" +
            "\"main\": {\n" +
            "\"temp\": 24.58,\n" +
            "\"feels_like\": 23.9,\n" +
            "\"temp_min\": 24.58,\n" +
            "\"temp_max\": 24.58,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 31,\n" +
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
            "\"speed\": 3.07,\n" +
            "\"deg\": 278,\n" +
            "\"gust\": 4.96\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-04 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656968400,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.66,\n" +
            "\"feels_like\": 18.99,\n" +
            "\"temp_min\": 19.66,\n" +
            "\"temp_max\": 19.66,\n" +
            "\"pressure\": 1019,\n" +
            "\"sea_level\": 1019,\n" +
            "\"grnd_level\": 1013,\n" +
            "\"humidity\": 50,\n" +
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
            "\"speed\": 2.72,\n" +
            "\"deg\": 351,\n" +
            "\"gust\": 5.93\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-04 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656979200,\n" +
            "\"main\": {\n" +
            "\"temp\": 17.73,\n" +
            "\"feels_like\": 17.1,\n" +
            "\"temp_min\": 17.73,\n" +
            "\"temp_max\": 17.73,\n" +
            "\"pressure\": 1019,\n" +
            "\"sea_level\": 1019,\n" +
            "\"grnd_level\": 1014,\n" +
            "\"humidity\": 59,\n" +
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
            "\"all\": 16\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.58,\n" +
            "\"deg\": 346,\n" +
            "\"gust\": 2.44\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-05 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1656990000,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.06,\n" +
            "\"feels_like\": 15.5,\n" +
            "\"temp_min\": 16.06,\n" +
            "\"temp_max\": 16.06,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
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
            "\"all\": 59\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.36,\n" +
            "\"deg\": 320,\n" +
            "\"gust\": 5.58\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-05 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657000800,\n" +
            "\"main\": {\n" +
            "\"temp\": 17.38,\n" +
            "\"feels_like\": 16.66,\n" +
            "\"temp_min\": 17.38,\n" +
            "\"temp_max\": 17.38,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
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
            "\"all\": 30\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.98,\n" +
            "\"deg\": 303,\n" +
            "\"gust\": 6.03\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-05 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657011600,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.37,\n" +
            "\"feels_like\": 20.55,\n" +
            "\"temp_min\": 21.37,\n" +
            "\"temp_max\": 21.37,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
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
            "\"all\": 1\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.32,\n" +
            "\"deg\": 277,\n" +
            "\"gust\": 6.4\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-05 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657022400,\n" +
            "\"main\": {\n" +
            "\"temp\": 24.28,\n" +
            "\"feels_like\": 23.52,\n" +
            "\"temp_min\": 24.28,\n" +
            "\"temp_max\": 24.28,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 29,\n" +
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
            "\"speed\": 4.65,\n" +
            "\"deg\": 273,\n" +
            "\"gust\": 6.43\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-05 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657033200,\n" +
            "\"main\": {\n" +
            "\"temp\": 25.68,\n" +
            "\"feels_like\": 24.96,\n" +
            "\"temp_min\": 25.68,\n" +
            "\"temp_max\": 25.68,\n" +
            "\"pressure\": 1019,\n" +
            "\"sea_level\": 1019,\n" +
            "\"grnd_level\": 1014,\n" +
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
            "\"speed\": 4.41,\n" +
            "\"deg\": 275,\n" +
            "\"gust\": 6.77\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-05 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657044000,\n" +
            "\"main\": {\n" +
            "\"temp\": 24.01,\n" +
            "\"feels_like\": 23.2,\n" +
            "\"temp_min\": 24.01,\n" +
            "\"temp_max\": 24.01,\n" +
            "\"pressure\": 1018,\n" +
            "\"sea_level\": 1018,\n" +
            "\"grnd_level\": 1013,\n" +
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
            "\"all\": 14\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.12,\n" +
            "\"deg\": 295,\n" +
            "\"gust\": 6.62\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-05 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657054800,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.16,\n" +
            "\"feels_like\": 18.41,\n" +
            "\"temp_min\": 19.16,\n" +
            "\"temp_max\": 19.16,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 49,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 804,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"overcast clouds\",\n" +
            "\"icon\": \"04n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 95\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.21,\n" +
            "\"deg\": 347,\n" +
            "\"gust\": 4.34\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-05 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657065600,\n" +
            "\"main\": {\n" +
            "\"temp\": 17.21,\n" +
            "\"feels_like\": 16.47,\n" +
            "\"temp_min\": 17.21,\n" +
            "\"temp_max\": 17.21,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 57,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 804,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"overcast clouds\",\n" +
            "\"icon\": \"04n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 86\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.67,\n" +
            "\"deg\": 330,\n" +
            "\"gust\": 5.14\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-06 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657076400,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.19,\n" +
            "\"feels_like\": 13.49,\n" +
            "\"temp_min\": 14.19,\n" +
            "\"temp_max\": 14.19,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 70,\n" +
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
            "\"speed\": 3.52,\n" +
            "\"deg\": 302,\n" +
            "\"gust\": 6.67\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-06 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657087200,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.76,\n" +
            "\"feels_like\": 15.06,\n" +
            "\"temp_min\": 15.76,\n" +
            "\"temp_max\": 15.76,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 64,\n" +
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
            "\"all\": 46\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.45,\n" +
            "\"deg\": 294,\n" +
            "\"gust\": 7.07\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-06 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657098000,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.92,\n" +
            "\"feels_like\": 19.04,\n" +
            "\"temp_min\": 19.92,\n" +
            "\"temp_max\": 19.92,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 41,\n" +
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
            "\"speed\": 4.9,\n" +
            "\"deg\": 286,\n" +
            "\"gust\": 6.63\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-06 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657108800,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.13,\n" +
            "\"feels_like\": 18.22,\n" +
            "\"temp_min\": 19.13,\n" +
            "\"temp_max\": 19.13,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 43,\n" +
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
            "\"all\": 44\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.48,\n" +
            "\"deg\": 290,\n" +
            "\"gust\": 6.59\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-06 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657119600,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.48,\n" +
            "\"feels_like\": 18.61,\n" +
            "\"temp_min\": 19.48,\n" +
            "\"temp_max\": 19.48,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 43,\n" +
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
            "\"all\": 100\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.75,\n" +
            "\"deg\": 301,\n" +
            "\"gust\": 6\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-06 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657130400,\n" +
            "\"main\": {\n" +
            "\"temp\": 18.56,\n" +
            "\"feels_like\": 17.7,\n" +
            "\"temp_min\": 18.56,\n" +
            "\"temp_max\": 18.56,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 47,\n" +
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
            "\"all\": 100\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.47,\n" +
            "\"deg\": 332,\n" +
            "\"gust\": 3.8\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-06 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657141200,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.47,\n" +
            "\"feels_like\": 15.53,\n" +
            "\"temp_min\": 16.47,\n" +
            "\"temp_max\": 16.47,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 52,\n" +
            "\"temp_kf\": 0\n" +
            "},\n" +
            "\"weather\": [\n" +
            "{\n" +
            "\"id\": 804,\n" +
            "\"main\": \"Clouds\",\n" +
            "\"description\": \"overcast clouds\",\n" +
            "\"icon\": \"04n\"\n" +
            "}\n" +
            "],\n" +
            "\"clouds\": {\n" +
            "\"all\": 89\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.85,\n" +
            "\"deg\": 238,\n" +
            "\"gust\": 3.57\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-06 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657152000,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.12,\n" +
            "\"feels_like\": 13.08,\n" +
            "\"temp_min\": 14.12,\n" +
            "\"temp_max\": 14.12,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 57,\n" +
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
            "\"all\": 73\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.54,\n" +
            "\"deg\": 295,\n" +
            "\"gust\": 4.77\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-07 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657162800,\n" +
            "\"main\": {\n" +
            "\"temp\": 13.29,\n" +
            "\"feels_like\": 12.27,\n" +
            "\"temp_min\": 13.29,\n" +
            "\"temp_max\": 13.29,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1014,\n" +
            "\"humidity\": 61,\n" +
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
            "\"speed\": 2.23,\n" +
            "\"deg\": 240,\n" +
            "\"gust\": 4.35\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-07 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657173600,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.91,\n" +
            "\"feels_like\": 14.89,\n" +
            "\"temp_min\": 15.91,\n" +
            "\"temp_max\": 15.91,\n" +
            "\"pressure\": 1019,\n" +
            "\"sea_level\": 1019,\n" +
            "\"grnd_level\": 1014,\n" +
            "\"humidity\": 51,\n" +
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
            "\"all\": 83\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.2,\n" +
            "\"deg\": 246,\n" +
            "\"gust\": 9.39\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-07 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657184400,\n" +
            "\"main\": {\n" +
            "\"temp\": 12.91,\n" +
            "\"feels_like\": 12.63,\n" +
            "\"temp_min\": 12.91,\n" +
            "\"temp_max\": 12.91,\n" +
            "\"pressure\": 1018,\n" +
            "\"sea_level\": 1018,\n" +
            "\"grnd_level\": 1013,\n" +
            "\"humidity\": 91,\n" +
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
            "\"speed\": 4.45,\n" +
            "\"deg\": 211,\n" +
            "\"gust\": 10.31\n" +
            "},\n" +
            "\"visibility\": 9317,\n" +
            "\"pop\": 0.9,\n" +
            "\"rain\": {\n" +
            "\"3h\": 1.9\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-07 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657195200,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.53,\n" +
            "\"feels_like\": 14.28,\n" +
            "\"temp_min\": 14.53,\n" +
            "\"temp_max\": 14.53,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 86,\n" +
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
            "\"speed\": 4.75,\n" +
            "\"deg\": 222,\n" +
            "\"gust\": 10.52\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 1,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.85\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-07 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657206000,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.84,\n" +
            "\"feels_like\": 15.86,\n" +
            "\"temp_min\": 15.84,\n" +
            "\"temp_max\": 15.84,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1010,\n" +
            "\"humidity\": 91,\n" +
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
            "\"speed\": 3.9,\n" +
            "\"deg\": 255,\n" +
            "\"gust\": 9.04\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.85,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.79\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-07 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657216800,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.7,\n" +
            "\"feels_like\": 16.72,\n" +
            "\"temp_min\": 16.7,\n" +
            "\"temp_max\": 16.7,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1010,\n" +
            "\"humidity\": 88,\n" +
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
            "\"speed\": 3.86,\n" +
            "\"deg\": 274,\n" +
            "\"gust\": 8.45\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 1,\n" +
            "\"rain\": {\n" +
            "\"3h\": 1.06\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-07 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657227600,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.21,\n" +
            "\"feels_like\": 15.27,\n" +
            "\"temp_min\": 15.21,\n" +
            "\"temp_max\": 15.21,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 95,\n" +
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
            "\"all\": 76\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.49,\n" +
            "\"deg\": 289,\n" +
            "\"gust\": 11.35\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.73,\n" +
            "\"rain\": {\n" +
            "\"3h\": 1\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-07 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657238400,\n" +
            "\"main\": {\n" +
            "\"temp\": 12.89,\n" +
            "\"feels_like\": 12.64,\n" +
            "\"temp_min\": 12.89,\n" +
            "\"temp_max\": 12.89,\n" +
            "\"pressure\": 1018,\n" +
            "\"sea_level\": 1018,\n" +
            "\"grnd_level\": 1013,\n" +
            "\"humidity\": 92,\n" +
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
            "\"all\": 46\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.95,\n" +
            "\"deg\": 287,\n" +
            "\"gust\": 11.76\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.52,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-08 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657249200,\n" +
            "\"main\": {\n" +
            "\"temp\": 12.33,\n" +
            "\"feels_like\": 12.1,\n" +
            "\"temp_min\": 12.33,\n" +
            "\"temp_max\": 12.33,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1014,\n" +
            "\"humidity\": 95,\n" +
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
            "\"all\": 32\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5,\n" +
            "\"deg\": 289,\n" +
            "\"gust\": 12.2\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-08 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657260000,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.13,\n" +
            "\"feels_like\": 13.77,\n" +
            "\"temp_min\": 14.13,\n" +
            "\"temp_max\": 14.13,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 83,\n" +
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
            "\"all\": 47\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.7,\n" +
            "\"deg\": 299,\n" +
            "\"gust\": 9.91\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-08 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1657270800,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.01,\n" +
            "\"feels_like\": 18.48,\n" +
            "\"temp_min\": 19.01,\n" +
            "\"temp_max\": 19.01,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 58,\n" +
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
            "\"speed\": 5.46,\n" +
            "\"deg\": 303,\n" +
            "\"gust\": 7.27\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-07-08 09:00:00\"\n" +
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
            "\"sunrise\": 1656816537,\n" +
            "\"sunset\": 1656876709\n" +
            "}\n" +
            "}";

}

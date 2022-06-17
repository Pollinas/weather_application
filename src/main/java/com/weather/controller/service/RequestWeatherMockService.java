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
            "\"dt\": 1655488800,\n" +
            "\"main\": {\n" +
            "\"temp\": 25.17,\n" +
            "\"feels_like\": 24.66,\n" +
            "\"temp_min\": 24.12,\n" +
            "\"temp_max\": 25.17,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 35,\n" +
            "\"temp_kf\": 1.05\n" +
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
            "\"all\": 33\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.62,\n" +
            "\"deg\": 281,\n" +
            "\"gust\": 3.84\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-17 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655499600,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.83,\n" +
            "\"feels_like\": 22.24,\n" +
            "\"temp_min\": 21.4,\n" +
            "\"temp_max\": 22.83,\n" +
            "\"pressure\": 1019,\n" +
            "\"sea_level\": 1019,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 41,\n" +
            "\"temp_kf\": 1.43\n" +
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
            "\"all\": 67\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.52,\n" +
            "\"deg\": 326,\n" +
            "\"gust\": 2.79\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-17 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655510400,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.89,\n" +
            "\"feels_like\": 19.16,\n" +
            "\"temp_min\": 19.89,\n" +
            "\"temp_max\": 19.89,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 47,\n" +
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
            "\"all\": 99\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.36,\n" +
            "\"deg\": 192,\n" +
            "\"gust\": 4.33\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-18 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655521200,\n" +
            "\"main\": {\n" +
            "\"temp\": 18.26,\n" +
            "\"feels_like\": 17.45,\n" +
            "\"temp_min\": 18.26,\n" +
            "\"temp_max\": 18.26,\n" +
            "\"pressure\": 1019,\n" +
            "\"sea_level\": 1019,\n" +
            "\"grnd_level\": 1013,\n" +
            "\"humidity\": 50,\n" +
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
            "\"speed\": 3.36,\n" +
            "\"deg\": 189,\n" +
            "\"gust\": 9.72\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-18 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655532000,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.35,\n" +
            "\"feels_like\": 21.79,\n" +
            "\"temp_min\": 22.35,\n" +
            "\"temp_max\": 22.35,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1012,\n" +
            "\"humidity\": 44,\n" +
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
            "\"all\": 90\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.52,\n" +
            "\"deg\": 224,\n" +
            "\"gust\": 8.66\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-18 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655542800,\n" +
            "\"main\": {\n" +
            "\"temp\": 28.59,\n" +
            "\"feels_like\": 27.98,\n" +
            "\"temp_min\": 28.59,\n" +
            "\"temp_max\": 28.59,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 37,\n" +
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
            "\"speed\": 5.32,\n" +
            "\"deg\": 259,\n" +
            "\"gust\": 8.37\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-18 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655553600,\n" +
            "\"main\": {\n" +
            "\"temp\": 31.61,\n" +
            "\"feels_like\": 30.28,\n" +
            "\"temp_min\": 31.61,\n" +
            "\"temp_max\": 31.61,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1010,\n" +
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
            "\"speed\": 5.82,\n" +
            "\"deg\": 279,\n" +
            "\"gust\": 7.97\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-18 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655564400,\n" +
            "\"main\": {\n" +
            "\"temp\": 32.37,\n" +
            "\"feels_like\": 31.12,\n" +
            "\"temp_min\": 32.37,\n" +
            "\"temp_max\": 32.37,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
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
            "\"speed\": 4.82,\n" +
            "\"deg\": 279,\n" +
            "\"gust\": 6.92\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-18 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655575200,\n" +
            "\"main\": {\n" +
            "\"temp\": 30.17,\n" +
            "\"feels_like\": 29.66,\n" +
            "\"temp_min\": 30.17,\n" +
            "\"temp_max\": 30.17,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
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
            "\"speed\": 3.41,\n" +
            "\"deg\": 277,\n" +
            "\"gust\": 5.67\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-18 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655586000,\n" +
            "\"main\": {\n" +
            "\"temp\": 24.3,\n" +
            "\"feels_like\": 24.33,\n" +
            "\"temp_min\": 24.3,\n" +
            "\"temp_max\": 24.3,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
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
            "\"all\": 20\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.06,\n" +
            "\"deg\": 14,\n" +
            "\"gust\": 4.69\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-18 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655596800,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.64,\n" +
            "\"feels_like\": 21.69,\n" +
            "\"temp_min\": 21.64,\n" +
            "\"temp_max\": 21.64,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 70,\n" +
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
            "\"all\": 13\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.88,\n" +
            "\"deg\": 66,\n" +
            "\"gust\": 3.19\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655607600,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.53,\n" +
            "\"feels_like\": 19.6,\n" +
            "\"temp_min\": 19.53,\n" +
            "\"temp_max\": 19.53,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 79,\n" +
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
            "\"all\": 81\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.73,\n" +
            "\"deg\": 70,\n" +
            "\"gust\": 4.2\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.3,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655618400,\n" +
            "\"main\": {\n" +
            "\"temp\": 24.88,\n" +
            "\"feels_like\": 24.81,\n" +
            "\"temp_min\": 24.88,\n" +
            "\"temp_max\": 24.88,\n" +
            "\"pressure\": 1009,\n" +
            "\"sea_level\": 1009,\n" +
            "\"grnd_level\": 1004,\n" +
            "\"humidity\": 53,\n" +
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
            "\"all\": 51\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.88,\n" +
            "\"deg\": 183,\n" +
            "\"gust\": 6.11\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.22,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655629200,\n" +
            "\"main\": {\n" +
            "\"temp\": 31.98,\n" +
            "\"feels_like\": 30.79,\n" +
            "\"temp_min\": 31.98,\n" +
            "\"temp_max\": 31.98,\n" +
            "\"pressure\": 1007,\n" +
            "\"sea_level\": 1007,\n" +
            "\"grnd_level\": 1002,\n" +
            "\"humidity\": 30,\n" +
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
            "\"all\": 16\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.07,\n" +
            "\"deg\": 217,\n" +
            "\"gust\": 7.67\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655640000,\n" +
            "\"main\": {\n" +
            "\"temp\": 36.3,\n" +
            "\"feels_like\": 34.39,\n" +
            "\"temp_min\": 36.3,\n" +
            "\"temp_max\": 36.3,\n" +
            "\"pressure\": 1004,\n" +
            "\"sea_level\": 1004,\n" +
            "\"grnd_level\": 999,\n" +
            "\"humidity\": 19,\n" +
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
            "\"all\": 15\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.53,\n" +
            "\"deg\": 224,\n" +
            "\"gust\": 9.44\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655650800,\n" +
            "\"main\": {\n" +
            "\"temp\": 30.2,\n" +
            "\"feels_like\": 30.05,\n" +
            "\"temp_min\": 30.2,\n" +
            "\"temp_max\": 30.2,\n" +
            "\"pressure\": 1005,\n" +
            "\"sea_level\": 1005,\n" +
            "\"grnd_level\": 1001,\n" +
            "\"humidity\": 41,\n" +
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
            "\"all\": 26\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 7.17,\n" +
            "\"deg\": 337,\n" +
            "\"gust\": 7.81\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.03,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655661600,\n" +
            "\"main\": {\n" +
            "\"temp\": 18.97,\n" +
            "\"feels_like\": 18.7,\n" +
            "\"temp_min\": 18.97,\n" +
            "\"temp_max\": 18.97,\n" +
            "\"pressure\": 1009,\n" +
            "\"sea_level\": 1009,\n" +
            "\"grnd_level\": 1004,\n" +
            "\"humidity\": 68,\n" +
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
            "\"all\": 54\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.4,\n" +
            "\"deg\": 12,\n" +
            "\"gust\": 7.09\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.46,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.53\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655672400,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.47,\n" +
            "\"feels_like\": 15,\n" +
            "\"temp_min\": 15.47,\n" +
            "\"temp_max\": 15.47,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 74,\n" +
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
            "\"all\": 19\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.87,\n" +
            "\"deg\": 14,\n" +
            "\"gust\": 4.54\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.09,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-19 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655683200,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.22,\n" +
            "\"feels_like\": 13.73,\n" +
            "\"temp_min\": 14.22,\n" +
            "\"temp_max\": 14.22,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 78,\n" +
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
            "\"speed\": 2.66,\n" +
            "\"deg\": 360,\n" +
            "\"gust\": 3.97\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.11,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655694000,\n" +
            "\"main\": {\n" +
            "\"temp\": 13.57,\n" +
            "\"feels_like\": 13.12,\n" +
            "\"temp_min\": 13.57,\n" +
            "\"temp_max\": 13.57,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 82,\n" +
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
            "\"all\": 82\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.91,\n" +
            "\"deg\": 344,\n" +
            "\"gust\": 2.7\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.31,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.11\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655704800,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.26,\n" +
            "\"feels_like\": 13.65,\n" +
            "\"temp_min\": 14.26,\n" +
            "\"temp_max\": 14.26,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 73,\n" +
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
            "\"all\": 90\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.66,\n" +
            "\"deg\": 335,\n" +
            "\"gust\": 3.23\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.18,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655715600,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.04,\n" +
            "\"feels_like\": 14.24,\n" +
            "\"temp_min\": 15.04,\n" +
            "\"temp_max\": 15.04,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 63,\n" +
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
            "\"speed\": 3.46,\n" +
            "\"deg\": 322,\n" +
            "\"gust\": 4.34\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.2,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655726400,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.21,\n" +
            "\"feels_like\": 18.23,\n" +
            "\"temp_min\": 19.21,\n" +
            "\"temp_max\": 19.21,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1008,\n" +
            "\"humidity\": 40,\n" +
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
            "\"speed\": 2.7,\n" +
            "\"deg\": 322,\n" +
            "\"gust\": 6.42\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.12,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655737200,\n" +
            "\"main\": {\n" +
            "\"temp\": 20.18,\n" +
            "\"feels_like\": 19.22,\n" +
            "\"temp_min\": 20.18,\n" +
            "\"temp_max\": 20.18,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
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
            "\"all\": 96\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 6.37,\n" +
            "\"deg\": 323,\n" +
            "\"gust\": 8.54\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.02,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655748000,\n" +
            "\"main\": {\n" +
            "\"temp\": 18.73,\n" +
            "\"feels_like\": 17.83,\n" +
            "\"temp_min\": 18.73,\n" +
            "\"temp_max\": 18.73,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 45,\n" +
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
            "\"speed\": 5.79,\n" +
            "\"deg\": 324,\n" +
            "\"gust\": 8.56\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.1,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655758800,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.73,\n" +
            "\"feels_like\": 13.96,\n" +
            "\"temp_min\": 14.73,\n" +
            "\"temp_max\": 14.73,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1011,\n" +
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
            "\"speed\": 3.23,\n" +
            "\"deg\": 328,\n" +
            "\"gust\": 7.71\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-20 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655769600,\n" +
            "\"main\": {\n" +
            "\"temp\": 12.39,\n" +
            "\"feels_like\": 11.56,\n" +
            "\"temp_min\": 12.39,\n" +
            "\"temp_max\": 12.39,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 72,\n" +
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
            "\"speed\": 2.31,\n" +
            "\"deg\": 332,\n" +
            "\"gust\": 4.08\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-21 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655780400,\n" +
            "\"main\": {\n" +
            "\"temp\": 11.23,\n" +
            "\"feels_like\": 10.39,\n" +
            "\"temp_min\": 11.23,\n" +
            "\"temp_max\": 11.23,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 76,\n" +
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
            "\"speed\": 1.69,\n" +
            "\"deg\": 327,\n" +
            "\"gust\": 2.8\n" +
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
            "\"temp\": 14.67,\n" +
            "\"feels_like\": 13.81,\n" +
            "\"temp_min\": 14.67,\n" +
            "\"temp_max\": 14.67,\n" +
            "\"pressure\": 1018,\n" +
            "\"sea_level\": 1018,\n" +
            "\"grnd_level\": 1013,\n" +
            "\"humidity\": 62,\n" +
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
            "\"all\": 28\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.63,\n" +
            "\"deg\": 272,\n" +
            "\"gust\": 3.49\n" +
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
            "\"temp\": 21.03,\n" +
            "\"feels_like\": 20.23,\n" +
            "\"temp_min\": 21.03,\n" +
            "\"temp_max\": 21.03,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 40,\n" +
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
            "\"all\": 41\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.18,\n" +
            "\"deg\": 296,\n" +
            "\"gust\": 1.5\n" +
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
            "\"temp\": 25.18,\n" +
            "\"feels_like\": 24.46,\n" +
            "\"temp_min\": 25.18,\n" +
            "\"temp_max\": 25.18,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 27,\n" +
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
            "\"all\": 28\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 0.66,\n" +
            "\"deg\": 177,\n" +
            "\"gust\": 0.81\n" +
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
            "\"temp\": 25.81,\n" +
            "\"feels_like\": 25.05,\n" +
            "\"temp_min\": 25.81,\n" +
            "\"temp_max\": 25.81,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
            "\"humidity\": 23,\n" +
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
            "\"all\": 72\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.33,\n" +
            "\"deg\": 174,\n" +
            "\"gust\": 1.75\n" +
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
            "\"temp\": 24.15,\n" +
            "\"feels_like\": 23.35,\n" +
            "\"temp_min\": 24.15,\n" +
            "\"temp_max\": 24.15,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 28,\n" +
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
            "\"all\": 40\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.56,\n" +
            "\"deg\": 132,\n" +
            "\"gust\": 1.96\n" +
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
            "\"temp\": 19.17,\n" +
            "\"feels_like\": 18.24,\n" +
            "\"temp_min\": 19.17,\n" +
            "\"temp_max\": 19.17,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 42,\n" +
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
            "\"speed\": 2.76,\n" +
            "\"deg\": 118,\n" +
            "\"gust\": 4.73\n" +
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
            "\"temp\": 16.72,\n" +
            "\"feels_like\": 15.67,\n" +
            "\"temp_min\": 16.72,\n" +
            "\"temp_max\": 16.72,\n" +
            "\"pressure\": 1009,\n" +
            "\"sea_level\": 1009,\n" +
            "\"grnd_level\": 1004,\n" +
            "\"humidity\": 47,\n" +
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
            "\"all\": 13\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.91,\n" +
            "\"deg\": 130,\n" +
            "\"gust\": 6.71\n" +
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
            "\"temp\": 15.71,\n" +
            "\"feels_like\": 14.8,\n" +
            "\"temp_min\": 15.71,\n" +
            "\"temp_max\": 15.71,\n" +
            "\"pressure\": 1007,\n" +
            "\"sea_level\": 1007,\n" +
            "\"grnd_level\": 1002,\n" +
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
            "\"all\": 100\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.11,\n" +
            "\"deg\": 121,\n" +
            "\"gust\": 7.13\n" +
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
            "\"temp\": 19.82,\n" +
            "\"feels_like\": 19.01,\n" +
            "\"temp_min\": 19.82,\n" +
            "\"temp_max\": 19.82,\n" +
            "\"pressure\": 1006,\n" +
            "\"sea_level\": 1006,\n" +
            "\"grnd_level\": 1001,\n" +
            "\"humidity\": 44,\n" +
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
            "\"speed\": 3.3,\n" +
            "\"deg\": 158,\n" +
            "\"gust\": 5.43\n" +
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
            "\"temp\": 24.93,\n" +
            "\"feels_like\": 24.6,\n" +
            "\"temp_min\": 24.93,\n" +
            "\"temp_max\": 24.93,\n" +
            "\"pressure\": 1004,\n" +
            "\"sea_level\": 1004,\n" +
            "\"grnd_level\": 999,\n" +
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
            "\"all\": 99\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.14,\n" +
            "\"deg\": 194,\n" +
            "\"gust\": 5.17\n" +
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
            "\"temp\": 26.76,\n" +
            "\"feels_like\": 26.93,\n" +
            "\"temp_min\": 26.76,\n" +
            "\"temp_max\": 26.76,\n" +
            "\"pressure\": 1003,\n" +
            "\"sea_level\": 1003,\n" +
            "\"grnd_level\": 998,\n" +
            "\"humidity\": 45,\n" +
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
            "\"all\": 96\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.58,\n" +
            "\"deg\": 197,\n" +
            "\"gust\": 5.72\n" +
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
            "\"temp\": 23.54,\n" +
            "\"feels_like\": 23.52,\n" +
            "\"temp_min\": 23.54,\n" +
            "\"temp_max\": 23.54,\n" +
            "\"pressure\": 1002,\n" +
            "\"sea_level\": 1002,\n" +
            "\"grnd_level\": 997,\n" +
            "\"humidity\": 60,\n" +
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
            "\"speed\": 2.66,\n" +
            "\"deg\": 168,\n" +
            "\"gust\": 2.67\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.08,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-22 15:00:00\"\n" +
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
            "\"sunrise\": 1655433761,\n" +
            "\"sunset\": 1655494310\n" +
            "}\n" +
            "}";

}

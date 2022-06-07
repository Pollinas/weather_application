package com.weather.controller.service;

import com.google.gson.Gson;
import com.weather.model.dto.WeatherDTO;

import java.time.Instant;
import java.util.Date;

public class RequestWeatherMockService implements RequestService{


    @Override
    public WeatherDTO JSONToModelConversion(){
        WeatherDTO weatherDTO = new Gson().fromJson(json, WeatherDTO.class);
        return weatherDTO;
    }


    private String json = "{\n" +
            "\"cod\": \"200\",\n" +
            "\"message\": 0,\n" +
            "\"cnt\": 40,\n" +
            "\"list\": [\n" +
            "{\n" +
            "\"dt\": 1654624800,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.38,\n" +
            "\"feels_like\": 22.92,\n" +
            "\"temp_min\": 20.35,\n" +
            "\"temp_max\": 23.38,\n" +
            "\"pressure\": 1001,\n" +
            "\"sea_level\": 1001,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 44,\n" +
            "\"temp_kf\": 3.03\n" +
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
            "\"speed\": 2.08,\n" +
            "\"deg\": 185,\n" +
            "\"gust\": 4.24\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-07 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654635600,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.28,\n" +
            "\"feels_like\": 20.77,\n" +
            "\"temp_min\": 17.08,\n" +
            "\"temp_max\": 21.28,\n" +
            "\"pressure\": 1004,\n" +
            "\"sea_level\": 1004,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 50,\n" +
            "\"temp_kf\": 4.2\n" +
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
            "\"all\": 22\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.96,\n" +
            "\"deg\": 236,\n" +
            "\"gust\": 3.48\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-07 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654646400,\n" +
            "\"main\": {\n" +
            "\"temp\": 17.78,\n" +
            "\"feels_like\": 17.23,\n" +
            "\"temp_min\": 14.98,\n" +
            "\"temp_max\": 17.78,\n" +
            "\"pressure\": 1008,\n" +
            "\"sea_level\": 1008,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 62,\n" +
            "\"temp_kf\": 2.8\n" +
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
            "\"all\": 23\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.92,\n" +
            "\"deg\": 253,\n" +
            "\"gust\": 3.79\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654657200,\n" +
            "\"main\": {\n" +
            "\"temp\": 13.78,\n" +
            "\"feels_like\": 13.3,\n" +
            "\"temp_min\": 13.78,\n" +
            "\"temp_max\": 13.78,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 80,\n" +
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
            "\"all\": 18\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.34,\n" +
            "\"deg\": 256,\n" +
            "\"gust\": 2.08\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654668000,\n" +
            "\"main\": {\n" +
            "\"temp\": 17.43,\n" +
            "\"feels_like\": 16.95,\n" +
            "\"temp_min\": 17.43,\n" +
            "\"temp_max\": 17.43,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 66,\n" +
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
            "\"speed\": 1.83,\n" +
            "\"deg\": 212,\n" +
            "\"gust\": 2.66\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654678800,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.89,\n" +
            "\"feels_like\": 21.49,\n" +
            "\"temp_min\": 21.89,\n" +
            "\"temp_max\": 21.89,\n" +
            "\"pressure\": 1009,\n" +
            "\"sea_level\": 1009,\n" +
            "\"grnd_level\": 1004,\n" +
            "\"humidity\": 52,\n" +
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
            "\"speed\": 2.94,\n" +
            "\"deg\": 202,\n" +
            "\"gust\": 4.4\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654689600,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.69,\n" +
            "\"feels_like\": 22.27,\n" +
            "\"temp_min\": 22.69,\n" +
            "\"temp_max\": 22.69,\n" +
            "\"pressure\": 1008,\n" +
            "\"sea_level\": 1008,\n" +
            "\"grnd_level\": 1003,\n" +
            "\"humidity\": 48,\n" +
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
            "\"all\": 53\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.65,\n" +
            "\"deg\": 221,\n" +
            "\"gust\": 5.23\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.34,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.22\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654700400,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.73,\n" +
            "\"feels_like\": 23.31,\n" +
            "\"temp_min\": 23.73,\n" +
            "\"temp_max\": 23.73,\n" +
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
            "\"all\": 90\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.98,\n" +
            "\"deg\": 242,\n" +
            "\"gust\": 4.25\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.03,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654711200,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.23,\n" +
            "\"feels_like\": 21.81,\n" +
            "\"temp_min\": 22.23,\n" +
            "\"temp_max\": 22.23,\n" +
            "\"pressure\": 1006,\n" +
            "\"sea_level\": 1006,\n" +
            "\"grnd_level\": 1001,\n" +
            "\"humidity\": 50,\n" +
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
            "\"all\": 78\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.01,\n" +
            "\"deg\": 181,\n" +
            "\"gust\": 3.94\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.03,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654722000,\n" +
            "\"main\": {\n" +
            "\"temp\": 17.22,\n" +
            "\"feels_like\": 17.06,\n" +
            "\"temp_min\": 17.22,\n" +
            "\"temp_max\": 17.22,\n" +
            "\"pressure\": 1007,\n" +
            "\"sea_level\": 1007,\n" +
            "\"grnd_level\": 1002,\n" +
            "\"humidity\": 79,\n" +
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
            "\"all\": 82\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.19,\n" +
            "\"deg\": 269,\n" +
            "\"gust\": 9.5\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.69,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.62\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654732800,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.62,\n" +
            "\"feels_like\": 14.44,\n" +
            "\"temp_min\": 14.62,\n" +
            "\"temp_max\": 14.62,\n" +
            "\"pressure\": 1008,\n" +
            "\"sea_level\": 1008,\n" +
            "\"grnd_level\": 1003,\n" +
            "\"humidity\": 88,\n" +
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
            "\"all\": 89\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.32,\n" +
            "\"deg\": 255,\n" +
            "\"gust\": 7.78\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.38,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.11\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654743600,\n" +
            "\"main\": {\n" +
            "\"temp\": 13.79,\n" +
            "\"feels_like\": 13.52,\n" +
            "\"temp_min\": 13.79,\n" +
            "\"temp_max\": 13.79,\n" +
            "\"pressure\": 1008,\n" +
            "\"sea_level\": 1008,\n" +
            "\"grnd_level\": 1002,\n" +
            "\"humidity\": 88,\n" +
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
            "\"speed\": 2.94,\n" +
            "\"deg\": 261,\n" +
            "\"gust\": 7.7\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654754400,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.04,\n" +
            "\"feels_like\": 14.77,\n" +
            "\"temp_min\": 15.04,\n" +
            "\"temp_max\": 15.04,\n" +
            "\"pressure\": 1009,\n" +
            "\"sea_level\": 1009,\n" +
            "\"grnd_level\": 1004,\n" +
            "\"humidity\": 83,\n" +
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
            "\"all\": 98\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.59,\n" +
            "\"deg\": 259,\n" +
            "\"gust\": 5.59\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654765200,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.41,\n" +
            "\"feels_like\": 18.92,\n" +
            "\"temp_min\": 19.41,\n" +
            "\"temp_max\": 19.41,\n" +
            "\"pressure\": 1009,\n" +
            "\"sea_level\": 1009,\n" +
            "\"grnd_level\": 1004,\n" +
            "\"humidity\": 58,\n" +
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
            "\"speed\": 2.65,\n" +
            "\"deg\": 282,\n" +
            "\"gust\": 3.75\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.11,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654776000,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.31,\n" +
            "\"feels_like\": 21.69,\n" +
            "\"temp_min\": 22.31,\n" +
            "\"temp_max\": 22.31,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1005,\n" +
            "\"humidity\": 42,\n" +
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
            "\"speed\": 2.68,\n" +
            "\"deg\": 309,\n" +
            "\"gust\": 3.36\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.27,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654786800,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.21,\n" +
            "\"feels_like\": 20.59,\n" +
            "\"temp_min\": 21.21,\n" +
            "\"temp_max\": 21.21,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 46,\n" +
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
            "\"speed\": 4.06,\n" +
            "\"deg\": 289,\n" +
            "\"gust\": 5.56\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.25,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654797600,\n" +
            "\"main\": {\n" +
            "\"temp\": 20.05,\n" +
            "\"feels_like\": 19.55,\n" +
            "\"temp_min\": 20.05,\n" +
            "\"temp_max\": 20.05,\n" +
            "\"pressure\": 1012,\n" +
            "\"sea_level\": 1012,\n" +
            "\"grnd_level\": 1007,\n" +
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
            "\"all\": 100\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4,\n" +
            "\"deg\": 311,\n" +
            "\"gust\": 6.93\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.24,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654808400,\n" +
            "\"main\": {\n" +
            "\"temp\": 17.4,\n" +
            "\"feels_like\": 17.02,\n" +
            "\"temp_min\": 17.4,\n" +
            "\"temp_max\": 17.4,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1010,\n" +
            "\"humidity\": 70,\n" +
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
            "\"all\": 92\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.78,\n" +
            "\"deg\": 316,\n" +
            "\"gust\": 6.99\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654819200,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.59,\n" +
            "\"feels_like\": 14.22,\n" +
            "\"temp_min\": 14.59,\n" +
            "\"temp_max\": 14.59,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1011,\n" +
            "\"humidity\": 81,\n" +
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
            "\"all\": 77\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.75,\n" +
            "\"deg\": 302,\n" +
            "\"gust\": 5.5\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-10 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654830000,\n" +
            "\"main\": {\n" +
            "\"temp\": 13.11,\n" +
            "\"feels_like\": 12.83,\n" +
            "\"temp_min\": 13.11,\n" +
            "\"temp_max\": 13.11,\n" +
            "\"pressure\": 1018,\n" +
            "\"sea_level\": 1018,\n" +
            "\"grnd_level\": 1013,\n" +
            "\"humidity\": 90,\n" +
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
            "\"all\": 78\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.98,\n" +
            "\"deg\": 295,\n" +
            "\"gust\": 7.16\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-10 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654840800,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.02,\n" +
            "\"feels_like\": 15.61,\n" +
            "\"temp_min\": 16.02,\n" +
            "\"temp_max\": 16.02,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 74,\n" +
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
            "\"all\": 86\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.89,\n" +
            "\"deg\": 295,\n" +
            "\"gust\": 6.13\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-10 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654851600,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.79,\n" +
            "\"feels_like\": 19.13,\n" +
            "\"temp_min\": 19.79,\n" +
            "\"temp_max\": 19.79,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
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
            "\"all\": 92\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.1,\n" +
            "\"deg\": 282,\n" +
            "\"gust\": 5.5\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-10 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654862400,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.17,\n" +
            "\"feels_like\": 22.48,\n" +
            "\"temp_min\": 23.17,\n" +
            "\"temp_max\": 23.17,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 36,\n" +
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
            "\"all\": 53\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.34,\n" +
            "\"deg\": 283,\n" +
            "\"gust\": 5.57\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-10 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654873200,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.58,\n" +
            "\"feels_like\": 22.93,\n" +
            "\"temp_min\": 23.58,\n" +
            "\"temp_max\": 23.58,\n" +
            "\"pressure\": 1019,\n" +
            "\"sea_level\": 1019,\n" +
            "\"grnd_level\": 1014,\n" +
            "\"humidity\": 36,\n" +
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
            "\"all\": 18\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 5.89,\n" +
            "\"deg\": 301,\n" +
            "\"gust\": 5.36\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-10 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654884000,\n" +
            "\"main\": {\n" +
            "\"temp\": 20.1,\n" +
            "\"feels_like\": 19.45,\n" +
            "\"temp_min\": 20.1,\n" +
            "\"temp_max\": 20.1,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 49,\n" +
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
            "\"speed\": 4.09,\n" +
            "\"deg\": 312,\n" +
            "\"gust\": 5.83\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-10 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654894800,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.92,\n" +
            "\"feels_like\": 16.26,\n" +
            "\"temp_min\": 16.92,\n" +
            "\"temp_max\": 16.92,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 61,\n" +
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
            "\"all\": 1\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 0.19,\n" +
            "\"deg\": 232,\n" +
            "\"gust\": 0.4\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-10 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654905600,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.95,\n" +
            "\"feels_like\": 16.27,\n" +
            "\"temp_min\": 16.95,\n" +
            "\"temp_max\": 16.95,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 60,\n" +
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
            "\"all\": 28\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 0.67,\n" +
            "\"deg\": 168,\n" +
            "\"gust\": 0.94\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-11 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654916400,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.28,\n" +
            "\"feels_like\": 15.58,\n" +
            "\"temp_min\": 16.28,\n" +
            "\"temp_max\": 16.28,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 62,\n" +
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
            "\"speed\": 1.93,\n" +
            "\"deg\": 194,\n" +
            "\"gust\": 4.16\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-11 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654927200,\n" +
            "\"main\": {\n" +
            "\"temp\": 17.2,\n" +
            "\"feels_like\": 16.59,\n" +
            "\"temp_min\": 17.2,\n" +
            "\"temp_max\": 17.2,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 62,\n" +
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
            "\"speed\": 2.13,\n" +
            "\"deg\": 233,\n" +
            "\"gust\": 4.08\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-11 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654938000,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.39,\n" +
            "\"feels_like\": 20.92,\n" +
            "\"temp_min\": 21.39,\n" +
            "\"temp_max\": 21.39,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
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
            "\"all\": 59\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.3,\n" +
            "\"deg\": 283,\n" +
            "\"gust\": 4.95\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-11 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654948800,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.65,\n" +
            "\"feels_like\": 23.27,\n" +
            "\"temp_min\": 23.65,\n" +
            "\"temp_max\": 23.65,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 46,\n" +
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
            "\"speed\": 4.73,\n" +
            "\"deg\": 289,\n" +
            "\"gust\": 5.7\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-11 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654959600,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.69,\n" +
            "\"feels_like\": 21.35,\n" +
            "\"temp_min\": 21.69,\n" +
            "\"temp_max\": 21.69,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
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
            "\"all\": 87\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.85,\n" +
            "\"deg\": 313,\n" +
            "\"gust\": 6.11\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-11 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654970400,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.44,\n" +
            "\"feels_like\": 22.05,\n" +
            "\"temp_min\": 22.44,\n" +
            "\"temp_max\": 22.44,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 50,\n" +
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
            "\"all\": 65\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.83,\n" +
            "\"deg\": 268,\n" +
            "\"gust\": 3.72\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.01,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-11 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654981200,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.72,\n" +
            "\"feels_like\": 19.31,\n" +
            "\"temp_min\": 19.72,\n" +
            "\"temp_max\": 19.72,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 60,\n" +
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
            "\"all\": 80\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.11,\n" +
            "\"deg\": 331,\n" +
            "\"gust\": 2.75\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-11 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654992000,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.32,\n" +
            "\"feels_like\": 16.12,\n" +
            "\"temp_min\": 16.32,\n" +
            "\"temp_max\": 16.32,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 81,\n" +
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
            "\"all\": 54\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.53,\n" +
            "\"deg\": 347,\n" +
            "\"gust\": 4.99\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-12 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655002800,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.64,\n" +
            "\"feels_like\": 14.43,\n" +
            "\"temp_min\": 14.64,\n" +
            "\"temp_max\": 14.64,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 87,\n" +
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
            "\"speed\": 1.92,\n" +
            "\"deg\": 327,\n" +
            "\"gust\": 2.89\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-12 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655013600,\n" +
            "\"main\": {\n" +
            "\"temp\": 18.34,\n" +
            "\"feels_like\": 17.98,\n" +
            "\"temp_min\": 18.34,\n" +
            "\"temp_max\": 18.34,\n" +
            "\"pressure\": 1023,\n" +
            "\"sea_level\": 1023,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 67,\n" +
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
            "\"all\": 12\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.74,\n" +
            "\"deg\": 308,\n" +
            "\"gust\": 2.31\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-12 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655024400,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.48,\n" +
            "\"feels_like\": 22.95,\n" +
            "\"temp_min\": 23.48,\n" +
            "\"temp_max\": 23.48,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 41,\n" +
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
            "\"speed\": 1.52,\n" +
            "\"deg\": 295,\n" +
            "\"gust\": 2.82\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-12 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655035200,\n" +
            "\"main\": {\n" +
            "\"temp\": 26.71,\n" +
            "\"feels_like\": 26.32,\n" +
            "\"temp_min\": 26.71,\n" +
            "\"temp_max\": 26.71,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 32,\n" +
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
            "\"speed\": 2.19,\n" +
            "\"deg\": 292,\n" +
            "\"gust\": 4.94\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-12 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655046000,\n" +
            "\"main\": {\n" +
            "\"temp\": 27.88,\n" +
            "\"feels_like\": 26.88,\n" +
            "\"temp_min\": 27.88,\n" +
            "\"temp_max\": 27.88,\n" +
            "\"pressure\": 1018,\n" +
            "\"sea_level\": 1018,\n" +
            "\"grnd_level\": 1013,\n" +
            "\"humidity\": 27,\n" +
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
            "\"all\": 62\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.84,\n" +
            "\"deg\": 266,\n" +
            "\"gust\": 5.07\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-12 15:00:00\"\n" +
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
            "\"sunrise\": 1654569935,\n" +
            "\"sunset\": 1654629904\n" +
            "}\n" +
            "}" ;
}

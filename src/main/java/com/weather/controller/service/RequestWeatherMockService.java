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
            "\"dt\": 1654678800,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.31,\n" +
            "\"feels_like\": 22.03,\n" +
            "\"temp_min\": 22.23,\n" +
            "\"temp_max\": 22.31,\n" +
            "\"pressure\": 1006,\n" +
            "\"sea_level\": 1006,\n" +
            "\"grnd_level\": 1004,\n" +
            "\"humidity\": 55,\n" +
            "\"temp_kf\": 0.08\n" +
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
            "\"speed\": 3.02,\n" +
            "\"deg\": 204,\n" +
            "\"gust\": 4.49\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.27,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654689600,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.29,\n" +
            "\"feels_like\": 22.95,\n" +
            "\"temp_min\": 23.29,\n" +
            "\"temp_max\": 25.25,\n" +
            "\"pressure\": 1006,\n" +
            "\"sea_level\": 1006,\n" +
            "\"grnd_level\": 1002,\n" +
            "\"humidity\": 49,\n" +
            "\"temp_kf\": -1.96\n" +
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
            "\"all\": 27\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.97,\n" +
            "\"deg\": 215,\n" +
            "\"gust\": 6.18\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.55,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.42\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654700400,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.7,\n" +
            "\"feels_like\": 22.33,\n" +
            "\"temp_min\": 22.7,\n" +
            "\"temp_max\": 22.9,\n" +
            "\"pressure\": 1007,\n" +
            "\"sea_level\": 1007,\n" +
            "\"grnd_level\": 1002,\n" +
            "\"humidity\": 50,\n" +
            "\"temp_kf\": -0.2\n" +
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
            "\"all\": 71\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.73,\n" +
            "\"deg\": 228,\n" +
            "\"gust\": 4.74\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.1,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654711200,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.77,\n" +
            "\"feels_like\": 21.39,\n" +
            "\"temp_min\": 21.77,\n" +
            "\"temp_max\": 21.77,\n" +
            "\"pressure\": 1006,\n" +
            "\"sea_level\": 1006,\n" +
            "\"grnd_level\": 1001,\n" +
            "\"humidity\": 53,\n" +
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
            "\"speed\": 2.07,\n" +
            "\"deg\": 166,\n" +
            "\"gust\": 4.11\n" +
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
            "\"temp\": 18.86,\n" +
            "\"feels_like\": 18.52,\n" +
            "\"temp_min\": 18.86,\n" +
            "\"temp_max\": 18.86,\n" +
            "\"pressure\": 1006,\n" +
            "\"sea_level\": 1006,\n" +
            "\"grnd_level\": 1001,\n" +
            "\"humidity\": 66,\n" +
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
            "\"all\": 98\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.9,\n" +
            "\"deg\": 141,\n" +
            "\"gust\": 2.97\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.36,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.13\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-08 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654732800,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.48,\n" +
            "\"feels_like\": 15.38,\n" +
            "\"temp_min\": 15.48,\n" +
            "\"temp_max\": 15.48,\n" +
            "\"pressure\": 1007,\n" +
            "\"sea_level\": 1007,\n" +
            "\"grnd_level\": 1002,\n" +
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
            "\"all\": 99\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.85,\n" +
            "\"deg\": 287,\n" +
            "\"gust\": 5.86\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.41,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.77\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654743600,\n" +
            "\"main\": {\n" +
            "\"temp\": 14.31,\n" +
            "\"feels_like\": 14.09,\n" +
            "\"temp_min\": 14.31,\n" +
            "\"temp_max\": 14.31,\n" +
            "\"pressure\": 1008,\n" +
            "\"sea_level\": 1008,\n" +
            "\"grnd_level\": 1003,\n" +
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
            "\"all\": 100\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.43,\n" +
            "\"deg\": 271,\n" +
            "\"gust\": 8.31\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.24,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654754400,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.5,\n" +
            "\"feels_like\": 16.22,\n" +
            "\"temp_min\": 16.5,\n" +
            "\"temp_max\": 16.5,\n" +
            "\"pressure\": 1010,\n" +
            "\"sea_level\": 1010,\n" +
            "\"grnd_level\": 1004,\n" +
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
            "\"all\": 77\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.24,\n" +
            "\"deg\": 272,\n" +
            "\"gust\": 4.85\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.12,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 06:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654765200,\n" +
            "\"main\": {\n" +
            "\"temp\": 20.69,\n" +
            "\"feels_like\": 20.22,\n" +
            "\"temp_min\": 20.69,\n" +
            "\"temp_max\": 20.69,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
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
            "\"all\": 55\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.71,\n" +
            "\"deg\": 281,\n" +
            "\"gust\": 4.02\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 09:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654776000,\n" +
            "\"main\": {\n" +
            "\"temp\": 23.53,\n" +
            "\"feels_like\": 23.06,\n" +
            "\"temp_min\": 23.53,\n" +
            "\"temp_max\": 23.53,\n" +
            "\"pressure\": 1011,\n" +
            "\"sea_level\": 1011,\n" +
            "\"grnd_level\": 1006,\n" +
            "\"humidity\": 43,\n" +
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
            "\"all\": 76\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.36,\n" +
            "\"deg\": 299,\n" +
            "\"gust\": 3.87\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.03,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 12:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654786800,\n" +
            "\"main\": {\n" +
            "\"temp\": 21.73,\n" +
            "\"feels_like\": 21.26,\n" +
            "\"temp_min\": 21.73,\n" +
            "\"temp_max\": 21.73,\n" +
            "\"pressure\": 1013,\n" +
            "\"sea_level\": 1013,\n" +
            "\"grnd_level\": 1008,\n" +
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
            "\"all\": 100\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.9,\n" +
            "\"deg\": 293,\n" +
            "\"gust\": 5.41\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.07,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654797600,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.4,\n" +
            "\"feels_like\": 18.94,\n" +
            "\"temp_min\": 19.4,\n" +
            "\"temp_max\": 19.4,\n" +
            "\"pressure\": 1014,\n" +
            "\"sea_level\": 1014,\n" +
            "\"grnd_level\": 1009,\n" +
            "\"humidity\": 59,\n" +
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
            "\"speed\": 5.12,\n" +
            "\"deg\": 288,\n" +
            "\"gust\": 6.62\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.04,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-09 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654808400,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.19,\n" +
            "\"feels_like\": 15.8,\n" +
            "\"temp_min\": 16.19,\n" +
            "\"temp_max\": 16.19,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1012,\n" +
            "\"humidity\": 74,\n" +
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
            "\"all\": 79\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3,\n" +
            "\"deg\": 319,\n" +
            "\"gust\": 7.49\n" +
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
            "\"temp\": 14.6,\n" +
            "\"feels_like\": 14.26,\n" +
            "\"temp_min\": 14.6,\n" +
            "\"temp_max\": 14.6,\n" +
            "\"pressure\": 1019,\n" +
            "\"sea_level\": 1019,\n" +
            "\"grnd_level\": 1013,\n" +
            "\"humidity\": 82,\n" +
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
            "\"speed\": 2.59,\n" +
            "\"deg\": 299,\n" +
            "\"gust\": 4.88\n" +
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
            "\"temp\": 13.33,\n" +
            "\"feels_like\": 12.78,\n" +
            "\"temp_min\": 13.33,\n" +
            "\"temp_max\": 13.33,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 79,\n" +
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
            "\"speed\": 3.01,\n" +
            "\"deg\": 302,\n" +
            "\"gust\": 8.15\n" +
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
            "\"temp\": 15.79,\n" +
            "\"feels_like\": 15.17,\n" +
            "\"temp_min\": 15.79,\n" +
            "\"temp_max\": 15.79,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 67,\n" +
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
            "\"speed\": 2.82,\n" +
            "\"deg\": 301,\n" +
            "\"gust\": 4.93\n" +
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
            "\"temp\": 20.33,\n" +
            "\"feels_like\": 19.62,\n" +
            "\"temp_min\": 20.33,\n" +
            "\"temp_max\": 20.33,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
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
            "\"all\": 64\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.43,\n" +
            "\"deg\": 286,\n" +
            "\"gust\": 4.69\n" +
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
            "\"temp\": 23.4,\n" +
            "\"feels_like\": 22.66,\n" +
            "\"temp_min\": 23.4,\n" +
            "\"temp_max\": 23.4,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 33,\n" +
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
            "\"all\": 33\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.4,\n" +
            "\"deg\": 281,\n" +
            "\"gust\": 4.38\n" +
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
            "\"temp\": 24.65,\n" +
            "\"feels_like\": 23.95,\n" +
            "\"temp_min\": 24.65,\n" +
            "\"temp_max\": 24.65,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
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
            "\"all\": 1\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.53,\n" +
            "\"deg\": 275,\n" +
            "\"gust\": 4.25\n" +
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
            "\"temp\": 22.53,\n" +
            "\"feels_like\": 21.88,\n" +
            "\"temp_min\": 22.53,\n" +
            "\"temp_max\": 22.53,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 40,\n" +
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
            "\"speed\": 1.94,\n" +
            "\"deg\": 311,\n" +
            "\"gust\": 3.07\n" +
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
            "\"temp\": 20.54,\n" +
            "\"feels_like\": 19.8,\n" +
            "\"temp_min\": 20.54,\n" +
            "\"temp_max\": 20.54,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 44,\n" +
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
            "\"all\": 87\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 0.8,\n" +
            "\"deg\": 248,\n" +
            "\"gust\": 1.45\n" +
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
            "\"temp\": 18.95,\n" +
            "\"feels_like\": 18.28,\n" +
            "\"temp_min\": 18.95,\n" +
            "\"temp_max\": 18.95,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 53,\n" +
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
            "\"all\": 94\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.73,\n" +
            "\"deg\": 281,\n" +
            "\"gust\": 3.4\n" +
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
            "\"temp\": 16.33,\n" +
            "\"feels_like\": 15.95,\n" +
            "\"temp_min\": 16.33,\n" +
            "\"temp_max\": 16.33,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 74,\n" +
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
            "\"all\": 69\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.23,\n" +
            "\"deg\": 273,\n" +
            "\"gust\": 4.06\n" +
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
            "\"temp\": 19.39,\n" +
            "\"feels_like\": 19.11,\n" +
            "\"temp_min\": 19.39,\n" +
            "\"temp_max\": 19.39,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 66,\n" +
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
            "\"speed\": 2.7,\n" +
            "\"deg\": 273,\n" +
            "\"gust\": 4.15\n" +
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
            "\"temp\": 23.57,\n" +
            "\"feels_like\": 23.26,\n" +
            "\"temp_min\": 23.57,\n" +
            "\"temp_max\": 23.57,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 49,\n" +
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
            "\"speed\": 3.3,\n" +
            "\"deg\": 271,\n" +
            "\"gust\": 4.49\n" +
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
            "\"temp\": 25.92,\n" +
            "\"feels_like\": 25.53,\n" +
            "\"temp_min\": 25.92,\n" +
            "\"temp_max\": 25.92,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 37,\n" +
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
            "\"speed\": 3.33,\n" +
            "\"deg\": 268,\n" +
            "\"gust\": 4.26\n" +
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
            "\"temp\": 25.35,\n" +
            "\"feels_like\": 24.99,\n" +
            "\"temp_min\": 25.35,\n" +
            "\"temp_max\": 25.35,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 40,\n" +
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
            "\"all\": 54\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 3.61,\n" +
            "\"deg\": 246,\n" +
            "\"gust\": 4.2\n" +
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
            "\"temp\": 23.51,\n" +
            "\"feels_like\": 23.14,\n" +
            "\"temp_min\": 23.51,\n" +
            "\"temp_max\": 23.51,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 47,\n" +
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
            "\"speed\": 2.54,\n" +
            "\"deg\": 265,\n" +
            "\"gust\": 5.91\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-11 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1654981200,\n" +
            "\"main\": {\n" +
            "\"temp\": 20.08,\n" +
            "\"feels_like\": 19.76,\n" +
            "\"temp_min\": 20.08,\n" +
            "\"temp_max\": 20.08,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 62,\n" +
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
            "\"all\": 61\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.71,\n" +
            "\"deg\": 282,\n" +
            "\"gust\": 6.27\n" +
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
            "\"temp\": 17.85,\n" +
            "\"feels_like\": 17.52,\n" +
            "\"temp_min\": 17.85,\n" +
            "\"temp_max\": 17.85,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 70,\n" +
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
            "\"all\": 40\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.17,\n" +
            "\"deg\": 304,\n" +
            "\"gust\": 4.1\n" +
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
            "\"temp\": 15.91,\n" +
            "\"feels_like\": 15.57,\n" +
            "\"temp_min\": 15.91,\n" +
            "\"temp_max\": 15.91,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 77,\n" +
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
            "\"speed\": 1.95,\n" +
            "\"deg\": 296,\n" +
            "\"gust\": 3.32\n" +
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
            "\"temp\": 19.67,\n" +
            "\"feels_like\": 19.34,\n" +
            "\"temp_min\": 19.67,\n" +
            "\"temp_max\": 19.67,\n" +
            "\"pressure\": 1022,\n" +
            "\"sea_level\": 1022,\n" +
            "\"grnd_level\": 1017,\n" +
            "\"humidity\": 63,\n" +
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
            "\"all\": 23\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.91,\n" +
            "\"deg\": 286,\n" +
            "\"gust\": 2.81\n" +
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
            "\"temp\": 22.51,\n" +
            "\"feels_like\": 22.1,\n" +
            "\"temp_min\": 22.51,\n" +
            "\"temp_max\": 22.51,\n" +
            "\"pressure\": 1021,\n" +
            "\"sea_level\": 1021,\n" +
            "\"grnd_level\": 1016,\n" +
            "\"humidity\": 49,\n" +
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
            "\"all\": 71\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.47,\n" +
            "\"deg\": 233,\n" +
            "\"gust\": 3.57\n" +
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
            "\"temp\": 25.78,\n" +
            "\"feels_like\": 25.48,\n" +
            "\"temp_min\": 25.78,\n" +
            "\"temp_max\": 25.78,\n" +
            "\"pressure\": 1020,\n" +
            "\"sea_level\": 1020,\n" +
            "\"grnd_level\": 1015,\n" +
            "\"humidity\": 41,\n" +
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
            "\"speed\": 2.58,\n" +
            "\"deg\": 245,\n" +
            "\"gust\": 6.02\n" +
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
            "\"temp\": 24.24,\n" +
            "\"feels_like\": 24.03,\n" +
            "\"temp_min\": 24.24,\n" +
            "\"temp_max\": 24.24,\n" +
            "\"pressure\": 1018,\n" +
            "\"sea_level\": 1018,\n" +
            "\"grnd_level\": 1013,\n" +
            "\"humidity\": 50,\n" +
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
            "\"all\": 86\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.75,\n" +
            "\"deg\": 159,\n" +
            "\"gust\": 2.39\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.27,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.13\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-12 15:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655056800,\n" +
            "\"main\": {\n" +
            "\"temp\": 22.12,\n" +
            "\"feels_like\": 21.95,\n" +
            "\"temp_min\": 22.12,\n" +
            "\"temp_max\": 22.12,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1012,\n" +
            "\"humidity\": 60,\n" +
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
            "\"all\": 69\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.18,\n" +
            "\"deg\": 255,\n" +
            "\"gust\": 4.76\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.33,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.2\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-12 18:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655067600,\n" +
            "\"main\": {\n" +
            "\"temp\": 19.66,\n" +
            "\"feels_like\": 19.51,\n" +
            "\"temp_min\": 19.66,\n" +
            "\"temp_max\": 19.66,\n" +
            "\"pressure\": 1017,\n" +
            "\"sea_level\": 1017,\n" +
            "\"grnd_level\": 1012,\n" +
            "\"humidity\": 70,\n" +
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
            "\"all\": 78\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 1.97,\n" +
            "\"deg\": 246,\n" +
            "\"gust\": 3.7\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.58,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.19\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-12 21:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655078400,\n" +
            "\"main\": {\n" +
            "\"temp\": 17.62,\n" +
            "\"feels_like\": 17.42,\n" +
            "\"temp_min\": 17.62,\n" +
            "\"temp_max\": 17.62,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1011,\n" +
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
            "\"all\": 85\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 2.22,\n" +
            "\"deg\": 251,\n" +
            "\"gust\": 4.12\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.5,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.21\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"n\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-13 00:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655089200,\n" +
            "\"main\": {\n" +
            "\"temp\": 15.19,\n" +
            "\"feels_like\": 14.83,\n" +
            "\"temp_min\": 15.19,\n" +
            "\"temp_max\": 15.19,\n" +
            "\"pressure\": 1015,\n" +
            "\"sea_level\": 1015,\n" +
            "\"grnd_level\": 1010,\n" +
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
            "\"speed\": 2.88,\n" +
            "\"deg\": 331,\n" +
            "\"gust\": 5.44\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.38,\n" +
            "\"rain\": {\n" +
            "\"3h\": 0.13\n" +
            "},\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-13 03:00:00\"\n" +
            "},\n" +
            "{\n" +
            "\"dt\": 1655100000,\n" +
            "\"main\": {\n" +
            "\"temp\": 16.57,\n" +
            "\"feels_like\": 16.06,\n" +
            "\"temp_min\": 16.57,\n" +
            "\"temp_max\": 16.57,\n" +
            "\"pressure\": 1016,\n" +
            "\"sea_level\": 1016,\n" +
            "\"grnd_level\": 1011,\n" +
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
            "\"all\": 84\n" +
            "},\n" +
            "\"wind\": {\n" +
            "\"speed\": 4.39,\n" +
            "\"deg\": 327,\n" +
            "\"gust\": 6.62\n" +
            "},\n" +
            "\"visibility\": 10000,\n" +
            "\"pop\": 0.3,\n" +
            "\"sys\": {\n" +
            "\"pod\": \"d\"\n" +
            "},\n" +
            "\"dt_txt\": \"2022-06-13 06:00:00\"\n" +
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
            "\"sunrise\": 1654656304,\n" +
            "\"sunset\": 1654716357\n" +
            "}\n" +
            "}";

}

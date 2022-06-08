package com.weather.model.dto;

import java.util.List;

public class DailyWeatherDTO {
    private long dt;
    private TemperatureDTO main;
    private List<GeneralDescriptionDTO> weather;

    public long getDt() {
        return dt;
    }

    public TemperatureDTO getMain() {
        return main;
    }

    public List<GeneralDescriptionDTO> getWeatherDescription() {
        return weather;
    }

}

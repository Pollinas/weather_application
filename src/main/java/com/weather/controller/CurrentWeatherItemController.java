package com.weather.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class CurrentWeatherItemController extends CustomBaseController {

    @FXML
    private Label temperatureLabel;

    public CurrentWeatherItemController() {
        super("/fxml/CurrentWeatherItem.fxml");
    }

    public void setTemperature(String temperature) {
        this.temperatureLabel.setText(temperature);
    }
}

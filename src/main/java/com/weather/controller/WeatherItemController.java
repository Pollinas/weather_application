package com.weather.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class WeatherItemController extends CustomBaseController {

    @FXML
    private Label dateLabel;

    @FXML
    private Label tempsLabel;

    public WeatherItemController() {
      super("/fxml/WeatherItem.fxml");
    }

    public void setDate(String date) {
        this.dateLabel.setText(date);
    }

    public void setTemps(String temp) {
        this.tempsLabel.setText(temp);
    }
}

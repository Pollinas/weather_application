package com.weather.controller;

import com.weather.controller.service.WeatherService;
import com.weather.model.Weather;
import com.weather.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class MainWindowController {

    private ViewFactory viewFactory;
    private WeatherService weatherService;
    private String fxmlName;

    public MainWindowController(ViewFactory viewFactory, String fxmlName, WeatherService weatherService) {
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
        this.weatherService = weatherService;
    }
    public String getFxmlName() {
        return "/fxml/" + fxmlName;
    }


    @FXML
    private TextField firstCityName;



    @FXML
    void firstCityButtonAction() {


        String cityName = firstCityName.getText();


    }

    @FXML
    void secondCityButtonAction() {



    }

}

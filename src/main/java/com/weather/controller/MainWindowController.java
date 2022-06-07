package com.weather.controller;

import com.weather.controller.service.WeatherService;
import com.weather.model.Weather;
import com.weather.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {

    private ViewFactory viewFactory;
    private WeatherService weatherServiceMock;
    private String fxmlName;

    public MainWindowController(ViewFactory viewFactory, String fxmlName, WeatherService weatherService) {
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
        this.weatherServiceMock = weatherService;
    }
    public String getFxmlName() {
        return "/fxml/" + fxmlName;
    }

    //fxml stuff

    @FXML
    private TextField firstCityName;

    @FXML
    private AnchorPane firstCityanchorPane;

    @FXML
    private AnchorPane secondCityAnchorPane;

    @FXML
    private TextField secondCityName;

    @FXML
    void firstCityButtonAction() {

        for(Weather weather: weatherServiceMock.getWeather("Berlin")){
            System.out.println(weather.getDescription());
            System.out.println(weather.getDayTemperature());
            System.out.println(weather.getNightTemperature());
        }

    }

    @FXML
    void secondCityButtonAction() {
//        for(Weather weather: weatherServiceMock.getWeather("Szczecin")){
//            System.out.println(weather);
//        }

    }
}

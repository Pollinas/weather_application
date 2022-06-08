package com.weather.controller;

import com.weather.controller.service.WeatherService;
import com.weather.model.Weather;
import com.weather.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

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
    private AnchorPane firstCityanchorPane;

    @FXML
    private AnchorPane secondCityAnchorPane;

    @FXML
    private TextField secondCityName;
    @FXML
    private VBox currentTimeVBox;
    @FXML
    private VBox weatherCityOneDayFour;

    @FXML
    private VBox weatherCityOneDayOne;

    @FXML
    private VBox weatherCityOneDayThree;

    @FXML
    private VBox weatherCityOneDayTwo;

    @FXML
    void firstCityButtonAction() {

        String cityName = firstCityName.getText();

        Label currentTemperature = new Label(String.valueOf(weatherService.getWeather(cityName).get(0).getDayTemperature()) + " °C");
        Label currentDescription = new Label(weatherService.getWeather(cityName).get(0).getDescription());
        currentTimeVBox.getChildren().addAll(currentTemperature, currentDescription);

        Label dayTempDayOne = new Label(String.valueOf(weatherService.getWeather(cityName).get(1).getDayTemperature()) + " °C");
        Label nightTempDayOne = new Label(String.valueOf(weatherService.getWeather(cityName).get(1).getNightTemperature()) + " °C");
        Label descriptionDayOne = new Label(weatherService.getWeather(cityName).get(1).getDescription());
        weatherCityOneDayOne.getChildren().addAll(dayTempDayOne,nightTempDayOne,descriptionDayOne);

    }

    @FXML
    void secondCityButtonAction() {

        String cityName = secondCityName.getText();

    }
}

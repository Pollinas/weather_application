package com.weather.controller;

import com.weather.controller.service.WeatherService;
import com.weather.model.Weather;
import com.weather.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;


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
    private TextField secondCityName;

    @FXML
    private VBox weatherItemsContainer;

    @FXML
    private VBox secondCityItemHolder;

    @FXML
    void firstCityButtonAction() {
        weatherItemsContainer.getChildren().clear();
        for (int i = 0; i < 4; i++) {
            Node node = viewFactory.createWeatherItem();
            weatherItemsContainer.getChildren().add(node);
        }

    }

    @FXML
    void secondCityButtonAction() {

    }

}

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
import java.util.List;


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

        List<Weather> weathers = weatherService.getWeather("Berlin");

        for (int i = 1; i <=4 ; i++) {
            String temps = String.valueOf(weathers.get(i).getDayTemperature());
            String description = weathers.get(i).getDescription();
            String date = String.valueOf(i);
            Node node = viewFactory.createWeatherItem(temps, description, date);
            weatherItemsContainer.getChildren().add(node);
        }

    }

    @FXML
    void secondCityButtonAction() {

    }

}

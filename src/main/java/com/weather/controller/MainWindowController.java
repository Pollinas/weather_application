package com.weather.controller;

import com.weather.controller.service.WeatherService;
import com.weather.model.Weather;
import com.weather.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
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
    private VBox fistCityItemHolder;

    @FXML
    private VBox secondCityItemHolder;

    @FXML
    void firstCityButtonAction() {
        fistCityItemHolder.getChildren().clear();

        for (int i = 0; i < 4; i++) {
            try{
                Node node = viewFactory.createWeatherItem();
                fistCityItemHolder.getChildren().add(node);
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    @FXML
    void secondCityButtonAction() {

    }

}

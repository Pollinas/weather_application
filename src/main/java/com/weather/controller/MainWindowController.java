package com.weather.controller;

import com.weather.controller.service.WeatherService;
import com.weather.model.Weather;
import com.weather.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
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
    private TextField secondCityName;

    @FXML
    private VBox fistCityItemHolder;

    @FXML
    private VBox secondCityItemHolder;

    @FXML
    void firstCityButtonAction() {

        Node[] nodes = new Node[4];
        for (int i = 0; i < nodes.length; i++) {

        }
    }

    @FXML
    void secondCityButtonAction() {

    }

}

package com.weather.controller;

import com.weather.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {

    protected ViewFactory viewFactory;
    private String fxmlName;

    public MainWindowController(ViewFactory viewFactory, String fxmlName) {
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }
    public String getFxmlName() {
        return fxmlName;
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
        System.out.println("first city");
    }

    @FXML
    void secondCityButtonAction() {
        System.out.println("second city");
    }
}

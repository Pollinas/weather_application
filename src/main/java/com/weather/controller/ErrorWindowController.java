package com.weather.controller;

import com.weather.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ErrorWindowController extends BaseController{

    @FXML
    private Button closingButton;

    public ErrorWindowController(String fxmlName, ViewFactory viewFactory) {
        super(fxmlName, viewFactory);
    }

    @FXML
    void closeErrorWindow() {
        Stage stage = (Stage) closingButton.getScene().getWindow();
        viewFactory.closeStage(stage);
    }

}

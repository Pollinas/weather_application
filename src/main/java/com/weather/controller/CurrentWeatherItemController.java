package com.weather.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.IOException;

public class CurrentWeatherItemController extends VBox {


    @FXML
    private ImageView currentWeatherIcon;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label temperatureLabel;

    public CurrentWeatherItemController() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "/fxml/CurrentWeatherItem.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void setDescription(String description) {
        this.descriptionLabel.setText(description);

        if (descriptionLabel.getText().equals("clear sky")) {
            Image image = new Image(getClass().getResourceAsStream("/icons/location.png"));
            setCurrentWeatherIcon(image);
        } else {
            Image image = new Image(getClass().getResourceAsStream("/icons/main.png"));
            setCurrentWeatherIcon(image);
        }
    }

    private void setCurrentWeatherIcon(Image image) {
        currentWeatherIcon.setImage(image);
    }

    public void setTemperature(String temperature) {
        this.temperatureLabel.setText(temperature);
    }
}

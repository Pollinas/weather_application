package com.weather.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class WeatherItemController extends VBox {

    @FXML
    private Label dateLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label tempsLabel;

    @FXML
    private ImageView weatherIcon;

    public WeatherItemController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "/fxml/WeatherItem.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void setDate(String date) {
        this.dateLabel.setText(date);
    }

    public void setDescription(String description) {
        this.descriptionLabel.setText(description);

        if (descriptionLabel.getText().equals("clear sky")) {
            Image image = new Image(getClass().getResourceAsStream("/icons/location.png"));
            setWeatherIcon(image);
        } else {
            Image image = new Image(getClass().getResourceAsStream("/icons/main.png"));
            setWeatherIcon(image);
        }
    }

    private void setWeatherIcon(Image image){
        weatherIcon.setImage(image);
    }

    public void setTemps(String temp) {
        this.tempsLabel.setText(temp);
    }
}

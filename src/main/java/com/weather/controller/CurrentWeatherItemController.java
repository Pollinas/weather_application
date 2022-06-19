package com.weather.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.io.File;
import java.io.IOException;

public class CurrentWeatherItemController extends VBox {


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
            Image image = new Image(getClass().getResourceAsStream("/background/rainy.jpg"), 400,312,false,true);
            setBackgroundImage(image);

        } else {


        }
    }

    private void setBackgroundImage(Image image){
        BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        // create Background
        Background background = new Background(backgroundimage);

        // set background
        this.setBackground(background);
    }


    public void setTemperature(String temperature) {
        this.temperatureLabel.setText(temperature);
    }
}

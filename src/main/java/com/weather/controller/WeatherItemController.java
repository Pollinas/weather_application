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
            Image image = new Image(getClass().getResourceAsStream("/icons/sun.png"));
            setWeatherIcon(image);
        } else if (descriptionLabel.getText().equals("few clouds")) {
            Image image = new Image(getClass().getResourceAsStream("/icons/cloud-sun.png"));
            setWeatherIcon(image);
        } else if (descriptionLabel.getText().equals("scattered clouds")) {
            Image image = new Image(getClass().getResourceAsStream("/icons/cloud.png"));
            setWeatherIcon(image);
      }  else if (descriptionLabel.getText().equals("broken clouds")) {
            Image image = new Image(getClass().getResourceAsStream("/icons/broken-clouds.png"));
            setWeatherIcon(image);
       }  else if (descriptionLabel.getText().equals("shower rain")) {
            Image image = new Image(getClass().getResourceAsStream("/icons/shower-rain.png"));
            setWeatherIcon(image);
        } else if (descriptionLabel.getText().equals("rain")) {
            Image image = new Image(getClass().getResourceAsStream("/icons/rain.png"));
            setWeatherIcon(image);
        } else if (descriptionLabel.getText().equals("thunderstorm")) {
            Image image = new Image(getClass().getResourceAsStream("/icons/thunderstorm.png"));
            setWeatherIcon(image);
       } else if (descriptionLabel.getText().equals("snow")) {
            Image image = new Image(getClass().getResourceAsStream("/icons/snow.png"));
            setWeatherIcon(image);
        } else if (descriptionLabel.getText().equals("mist")) {
            Image image = new Image(getClass().getResourceAsStream("/icons/mist.png"));
            setWeatherIcon(image);
        }
    }

    private void setWeatherIcon(Image image) {
        weatherIcon.setImage(image);
    }

    public void setTemps(String temp) {
        this.tempsLabel.setText(temp);
    }
}

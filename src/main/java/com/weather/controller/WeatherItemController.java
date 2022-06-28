package com.weather.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class WeatherItemController extends CustomBaseContoller {

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

        if (isDescriptionLabelMatchingIconDescription("clear sky")) {
            setWeatherIcon("");
        } else if (isDescriptionLabelMatchingIconDescription("few clouds") || isDescriptionLabelMatchingIconDescription("few clouds: 11-25%")) {
            setWeatherIcon("");
        } else if (isDescriptionLabelMatchingIconDescription("scattered clouds") || isDescriptionLabelMatchingIconDescription("scattered clouds: 25-50%")) {
            setWeatherIcon("");
        } else if (isDescriptionLabelMatchingIconDescription("broken clouds") || isDescriptionLabelMatchingIconDescription("overcast clouds")
                || isDescriptionLabelMatchingIconDescription("broken clouds: 51-84%") || isDescriptionLabelMatchingIconDescription("overcast clouds: 85-100%")) {
            setWeatherIcon("");
        } else if (isDescriptionLabelMatchingIconDescription("shower rain") || isDescriptionLabelMatchingIconDescription("light intensity shower rain")
                || isDescriptionLabelMatchingIconDescription("heavy intensity shower rain") || isDescriptionLabelMatchingIconDescription("ragged shower rain")
                || isDescriptionLabelMatchingIconDescription("light intensity drizzle") || isDescriptionLabelMatchingIconDescription("drizzle")
                || isDescriptionLabelMatchingIconDescription("heavy intensity drizzle") || isDescriptionLabelMatchingIconDescription("light intensity drizzle rain")
                || isDescriptionLabelMatchingIconDescription("drizzle rain") || isDescriptionLabelMatchingIconDescription("heavy intensity drizzle rain")
                || isDescriptionLabelMatchingIconDescription("shower rain and drizzle") || isDescriptionLabelMatchingIconDescription("heavy shower rain and drizzle")
                || isDescriptionLabelMatchingIconDescription("shower drizzle")) {

            setWeatherIcon("");
        } else if (isDescriptionLabelMatchingIconDescription("light rain") || isDescriptionLabelMatchingIconDescription("moderate rain")
                || isDescriptionLabelMatchingIconDescription("heavy intensity rain") || isDescriptionLabelMatchingIconDescription("very heavy rain")
                || isDescriptionLabelMatchingIconDescription("extreme rain")) {

            setWeatherIcon("");
        } else if (isDescriptionLabelMatchingIconDescription("thunderstorm with light rain") || isDescriptionLabelMatchingIconDescription("thunderstorm with rain")
                || isDescriptionLabelMatchingIconDescription("thunderstorm with heavy rain") || isDescriptionLabelMatchingIconDescription("light thunderstorm")
                || isDescriptionLabelMatchingIconDescription("thunderstorm") || isDescriptionLabelMatchingIconDescription("heavy thunderstorm")
                || isDescriptionLabelMatchingIconDescription("ragged thunderstorm") || isDescriptionLabelMatchingIconDescription("thunderstorm with light drizzle")
                || isDescriptionLabelMatchingIconDescription("thunderstorm with drizzle") || isDescriptionLabelMatchingIconDescription("thunderstorm with heavy drizzle")) {

            setWeatherIcon("");
        } else if (isDescriptionLabelMatchingIconDescription("freezing rain") || isDescriptionLabelMatchingIconDescription("light snow")
                || isDescriptionLabelMatchingIconDescription("Snow") || isDescriptionLabelMatchingIconDescription("Heavy snow") || isDescriptionLabelMatchingIconDescription("Sleet")
                || isDescriptionLabelMatchingIconDescription("Light shower sleet") || isDescriptionLabelMatchingIconDescription("Shower sleet")
                || isDescriptionLabelMatchingIconDescription("Light rain and snow") || isDescriptionLabelMatchingIconDescription("Rain and snow")
                || isDescriptionLabelMatchingIconDescription("Light shower snow") || isDescriptionLabelMatchingIconDescription("Shower snow")
                || isDescriptionLabelMatchingIconDescription("Heavy shower snow")) {

            setWeatherIcon("");
        } else if (isDescriptionLabelMatchingIconDescription("mist") || isDescriptionLabelMatchingIconDescription("Smoke")
                || isDescriptionLabelMatchingIconDescription("Haze") || isDescriptionLabelMatchingIconDescription("sand/ dust whirls")
                || isDescriptionLabelMatchingIconDescription("fog") || isDescriptionLabelMatchingIconDescription("sand")
                || isDescriptionLabelMatchingIconDescription("dust") || isDescriptionLabelMatchingIconDescription("volcanic ash")
                || isDescriptionLabelMatchingIconDescription("squalls") || isDescriptionLabelMatchingIconDescription("tornado")) {
            setWeatherIcon("");
        }
    }

    private boolean isDescriptionLabelMatchingIconDescription(String iconDescription) {
        return descriptionLabel.getText().equals(iconDescription);
    }

    private void setWeatherIcon(String imageName) {
        Image image = new Image(getClass().getResourceAsStream(imageName));
        weatherIcon.setImage(image);
    }

    public void setTemps(String temp) {
        this.tempsLabel.setText(temp);
    }
}

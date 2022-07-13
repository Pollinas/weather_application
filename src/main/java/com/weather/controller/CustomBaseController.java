package com.weather.controller;

import com.weather.view.ImageHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Objects;

public abstract class CustomBaseController extends VBox {

    @FXML
    private Label descriptionLabel;

    @FXML
    private ImageView weatherIcon;

    public CustomBaseController(String FXMLName) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                FXMLName));
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
        ImageHandler imageHandler = new ImageHandler(description);
        String imagePath = imageHandler.getImagePath();
        setWeatherIcon(imagePath);
    }

    protected void setWeatherIcon(String imageName) {
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imageName)));
        weatherIcon.setImage(image);
    }
}

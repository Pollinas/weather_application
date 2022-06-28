package com.weather.controller;

import com.weather.controller.service.WeatherService;
import com.weather.model.Weather;
import com.weather.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;


import java.nio.channels.UnresolvedAddressException;
import java.util.List;


public class MainWindowController extends BaseController {

    private WeatherService weatherService;

    public MainWindowController(ViewFactory viewFactory, String fxmlName, WeatherService weatherService) {
        super(fxmlName, viewFactory);
        this.weatherService = weatherService;
    }


    @FXML
    private TextField firstCityName;

    @FXML
    private TextField secondCityName;

    @FXML
    private HBox firstCityWeatherItemsContainer1;

    @FXML
    private HBox firstCityWeatherItemsContainer2;

    @FXML
    private AnchorPane firstCityCurrentWeatherItemContainer;

    @FXML
    private HBox secondCityWeatherItemsContainer1;

    @FXML
    private HBox secondCityWeatherItemsContainer2;

    @FXML
    private AnchorPane secondCityCurrentWeatherItemContainer;



    @FXML
    void addAutocompletion() {
        // TextFields.bindAutoCompletion(firstCityName, "Warszawa");
    }

    @FXML
    void closeMainWindow() {
        Stage stage = (Stage) firstCityWeatherItemsContainer1.getScene().getWindow();
        viewFactory.closeStage(stage);
    }

    @FXML
    void minimizeMainWindow() {
        Stage stage = (Stage) firstCityWeatherItemsContainer1.getScene().getWindow();
        viewFactory.minimizeStage(stage);
    }


    @FXML
    void firstCityButtonAction() {
        handleWeatherDataDisplay(firstCityWeatherItemsContainer1, firstCityWeatherItemsContainer2, firstCityCurrentWeatherItemContainer, firstCityName);

    }

    @FXML
    void secondCityButtonAction() {
        handleWeatherDataDisplay(secondCityWeatherItemsContainer1, secondCityWeatherItemsContainer2, secondCityCurrentWeatherItemContainer, secondCityName);
    }

    private void handleWeatherDataDisplay(HBox weatherContainer1, HBox weatherContainer2, AnchorPane currentWeatherContainer, TextField textField) {
        weatherContainer1.getChildren().clear();
        weatherContainer2.getChildren().clear();
        currentWeatherContainer.getChildren().clear();

        try {
            List<Weather> weathers = weatherService.getWeather(textField.getText());
            //current weather:
            String temps = String.valueOf(weathers.get(0).getDayTemperature()) + "°C";
            String description = weathers.get(0).getDescription();
            String date = String.valueOf(0);
            Node currentWeatherNode = viewFactory.createCurrentWeatherItem(temps, description);
            currentWeatherContainer.getChildren().add(currentWeatherNode);

            //weather for the next four days:
            for (int i = 1; i <= 4; i++) {
                temps = String.valueOf((int) weathers.get(i).getDayTemperature()) + "°C / " + String.valueOf((int) weathers.get(i).getNightTemperature()) + "°C";
                description = weathers.get(i).getDescription();
                date = String.valueOf(i);
                Node node = viewFactory.createWeatherItem(temps, description, date);

                if (i < 3) {
                    weatherContainer1.getChildren().add(node);
                } else {
                    weatherContainer2.getChildren().add(node);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            viewFactory.showErrorWindow();
        }
    }

}

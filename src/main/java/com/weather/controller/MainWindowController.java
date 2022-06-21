package com.weather.controller;

import com.weather.controller.service.WeatherService;
import com.weather.model.Weather;
import com.weather.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;



import java.util.List;


public class MainWindowController extends BaseController{

    private WeatherService weatherService;

    public MainWindowController(ViewFactory viewFactory, String fxmlName, WeatherService weatherService) {
        super(fxmlName,viewFactory);
        this.weatherService = weatherService;
    }


    @FXML
    private TextField firstCityName;

    @FXML
    private TextField secondCityName;

    @FXML
    private HBox weatherItemsContainer;

    @FXML
    private AnchorPane currentWeatherItemContainer;


    @FXML
    void firstCityButtonAction() {
        weatherItemsContainer.getChildren().clear();
        currentWeatherItemContainer.getChildren().clear();


        try {
            List<Weather> weathers = weatherService.getWeather(firstCityName.getText());
            //current weather:
            String temps = String.valueOf(weathers.get(0).getDayTemperature()) + "°C";
            String description = weathers.get(0).getDescription();
            String date = String.valueOf(0);
            Node currentWeatherNode = viewFactory.createCurrentWeatherItem(temps, description);
            currentWeatherItemContainer.getChildren().add(currentWeatherNode);

            //weather for the next four days:
            for (int i = 1; i <= 4 ; i++) {
                temps = String.valueOf((int)weathers.get(i).getDayTemperature()) + "°C / " +  String.valueOf((int)weathers.get(i).getNightTemperature()) + "°C";
                description = weathers.get(i).getDescription();
                date = String.valueOf(i);
                Node node = viewFactory.createWeatherItem(temps, description, date);
                weatherItemsContainer.getChildren().add(node);
            }
        } catch(Exception e){
            viewFactory.showErrorWindow();
        }



    }

    @FXML
    void secondCityButtonAction() {

    }

}

package com.weather.view;

import com.weather.controller.*;
import com.weather.controller.service.RequestWeatherMockService;
import com.weather.controller.service.RequestWeatherService;
import com.weather.controller.service.WeatherServiceImpl;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ViewFactory {

    double x,y =0;
    public void showMainWindow(){

        MainWindowController controller = new MainWindowController(this, "MainWindow.fxml", new WeatherServiceImpl(new RequestWeatherMockService()));
        initializeStage(controller);
    }

    private void initializeStage(BaseController controller) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFxmlName()));
        fxmlLoader.setController(controller);
        Parent parent;

        try{
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        Stage stage = new Stage(StageStyle.UNDECORATED);
        parent.setOnMousePressed(event -> {
            x = event.getSceneX();
            y= event.getSceneY();
        });
        parent.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);
        });

        stage.setScene(scene);
        stage.show();
    }

    public Node createWeatherItem(String temps, String description, String date)  {

        WeatherItemController node = new WeatherItemController();

        node.setDate(date);
        node.setDescription(description);
        node.setTemps(temps);

        return node;
    }

    public Node createCurrentWeatherItem(String temps, String description)  {

        CurrentWeatherItemController node = new CurrentWeatherItemController();
        node.setDescription(description);
        node.setTemperature(temps);
        return node;
    }

    public void showErrorWindow() {
        ErrorWindowController controller = new ErrorWindowController("ErrorWindow.fxml",this);
        initializeStage(controller);
    }

    public void closeStage(Stage stageToClose) {
        stageToClose.close();
    }

    public void minimizeStage(Stage stageToMinimize) {
        stageToMinimize.setIconified(true);
    }

    public void maximizeStage(Stage stageToMaximize) {
        stageToMaximize.setMaximized(true);
    }
}

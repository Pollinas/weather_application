package com.weather.view;

import com.weather.controller.MainWindowController;
import com.weather.controller.WeatherItemController;
import com.weather.controller.service.RequestWeatherMockService;
import com.weather.controller.service.RequestWeatherService;
import com.weather.controller.service.WeatherServiceImpl;
import com.weather.model.Weather;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ViewFactory {


    double x,y =0;
    public void showMainWindow(){

        MainWindowController controller = new MainWindowController(this, "MainWindow.fxml", new WeatherServiceImpl(new RequestWeatherMockService()));
        initializeStage(controller);
    }

    private void initializeStage(MainWindowController controller) {
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

    public Node createWeatherItem()  {

        WeatherItemController node = new WeatherItemController();

        node.setOnMouseEntered(event -> {
            node.setStyle("-fx-background-color: #64B5F6");
        });
        node.setOnMouseExited(event -> {
            node.setStyle("-fx-background-color: #E3F2FD");
        });
        node.setOnMousePressed(event -> {
            node.setStyle("-fx-background-color: #1565C0");
        });

        node.setDate("30/11/12");
        node.setDescription("sunny");
        node.setTemps("39");
        return node;
    }
}

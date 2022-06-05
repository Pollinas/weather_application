package com.weather.view;

import com.weather.controller.MainWindowController;
import com.weather.controller.service.WeatherServiceMock;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {


    public void showMainWindow(){

        MainWindowController controller = new MainWindowController(this, "MainWindow.fxml", new WeatherServiceMock());
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
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}

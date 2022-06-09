package com.weather;

import com.weather.view.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;


public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage){

        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showMainWindow();
    }
}

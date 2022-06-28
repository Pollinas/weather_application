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
import java.util.ArrayList;

public class ViewFactory {

    double x,y =0;

    private boolean isLightMode;
    private ArrayList<Stage> activeStages;
    private final static String DARK_MODE_PATH = "/css/darkMode.css";
    private final static String LIGHT_MODE_PATH = "/css/lightMode.css";

    public ViewFactory() {
        activeStages = new ArrayList<Stage>();
    }

    public void showMainWindow(){

        MainWindowController controller = new MainWindowController(this, "MainWindow.fxml", new WeatherServiceImpl(new RequestWeatherService()));
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
        scene.getStylesheets().add(getClass().getResource(DARK_MODE_PATH).toExternalForm());
        isLightMode = false;
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

        activeStages.add(stage);
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
        activeStages.remove(stageToClose);
    }

    public void minimizeStage(Stage stageToMinimize) {
        stageToMinimize.setIconified(true);
    }


    public void changeModeInAllWindows() {

        for (Stage stage : activeStages) {
            Scene scene = stage.getScene();

            if(isLightMode) {
                updateMode(scene, DARK_MODE_PATH);
                isLightMode = false;
            } else {
                updateMode(scene, LIGHT_MODE_PATH);
                isLightMode = true;
            }
        }

    }

    private void updateMode(Scene scene, String CSSFilePath) {
        scene.getStylesheets().clear();
        scene.getStylesheets().add(getClass().getResource(CSSFilePath).toExternalForm());

    }
}

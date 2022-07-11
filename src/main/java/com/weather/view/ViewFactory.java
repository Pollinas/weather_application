package com.weather.view;

import com.weather.Config;
import com.weather.controller.*;
import com.weather.controller.service.RequestWeatherService;
import com.weather.controller.service.WeatherServiceImpl;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.Objects;

public class ViewFactory {

    double x, y = 0;

    private boolean isLightMode;
    private boolean isTheInfoWindowOpen;
    private ArrayList<Stage> activeStages;
    private final static String DARK_MODE_PATH = "/css/darkMode.css";
    private final static String LIGHT_MODE_PATH = "/css/lightMode.css";

    public ViewFactory() {
        activeStages = new ArrayList<>();
        isLightMode = false;
        isTheInfoWindowOpen = false;
    }

    public void showMainWindow() {

        Config config = new Config();
        RequestWeatherService requestWeatherService = new RequestWeatherService(config, HttpClient.newHttpClient());
        WeatherServiceImpl weatherService = new WeatherServiceImpl(requestWeatherService);
        MainWindowController controller = new MainWindowController(this, "MainWindow.fxml", weatherService);
        initializeStage(controller);

    }

    private void initializeStage(BaseController controller) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFxmlName()));
        fxmlLoader.setController(controller);
        Parent parent;

        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        if (!isLightMode) {
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(DARK_MODE_PATH)).toExternalForm());
        } else {
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(LIGHT_MODE_PATH)).toExternalForm());
        }
        Stage stage = new Stage(StageStyle.UNDECORATED);
        parent.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });
        parent.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);
        });

        stage.setScene(scene);
        stage.show();

        activeStages.add(stage);
    }

    public Node createWeatherItem(String temps, String description, String date) {

        WeatherItemController node = new WeatherItemController();

        node.setDate(date);
        node.setDescription(description);
        node.setTemps(temps);

        return node;
    }

    public Node createCurrentWeatherItem(String temps, String description) {

        CurrentWeatherItemController node = new CurrentWeatherItemController();
        node.setDescription(description);
        node.setTemperature(temps);
        return node;
    }

    public void showErrorWindow() {
        ErrorWindowController controller = new ErrorWindowController("ErrorWindow.fxml", this);
        initializeStage(controller);
    }

    public void showInfoWindow() {
        if (!isTheInfoWindowOpen) {
            isTheInfoWindowOpen = true;
            InfoWindowController controller = new InfoWindowController("InfoWindow.fxml", this);
            initializeStage(controller);
        }
    }

    public void closeStage(Stage stageToClose) {
        stageToClose.close();
        activeStages.remove(stageToClose);
    }

    public void minimizeStage(Stage stageToMinimize) {
        stageToMinimize.setIconified(true);
    }

    public void setIsTheInfoWindowOpen(boolean isTheInfoWindowOpen) {
        this.isTheInfoWindowOpen = isTheInfoWindowOpen;
    }

    public void changeModeInAllWindows() {

        if (isLightMode) {
            for (Stage stage : activeStages) {
                Scene scene = stage.getScene();
                updateMode(scene, DARK_MODE_PATH);
            }
            isLightMode = false;
        } else {
            for (Stage stage : activeStages) {
                Scene scene = stage.getScene();
                updateMode(scene, LIGHT_MODE_PATH);
            }
            isLightMode = true;
        }

    }

    private void updateMode(Scene scene, String CSSFilePath) {
        scene.getStylesheets().clear();
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(CSSFilePath)).toExternalForm());
    }
}

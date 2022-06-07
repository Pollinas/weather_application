module com.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;
    requires com.google.gson;

    opens com.weather;
    opens com.weather.view;
    opens com.weather.controller;


    exports com.weather;
}
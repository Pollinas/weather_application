module com.weather {

    requires javafx.fxml;
    requires javafx.web;
    requires com.google.gson;
    requires java.net.http;
    requires javafx.controls;
    requires javafx.base;
    requires javafx.graphics;

    opens com.weather;
    opens com.weather.view;
    opens com.weather.controller;
    opens com.weather.model;
    opens com.weather.model.dto;

    exports com.weather;
}






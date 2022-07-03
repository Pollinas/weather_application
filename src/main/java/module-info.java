module com.weather {

    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;
    requires com.google.gson;
    requires java.net.http;
    requires org.controlsfx.controls;
    //requires javafx.base;

    opens com.weather;
    opens com.weather.view;
    opens com.weather.controller;
    opens com.weather.model;
    opens com.weather.model.dto;

    exports com.weather;
}




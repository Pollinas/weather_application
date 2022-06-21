package com.weather.controller;

import com.weather.view.ViewFactory;

public abstract class BaseController {

    protected String fxmlName;
    protected ViewFactory viewFactory;

    public BaseController(String fxmlName, ViewFactory viewFactory) {
        this.fxmlName = fxmlName;
        this.viewFactory = viewFactory;
    }

    public String getFxmlName() {
        return "/fxml/" + fxmlName;
    }
}

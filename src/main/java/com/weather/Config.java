package com.weather;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private final static String RESOURCE_FILE = "config.properties";
    private final static String API_KEY = "openweather.api.key";

    public String getApiKey() throws IOException {

        InputStream inputStream = null;

        try {
            Properties prop = new Properties();
            inputStream = Config.class.getClassLoader().getResourceAsStream(RESOURCE_FILE);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + RESOURCE_FILE + "' not found in the classpath");
            }
            return prop.getProperty(API_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null)
                inputStream.close();
        }
        return null;
    }
}

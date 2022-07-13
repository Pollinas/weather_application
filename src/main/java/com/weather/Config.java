package com.weather;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private final static String RESOURCE_FILE = "config.properties";
    private final static String API_KEY = "openweather.api.key";
    private String apiKey = null;

    public String getApiKey() throws IOException {

        if (apiKey != null)
            return apiKey;

        else {

            InputStream inputStream = null;
            try {
                Properties prop = new Properties();
                inputStream = Config.class.getClassLoader().getResourceAsStream(RESOURCE_FILE);

                if (inputStream != null) {
                    prop.load(inputStream);
                } else {
                    throw new FileNotFoundException("property file '" + RESOURCE_FILE + "' not found in the classpath");
                }
                apiKey = prop.getProperty(API_KEY);
                return apiKey;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (inputStream != null)
                    inputStream.close();
            }
            return null;
        }
    }
}

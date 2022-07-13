package com.weather.view;


public class ImageHandler {

    private final String description;

    public ImageHandler(String description) {
        this.description = description;
    }

    public String getImagePath() {
        String imagePath = "";

        if (isDescriptionMatchingIconDescription("clear sky")) {
            imagePath = "/icons/sun.png";
        } else if (isDescriptionMatchingIconDescription("few clouds") || isDescriptionMatchingIconDescription("few clouds: 11-25%")) {
            imagePath = "/icons/sun_cloud.png";
        } else if (isDescriptionMatchingIconDescription("scattered clouds") || isDescriptionMatchingIconDescription("scattered clouds: 25-50%")) {
            imagePath = "/icons/scattered_clouds.png";
        } else if (isDescriptionMatchingIconDescription("broken clouds") || isDescriptionMatchingIconDescription("overcast clouds")
                || isDescriptionMatchingIconDescription("broken clouds: 51-84%") || isDescriptionMatchingIconDescription("overcast clouds: 85-100%")) {
            imagePath = "/icons/broken_clouds.png";

        } else if (isDescriptionMatchingIconDescription("shower rain") || isDescriptionMatchingIconDescription("light intensity shower rain")
                || isDescriptionMatchingIconDescription("heavy intensity shower rain") || isDescriptionMatchingIconDescription("ragged shower rain")
                || isDescriptionMatchingIconDescription("light intensity drizzle") || isDescriptionMatchingIconDescription("drizzle")
                || isDescriptionMatchingIconDescription("heavy intensity drizzle") || isDescriptionMatchingIconDescription("light intensity drizzle rain")
                || isDescriptionMatchingIconDescription("drizzle rain") || isDescriptionMatchingIconDescription("heavy intensity drizzle rain")
                || isDescriptionMatchingIconDescription("shower rain and drizzle") || isDescriptionMatchingIconDescription("heavy shower rain and drizzle")
                || isDescriptionMatchingIconDescription("shower drizzle")) {

            imagePath = "/icons/heavy_rain.png";
        } else if (isDescriptionMatchingIconDescription("light rain") || isDescriptionMatchingIconDescription("moderate rain")
                || isDescriptionMatchingIconDescription("heavy intensity rain") || isDescriptionMatchingIconDescription("very heavy rain")
                || isDescriptionMatchingIconDescription("extreme rain")) {

            imagePath = "/icons/light_rain.png";
        } else if (isDescriptionMatchingIconDescription("thunderstorm with light rain") || isDescriptionMatchingIconDescription("thunderstorm with rain")
                || isDescriptionMatchingIconDescription("thunderstorm with heavy rain") || isDescriptionMatchingIconDescription("light thunderstorm")
                || isDescriptionMatchingIconDescription("thunderstorm") || isDescriptionMatchingIconDescription("heavy thunderstorm")
                || isDescriptionMatchingIconDescription("ragged thunderstorm") || isDescriptionMatchingIconDescription("thunderstorm with light drizzle")
                || isDescriptionMatchingIconDescription("thunderstorm with drizzle") || isDescriptionMatchingIconDescription("thunderstorm with heavy drizzle")) {

            imagePath = "/icons/thunderstorm.png";
        } else if (isDescriptionMatchingIconDescription("freezing rain") || isDescriptionMatchingIconDescription("light snow")
                || isDescriptionMatchingIconDescription("Snow") || isDescriptionMatchingIconDescription("Heavy snow") || isDescriptionMatchingIconDescription("Sleet")
                || isDescriptionMatchingIconDescription("Light shower sleet") || isDescriptionMatchingIconDescription("Shower sleet")
                || isDescriptionMatchingIconDescription("Light rain and snow") || isDescriptionMatchingIconDescription("Rain and snow")
                || isDescriptionMatchingIconDescription("Light shower snow") || isDescriptionMatchingIconDescription("Shower snow")
                || isDescriptionMatchingIconDescription("Heavy shower snow")) {

            imagePath = "/icons/snow.png";
        } else if (isDescriptionMatchingIconDescription("mist") || isDescriptionMatchingIconDescription("Smoke")
                || isDescriptionMatchingIconDescription("Haze") || isDescriptionMatchingIconDescription("sand/ dust whirls")
                || isDescriptionMatchingIconDescription("fog") || isDescriptionMatchingIconDescription("sand")
                || isDescriptionMatchingIconDescription("dust") || isDescriptionMatchingIconDescription("volcanic ash")
                || isDescriptionMatchingIconDescription("squalls") || isDescriptionMatchingIconDescription("tornado")) {
            imagePath = "";
        }

        return imagePath;
    }

    protected boolean isDescriptionMatchingIconDescription(String iconDescription) {
        return description.equals(iconDescription);
    }

}

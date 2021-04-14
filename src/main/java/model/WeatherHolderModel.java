/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author The_Z
 */
public abstract class WeatherHolderModel {

    private static List<WeatherModel> weatherArray = new ArrayList();
    private static List<WeatherMediaModel> weatherMedia = new ArrayList();

    public static List<WeatherMediaModel> getWeatherMedia() {
        return weatherMedia;
    }

    public static void setWeatherMedia(List<WeatherMediaModel> weatherMedia) {
        WeatherHolderModel.weatherMedia = weatherMedia;
    }

    public static List<WeatherModel> getWeatherArray() {
        return weatherArray;
    }

    public static void setWeatherArray(List<WeatherModel> weatherArray) {
        WeatherHolderModel.weatherArray = weatherArray;
    }
}

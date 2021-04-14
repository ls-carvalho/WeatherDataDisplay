/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import java.util.List;
import static model.WeatherHolderModel.getWeatherArray;
import model.WeatherModel;

/**
 *
 * @author The_Z
 */
public interface PresenterLastWeather {
    public static WeatherModel getLastWeather() { //passar pra um outro java
        List<WeatherModel> weatherArray;
        weatherArray = getWeatherArray();
        WeatherModel model = null;
        if (!weatherArray.isEmpty()) {
            model = weatherArray.get(weatherArray.size()-1);
        }
        return model;
    }
}

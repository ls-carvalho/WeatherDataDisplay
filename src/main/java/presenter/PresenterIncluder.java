/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import java.util.List;
import model.LogModel;
import model.WeatherHolderModel;
import model.WeatherModel;

/**
 *
 * @author The_Z
 */
public interface PresenterIncluder {
    public static void incluirReport(String d, String t, String u, String p) {
        WeatherModel model = new WeatherModel(d, Float.parseFloat(t), Float.parseFloat(u), Float.parseFloat(p));
        List<WeatherModel> weatherArray;
        weatherArray = WeatherHolderModel.getWeatherArray();
        weatherArray.add(model);
        LogModel.removeLog(model);
        PresenterMedia.calculaMedia();
    }
}

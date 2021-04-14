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
public interface PresenterRemover {

    public static void removerReport(int i) {
        List<WeatherModel> weatherArray;
        weatherArray = WeatherHolderModel.getWeatherArray();
        LogModel.removeLog(weatherArray.get(i));
        weatherArray.remove(i);
        PresenterMedia.calculaMedia();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import java.util.List;
import model.MediaHelper;
import model.WeatherHolderModel;
import model.WeatherMediaModel;
import model.WeatherModel;

/**
 *
 * @author The_Z
 */
public interface PresenterMedia {
    public static void calculaMedia() {
        List<WeatherModel> weatherArray;
        weatherArray = WeatherHolderModel.getWeatherArray();
        List<WeatherMediaModel> weatherMedia;
        weatherMedia = WeatherHolderModel.getWeatherMedia();
        WeatherMediaModel model = null;
        model = MediaHelper.mediaSemanal(weatherArray);
        if (model != null) {
            if(weatherMedia.size()==0) weatherMedia.add(model);
            else weatherMedia.set(0, model);
        }
        model = null;
        model = MediaHelper.mediaDiaria(weatherArray);
        if (model != null) {
            if(weatherMedia.size()<=1) weatherMedia.add(model);
            else weatherMedia.set(1, model);
        }
        model = null;
        model = MediaHelper.mediaMensal(weatherArray);
        if (model != null) {
            if(weatherMedia.size()<=2) weatherMedia.add(model);
            else weatherMedia.set(2, model);
        }
    }
}

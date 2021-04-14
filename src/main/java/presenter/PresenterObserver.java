/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import Aplicação.Main;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.WeatherHolderModel;

/**
 *
 * @author The_Z
 */
public class PresenterObserver implements Observer {

    @Override
    public void update() {
        //limpa a inserção
        Main.getDisplay().getDataDadosTempoFTField().setText("");
        Main.getDisplay().getTempDadosTempoTField().setText("");
        Main.getDisplay().getUmiDadosTempoTField().setText("");
        Main.getDisplay().getPresDadosTempoTField().setText("");
        //atualiza o ultimo report
        if (PresenterLastWeather.getLastWeather() == null) {
            Main.getDisplay().getDataUltimaAtualizacaoFinalLabel().setText("DATA");
            Main.getDisplay().getTempUltimaAtualizacaoFinalLabel().setText("TEMPERATURA");
            Main.getDisplay().getUmiUltimaAtualizacaoFinalLabel().setText("UMIDADE");
            Main.getDisplay().getPresUltimaAtualizacaoFinalLabel().setText("PRESSÃO");
        } else {
            Main.getDisplay().getDataUltimaAtualizacaoFinalLabel().setText(PresenterLastWeather.getLastWeather().getData());
            Main.getDisplay().getTempUltimaAtualizacaoFinalLabel().setText(Float.toString(PresenterLastWeather.getLastWeather().getTemperatura()));
            Main.getDisplay().getUmiUltimaAtualizacaoFinalLabel().setText(Float.toString(PresenterLastWeather.getLastWeather().getUmidade()));
            Main.getDisplay().getPresUltimaAtualizacaoFinalLabel().setText(Float.toString(PresenterLastWeather.getLastWeather().getPressao()));
        }
        DefaultTableModel model = (DefaultTableModel) Main.getDisplay().getRegistroTable().getModel();
        //limpa a tabela
        model.setRowCount(0);
        //re-insere a tabela;
        WeatherHolderModel.getWeatherArray().stream().map(weather -> {
            Vector v = new Vector();
            v.add(weather.getData());
            v.add(Float.toString(weather.getTemperatura()));
            v.add(Float.toString(weather.getUmidade()));
            v.add(Float.toString(weather.getPressao()));
            return v;
        }).forEachOrdered(v -> {
            model.addRow(v);
        });
        //atualiza total de registros
        Main.getDisplay().getTotalRegFinal().setText(Integer.toString(WeatherHolderModel.getWeatherArray().size()));
        //atualiza as médias
        if (WeatherHolderModel.getWeatherMedia() == null) {
            Main.getDisplay().getTempDadosMediosFinalLabel().setText("TEMPERATURA");
            Main.getDisplay().getUmiDadosMediosFinalLabel().setText("UMIDADE");
            Main.getDisplay().getPresDadosMediosFinalLabel().setText("PRESSÃO");
            Main.getDisplay().getRegDadosMediosFinalLabel().setText("Nº REGISTROS");
        } else {
            switch (Main.getDisplay().getPeriodoDadosMediosComboBox().getSelectedIndex()) {
                case 0:
                    //semanal
                    Main.getDisplay().getTempDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(0).getTemperatura()));
                    Main.getDisplay().getUmiDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(0).getUmidade()));
                    Main.getDisplay().getPresDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(0).getPressao()));
                    Main.getDisplay().getRegDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(0).getRegistro()));
                    break;
                case 1:
                    //diario
                    Main.getDisplay().getTempDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(1).getTemperatura()));
                    Main.getDisplay().getUmiDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(1).getUmidade()));
                    Main.getDisplay().getPresDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(1).getPressao()));
                    Main.getDisplay().getRegDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(1).getRegistro()));
                    break;
                case 2:
                    //mensal
                    Main.getDisplay().getTempDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(2).getTemperatura()));
                    Main.getDisplay().getUmiDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(2).getUmidade()));
                    Main.getDisplay().getPresDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(2).getPressao()));
                    Main.getDisplay().getRegDadosMediosFinalLabel().setText(Float.toString(WeatherHolderModel.getWeatherMedia().get(2).getRegistro()));
                    break;
            }
        }
    }
}

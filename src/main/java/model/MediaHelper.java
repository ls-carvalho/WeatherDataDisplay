/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 *
 * @author The_Z
 */
public class MediaHelper {

    public static WeatherMediaModel mediaSemanal(List<WeatherModel> reports) {
        int registros = 0;
        float mediaTemp = 0;
        float mediaUmi = 0;
        float mediaPres = 0;
        WeatherMediaModel model;
        var today = LocalDate.now();
        for (int i = 0; i < reports.size(); i++) {
            var aux = LocalDate.parse(reports.get(i).data, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            if (aux.compareTo(today.minusWeeks(1))>0 && today.until(aux, ChronoUnit.DAYS) < 8) {
                registros++;
                mediaTemp = reports.get(i).getTemperatura() + mediaTemp;
                mediaUmi = reports.get(i).getUmidade() + mediaUmi;
                mediaPres = reports.get(i).getPressao() + mediaPres;
            }
        }
        if (registros <= 0) {
            model = new WeatherMediaModel("Semanal", 0, 0, 0, 0);
        } else {
            model = new WeatherMediaModel("Semanal", mediaTemp / registros, mediaUmi / registros, mediaPres / registros, registros);
        }
        return model;
    }

    public static WeatherMediaModel mediaDiaria(List<WeatherModel> reports) {
        int registros = 0;
        float mediaTemp = 0;
        float mediaUmi = 0;
        float mediaPres = 0;
        WeatherMediaModel model;
        var today = LocalDate.now();
        for (int i = 0; i < reports.size(); i++) {
            var aux = LocalDate.parse(reports.get(i).data, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            if (today.equals(aux)) {
                registros++;
                mediaTemp = reports.get(i).getTemperatura() + mediaTemp;
                mediaUmi = reports.get(i).getUmidade() + mediaUmi;
                mediaPres = reports.get(i).getPressao() + mediaPres;
            }
        }
        if (registros <= 0) {
            model = new WeatherMediaModel("Semanal", 0, 0, 0, 0);
        } else {
            model = new WeatherMediaModel("Diária", mediaTemp / registros, mediaUmi / registros, mediaPres / registros, registros);
        }
        return model;
    }

    public static WeatherMediaModel mediaMensal(List<WeatherModel> reports) {
        int registros = 0;
        float mediaTemp = 0;
        float mediaUmi = 0;
        float mediaPres = 0;
        WeatherMediaModel model;
        var today = LocalDate.now();
        for (int i = 0; i < reports.size(); i++) {
            var aux = LocalDate.parse(reports.get(i).data, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            if (today.getMonthValue() == aux.getMonthValue()) {
                registros++;
                mediaTemp = reports.get(i).getTemperatura() + mediaTemp;
                mediaUmi = reports.get(i).getUmidade() + mediaUmi;
                mediaPres = reports.get(i).getPressao() + mediaPres;
            }
        }
        if (registros <= 0) {
            model = new WeatherMediaModel("Semanal", 0, 0, 0, 0);
        } else {
            model = new WeatherMediaModel("Mensal", mediaTemp / registros, mediaUmi / registros, mediaPres / registros, registros);
        }
        return model;
    }
}

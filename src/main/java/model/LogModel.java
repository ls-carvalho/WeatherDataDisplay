/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author The_Z
 */
public abstract class LogModel {

    private static List<String> arrayLog = new ArrayList<>();

    public static List<String> getArrayLog() {
        return arrayLog;
    }

    public static void setArrayLog(List<String> arrayLog) {
        LogModel.arrayLog = arrayLog;
    }

    public static void insereLog(WeatherModel report) {
        LogModel.getArrayLog().add(report.getData());
        LogModel.getArrayLog().add(Float.toString(report.getTemperatura()));
        LogModel.getArrayLog().add(Float.toString(report.getUmidade()));
        LogModel.getArrayLog().add(Float.toString(report.getPressao()));
        LogModel.getArrayLog().add("Inclusao");
    }
    
    public static void removeLog(WeatherModel report) {
        LogModel.getArrayLog().add(report.getData());
        LogModel.getArrayLog().add(Float.toString(report.getTemperatura()));
        LogModel.getArrayLog().add(Float.toString(report.getUmidade()));
        LogModel.getArrayLog().add(Float.toString(report.getPressao()));
        LogModel.getArrayLog().add("Remocao");
    }
}

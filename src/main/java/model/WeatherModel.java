/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author The_Z
 */
public class WeatherModel {

    public float temperatura;
    public String data;
    public float pressao;
    public float umidade;
    
    public WeatherModel(){
        //construtor vazio
    }

    public WeatherModel(String d, float t, float u, float p) {
        this.data = d;
        this.temperatura = t;
        this.pressao = p;
        this.umidade = u;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPressao() {
        return pressao;
    }

    public void setPressao(float pressao) {
        this.pressao = pressao;
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

}

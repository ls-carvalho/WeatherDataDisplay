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
public class WeatherMediaModel {
    
    public String tipo;
    public float temperatura;
    public float umidade;
    public float pressao;
    public int registro;
    
    public WeatherMediaModel(){
        //construtor vazio
    }

    public WeatherMediaModel(String tipo, float temperatura, float umidade, float pressao, int registro) {
        this.tipo = tipo;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        this.registro = registro;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

    public float getPressao() {
        return pressao;
    }

    public void setPressao(float pressao) {
        this.pressao = pressao;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
}

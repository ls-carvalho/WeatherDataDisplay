/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.List;

/**
 *
 * @author The_Z
 */
public abstract class AdaptToXML {

    public static String convertToXML(List<String> aux) {
        StringBuilder str = new StringBuilder();
        int j = 1;
        while (aux.isEmpty() == false) {
            str.append("<report id=\"").append(j).append("\">");
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    str.append("<data>").append(aux.get(0)).append("</data>");
                }
                if (i == 1) {
                    str.append("<temperatura>").append(aux.get(0)).append("</temperatura>");
                }
                if (i == 2) {
                    str.append("<umidade>").append(aux.get(0)).append("</umidade>");
                }
                if (i == 3) {
                    str.append("<pressao>").append(aux.get(0)).append("</pressao>");
                }
                if (i == 4) {
                    str.append("<operacao>").append(aux.get(0)).append("</operacao>");
                }
                aux.remove(0);
            }
            str.append("</report>");
            j++;
        }
        return str.toString();
    }
}
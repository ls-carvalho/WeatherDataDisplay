/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.List;
import org.json.simple.JSONObject;

/**
 *
 * @author The_Z
 */
public class AdaptToJSON {

    public static String convertToJSON(List<String> aux) {
        JSONObject obj = new JSONObject();
        while (!aux.isEmpty()) {
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    obj.put("Data", aux.get(0));
                }
                if (i == 1) {
                    obj.put("Temperatura", aux.get(0));
                }
                if (i == 2) {
                    obj.put("Umidade", aux.get(0));
                }
                if (i == 3) {
                    obj.put("Pressao", aux.get(0));
                }
                if (i == 4) {
                    obj.put("Operacao", aux.get(0));
                }
                aux.remove(0);
            }
        }
        return obj.toString();
    }
}

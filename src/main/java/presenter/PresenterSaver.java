/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import adapter.AdaptToJSON;
import adapter.AdaptToXML;
import java.io.IOException;
import model.LogModel;
import model.Writer;

/**
 *
 * @author The_Z
 */
public interface PresenterSaver {
    public static void salvarConfig(int tipo) throws IOException{
        switch(tipo){
            case 0:
                Writer.printLog(AdaptToJSON.convertToJSON(LogModel.getArrayLog()), 0);
                break;
            case 1:
                Writer.printLog(AdaptToXML.convertToXML(LogModel.getArrayLog()), 1);
                break;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author The_Z
 */
public abstract class Writer {

    public static void printLog(String log, int tipo) throws IOException {
        FileWriter file = null;
        if (tipo == 0) {
            file = new FileWriter("log.json");
        } else if (tipo == 1) {
            file = new FileWriter("log.xml");
        }
        if (log != null) {
            file.write(log);
            file.flush();
            file.close();
        }
    }
}

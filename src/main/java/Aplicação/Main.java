/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicação;

import view.Interface;

/**
 *
 * @author The_Z
 */
public class Main {

    private static Interface display;

    public static Interface getDisplay() {
        return display;
    }

    public static void main(String args[]) {
      display =  new Interface();
    }
}

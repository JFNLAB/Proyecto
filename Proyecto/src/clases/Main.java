/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import gui.Principal;
import clases.Base;
import clases.Barras;
import clases.Reloj;

/**
 *
 * @author julian
 */
public class Main {

    private static Base db = new Base();
    private static Barras barra = new Barras();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal ventana = new Principal(db, barra);
        ventana.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumador;

import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class ExceptionNumero extends Exception {

    public ExceptionNumero(String msg) {
        super(msg);

    }

    public void mensaje(){

        JOptionPane.showMessageDialog(null, "Dato no valido");
    }
}
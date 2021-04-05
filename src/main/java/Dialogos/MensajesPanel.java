/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author jonat
 */
public class MensajesPanel extends JPanel{

    private TxtEdit titulo;
    private TxtEdit mensaje;

    public MensajesPanel(){
        //super.setLayout(new BorderLayout(100,5));
        titulo = new TxtEdit("Titulo");
        mensaje = new TxtEdit("Mensaje");

        super.add(titulo);
        super.add(mensaje);
    }
    public String getMensaje() throws ExceptionVacio{
        return mensaje.getValor();
    }
    public String getTitulo() throws ExceptionVacio{
        return titulo.getValor();
    }
    public void limpiar(){
        titulo.clear();
        mensaje.clear();
    }
}

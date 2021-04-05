/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author jonat
 */
public class PrincipalFrame extends JFrame{
    private Usuario pnlUsuario;
    private BotonPanel btnSalir;
    private ComboBox cbOpcion;
    private static final Double DOLAR = 20.29;
    
    public PrincipalFrame(){
        super("Conversor");
        super.setLayout(new GridLayout(3,1));
        super.setSize(250,250);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pnlUsuario = new Usuario();
        btnSalir = new BotonPanel();
        cbOpcion = new ComboBox();
        
        cbOpcion.setListener(new ComboBoxInterface(){
            public void functionSelect(){
                Double resultado = 0.0;
                if (cbOpcion.getComboValue() == 1) {
                    Double numero = pnlUsuario.getNumero();
                    resultado = numero / DOLAR;
                    pnlUsuario.setResultado(resultado);
                }else if(cbOpcion.getComboValue() == 2) {
                    Double numero = pnlUsuario.getNumero();
                    resultado = numero * DOLAR;
                    pnlUsuario.setResultado(resultado);
                }
            }
        });
        
        btnSalir.setListener(new BotonPanelInterface(){
            public void functionSalir(){
                System.exit(0);
            }
        });
        
        super.setVisible(true);
        super.add(pnlUsuario);
        super.add(cbOpcion);
        super.add(btnSalir);
    }
    public static void main(String[] args) {
        new PrincipalFrame();
    }
}

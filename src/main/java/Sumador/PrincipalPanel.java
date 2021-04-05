/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumador;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jonat
 */
public class PrincipalPanel extends JFrame {

    private BotonesPanel pnlBotones;
    private NumerosPanel pnlNumeros;
    private Combo combo;


    public PrincipalPanel() {
        super("Sumatoria");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(300, 400);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);


        pnlBotones = new BotonesPanel();
        pnlNumeros = new NumerosPanel();
        combo = new Combo();
        combo.setListener(new ComboListener() {
            @Override
            public void agrgegarClick(Integer a) {
                pnlNumeros.agregar(a);
                PrincipalPanel.this.pack();                
            }
        });


        pnlBotones.setListener(new Acciones() {
            @Override
            public void calcularSumaClick() {
                try {
                    Integer a= pnlNumeros.suma();
                    JOptionPane.showMessageDialog(PrincipalPanel.this,
                            String.format("El resultado es %d", a),
                            "Resultado",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (NumeroIncorrecto ex) {
                    JOptionPane.showMessageDialog(PrincipalPanel.this,
                            ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }

            @Override
            public void salirClick() {
                System.exit(0);
            }

            @Override
            public void limpiarClick() {
                pnlNumeros.limpiar();
            }
        });

        super.add(combo,BorderLayout.NORTH);
        super.add(pnlBotones, BorderLayout.SOUTH);
        super.add(pnlNumeros);
        super.setVisible(true);
    }

    public static void main(String[] args) {
        new PrincipalPanel();
    }
}

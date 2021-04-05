/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jonat
 */
public class PrincipalPanel extends JFrame {

    private RadioPanel rpBotones;
    private MensajesPanel mpTexto;
    private BotonesPanel btnBotones;

    public PrincipalPanel() {
        super("Dialogos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 250);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        rpBotones = new RadioPanel();
        mpTexto = new MensajesPanel();
        btnBotones = new BotonesPanel();
        btnBotones.setListener(new BotonListener() {
            @Override
            public void generarClick() {
                try {
                    switch (rpBotones.seleccionado()) {
                        case 1:
                            JOptionPane.showMessageDialog(PrincipalPanel.this,
                                    mpTexto.getMensaje(),
                                    mpTexto.getTitulo(),
                                    JOptionPane.WARNING_MESSAGE);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(PrincipalPanel.this,
                                    mpTexto.getMensaje(),
                                    mpTexto.getTitulo(),
                                    JOptionPane.ERROR_MESSAGE);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(PrincipalPanel.this,
                                    mpTexto.getMensaje(),
                                    mpTexto.getTitulo(),
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(PrincipalPanel.this,
                                    mpTexto.getMensaje(),
                                    mpTexto.getTitulo(),
                                    JOptionPane.QUESTION_MESSAGE);
                            break;
                    }
                } catch (ExceptionSelection ex) {
                    JOptionPane.showMessageDialog(PrincipalPanel.this,
                            ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (ExceptionVacio ex) {
                    JOptionPane.showMessageDialog(PrincipalPanel.this,
                            ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            @Override
            public void limpiarClick() {
                mpTexto.limpiar();
                rpBotones.desseleccionar();
            }
        });

        super.add(rpBotones, BorderLayout.WEST);
        super.add(mpTexto, BorderLayout.CENTER);
        super.add(btnBotones, BorderLayout.SOUTH);
        super.setVisible(true);

    }

    public static void main(String[] args) {
        new PrincipalPanel();
    }
}
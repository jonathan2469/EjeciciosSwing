/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author jonat
 */
public class BotonPanel extends JPanel{
    private JButton btnSalir;
    private BotonPanelInterface listener;
    
    public BotonPanel() {
        super.setLayout(new FlowLayout());
        
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.functionSalir();
            }
        });
        
        super.add(btnSalir);
    }

    public void setListener(BotonPanelInterface listener) {
        this.listener = listener;
    }
    
    
}

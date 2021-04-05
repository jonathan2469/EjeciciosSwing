/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author jonat
 */
public class ComboBox extends JPanel{
    private JComboBox cbOpcion;
    private ComboBoxInterface listener;
    
    public ComboBox() {
        
        cbOpcion = new JComboBox();
        
        cbOpcion.addItem("");
        cbOpcion.addItem("De peso a dolar");
        cbOpcion.addItem("De dolar a peso");
        
        cbOpcion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.functionSelect();
                }
        });
        
        super.add(cbOpcion);
    }

    public void setListener(ComboBoxInterface listener) {
        this.listener = listener;
    }

    public Integer getComboValue() {
        return cbOpcion.getSelectedIndex();
    }
    
    
}

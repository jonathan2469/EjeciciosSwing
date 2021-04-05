/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jonat
 */
public class Usuario extends JPanel{
    private JLabel jlCantidad;
    private JLabel jlResultado;
    
    private JTextField txtCantidad;
    
    private JPanel pnlCantidad;

    public Usuario() {
        super.setLayout(new GridLayout(2,1));
        jlCantidad = new JLabel("Ingrese la cantidad: ");
        jlResultado = new JLabel("$ 0.00");
        
        txtCantidad = new JTextField();
        
        pnlCantidad = new JPanel();
        
        pnlCantidad.add(jlCantidad);
        pnlCantidad.add(txtCantidad);
        
        super.add(pnlCantidad);
        super.add(jlResultado);
        pnlCantidad.setLayout(new GridLayout(2,1));
        
    }
    
    public Double getNumero(){
        Double numero = Double.parseDouble(txtCantidad.getText());
        return numero;
    }
    
    public void setResultado(Double x){
        jlResultado.setText(x.toString());
    }
}

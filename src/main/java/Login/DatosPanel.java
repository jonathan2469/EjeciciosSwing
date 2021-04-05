/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author jonat
 */
public class DatosPanel extends JPanel {

    private TxtEdit usuario;
    private TxtEdit2 password;
    private JToggleButton tbPass;
    private JLabel lblOculto;

    private JPanel pnacomodo;

    public DatosPanel() {
        super.setLayout(new FlowLayout());
        usuario = new TxtEdit("Usuario: ");
        password = new TxtEdit2("Password: ");
        tbPass = new JToggleButton("ver1.png");
        Dimension s= new Dimension(30,15);
        tbPass.setPreferredSize(s);
        lblOculto = new JLabel("");
        tbPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tbPass.isSelected()) {                    
                    lblOculto.setText(password.getValor());
                }else{
                    lblOculto.setText("");
                }
            }
        });

        pnacomodo = new JPanel();
        pnacomodo.setLayout(new BorderLayout());

        pnacomodo.add(password, BorderLayout.CENTER);
        pnacomodo.add(lblOculto, BorderLayout.SOUTH);
        pnacomodo.add(tbPass, BorderLayout.EAST);
        super.add(usuario);
        super.add(pnacomodo);
    }

    public String getUsuario(){
        return usuario.getValor();
    }
}

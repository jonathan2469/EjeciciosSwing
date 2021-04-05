/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author jonat
 */
public class PrincipalPanel extends JFrame{

    private JLabel lblTitulo;
    private JPanel pntitulo;
    private JPanel pningreso;
    private DatosPanel dpTexto;
    private JButton btnIngreso;


    public PrincipalPanel(){
        super("Login");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,200);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        lblTitulo = new JLabel("Oxxo");
        lblTitulo.setFont(new Font("Arial", Font.ITALIC,30));
        pntitulo= new JPanel();
        pntitulo.add(lblTitulo, BorderLayout.CENTER);
        dpTexto = new DatosPanel();
        btnIngreso = new JButton("Ingresar");
        pningreso = new JPanel();
        pningreso.setLayout(new FlowLayout());
        pningreso.add(btnIngreso);
        btnIngreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PrincipalPanel.this, 
                        String.format("Bienvenido %s !", 
                                dpTexto.getUsuario(),
                                JOptionPane.INFORMATION_MESSAGE));
            }
        });

        super.add(dpTexto, BorderLayout.CENTER);
        super.add(pntitulo, BorderLayout.NORTH);
        super.add(pningreso, BorderLayout.SOUTH);

        super.setVisible(true);
    }

    public static void main(String[] args) {
        new PrincipalPanel();
    }
}

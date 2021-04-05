/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jonat
 */
public class PrincipalPanel extends JFrame{

    private JMenuBar mbMenu;
    private Archivo Archivo;
    private Edicion Edicion;
    private Ayuda Ayuda;
    private JPanel pnl;

    public PrincipalPanel(){
        super("Menu");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        mbMenu = new JMenuBar();
        Archivo = new Archivo();
        Edicion = new Edicion();
        pnl = new JPanel();        
        pnl.setBackground(Color.LIGHT_GRAY);
        Edicion.setListener(new ColorListener() {
            @Override
            public void colorClick() {
                pnl.setBackground(Edicion.color());
            }
        });
        Ayuda = new Ayuda();
        mbMenu.add(Archivo);
        mbMenu.add(Edicion);
        mbMenu.add(Ayuda);

        super.add(mbMenu, BorderLayout.NORTH);
        super.add(pnl);

        super.setVisible(true);
    }



    public static void main(String[] args) {
        new PrincipalPanel();
    }
}   
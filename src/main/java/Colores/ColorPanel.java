/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author jonat
 */
public class ColorPanel extends JPanel{
    
    public ColorPanel(){
        super.setBackground(Color.BLACK);
        super.setLayout(new FlowLayout());
        Dimension sim= new Dimension(150,150);
        super.setPreferredSize(sim);
    }

    public void setBack(Integer x, Integer y, Integer z){
        Color color= new Color(x,y,z);
        super.setBackground(color);
    }
}


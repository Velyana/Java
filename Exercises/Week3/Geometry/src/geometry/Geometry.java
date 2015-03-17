/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Velyana
 */
public class Geometry extends JPanel{

    private int x;
    private int y;

    public Geometry() {
        String input = JOptionPane.showInputDialog("Input x:");
        x = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Input y:");
        y = Integer.parseInt(input);    
    }
    

    public void paintComponent(Graphics g) {
        int r = Math.min(x,y)/2;
        super.paintComponent(g);
        g.drawOval(10 + x*10, 10 + y*10, 10 + r*10, 10 + r*10);
    }

}

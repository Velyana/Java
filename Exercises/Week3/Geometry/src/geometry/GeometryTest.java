/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import javax.swing.JFrame;

/**
 *
 * @author Velyana
 */
public class GeometryTest {
    public static void main(String[] args) {
        Geometry circle = new Geometry();
        
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(circle);
        application.setSize(300, 300);
        application.setVisible(true);
               
    }
}

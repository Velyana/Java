/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.drawingpanel;

/**
 *
 * @author Velyana
 */
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter
{
   public static void main( String args[] )
   { 
      // create JFrame
      JFrame application = new JFrame( "Drawing Panel" );

      PaintPanel paintPanel = new PaintPanel(); // create paint panel
      application.add( paintPanel, BorderLayout.CENTER ); // in center
      
      // create a label and place it in SOUTH of BorderLayout
      application.add( new JLabel( "Drag the mouse to draw" ), 
         BorderLayout.SOUTH );

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.setSize( 400, 200 ); // set frame size
      application.setVisible( true ); // display frame
   } // end main
} // end class Painter
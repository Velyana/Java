/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import javax.swing.JOptionPane;

/**
 *
 * @author Velyana
 */
public class RectangleTest {

    public static void main(String[] args) {
        String inputWidth = JOptionPane.showInputDialog("Please, input width:");
        String inputHeight = JOptionPane.showInputDialog("Please, input height:");
        String inputColor = JOptionPane.showInputDialog("Please, input color:");

        Rectangle rect = new Rectangle();
        Rectangle rectangle = new Rectangle(Double.parseDouble(inputWidth), Double.parseDouble(inputHeight));
        rectangle.setColor(inputColor);

        String message1 = String.format("The area of rectangle is: %s", rectangle.getArea());
        String message2 = String.format("The perimeter of rectangleis: %s", rectangle.getPerimeter());
        String message3 = String.format("The color of rectangle is: %s", rectangle.getColor());

        JOptionPane.showMessageDialog(null, message1);
        JOptionPane.showMessageDialog(null, message2);
        JOptionPane.showMessageDialog(null, message3);

    }
}

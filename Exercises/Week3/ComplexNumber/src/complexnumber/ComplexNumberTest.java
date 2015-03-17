/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

import javax.swing.JOptionPane;

/**
 *
 * @author Velyana
 */
public class ComplexNumberTest {

    public static void main(String[] args) {
        String inputRP = JOptionPane.showInputDialog("Input realPart:");
        String inputIP = JOptionPane.showInputDialog("Input imaginaryPart:");
        double rPart = Double.parseDouble(inputRP);
        double iPart = Double.parseDouble(inputIP);

        ComplexNumber number = new ComplexNumber(rPart, iPart);
        System.out.println("RealPart: " + number.getRealPart());
        System.out.println("ImaginaryPart: " + number.getImaginaryPart());
        System.out.println("Angle: " + number.getAngle());
        System.out.println("Magnitude: " + number.getMagnitude());
        ComplexNumber num =  number.add(new ComplexNumber(2, 3));
        System.out.println("Add: " + num.getRealPart() +  " + i" + num.getImaginaryPart() );
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

/**
 *
 * @author Velyana
 */
public class ComplexNumber {

    /**
     * @param args the command line arguments
     */
    private double imaginaryPart;
    private double realPart;

    public ComplexNumber(double imaginaryPart, double realPart) {
        this.imaginaryPart = imaginaryPart;
        this.realPart = realPart;
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(realPart + number.getRealPart(), imaginaryPart + number.getImaginaryPart());
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getAngle() {
        return Math.atan2(realPart, imaginaryPart);
    }

    public double getMagnitude() {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

}

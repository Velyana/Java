/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computecos;

import javax.swing.JOptionPane;

/**
 *
 * @author Velyana
 */
public class ComputeCos {

    private double x;
    private double e;

    public ComputeCos() {
        String input = JOptionPane.showInputDialog("Please input x:");
        x = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Please input epsilon:");
        e = Double.parseDouble(input);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double computeCos() {

        int idx = 1;
        double num = 1;
        int den = 2;
        double sum = 1;
        double temp;
        do {
            num = -num * x * x;
            den = den * (++idx) * (idx++);
            temp = num / den;
            sum += temp;
        } while (Math.abs(temp) > e);
        return sum;
    }

}

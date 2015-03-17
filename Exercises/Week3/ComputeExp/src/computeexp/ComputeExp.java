/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeexp;

import javax.swing.JOptionPane;

/**
 *
 * @author Velyana
 */
public class ComputeExp {

    public double Compute() {
        String input = JOptionPane.showInputDialog("Please input x:");
        double x = Double.parseDouble(input);
        double sum = 0.0;
        double term = 1.0;
        for (int i = 1; sum != sum + term; i++) {
            sum = sum + term;
            term = term * x / i;
        }
        return sum;
        //System.out.println(Math.exp(x));
    }
}

//public class Exponential {
//
//    public static void main(String[] args) { 
//        double x = Double.parseDouble(args[0]);
//        double sum  = 0.0;
//        double term = 1.0;
//        for (int i = 1; sum != sum + term; i++) {
//            sum  = sum + term;
//            term = term * x / i;
//            System.out.println(i + " " + term + " " + sum);
//        }
//        System.out.println(sum);
//        System.out.println(Math.exp(x));
//   }
//
//}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.Scanner;

/**
 *
 * @author Velyana
 */
public class GCD {

    /**
     * @param a
     * @param b
     * @return 
     */
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;

    }

    public static void main(String[] args) {
        System.out.println("Input a: ");
        Scanner inputA = new Scanner(System.in);
        int a = inputA.nextInt();
        System.out.println("Input b: ");
        Scanner inputB = new Scanner(System.in);
        int b = inputB.nextInt();

        System.out.println(gcd(a, b));

    }

}

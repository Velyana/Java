/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.Scanner;

/**
 *
 * @author grade
 */
public class HelloWorldApp {

    /**
     * @param args the command line arguments
     */
    public static double CalculateCelsius(double f) {
        double c = 5.0 / 9.0 * (f - 32);
        return c;
    }

    public static double CalculateFahrenheit(double c) {
        double f = 9.0 / 5.0 * c + 32;
        return f;
    }

    public static String isPalindrome(int number) {
        String resultString;
        int originalNumber = number;
        if (number < 10000 || number > 99999) {
            resultString = "Not a five digit number!";
        } else {
            int digit1, digit2, digit4, digit5;
            digit1 = number / 10000;
            digit2 = number / 10 % 10;
            digit4 = number / 1000 % 10;
            digit5 = number % 10;

            if (digit1 == digit5 && digit2 == digit4) {
                resultString = "Palindrome";
            } else {
                resultString = "Not palindrome";
            }
        }

        return resultString;
    }

    public static int encrypt(int number) {
        int d1, d2, d3, d4, newNumber = 0;
        d1 = (number / 1000 + 7) % 10;
        d2 = (number / 100 % 10 + 7) % 10;
        d3 = (number / 10 % 10 + 7) % 10;
        d4 = (number % 10 + 7) % 10;
        newNumber = d3 * 1000 + d4 * 100 + d1 * 10 + d2;
        return newNumber;
    }

    public static int decrypt(int number) {
        int d1 = number / 1000,
                d2 = number / 100 % 10,
                d3 = number / 10 % 10,
                d4 = number % 10,
                newNumber = 0;

        if (d1 <= 7) {
            d1 = (number / 1000 + 10) - 7;
        } else {
            d1 -= 7;
        }

        if (d2 <= 7) {
            d2 = (d2 + 10) - 7;
        } else {
            d2 -= 7;
        }
        if (d3 <= 7) {
            d3 = (d3 + 10) - 7;
        } else {
            d3 -= 7;
        }
        if (d4 <= 7) {
            d4 = (d4 + 10) - 7;
        } else {
            d4 -= 7;
        }

        newNumber = d3 * 1000 + d4 * 100 + d1 * 10 + d2;
        return newNumber;
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");

//        Scanner input = new Scanner(System.in);
//        System.out.print("Input f: ");
//        double f = input.nextInt();
//        double c = 5.0/9.0*(f - 32);
//        System.out.println("c = " + c);
//        System.out.println(CalculateCelsius(60));
//        System.out.println(CalculateFahrenheit(15.56));
        System.out.print("Please input number: ");
        Scanner number = new Scanner(System.in);
        double n = number.nextDouble();
        System.out.print("Please enter c for Celsius or f for Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        if (choice.equals("c")) {
            System.out.println(CalculateCelsius(n));
        } else if (choice.equals("f")) {
            System.out.println(CalculateFahrenheit(n));
        } else {
            System.out.println("Wrong input!");
        }

        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(98712));
        System.out.println(isPalindrome(36));

        System.out.println(encrypt(1245));
        System.out.println(decrypt(1289));
    }
}
//Alt+shift+f -> Format
//ctrl+space -> Auto compleate
//System.exit(...);
//%.2f -> 2 znaka sled zapetaqta
//integer -> digit: (digit+7) 1<->3; 2<->4

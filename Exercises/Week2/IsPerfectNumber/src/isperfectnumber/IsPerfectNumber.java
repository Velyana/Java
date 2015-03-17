/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isperfectnumber;

import java.util.Scanner;

/**
 *
 * @author Velyana
 */
public class IsPerfectNumber {

    /**
     * @param args the command line arguments
     */
    public static final int NUMBER_PER_LINE = 5;
    public static final int NUMBER_OF_PERFECTS = 10000;

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;

    }

    public static void showMultipliers(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (count < 5) {
                    System.out.printf(" %5d ", i);
                }
                if (count == 5) {
                    System.out.printf("\n %5d ", i);
                    count = 0;
                }
                count++;
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(isPerfect(number));

//        for(int i = 1; i < NUMBER_OF_PERFECTS; i++)
//            if(isPerfect(i))
//                System.out.println(i);
//        showMultipliers(number);
    }

}

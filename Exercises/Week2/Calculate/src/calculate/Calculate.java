/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;

import java.util.Scanner;

/**
 *
 * @author Velyana
 */
public class Calculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int countAll = 0, count = 0;
        for (int d1 = 3; d1 <= 9; d1++) {
            for (int d2 = 2; d2 <= 8; d2++) {
                for (int d3 = 4; d3 <= 9; d3++) {
                    for (int d4 = 1; d4 <= 6; d4++) {
                        for (int d5 = 6; d5 <= 9; d5++) {
                            int number = d1 * 10000 + d2 * 1000 + d3 * 100 + d4 * 10 + d5;
                            if (number % 12 == 0) {
                                count++;
                            }
                            countAll++;
                        }
                    }
                }
            }
        }
        System.out.println("All numbers: " + countAll);
        System.out.println("Probability: " + count);

    }

}

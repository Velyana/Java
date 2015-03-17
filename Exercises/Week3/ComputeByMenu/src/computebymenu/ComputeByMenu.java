/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computebymenu;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author grade
 */
public class ComputeByMenu {

    /**
     * @param args the command line arguments
     */
    private double x;

    public ComputeByMenu() {
        this.x = 0;
    }

    public void displayMenu() {
        for (int i = 0; i <= 60; i++) {
            System.out.println("\n");
        }
        System.out.println("1.Въведи число x  в плаваща запетая");
        System.out.println("2.Пресметни  и изведи exp(x)");
        System.out.println("3.Пресметни и изведи sin(x)");
        System.out.println("4.Пресметни и изведи floor(x)");
        System.out.println("5.Край");
    }

    public void doSelection(int choice) {
        switch (choice) {
            case 1:
                x = Double.parseDouble(JOptionPane.showInputDialog("Please, input x:"));
                break;
            case 2:
                System.out.printf("exp(x) = %f", Math.exp(x));
                break;
            case 3:
                System.out.printf("\nsin(x) = %f", Math.sin(x));
                break;
            case 4:
                System.out.printf("\nfloor(x) = %f", Math.floor(x));
                break;
            case 5:
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }

    }

    public void getUserChoice() {
        int choice;
        displayMenu();
        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog("Please, input your choice:"));
            doSelection(choice);
        } while (choice != 5);
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtable;

import java.util.Scanner;

/**
 *
 * @author Velyana
 */
public class Table {

    /**
     * @param args the command line arguments
     */
    private double start;
    private double end;
    private int step;

    public Table() {
        this.start = 1;
        this.end = 6;
        this.step = 1;
    }

    public Table(double start, double end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public void makeTable() {
        double f;
        int count = 0;
        System.out.printf("%s%25s\n", "x", "f(x)");
        while (start <= end) {
            if (count == 20) {
                System.out.println("Press return to continue ...");
                Scanner input = new Scanner(System.in);
                String s = input.next();
                if (s.equals("return")) {
                    count = 0;
                } else {
                    break;
                }
            }
            f = ((start - 2) * (start - 2)) / (start * start + 1);
            System.out.printf("%f%20.4f\n", start, f);
            start += step;
            count++;
        }
    }

    public static void main(String[] args) {

    }

}

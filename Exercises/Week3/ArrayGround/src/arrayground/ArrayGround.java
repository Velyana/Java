/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayground;


/**
 *
 * @author Velyana
 */
public class ArrayGround {

    public static void main(String[] args) {
        int[] a = {1, 7, 2, 1, 1, 4, 6, 6, 6};

        int count = 0;
        int position = 0, number = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    position = j;
                    number = a[j];
                    count++;
                } else {
                    count = 0;
                }
                if (count > 1) {
                    System.out.println("position: " + position);
                    System.out.println("number: " + number);
                    System.out.println("count: " + count);
                }
            }

        }
    }
}

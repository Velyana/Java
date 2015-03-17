/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distinctnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Velyana
 */
public class DistinctNumbers {

    public ArrayList numbers() {
        ArrayList result = new ArrayList();
        ArrayList tempArray = new ArrayList();

        Scanner input = new Scanner(System.in);
        String number;
        do {
            System.out.println("Input number: ");
            number = input.nextLine();
            tempArray.add(number);
        } while (Integer.parseInt(number) != 0);

        for (int i = 0; i < tempArray.size() - 1; i++) {
            if (Collections.frequency(tempArray, tempArray.get(i)) == 1) {
                result.add(tempArray.get(i));
            } else {
                tempArray.remove(tempArray.get(i));
                i--;
            }
        }
        return result;
    }

}

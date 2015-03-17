/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostfrequentelement;

/**
 *
 * @author Velyana
 */
import java.util.ArrayList;
import java.util.Collections;

public class MostFrequentElement {

    public static void main(String[] args) {
        int[] elements = {1, 3, 4, 1, 5, 2, 3, 6, 6, 6, 4, 1, 2, 6, 2, 3, 1, 2, 1, 5, 5, 1, 1, 5, 4};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            list.add(elements[i]);
        }

        int el = list.get(0);
        int max = 0;
        for (int i : list) {
            if (Collections.frequency(list, i) > max) {
                max = Collections.frequency(list, i);
                el = i;
            }
        }
        System.out.printf("The most frequent element is %d, it occurs %d times\n", el, max);
        

//        String[] elem = {"a", "b", "c", "a"};
//        ArrayList<String> list2 = new ArrayList<>();
//        for (int i = 0; i < elem.length; i++) {
//            list2.add(elem[i]);
//        }
//        String el2 = list2.get(0);
//        int max2 = 0;
//        for (String i : list2) {
//            if (Collections.frequency(list2, i) > max2) {
//                max2 = Collections.frequency(list2, i);
//                el2 = i;
//            }
//        }
//        System.out.printf("The most frequent element is %s, it occurs %d times\n", el2, max2);
    }
}

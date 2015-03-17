/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortutils;

/**
 *
 * @author Velyana
 */
public class SortUtilsTest {

    public static void main(String[] args) {
        SortUtils array = new SortUtils();
        //sort.init(arr);
        int[] a = {10, 2, 3, 5, 36, 6, 100};
        int[] b = {2, 3, 6, 12};
        int[] c = {1, 5, 10, 23};
//        array.print(a);
//        array.sortBbl(a);
//        array.print(a);

        int[] arr = array.mergeSort(b, c);
        array.print(arr);
    }
}

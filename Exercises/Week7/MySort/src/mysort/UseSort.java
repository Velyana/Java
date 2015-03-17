/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysort;

/**
 *
 * @author Velyana
 */
public class UseSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4, 6, 1};
        SortOrder s = new SortOrder();
        Sortable sort1 = s.down();
        Sortable sort2 = s.up();

        MySort msort1 = new MySort(sort1);
        MySort msort2 = new MySort(sort2);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        msort1.sort(arr);
        msort2.sort(arr);
    }
}

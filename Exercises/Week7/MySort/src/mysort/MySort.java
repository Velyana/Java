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
public class MySort {

    private Sortable callback;

    public MySort(Sortable callback) {
        this.callback = callback;
    }
    
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && callback.greater(arr[j - 1], valueToSort)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

}

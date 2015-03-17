/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author Velyana
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    private int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }
    
    protected class Select implements Sortable {

        public void Sort() {
            for (int i = 1; i < arr.length; i++) {
                int valueToSort = arr[i];
                int j = i;
                while (j > 0 && greater(arr[j - 1], valueToSort)) {
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

        @Override
        public boolean greater(int a, int b) {
            return a > b;
        }
    }

//    public Sortable sSort() {
//        return new Select();
//    }
    
}

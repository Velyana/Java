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
public class SSortTest {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 8, 3, 6, 9};

        SelectionSort ss = new SelectionSort(array);
        //Sortable s = ss.sSort();
        for(int i = 0; i < array.length; i++)
            System.out.printf("%d ", ss.getArr()[i]);
        System.out.println();
        SelectionSort.Select s = ss.new Select();
        s.Sort();
    }
}

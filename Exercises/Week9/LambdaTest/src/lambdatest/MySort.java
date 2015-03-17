/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdatest;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Velyana
 */
public class MySort {

    public MySort() {
    }
    
    @FunctionalInterface
    public interface Comparator<T> {
        public T sortOrder();
    }        
    
    SortedSet<Integer> sort(int[] data, Comparator<Integer > sortOrder) {
        SortedSet<Integer> result = null;
        TreeSet<Integer> array = new TreeSet<>();
        for (int i = 0; i < data.length; i++) {
            array.add(data[i]);
        }
        
        
        return result;
    }
}

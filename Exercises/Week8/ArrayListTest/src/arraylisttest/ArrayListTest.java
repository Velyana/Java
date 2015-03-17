/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Velyana
 */
public class ArrayListTest {
    
    public static <E extends Comparable<E>> E max(E[][] list) {
        List<E> maxElements = new LinkedList<>();
        for (E[] arr : list) {
            maxElements.add(Collections.max(Arrays.asList(arr)));
        }
        return Collections.max(maxElements);
    }
    
    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }
    
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        return Collections.max(list);
    }
    
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        Set<E> set = new HashSet<>(list);
        result = new ArrayList<E>(set);        
        return result;
    }
    
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 3, 1, 6};
        Integer[][] arr = new Integer[][]{
            {5, 6},
            {3, 4},
            {1, 2}};
        
        System.out.println(ArrayListTest.max(arr));
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(array));
        ArrayListTest.shuffle(arrList);
        System.out.println(arrList);
        System.out.println(ArrayListTest.max(arrList));
        System.out.println(ArrayListTest.removeDuplicates(arrList));
    }
    
}

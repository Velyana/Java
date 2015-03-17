/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Velyana
 */
public class ArrayListTest2 {

    private List<String> list = new ArrayList<>();

    public ArrayListTest2() {
    }

    public ArrayListTest2(List<String> l) {
        list = new ArrayList<>(l);
    }

    public void sort() {
        Collections.sort(list);
        Collections.reverse(list);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static <T extends Comparable<? super T>> T removeMax(List<T> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            T max = Collections.max(list);
            list.remove(max);
//            for(T i : list)
//                System.out.println(i);
            return max;
        }
    }

    public void getNames() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("Please input names(exit to stop):");
        do {
            userInput = scanner.nextLine();
            list.add(userInput);
        } while (!("exit".equals(userInput)));

        list = list.subList(0, list.size()-1);
        for (String s : list) {
            int freq = Collections.frequency(list, s);
            if (freq == 1) {
                System.out.println(s);
            }
        }
    }

    public void searchNames(String name) {
        boolean flag = false;
        for (String i : list) {
            if (i.equals(name)) {
                flag = true;
                System.out.println("Name is found");
            }
        }
        if (!flag) {
            System.out.println("Name not found!");
        }
    }

    public void copyTo(ArrayList<String> str) {
        for (String i : list) {
            str.add(i);
        }
        for (String i : str) {
            System.out.println(i);
        }
    }

    public String toStringDescending() {
        String result = null;
        Collections.reverse(list);
        result = list.toString();
        return result;
    }

    public static void main(String[] args) {
        ArrayListTest2 test = new ArrayListTest2();
        ArrayList<String> str = new ArrayList<>();
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("c");
        arr.add("b");
        ArrayListTest2 list = new ArrayListTest2(arr);

//        list.sort();
//        System.out.println(removeMax(arr));
        test.getNames();

//        list.searchNames("a");
//        list.searchNames("v");
//        list.copyTo(str);
//          System.out.println(list.toStringDescending());
    }

}

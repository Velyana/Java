/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortutils;

import java.util.Scanner;

/**
 *
 * @author Velyana
 */
public class SortUtils {

    public static void init(int[] a) {
        System.out.print("Input the number of elements in the array: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input element of the array: ");
            Scanner inputEl = new Scanner(System.in);
            a[i] = inputEl.nextInt();
        }
    }

    public static void print(int[] a) {
        int n = a.length;
        System.out.print("[");
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%d, ", a[i]);
        }
        System.out.printf("%d]\n", a[n - 1]);
    }

    public static void sortBbl(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static int[] mergeSort(int a[], int[] b) {
        int result[] = new int[a.length + b.length];
        int i = 0,
                j = 0,
                k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                k++;
                i++;
            } else {
                result[k] = b[j];
                k++;
                j++;
            }
        }
        if (i == a.length) {
            while (j < b.length) {
                result[k] = b[j];
                k++;
                j++;
            }
        } else if (j == b.length) {
            while (i < a.length) {
                result[k] = a[i];
                k++;
                i++;
            }
        }
        return result;
    }
}

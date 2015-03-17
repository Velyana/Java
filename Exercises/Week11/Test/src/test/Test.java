/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Velyana
 */
public class Test implements Serializable {

    int[] grades;

    public Test() {
        this(new int[]{0});
    }

    public Test(int[] g) {
        setGrades(g);
    }

    public Test(Test t) {
        this(t.getGrades());
    }

    public int[] getGrades() {
        int[] result = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            result[i] = grades[i];
        }
        return result;
    }

    public void setGrades(int[] g) {
        if (g == null) {
            grades = new int[]{0};
        } else {
            grades = new int[g.length];
            for (int i = 0; i < g.length; i++) {
                grades[i] = g[i];
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("Grades:");

        for (int i = 0; i < grades.length - 1; i++) {
            System.out.println(grades[i]);
        }
        return String.format("%d\n", grades[grades.length - 1]);
    }

    public double average() {
        System.out.println("Average:");
        return IntStream.of(grades)
                .summaryStatistics()
                .getAverage();
    }
    
    public void sort() {
        Arrays.sort(grades);
        System.out.println("Sorted grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdatest;

import java.util.Scanner;

/**
 *
 * @author Velyana
 */
public class LambdaTest {

    /**
     * @param args the command line arguments
     */
    @FunctionalInterface
    public interface ISum<T> {

        public T sum(T n1, T n2);
    }

    @FunctionalInterface
    public interface IPrint<T> {

        public T print(T s1, T s2);

    }

    @FunctionalInterface
    public interface IMax<T> {

        public T max(T d1, T d2);
    }

    public static void main(String[] args) {
//        ISum<Integer> sumInt = (n1, n2) -> {
//            return (n1 + n2);
//        };
//        System.out.println(sumInt.sum(1, 2));

        ISum<Integer> sumInt = new ISum<Integer>() {
            public Integer sum(Integer n1, Integer n2) {
                return n1 + n2;
            }
        };
        System.out.println(sumInt.sum(1, 2));

        IPrint<String> printStr = (s1, s2) -> {
            return String.format("%s, %s\n", s1, s2);
        };
        System.out.println(printStr.print("Teo", "<3"));

        IMax<Double> maxDouble = (d1, d2) -> {
            //1,1 not 1.1 :D
            System.out.println("Input double number: ");
            Scanner input = new Scanner(System.in);
            double d3 = input.nextDouble();
            return Math.max(d3, Math.max(d1, d2));
        };
        System.out.println(maxDouble.max(3.6, 1.7));
    }
}

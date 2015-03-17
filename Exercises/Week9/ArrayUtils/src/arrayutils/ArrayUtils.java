/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayutils;

import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 *
 * @author Velyana
 */
public class ArrayUtils {

    static void filterNumbers(Predicate<Integer> condition, int[] array) {

        IntStream.of(array)
                .filter(value -> condition.test(value))
                .forEach(value -> System.out.printf("%d ", value));      

//        for (int i = 0; i < array.length; i++) {
//            if (condition.test(array[i])) {
//                System.out.print(" " + array[i]);
//            }
//        }
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(41) + 10;
        }
        System.out.print("Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        Predicate<Integer> pred1 = x -> x % 2 == 0;
        Predicate<Integer> pred2 = x -> (x >= 30 && x <= 40);
        Predicate<Integer> pred3 = x -> (isPrime(x));

        System.out.print("Even numbers:");
        filterNumbers(pred1, numbers);
        System.out.println();

        System.out.print("Numbers in [30;40]:");
        filterNumbers(pred2, numbers);
        System.out.println();

        System.out.print("Prime numbers:");
        filterNumbers(pred3, numbers);
        System.out.println();

    }

}

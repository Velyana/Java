/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamssamples;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 *
 * @author grade
 */
public class Test {

    public static void method(Function<Double, Double> function) {
        System.out.println(function.apply(123.6));
    }

    @FunctionalInterface
    public interface IUpper<T> {

        public T up(T s);

    }

    @FunctionalInterface
    public interface Runnable {

        public abstract void print();
    }

    @FunctionalInterface
    public interface IAddable<T> {

        public T add(T t1, T t2);
    }

    public static void main(String[] args) {
        Computer C1 = new Computer(100.1, "A", 3);
        Computer C2 = new Computer(100.6, "B", 10);

        Predicate<Integer> pred1 = (x) -> x > 6;
        System.out.println(pred1.test(10));

        BiPredicate<Computer, Computer> pred2 = (comp1, comp2) -> comp1.getPrice() > comp2.getPrice();
        System.out.println(pred2.test(C1, C2));

        Function<Computer, Double> func = comp -> comp.getPrice();
        System.out.println(func.apply(C1));

        Consumer<Integer> cons = x -> System.out.println(x);
        cons.accept(36);

        Supplier<String> supp = String::new;
        System.out.println(supp.get() instanceof String);

        BinaryOperator<Integer> bin = (x, y) -> x + y;
        System.out.println(bin.apply(36, 100));

        Function<Double, Double> f = x -> x;
        method(f);

        //Problem 2
        Consumer<Integer> intConsumer = value -> System.out.println(value);
        intConsumer.accept(1);

        IUpper<String> upperString = new IUpper<String>() {

            public String up(String s) {
                return s.toUpperCase();
            }
        };
        System.out.println(upperString.up("smile"));

        Runnable action = () -> System.out.println("Welcome to lambdas!");
        action.print();

        IAddable<Integer> largerInt = (n1, n2) -> {
            if (n1 > n2) {
                return n1;
            } else {
                return n2;
            }
        };
        System.out.println(largerInt.add(30, 10));
    }
}

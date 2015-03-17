/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesperson;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author Velyana
 */
public class LambdaDemo {

    public static void main(String[] args) {
        Predicate<Salesperson> predicate1 = person -> (person.getNumSales() > 1200);
        Predicate<Salesperson> predicate2 = person -> (person.getNumSales() > 900 && person.getSalary() < 2500);
        Consumer<Salesperson> consumer1 = person -> person.addBonus(0.05 * person.getSalary()); 
        Consumer<Salesperson> consumer2 = person -> person.addBonus(0.02 * person.getSalary()); 
        Salesperson[] salespersons
                = {
                    new Salesperson("John Doe", 2000, 949),
                    new Salesperson("Jane Doe", 3900, 1500)
                };
        
        for (Salesperson salesperson : salespersons) {
            applyBonus(salesperson,
                    predicate1,
                    consumer1);
            System.out.println(salesperson);
        }
        for (Salesperson salesperson : salespersons) {
            applyBonus(salesperson,
                    predicate2,
                    consumer2);
            System.out.println(salesperson);
        }
    }

    public static void applyBonus(Salesperson salesperson,
            Predicate<Salesperson> predicate,
            Consumer<Salesperson> consumer) {
            if(predicate.test(salesperson))
                consumer.accept(salesperson);
    }
}

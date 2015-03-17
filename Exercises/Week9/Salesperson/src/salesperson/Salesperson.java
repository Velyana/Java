/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesperson;

/**
 *
 * @author Velyana
 */
public class Salesperson {

    private String name;
    private double salary;
    private int numsales;

    public Salesperson(String name, int salary, int numsales) {
        this.name = name;
        this.salary = salary;
        this.numsales = numsales;
    }

    public void addBonus(double amount) {
        salary += amount;
    }

    public int getNumSales() {
        return numsales;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("name: %s, salary: %.2f numsales: %d ",
                name, salary, numsales);
    }
}

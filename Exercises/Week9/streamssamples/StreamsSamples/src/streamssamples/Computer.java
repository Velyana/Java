/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamssamples;

/**
 *
 * @author grade
 */
public class Computer {
    private double price;
    private String brand;
    private int procSpeed;

//Validirane
    
    public Computer(double price, String brand, int procSpeed) {
        setPrice(price);
        setBrand(brand);
        setProcSpeed(procSpeed);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProcSpeed(int procSpeed) {
        this.procSpeed = procSpeed;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public int getProcSpeed() {
        return procSpeed;
    }

    @Override
    public String toString() {
        return String.format("Price: %f\nBrand: %s\nProcSpeed: %d\n", price, brand, procSpeed);
    }
    
}

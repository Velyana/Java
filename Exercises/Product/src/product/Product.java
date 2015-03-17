/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.io.Serializable;

/**
 *
 * @author Velyana
 */
public class Product implements Serializable {

    private final int INV_NUMBER = 100;
    private String invDescription;
    private double price;

    public Product() {
        this("", 0.0);

    }

    public Product(String invDescr, double pr) {
        setInvDescription(invDescr);
        setPrice(pr);
    }

    public Product(Product p) {
        this(p.getInvDescription(), p.getPrice());
    }

    public void setInvDescription(String invDescr) {
        if (invDescr != "") {
            invDescription = invDescr;
        }
    }

    public void setPrice(double pr) {
        if (pr != 0.0) {
            price = pr;
        }
    }

    public int getINV_NUMBER() {
        return INV_NUMBER;
    }

    public String getInvDescription() {
        return invDescription;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("INV_NUMBER: %d, invDescription: %s, price: %f", INV_NUMBER, invDescription, price);
    }

   
}

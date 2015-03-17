/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Velyana
 * @param <E>
 */
public class ListOfProducts<E extends Product> {  // едносвързан списък

    private ArrayList<E> products;
    private ObjectOutputStream output;

    public ListOfProducts() {
        products = null;
    }

    public ListOfProducts(ArrayList<E> p) {
        products = new ArrayList<>(p);
    }

    public String[] toArray() {
        String[] result = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            result[i] = products.get(i).toString();
        }
        return result;
    }

    void toFile(String filename) {
        //open
        try {
            output = new ObjectOutputStream(new FileOutputStream(filename));
        } catch (IOException ex) {
            Logger.getLogger(ListOfProducts.class.getName()).log(Level.SEVERE, null, ex);
        }

        //add
        Product p;
        while (products.isEmpty()) {
            try {
                p = new Product(products.iterator().next().getInvDescription(),
                        products.iterator().next().getPrice());
                output.writeObject(p);
            } catch (IOException ex) {
                Logger.getLogger(ListOfProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //close
        try {
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(ListOfProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double averagePrice() {
        double result = 0.0;
        double sum = 0.0;
        int count = 0;
        for (E product : products) {
            sum += product.getPrice();
            count++;
        }
        return result = sum / count;
    }

    @Override
    public String toString() {
//         return String.format("[INV_NUMBER: %d, invDescription: %s, price: %f]",
//                 products.iterator().next().getINV_NUMBER(),
//                 products.iterator().next().getInvDescription(),
//                 products.iterator().next().getPrice());
        return products.toString();
    }

    public void sortByPrice(Comparator<E> comparator) {
        products.sort(comparator);
        //System.out.println(products.toString());
    }

}

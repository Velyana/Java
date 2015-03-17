/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import javax.swing.JOptionPane;

/**
 *
 * @author Velyana
 */
public class TestSctock {

    public static void main(String[] args) {
        Stock myStock = new Stock("lqlq", "nana");
        myStock.setCurrentPrice(20);
        myStock.setPreviousClosingPrice(30);
        JOptionPane.showMessageDialog(null, myStock.changePercent());
    }

}

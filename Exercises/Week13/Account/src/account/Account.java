/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Velyana
 */
public class Account {

    private int balance = 0;

    public Account() {
    }

    public Account(int b) {
        balance = b;
    }

    
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } 
    }

}

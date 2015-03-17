/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountdeposit;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emo
 */
public class Account implements Runnable{
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    public Account(){
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance >=0){
            this.balance = balance;
    }
        else{
            balance = 0;
        }
    }
    
    public synchronized void deposit(int amount) throws InterruptedException{
        balance+=amount;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(5);
            deposit(1);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(AccountDeposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

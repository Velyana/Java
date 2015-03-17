/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountdeposit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emo
 */
public class AccountDeposit {
    public static Account account;

    public AccountDeposit() {
        account = new Account();
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i=0; i<100; i++){
        executor.execute(account);
        }
        
        executor.shutdown();
        
        while(!executor.isTerminated())
        {
            
        }
        System.out.println(account.getBalance());
    }


    
}

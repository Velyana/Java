/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Velyana
 */
public class Clock extends ClockAnimationUsingThread {

    private boolean suspended;
    //Thread thread = new Thread(new ClockAnimationUsingThread());
    

    public synchronized void suspend() {
        suspended = true;
        System.out.println("suspend");
        try {
            Thread.currentThread().wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void resume() {
        suspended = false;
        System.out.println("resume");
        Thread.currentThread().notify();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javax.swing.SwingUtilities;

/**
 *
 * @author Velyana
 */
public class ClockAnimationUsingThread extends StillClock implements Runnable {

    private boolean suspended = false;
    //StillClock sc = new StillClock();

    public ClockAnimationUsingThread() {
    }

    @Override
    public void run() {
        while (true) {
            
        System.out.println("run");
            try {
                setCurrentTime();
                Thread.sleep(1000);
                
                
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            SwingUtilities.invokeLater(
                    new Runnable() {
                        public void run() {
                            repaint();
                        }
                    }
            );
        }
    }
}

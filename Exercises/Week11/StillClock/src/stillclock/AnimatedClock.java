/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stillclock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author grade
 */
public class AnimatedClock extends StillClock {
   Timer timer;
  
    public AnimatedClock(ActionListener a) {
        timer = new Timer(1000, a);
       // timer.setInitialDelay(pause);
        //timer.start();
    }
    public void start() {
        timer.start();
    }
    
    

}

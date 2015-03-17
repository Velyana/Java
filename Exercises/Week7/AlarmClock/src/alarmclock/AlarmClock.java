/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

/**
 *
 * @author Velyana
 */
public class AlarmClock {

    private AlarmListener alarm;
    private int nrings;

    public AlarmClock(AlarmListener event, int n) {
        alarm = event;
        nrings = n;
    }

    public void onAlarm(AlarmEvent e) {
        if (alarm != null) {
            alarm.alarmActionPerformed(e);
        }
    }

// event handling method 
    public void start() {
        for (;;) {
            nrings--;
            if (nrings < 0) {
                break;
            } else {
                AlarmEvent e = new AlarmEvent(nrings);
                onAlarm(e);
            }
        }
    }
}

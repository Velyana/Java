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
public class AlarmClockTest implements AlarmListener {

    public static AlarmClock clock;

    @Override
    public void alarmActionPerformed(AlarmEvent args) {
        args.ringing();
    }

    public static void main(String[] args) {
        AlarmClockTest act = new AlarmClockTest();
        clock = new AlarmClock(act, 3);
        clock.start();
    }
}

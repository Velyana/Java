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
public class AlarmEvent {

    private int nrings;

    public AlarmEvent(int nrings) {
        setNrings(nrings);
    }

    public int getNrings() {
        return nrings;
    }

    public void setNrings(int nrings) {
        //validate
        this.nrings = nrings;
    }

    public void ringing() {
        System.out.printf("%d. RING-RING-RING\n", nrings);
    }

}

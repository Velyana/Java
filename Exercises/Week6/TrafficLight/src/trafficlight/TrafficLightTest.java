/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficlight;

/**
 *
 * @author Velyana
 */
public class TrafficLightTest {

    public static void main(String[] args) throws InterruptedException {

        long tm = System.currentTimeMillis();
        while (System.currentTimeMillis() - tm < 90 * 1000) {
            for (TrafficLight t : TrafficLight.values()) {
                System.out.println(t);
                Thread.sleep(t.getDuration());
            }
        }
    }
}

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
public enum TrafficLight {

    RED(1200),
    YELLOW(500),
    GREEN(1000);

    private final long duration;

    private TrafficLight(long d) {
        duration = d;
    }

    public long getDuration() {
        return duration;
    }

}

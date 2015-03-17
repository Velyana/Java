/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsius;

/**
 *
 * @author Velyana
 */
public class Celsius {

    /**
     * @param args the command line arguments
     */
    private double celsius;

    public void setCelsius(double _celsius) {
        if (_celsius != 0) {
            celsius = _celsius;
        } else {
            celsius = 0;
        }
    }

    public double getCelsius() {
        return celsius;
    }

    public Celsius(double _celsius) {
        setCelsius(_celsius);
    }

    public double convertToFahrenheit() {
        double fahrenheit;
        return fahrenheit = 9.0 / 5.0 * celsius + 32;
    }

}

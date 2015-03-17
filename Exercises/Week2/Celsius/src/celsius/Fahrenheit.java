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
public class Fahrenheit {

    private double fahrenheit;

    public void setFahrenheit(double _fahrenheit) {
        if (_fahrenheit != 0) {
            fahrenheit = _fahrenheit;
        } else {
            fahrenheit = 0;
        }
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public Fahrenheit(double _fahrenheit) {
        setFahrenheit(_fahrenheit);
    }

    public double convertToCelsius() {
        double celsius;
        return celsius = 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static void main(String[] args) {

    }
}

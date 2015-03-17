/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsius;

import javax.swing.JOptionPane;

/**
 *
 * @author Velyana
 */
public class TestConvert {

    public static void main(String[] args) {
        String inputCelsius = JOptionPane.showInputDialog("Please, input celsius:");
        Celsius celsius = new Celsius(Double.parseDouble(inputCelsius));
        String message1 = String.format("%s celsius are %s fehrenheit.", inputCelsius, celsius.convertToFahrenheit());
        JOptionPane.showMessageDialog(null, message1);

        String inputFahrenheit = JOptionPane.showInputDialog("Please, input fahrenheit:");
        Fahrenheit fahrenheit = new Fahrenheit(Double.parseDouble(inputFahrenheit));
        String message2 = String.format("%s fahrenheit are %s celsius", inputFahrenheit, fahrenheit.convertToCelsius());
        JOptionPane.showMessageDialog(null, message2);
    }
}

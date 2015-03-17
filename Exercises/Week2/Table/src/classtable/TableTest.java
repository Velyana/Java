/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtable;

import javax.swing.JOptionPane;

/**
 *
 * @author Velyana
 */
public class TableTest {

    public static void main(String[] args) {
        String inputStart = JOptionPane.showInputDialog("Please, input start:");
        String inputEnd = JOptionPane.showInputDialog("Please, input end:");
        String inputStep = JOptionPane.showInputDialog("Please, input step:");

        double start = Double.parseDouble(inputStart);
        double end = Double.parseDouble(inputEnd);
        int step = Integer.parseInt(inputStep);

        if (start > end) {
            double temp = start;
            start = end;
            end = temp;
        }

        Table table = new Table(start, end, step);
        table.makeTable();
    }

}

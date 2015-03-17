/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcode;

/**
 *
 * @author Velyana
 */
public class BarCode {

    private final int CODE[][] = {
        {1, 1, 0, 0, 0},
        {0, 0, 0, 1, 1},
        {0, 0, 1, 0, 1},
        {0, 0, 1, 1, 0},
        {0, 1, 0, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 1, 1, 0, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 1, 0},
        {1, 0, 1, 0, 0}
    };

    public String decode(int number) {
        String result = "";
        int d1 = number / 100;
        int d2 = number / 10 % 10;
        int d3 = number % 10;
        String temp1 = "";
        String temp2 = "";
        String temp3 = "";

        for (int row = 0; row < CODE.length; row++) {
            for (int column = 0; column < CODE[row].length; column++) {
                temp1 += CODE[d1][column];
                temp2 += CODE[d2][column];
                temp3 += CODE[d3][column];
            }
            break;
        }
        String tempResult = (temp1 + temp2 + temp3).replace("1", "|");
        result = tempResult.replaceAll("0", ":");
        return result;
    }

}

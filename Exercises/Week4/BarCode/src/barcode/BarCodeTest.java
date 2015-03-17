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
public class BarCodeTest {

    public static void main(String[] args) {
        BarCode code = new BarCode();
        System.out.println(code.decode(111));
    }
}

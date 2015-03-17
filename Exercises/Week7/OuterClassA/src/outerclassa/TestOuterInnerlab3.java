/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outerclassa;

/**
 *
 * @author Velyana
 */
public class TestOuterInnerlab3 {

    public static void main(String[] args) {
        OuterClassA oca = new OuterClassA();
        OuterClassB ocb = new OuterClassB();
        
        OuterClassA.InnerClassA ica = oca.getInnerClassA("Velyana");
        OuterClassB.InnerClassB icb = ocb.getInnerClassB(oca, "V");
        
        System.out.println(oca.toString());
        System.out.println(ocb.toString());
        System.out.println(ica.toString());
        System.out.println(icb.toString());
        System.out.println(ica.getMyName());
        ica.setMyName("Teo");
        System.out.println(ica.getMyName());
        System.out.println(icb.getMyName());
    }
}

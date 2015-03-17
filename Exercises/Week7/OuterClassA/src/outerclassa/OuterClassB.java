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
public class OuterClassB {

    class InnerClassB extends OuterClassA.InnerClassA {

        public InnerClassB(OuterClassA o, String a) {
            o.super(a);
        }

        public String toString() {
            return "InnerClassB";
        }
    }

    public OuterClassB() {
    }

    public String toString() {
        return "OuterClassB";
    }

    public InnerClassB getInnerClassB(OuterClassA oa, String s) {
        return new InnerClassB(oa, s);
    }
}

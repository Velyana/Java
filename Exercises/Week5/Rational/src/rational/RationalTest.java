/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rational;

/**
 *
 * @author Velyana
 */
public class RationalTest {

    public static void main(String[] args) {
        Rational r1 = new Rational();
        Rational r2 = new Rational(4, 12);
        Rational r3 = new Rational(9, -3);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());

    }
}

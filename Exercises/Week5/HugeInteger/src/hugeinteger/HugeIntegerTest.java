/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hugeinteger;

/**
 *
 * @author Velyana
 */
public class HugeIntegerTest {

    public static void main(String[] args) {
        //digits ? numbers !!!
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 1, 8};
        int[] arr3 = {1, 1, 8};
        HugeInteger h1 = new HugeInteger();
        HugeInteger h2 = new HugeInteger(arr1);
        HugeInteger h3 = new HugeInteger(arr2);
        HugeInteger h4 = new HugeInteger(arr3);

        System.out.println("h1: " + h1.toString());
        System.out.println("h2: " + h2.toString());
        System.out.println("h3: " + h3.toString());
        System.out.println("h4: " + h4.toString());

//        h1.inputArr();
//        
//        System.out.println(h2.add(h3));
//        System.out.println(h2.subtraction(h3));
//        System.out.println(h2.isEqualTo(h3));
//        System.out.println(h3.isEqualTo(h4));
//        
//        System.out.println(h2.isNotEqualTo(h3));
//        System.out.println(h3.isNotEqualTo(h4));
//        System.out.println(h1.isZero());
//        System.out.println(h2.isZero());
        
        System.out.println(h1.isGreaterThan(h4));
        System.out.println(h2.isLessThan(h3));
        System.out.println(h1.isLessThanOrEqualTo(h2));
        System.out.println(h2.isGreaterThanOrEqualTo(h3));

    }
}

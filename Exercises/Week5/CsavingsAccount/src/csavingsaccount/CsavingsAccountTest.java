/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csavingsaccount;

import java.util.HashSet;

/**
 *
 * @author Velyana
 */
public class CsavingsAccountTest {

    public static void main(String[] args) {
        System.out.printf("CsavingsAccount before instantiation: %d\n", CsavingsAccount.getCount());
        CsavingsAccount c1 = new CsavingsAccount();
        CsavingsAccount c2 = new CsavingsAccount(0.3, 3);

//        System.out.println(c2.getmNumber());
//        System.out.println(c1.toString());
//        System.out.println(c2.toString());
        System.out.printf("c1: %d\n", c1.getCount());
        System.out.printf("c2: %d\n", c2.getCount());
        System.out.printf("CsavingsAccount after instantiation: %d\n", CsavingsAccount.getCount());
        c1 = null;
        c2 = null;
        System.gc();
        System.out.printf("CsavingsAccount after gc: %d\n", CsavingsAccount.getCount());

    }

}

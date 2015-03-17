/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isprime;

/**
 *
 * @author Velyana
 */
public class IsPrime {

    /**
     * @param args the command line arguments
     */
    public static final int NLIMIT = 10000;

    public static boolean isPrime(int N) {
        if (N == 1) {
            return false;
        }
        if (N == 2) {
            return true;
        }
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
//        for (int i = 1; i < NLIMIT / 2; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }

        for (int i = 1; i < NLIMIT; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

}

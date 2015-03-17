/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciphermethod;

import java.util.ArrayList;

/**
 *
 * @author Velyana
 */
public class Encryption {

    protected class MonoEncryption implements IEncryptable {
        
        private int[] getCounts(String cipher) {
            int[] result = new int[26];
            char[] cipherArray = cipher.toCharArray();
            for (int i = 0; i < cipherArray.length; i++) {
                ++result[cipherArray[i] - 'A'];
            }
            return result;
        }
        private int[] makeCipher(String cipher) {
            int[] result = new int[26];
            char[] cipherArray = cipher.toCharArray();
            int[] letterCounts = getCounts(cipher);
            
            return result;
        }
        

        public String encrypt(String plainText, String cipher) {
            String result = "";
            int[] cipherArray = makeCipher(cipher);
            char[] plaintTextArray = plainText.toCharArray();
                        
            
            return result;
        }

        public String decrypt(String cipherText, String cipher) {
            String result = "";
            int[] cipherArray = makeCipher(cipher);
            char[] ciphertextArray = cipherText.toCharArray();
            
            return result;
        }
    }
    
    public MonoEncryption getMonoCipherMethod() {
        return new MonoEncryption();
    }
}

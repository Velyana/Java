/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher;

/**
 *
 * @author Velyana
 */
public class CaesarCipher {

    public String cipher(String plaintext) {
        final int KEY = 3;
        char[] textArray = plaintext.toCharArray();
        String encr = "";
        for (char i : textArray) {
            encr += (char) ((i + KEY - 'A') % 26 + 'A');
        }
        return encr;

    }

    public String decipher(String ciphertext) {
        final int KEY = 3;
        char[] textArray = ciphertext.toCharArray();
        String cr = "";
        for (char i : textArray) {
            cr += (char) ((i - KEY - 'A' + 26) % 26 + 'A');
        }
        return cr;
    }
}

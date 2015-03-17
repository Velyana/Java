/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transcipher;

import javax.swing.JOptionPane;

/**
 *
 * @author Velyana
 */
public class TransCipher {

    public String encrypt() {
        String result = "";
        String plainText = JOptionPane.showInputDialog("Input plaintext:");
        String keyText = JOptionPane.showInputDialog("Input key text:");
        int key = keyText.length();
        char[] text = plainText.toCharArray();
        char[][] newText = new char[(int) Math.ceil(plainText.length() / (double) key)][key];
        int k = 0;
        for (int i = 0; i < (int) Math.ceil(plainText.length() / (double) key); i++) {
            for (int j = 0; j < key; j++) {
                if (i == plainText.length() / key && k == text.length) {
                    newText[i][j] = ' ';
                } else {
                    newText[i][j] = text[k];
                    k++;
                }
            }
        }
//        for (int i = 0; i < newText.length; i++) {
//            for (int j = 0; j < newText[i].length; j++) {
//                System.out.printf("%c", newText[i][j]);
//            }
//            System.out.println();
//        }
        for (int i = 0; i < newText[0].length; i++) {
            for (int j = 0; j < newText.length; j++) {
                result += newText[j][i];
            }
        }
        return result;
    }

    public String decrypt() {
        String result = "";
        String cipherText = JOptionPane.showInputDialog("Input plaintext:");
        String keyText = JOptionPane.showInputDialog("Input key text:");
        int key = keyText.length();
        char[] text = cipherText.toCharArray();
        int k = 0;
        char[][] newText = new char[text.length / key][key];
        for (int i = 0; i < newText[0].length; i++) {
            for (int j = 0; j < newText.length; j++) {
                newText[j][i] = text[k];
                k++;
            }
        }
        for (int i = 0; i < newText.length; i++) {
            for (int j = 0; j < newText[i].length; j++) {
                result += newText[i][j];
            }
        }
        return result;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciphermethod;

/**
 *
 * @author Velyana
 */
public interface IEncryptable {

    public String encrypt(String plainText, String cipher);
    public String decrypt(String cipherText, String cipher);
}

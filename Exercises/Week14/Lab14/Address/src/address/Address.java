/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author grade
 */
public class Address {

    private String name, street, city, state;

    
}

/*

package com;

import java.util.function.Function;

public class CryptoUtils {
    

    private String cypher;

    public String getCypher() {
        return cypher;
    }

    public void setCypher(String cypher) {
        this.cypher = cypher;
    }

    public CryptoUtils(String c) {
        setCypher(c);
    }

    public CryptoUtils() {
        this("TIGER");
    }

    @Override
    public String toString() {
        return cypher;
    }
    
    public Function<String, String> getEncryption(){
        return (a) -> func().encrypt(a);
    }
    
    public Function<String, String> getDecryption(){
        return (a) -> func().decrypt(a);
    }


    private IEncryptable func (){
        
        class VigenereEncryption implements IEncryptable {

            public boolean characterIsLower(char a) {
                return (a >= 'a' && a <= 'z');
            }

            public boolean characterIsUpper(char a) {
                return (a >= 'A' && a <= 'Z');
            }

            @Override
            public String encrypt(String plainText) {
                char[] pl = plainText.toCharArray();
                char[] c = cypher.toCharArray();
                String res = "";
                for (int i = 0; i < pl.length; i++) {
                    if (characterIsUpper(pl[i]) && characterIsUpper(c[i % c.length])) {
                        if (pl[i] - 'A' <= 'Z' - c[i % c.length]) {
                            pl[i] = (char) (pl[i] - 'A' + c[i % c.length]);
                        } else {
                            pl[i] = (char) ((pl[i] - 'A' + c[i % c.length]) - ('Z' - 'A' + 1));
                        }
                    } else if (characterIsLower(pl[i]) && characterIsUpper(c[i % c.length])) {
                        if (pl[i] - 'a' <= 'Z' - c[i % c.length]) {
                            pl[i] = (char) (pl[i] - 'a' + c[i % c.length] - 'A' + 'a');
                        } else {
                            pl[i] = (char) ((pl[i] - 'a' + c[i % c.length]) - ('Z' - 'A' + 1) - 'A' + 'a');
                        }
                    } else if (characterIsLower(pl[i]) && characterIsLower(c[i % c.length])) {
                        if (pl[i] - 'a' <= 'z' - c[i % c.length]) {
                            pl[i] = (char) (pl[i] - 'a' + c[i % c.length]);
                        } else {
                            pl[i] = (char) ((pl[i] - 'a' + c[i % c.length]) - ('z' - 'a' + 1));
                        }
                    } else {
                        if (pl[i] - 'A' <= 'z' - c[i % c.length]) {
                            pl[i] = (char) (pl[i] - 'A' + c[i % c.length] - 'a' + 'A');
                        } else {
                            pl[i] = (char) ((pl[i] - 'A' + c[i % c.length]) - ('z' - 'a' + 1) - 'a' + 'A');
                        }
                    }
                    res += pl[i];
                }
                System.out.println("");

                return res;
            }

            @Override
            public String decrypt(String cipherText) {
                char[] pl = cipherText.toCharArray();
                char[] c = cypher.toCharArray();
                String res = "";
                for (int i = 0; i < pl.length; i++) {
                    if (characterIsUpper(pl[i]) && characterIsUpper(c[i % c.length])) {
                        if (pl[i] - 'A' <= 'Z' - c[i % c.length]) {
                            pl[i] = (char) (pl[i] - 'A' + c[i % c.length]);
                        } else {
                            pl[i] = (char) ((pl[i] - 'A' + c[i % c.length]) - ('Z' - 'A' + 1));
                        }
                    } else if (characterIsLower(pl[i]) && characterIsUpper(c[i % c.length])) {
                        if (pl[i] - 'a' <= 'Z' - c[i % c.length]) {
                            pl[i] = (char) (pl[i] - 'a' + c[i % c.length] - 'A' + 'a');
                        } else {
                            pl[i] = (char) ((pl[i] - 'a' + c[i % c.length]) - ('Z' - 'A' + 1) - 'A' + 'a');
                        }
                    } else if (characterIsLower(pl[i]) && characterIsLower(c[i % c.length])) {
                        if (pl[i] - 'a' <= 'z' - c[i % c.length]) {
                            pl[i] = (char) (pl[i] - 'a' + c[i % c.length]);
                        } else {
                            pl[i] = (char) ((pl[i] - 'a' + c[i % c.length]) - ('z' - 'a' + 1));
                        }
                    } else {
                        if (pl[i] - 'A' <= 'z' - c[i % c.length]) {
                            pl[i] = (char) (pl[i] - 'A' + c[i % c.length] - 'a' + 'A');
                        } else {
                            pl[i] = (char) ((pl[i] - 'A' + c[i % c.length]) - ('z' - 'a' + 1) - 'a' + 'A');
                        }
                    }
                    res += pl[i];
                }
                System.out.println("");

                return res;
            }
        }
        return new VigenereEncryption();
    }

}

*/
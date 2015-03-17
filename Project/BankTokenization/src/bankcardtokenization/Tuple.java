/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcardtokenization;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Velyana
 */
public class Tuple implements Serializable {

    @XStreamAlias("banknumber")
    String bankNumber;
    @XStreamAlias("token")
    String token;

    public Tuple() {
        bankNumber = "";
        token = "";
    }

    public Tuple(String b, String t) {
        bankNumber = b;
        token = t;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public String getToken() {
        return token;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Tuple> sortCard(List<Tuple> tuple) {
        for (int i = 0; i < tuple.size(); i++) {
            for (int j = i + 1; j < tuple.size(); j++) {
                if (tuple.get(i).getBankNumber().compareTo(tuple.get(j).getBankNumber()) > 0) {
                    String temp = tuple.get(i).getBankNumber();
                    tuple.get(i).setBankNumber(tuple.get(j).getBankNumber());
                    tuple.get(j).setBankNumber(temp);
                }
            }
        }

        return tuple;
    }

    public List<Tuple> sortToken(List<Tuple> tuple) {
        for (int i = 0; i < tuple.size(); i++) {
            for (int j = i + 1; j < tuple.size(); j++) {
                if (tuple.get(i).getToken().compareTo(tuple.get(j).getToken()) > 0) {
                    String temp = tuple.get(i).getToken();
                    tuple.get(i).setToken(tuple.get(j).getToken());
                    tuple.get(j).setToken(temp);
                }
            }
        }

        return tuple;
    }

    public boolean isUnique(List<Tuple> tuple, String token) {
        for (Tuple t : tuple) {
            if (t.getToken().equals(token)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return bankNumber + "\t" + token;
    }

}

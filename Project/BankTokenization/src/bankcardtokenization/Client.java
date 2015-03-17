/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcardtokenization;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

/**
 *
 * @author Velyana
 */
public class Client implements Serializable {

    @XStreamAlias("name")
    private String name;

    @XStreamAlias("password")
    private String password;

    @XStreamAlias("canregister")
    private boolean canRegister;

    @XStreamAlias("cangetcardname")
    private boolean canGetCardNumber;

    public Client() {
        name = "";
        password = "";
        canRegister = false;
        canGetCardNumber = false;
    }

    public Client(String name, String password, boolean canRegister, boolean canGetName) {
        this.name = name;
        this.password = password;
        this.canRegister = canRegister;
        this.canGetCardNumber = canGetName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public boolean canRegister() {
        return canRegister;
    }

    public boolean canGetCardNumber() {
        return canGetCardNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Password: %s", name, password);
    }

}

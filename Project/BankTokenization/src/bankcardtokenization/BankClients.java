/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcardtokenization;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Velyana
 */
@XStreamAlias("bankclients")
public class BankClients implements Serializable {

//    @XStreamImplicit(itemFieldName = "bankclient")
//    List<Client> clients = new ArrayList<>();
    //checks if name and password are correct
    public boolean isCorrect(String name, String password) {
        UserDatabase userDB = new UserDatabase();
        List<Client> clientList = userDB.readFromFile();

        for (Client client : clientList) {
            if (client.getName().equals(name) && client.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean canRegisterToken(String name) {
        UserDatabase userDB = new UserDatabase();
        List<Client> clientList = userDB.readFromFile();

        for (Client client : clientList) {
            if (client.getName().equals(name)) {
                if (client.canRegister()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean canGetCard(String name) {
        UserDatabase userDB = new UserDatabase();
        List<Client> clientList = userDB.readFromFile();

        for (Client client : clientList) {
            if (client.getName().equals(name)) {
                if (client.canGetCardNumber()) {
                    return true;
                }
            }
        }
        return false;
    }

}

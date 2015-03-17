/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcardtokenization;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Velyana
 */
public class BankCardTokenization {

    public static void main(String[] args) throws RemoteException, Exception {

        //XStream xstream = new XStream(new DomDriver());
        // xstream.processAnnotations(Client.class);
        UserDatabase userDB = new UserDatabase();
        CardDatabase cardDB = new CardDatabase();
        TokenizationServerImpl server = new TokenizationServerImpl();
        BankClients bc = new BankClients();

//       Client c1 = new Client("Teo", "dokodoko", true, true);
//        Client c2 = new Client("Panda", "po123", true, false);
//        Client c3 = new Client("Lqlq", "parola", false, true);
//
//        userDB.add(c1);
//        userDB.add(c2);
//        userDB.add(c3);
        //System.out.println(server.getCardNumber("1234243434269991"));
        cardDB.writeToFile();
        //System.out.println(cardDB.readFromFile());
        
        //System.out.println(cardDB.serialize());
        //System.out.println(cardDB.deserialize());
        
        //userDB.writeToFile();
        //System.out.println(userDB.readFromFile());
        //System.out.println(server.isValidUser("Teo", "dokodoko"));
        //System.out.println(server.isValid("4563960122019991"));
        //System.out.println(server.tokenization("4563960222019991"));
//        List<Client> clientList = new LinkedList<>();
//        clientList.add(c1);
//        clientList.add(c2);
//        clientList.add(c3);
//
//        String xml = xstream.toXML(clientList);
//
//        File xmlFile = new File("Clients.xml");
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(xmlFile, true))) {
//            bw.write(xml);
//        } catch (IOException ex) {
//            System.out.println("Problem while writing to file");
//        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcardtokenization;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Velyana
 */
public class UserDatabase implements Serializable {

    File file = new File("Clients.xml");
    private XStream xstream = new XStream(new DomDriver());
    private List<Client> clients = new ArrayList<>();

    public UserDatabase() {
        Client c1 = new Client("Teo", "dokodoko", true, true);
        Client c2 = new Client("Panda", "po123", true, false);
        Client c3 = new Client("Lqlq", "parola", false, true);

        clients.add(c1);
        clients.add(c2);
        clients.add(c3);
    }

    public List<Client> getClients() {
        return clients;
    }

    public String serialize() {
        String xml = xstream.toXML(clients);
        return xml;

    }

    public List<Client> deserialize(String xml) throws IOException {

        ObjectInputStream input = xstream.createObjectInputStream(new FileReader(file));
        while (true) {
            try {
                Client newClient = (Client) input.readObject();
                //wtf
                if (clients.contains(newClient)) {
                    clients.add(newClient);
                }
            } catch (java.io.EOFException ex) {
                break;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return clients;
    }

    public void add(Client c) {
        clients.add(c);
    }

    public void writeToFile() {
        String xml = serialize();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(xml);
        } catch (IOException ex) {
            System.out.println("Problem while writing to file");
        }
    }

    public List<Client> readFromFile() {
        List<Client> result = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String currLine;
            String xml = "";
            while ((currLine = br.readLine()) != null) {
                xml = currLine;
            }
            result = deserialize(xml);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

}

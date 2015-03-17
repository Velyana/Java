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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Velyana
 */
public class CardDatabase implements Serializable {

    File file = new File("Tokens.xml");
    private XStream xstream = new XStream(new DomDriver());
    private List<Tuple> tuples = new ArrayList<>();

    public CardDatabase() {
        Tuple t1 = new Tuple("4563960222019991", "7124295804429991");
        Tuple t2 = new Tuple("4607886976206298", "3740528040536298");

        tuples.add(t1);
        tuples.add(t2);
    }

    public List<Tuple> getTuples() {
        return tuples;
    }

    public String serialize() {
        System.out.println(tuples.size());
        String xml = xstream.toXML(tuples);
        return xml;
    }

    public List<Tuple> deserialize() throws IOException {
        ObjectInputStream input = xstream.createObjectInputStream(new FileReader(file));
        List<Tuple> tupleList = new ArrayList<>();

        while (true) {
            try {
                Tuple newTuple = (Tuple) input.readObject();

                if (!tupleList.contains(newTuple)) {
                    tupleList.add(newTuple);
                }
            } catch (java.io.EOFException ex) {
                break;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tupleList;
    }

    public void add(Tuple t) {
        tuples.add(t);
    }

    public void writeToFile() {
        String xml = serialize();

        if (!file.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write(xml);
                bw.close();
            } catch (IOException ex) {
                System.out.println("Problem while writing to file");
            }
        } else {
            try {
                //???
                BufferedWriter bw = new BufferedWriter(new FileWriter(file, true)); //the true will append the new data
                bw.write(xml);//appends the string to the file
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(CardDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<Tuple> readFromFile() {
        List<Tuple> result = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String currLine;
            String xml = "";
            while ((currLine = br.readLine()) != null) {
                xml = currLine;
            }
            result = deserialize();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;

    }

    public String getCard(String token) {
        String result = "";
        List<Tuple> tuple = readFromFile();
        for (Tuple t : tuple) {
            if (t.getToken().equals(token)) {
                result = t.getBankNumber();
            }
        }
        return result;
    }

    public void clear() {
        tuples.clear();
    }

}

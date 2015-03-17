/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcardtokenization;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Velyana
 */
public class TokenizationServerImpl extends UnicastRemoteObject
        implements TokenizationServer {

    // private Client clients;
    private BankClients bankClients = new BankClients();
    private CardDatabase cardDB = new CardDatabase();
    //private Tuple tuple;
    private static final int port = 1099;
    private String address;

    public TokenizationServerImpl() throws RemoteException, Exception {
        super();
        XStream xstream = new XStream(new DomDriver());
        // xstream.processAnnotations(TokenizationClient.class);
        xstream.processAnnotations(Client.class);
//        Object readObject = xstream.fromXML(new File("Clients.xml"));
//        if (readObject instanceof Client) {
//            clients = (Client) readObject;
//        } else {
//            throw new Exception("Incorrect input");
//        }

        address = (InetAddress.getLocalHost()).toString();
        System.out.println("Address = " + address + ", port = " + port);

    }

    @Override
    public String tokenization(String bankNumber) throws RemoteException {
        String result = "";
        int length = bankNumber.length();
        char[] bankArr = bankNumber.toCharArray();
        char[] tempArr = new char[length];
        Random rand = new Random();
        int randNumber;
        int sum = 0;

        if (isValid(bankNumber)) {
            for (int i = bankArr.length - 4; i < bankArr.length; i++) {
                tempArr[i] = bankArr[i];
                sum += tempArr[i];
            }
            for (int i = 0; i < bankArr.length - 4; i++) {
                randNumber = rand.nextInt(10);
                if (bankArr[0] != 3 && bankArr[0] != 4 && bankArr[0] != 5 && bankArr[0] != 6) {
                    if (bankArr[i] != randNumber) {
                        tempArr[i] = Character.forDigit(randNumber, 10);
                        sum += tempArr[i];
                    }
                }
                if (sum % 10 == 0) {
                    int temp = (int) tempArr[0] + 1;
                    tempArr[0] = (char) temp;
                }
            }

            for (int i = 0; i < tempArr.length; i++) {
                result += tempArr[i];
            }
        }
        return result;
    }

    @Override
    public boolean isValid(String bankNumber) throws RemoteException {
        char[] bankArr = bankNumber.toCharArray();

        if (bankArr[0] == 3 && bankArr[0] == 4 && bankArr[0] == 5 && bankArr[0] == 6) {
            return true;
        }
        if (algLuhn(bankNumber)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isValidUser(String name, String password) {
        return bankClients.isCorrect(name, password);
    }

    @Override
    public boolean canRegisterToken(String name) {
        return bankClients.canRegisterToken(name);
    }

    @Override
    public boolean canGetCardNumber(String name) {
        return bankClients.canGetCard(name);
    }

    @Override
    public String getCardNumber(String token) {
        return cardDB.getCard(token);
    }

    public boolean algLuhn(String str) {
        char[] charArr = str.toCharArray();
        int[] intArr = new int[charArr.length];
        int sum = 0;

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Character.getNumericValue(charArr[i]);
        }

        for (int i = intArr.length - 1; i >= 0; i -= 2) {
            intArr[i] *= 2;
        }
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 10 < 0) {
                sum += intArr[i];
            } else {
                sum = sum + intArr[i] / 10 + intArr[i] % 10;
            }
        }
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            TokenizationServer server = new TokenizationServerImpl();
            Registry registry = LocateRegistry.createRegistry(port);
            registry.rebind("TokenizationServerImpl", server);
            System.out.println("Student server " + server + " registered");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

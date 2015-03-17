/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcardtokenization;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Velyana
 */
public interface TokenizationServer extends Remote {

    public String tokenization(String bankNumber) throws RemoteException;

    public boolean isValid(String bankNumber) throws RemoteException;

    public boolean isValidUser(String name, String password) throws RemoteException;

    public boolean canRegisterToken(String name) throws RemoteException;

    public boolean canGetCardNumber(String name) throws RemoteException;

    public String getCardNumber(String token) throws RemoteException;

}

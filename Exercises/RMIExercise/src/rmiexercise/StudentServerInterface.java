/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexercise;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Velyana
 */
public interface StudentServerInterface extends Remote {
    public double findScore(String name) throws RemoteException;
}

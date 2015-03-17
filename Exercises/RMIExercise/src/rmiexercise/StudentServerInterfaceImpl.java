/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexercise;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

/**
 *
 * @author Velyana
 */
public class StudentServerInterfaceImpl extends UnicastRemoteObject
        implements StudentServerInterface {

    private HashMap scores = new HashMap();

    public StudentServerInterfaceImpl() throws RemoteException {
        initializeStudent();
    }

    protected void initializeStudent() {
        scores.put("John", new Double(90.5));
        scores.put("Michael", new Double(100));
        scores.put("Michelle", new Double(98.5));
    }

    public double findScore(String name) throws RemoteException {
        Double d = (Double) scores.get(name);
        if (d == null) {
            System.out.println("Student \" + name + \" is not found!");
            return -1;
        } else {
            System.out.println("Student \" + name + \"\\'s score is " + d.doubleValue());
            return d.doubleValue();            
        }
    }
}


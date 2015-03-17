/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexercise;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Velyana
 */
public class RegisterWithRMIServer {
    public static void main(String[] args) {
        try {
            StudentServerInterface obj = new StudentServerInterfaceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("StudentServerInterfaceImpl", obj);
            System.out.println("Student server " + obj+ " registered");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


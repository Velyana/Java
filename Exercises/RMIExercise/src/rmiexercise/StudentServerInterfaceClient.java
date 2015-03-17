/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexercise;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Velyana
 */
public class StudentServerInterfaceClient extends JApplet {

    private StudentServerInterface student;
    private boolean isStandalone;

    private JButton jbtGetScore = new JButton("Get Score");
    private JTextField jtfName = new JTextField();
    private JTextField jtfScore = new JTextField();

    public void init() {
        initializeRMI();

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(2, 2));
        jPanel1.add(new JLabel("Name"));
        jPanel1.add(jtfName);
        jPanel1.add(new JLabel("Score"));
        jPanel1.add(jtfScore);
        add(jbtGetScore, BorderLayout.SOUTH);
        add(jPanel1, BorderLayout.CENTER);
        jbtGetScore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                getScore();
            }
        });
    }
    
    private void getScore() {
        try {
            double score = student.findScore(jtfName.getText().trim());
            if(score < 0) 
                jtfScore.setText("Not found");
            else
                jtfScore.setText(new Double(score).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        StudentServerInterfaceClient applet = new StudentServerInterfaceClient();
        applet.isStandalone = true;
        JFrame frame = new JFrame();
        frame.setTitle("StudentServerInterfaceClient");
        frame.add(applet, BorderLayout.CENTER);
        frame.setSize(250, 150);
        applet.init();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }

    protected void initializeRMI() {
        String host = "";
        if(!isStandalone) 
            host = getCodeBase().getHost();
        try {
            Registry registry = LocateRegistry.getRegistry(host, 1099);
            student = (StudentServerInterface) registry.lookup("StudentServerInterfaceImpl");
            
            System.out.println("Server object \" + student + \" found");
        } catch (Exception e) {
            System.out.println(e);
        }
            
    }
}

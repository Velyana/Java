package serverclient;

// Fig. 24.5: Server.java
// Set up a server that will receive a connection from a client, send 
// a string to the client, and close the connection.
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Server extends JFrame {

    private JTextField enterField; // inputs message from user
    private JTextArea displayArea; // display information to user
    private ServerSocket server; // server socket
    private int counter = 1; // counter of number of connections
    private ExecutorService threadPool = Executors.newFixedThreadPool(8);

    // set up GUI
    public Server() {
        super("Server");

        enterField = new JTextField(); // create enterField
        enterField.setEditable(false);
        enterField.addActionListener(
                new ActionListener() {
            // send message to client
            public void actionPerformed(ActionEvent event) {
                //sendData(event.getActionCommand());
                enterField.setText("");
            } // end method actionPerformed
        } // end anonymous inner class
                ); // end call to addActionListener

        add(enterField, BorderLayout.NORTH);

        displayArea = new JTextArea(); // create displayArea
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        setSize(300, 150); // set size of window
        setVisible(true); // show window
    } // end Server constructor

    // set up and run server 
    public void runServer() {
        try // set up server to receive connections; process connections
        {
            server = new ServerSocket(12345, 100); // create ServerSocket

            while (true) {
                waitForConnection();
                counter++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } // end method runServer // end method runServer // end method runServer
    }

    private void waitForConnection() throws IOException {
        displayMessage("\nWaiting for connection\n");
        Socket connection = server.accept(); // allow server to accept connection 
        threadPool.execute(new ClientHandle(connection, this));
        displayMessage("Connection " + counter + " received from: "
                + connection.getInetAddress().getHostName());
    } // end method waitForConnection

    

    // manipulates displayArea in the event-dispatch thread
    public void displayMessage(final String messageToDisplay) {
        SwingUtilities.invokeLater(
                new Runnable() {
            public void run() // updates displayArea
            {
                displayArea.append(messageToDisplay); // append message
            } // end method run
        } // end anonymous inner class
                ); // end call to SwingUtilities.invokeLater
    } // end method displayMessage

    // manipulates enterField in the event-dispatch thread
    void setTextFieldEditable(final boolean editable) {
        SwingUtilities.invokeLater(
                new Runnable() {
            public void run() // sets enterField's editability
            {
                enterField.setEditable(editable);
            } // end method run
        } // end inner class
                ); // end call to SwingUtilities.invokeLater
    } // end method setTextFieldEditable

    public int getCounter() {
        return counter;
    }
} // end class Server

/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandle implements Runnable {

    private Socket connection;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private Server server;

    public ClientHandle(Socket connection, Server server) {
        this.connection = connection;
        this.server = server;
    }

    private void getStreams() throws IOException {
        // set up output stream for objects
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush(); // flush output buffer to send header information

        // set up input stream for objects
        input = new ObjectInputStream(connection.getInputStream());

        server.displayMessage("\nGot I/O streams\n");
    } // end method getStreams

    private void processConnection() throws IOException {
        String message = "Connection successful";
        server.sendData(message); // send connection successful message

        // enable enterField so server user can send messages
        server.setTextFieldEditable(true);

        do // process messages sent from client
        {
            try // read message and display it
            {
                message = (String) input.readObject(); // read new message
                server.displayMessage("\n" + message); // display message
            } // end try
            catch (ClassNotFoundException classNotFoundException) {
                server.displayMessage("\nUnknown object type received");
            } // end catch

        } while (!message.equals("CLIENT>>> TERMINATE"));
    } // end method processConnection

    // close streams and socket
    private void closeConnection() {
        server.displayMessage("\nTerminating connection\n");
        server.setTextFieldEditable(false); // disable enterField

        try {
            output.close(); // close output stream
            input.close(); // close input stream
            connection.close(); // close socket
        } // end try
        catch (IOException ioException) {
            ioException.printStackTrace();
        } // end catch
    } // end method closeConnection

    private void sendData(String message) {
        try // send object to client
        {
            output.writeObject("SERVER>>> " + message);
            output.flush(); // flush output to client
            server.displayMessage("\nSERVER>>> " + message);
        } // end try
        catch (IOException ioException) {
            server.displayArea.append("\nError writing object");
        } // end catch
    } // end method sendData

    @Override
    public void run() {
        try {
            getStreams();
            processConnection();
        } // catch(...)? 
        catch (Exception e) {
        } finally {
            closeConnection();
        }
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverclient;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grade
 */
public class ClientHandle implements Runnable{
    
    private Socket connection;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private Server server;
    
    public ClientHandle(Socket connection, Server server){
        this.server = server;
        this.connection = connection;
    }
    
       
// get streams to send and receive data
   private void getStreams() throws IOException
   {
      // set up output stream for objects
      output = new ObjectOutputStream( connection.getOutputStream() );
      output.flush(); // flush output buffer to send header information

      // set up input stream for objects
      input = new ObjectInputStream( connection.getInputStream() );

      server.displayMessage( "\nGot I/O streams\n" );
   } // end method getStreams
   
   // send message to client
    public void sendData(String message) {
        try // send object to client
        {
            output.writeObject("SERVER>>> " + message);
            output.flush(); // flush output to client
            server.displayMessage("\nSERVER>>> " + message);
        } // end try
        catch (IOException ioException) {
            server.displayMessage("\nError writing object");
        } // end catch
    } // end method sendData
   
   // process connection with client
   private void processConnection() throws IOException
   {
      String message = "Connection successful";
      sendData( message ); // send connection successful message

      // enable enterField so server user can send messages
      server.setTextFieldEditable( true );

      do // process messages sent from client
      { 
         try // read message and display it
         {
            message = ( String ) input.readObject(); // read new message
            server.displayMessage( "\n" + message ); // display message
         } // end try
         catch ( ClassNotFoundException classNotFoundException ) 
         {
            server.displayMessage( "\nUnknown object type received" );
         } // end catch

      } while ( !message.equals( "CLIENT>>> TERMINATE" ) );
   } // end method processConnection
   
   // close streams and socket
    private void closeConnection() {
        server.displayMessage("\nTerminating connection " + server.getCounter() + "\n");
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
    @Override
    public void run() {
        try {
            getStreams(); // process connection
            processConnection(); // process connection
        } // end try
        catch (IOException ex) {
            Logger.getLogger(ClientHandle.class.getName()).log(Level.SEVERE, null, ex);
            server.displayMessage("\nServer terminated connection\n");
        }finally{
            closeConnection();
        }
                 
}
    
}

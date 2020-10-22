/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author Admin
 */
public class getSocketInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < args.length; i++) {
            try {
                Socket theSocket = new Socket(args[i], 80);
                System.out.println("Connect to " + theSocket.getInetAddress() + " on port " + theSocket.getPort()
                        + " from port " + theSocket.getLocalPort() + " of " + theSocket.getLocalAddress());
            } catch (UnknownHostException e) {
                System.err.println("I can't find " + args[i]);
            } catch(SocketException e) {
                System.err.println("Could not connect to " + args[i]);
            } catch(IOException e){
                System.err.println(e);
            }
        }
    }
    
}

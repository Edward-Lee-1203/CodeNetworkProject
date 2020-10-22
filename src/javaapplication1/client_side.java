/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class client_side {
	 public static void main (String [] args) throws UnknownHostException , IOException { 
		 int open_port = 9999 ; 
		 Scanner sc = new Scanner(System.in) ; 
		 System.out.println("This is client side. Code by Le Xuan Thuan.");
		 Socket client_socket = new Socket ( "localhost" , open_port ) ; 
		 System.out.println("Client is connected to socket server!");
		 Scanner socket_input = new Scanner (client_socket.getInputStream()) ; 
		 int my_number ;
		 System.out.println("Please enter a number: ");
		 my_number = sc.nextInt () ; 
		 PrintStream prntStr = new PrintStream(client_socket.getOutputStream()) ; 
		 prntStr.println(my_number) ;
		 String temp; 
		 temp = socket_input.nextLine() ; 
		 System.out.println("Ouput data from Socket Server: "+temp) ; } 
}


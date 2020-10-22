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
import java.util.Scanner;

public class server_side {
	public static void main ( String [] args ) throws IOException {
		int open_port = 9999 ; 
		ServerSocket server_socket = new ServerSocket(open_port) ; 
		Socket serverSoc = server_socket.accept() ; 
		Scanner sc = new Scanner(serverSoc.getInputStream()) ; 
		int number ; 
		number = sc.nextInt() ; 
		String string_out; 
		String s1=String.valueOf(number);
		string_out = "Hello_"+s1; 
		PrintStream p = new PrintStream(serverSoc.getOutputStream()) ; 
		p.println(string_out) ; 
		serverSoc.close () ; 
		server_socket.close() ;
	}
}
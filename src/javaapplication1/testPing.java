/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Admin
 */
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.util.ArrayList; 
  
public class testPing 
{  
    // method for finding the ping statics of website 
    static void commands(ArrayList<String> commandList)  
                                           throws Exception 
    {  
        // creating the sub process, execute system command 
        ProcessBuilder build = new ProcessBuilder(commandList); 
        Process process = build.start(); 
          
        // to read the output 
        BufferedReader input = new BufferedReader(new InputStreamReader 
                                   (process.getInputStream())); 
        BufferedReader Error = new BufferedReader(new InputStreamReader 
                                   (process.getErrorStream())); 
        String s = null; 
          
        System.out.println("Standard output: "); 
        while((s = input.readLine()) != null) 
        { 
            System.out.println(s); 
        } 
        System.out.println("error (if any): "); 
        while((s = Error.readLine()) != null) 
        { 
            System.out.println(s); 
        } 
    } 
      
    // Driver method 
    public static void main(String args[]) throws Exception 
    {  
        // creating list for commands 
        ArrayList<String> commandList = new ArrayList<String>(); 
          
        commandList.add("ping"); 
        // can be replaced by IP 
        commandList.add("www.google.com"); 
          
        testPing.commands(commandList); 
    } 
} 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package file_handling;
import java.io.*;

/**
 *
 * @author Soniya
 */
public class ReadStringTest {
    public static void main(String args[]){  
Console c=System.console();  
System.out.println("Enter your name: ");  
String n=c.readLine(); //not accepted as it expects a console(black screen) of ide (here) but not available so runs only 
//in version 1.5
System.out.println("Welcome "+n);  
}  

    
    
}

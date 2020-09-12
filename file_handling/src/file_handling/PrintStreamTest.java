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
public class PrintStreamTest {
      
 public static void main(String args[])throws Exception{  
  	
   FileOutputStream fout=new FileOutputStream("mfile.txt");  
   PrintStream pout=new PrintStream(fout);  
   pout.println(1900);  
   pout.println("Hello Java");  
   pout.println("Welcome to Java");  
   pout.close();  
   fout.close();  
      
 }  
}   


    


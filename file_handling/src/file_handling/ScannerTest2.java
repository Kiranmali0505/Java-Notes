/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package file_handling;
import java.util.*; 

/**
 *
 * @author Soniya
 */
public class ScannerTest2 {
    
public static void main(String args[]){  
     String input = "10 tea 20 coffee 30 tea buiscuits";  
     Scanner s = new Scanner(input).useDelimiter("\\s");  
     System.out.println(s.nextInt());  
     System.out.println(s.next());  
     System.out.println(s.nextInt());  
     System.out.println(s.next());  
     s.close();   
}}  

    

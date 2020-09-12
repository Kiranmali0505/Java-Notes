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
public class G5 {
    
public static void main (String args[])throws Exception{  
  
InputStreamReader r=new InputStreamReader(System.in);  
BufferedReader br=new BufferedReader(r);  //wrapping of inputstream to buffered reader{(system.in+inputstream+bufferedreader)-properties of br}
  
System.out.println ("Enter your name");  
String name=br.readLine ();  
System.out.println ("Welcome "+name);  
 }  
}  

    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionhandling;

/**
 *
 * @author LENOVO
 */
public class catch1 {
    	  public static void main(String args[]){  
              //System.exit(0);
	  try{  
	   int data=25/0;  
	   System.out.println(data);  
           
	  }  
	  catch(ArithmeticException e){System.out.println(e);}  
	  finally{System.out.println("finally block is always executed");}  
	  System.out.println("rest of the code...");  
          System.exit(0);//predefined method of system but bahar nikalta h after execution successfully.
	  }  
}

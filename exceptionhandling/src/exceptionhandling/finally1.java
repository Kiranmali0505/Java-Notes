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
public class finally1 {
    	 
	  public static void main(String args[]){  
	  try{  
	   int data=25/0;  
	   System.out.println(data);  
	  }  
	  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
        System.out.println("rest of the code...");  
	  }  
	}  

    


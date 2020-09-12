/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//throw-user defined(khud ki generated exception ko throw krne k liye)
package exceptionhandling;

import java.io.IOException;

/**
 *
 * @author LENOVO
 */
public class throws_wala {//can use multiple throw with throws using loops 
    void m()throws IOException,ArithmeticException{//if we write ArithmeticException also in the definition
        //of m(),then multiple throw cannot be used inside block coz throw single ko support kr sakta h
        //throws with multiple;jaise c me warning aati h toh ek error aa gyi toh agli ka kya role(variable declare kiya and not used so warning)
        //
       // throw new ArithmeticException("no ways");
          throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   throws_wala obj=new throws_wala();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	}  

    


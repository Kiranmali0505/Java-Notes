/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java_thread;

/**
 *
 * @author Advance Techno
 */
public class sleep_1 extends Thread {
    
    
    public void run(){  
        for(int i=1;i<5;i++){  
            try{Thread.sleep(500);}
            catch(InterruptedException e){System.out.println(e);}  
            System.out.println(i); 
          //  System.out.print(" ");
        }  
        //System.out.println();
    }  
	 public static void main(String args[]){  
	  sleep_1 t1=new sleep_1();  
	  sleep_1 t2=new sleep_1();  
	   
	  t1.start();  
	  t2.start();  
	 }  

}

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
public class implement_runnable implements Runnable{
    
    	public void run(){  
	System.out.println("thread is running...");  
	}  
    public static void main(String args[]){  
	implement_runnable m1=new implement_runnable();  
	Thread t1 =new Thread(m1);  //m1 is runnable state coz it is only runnable state so
        //thread class me object k jaise pass krna padega
	t1.start();  
	  
}
    
}

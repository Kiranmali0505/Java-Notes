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
public class naming_thread  extends Thread{ 
  public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
  naming_thread t1=new naming_thread();  
  naming_thread t2=new naming_thread();  
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
  t1.start();  
  t2.start();  
  
  t1.setName("soniya"); 
  System.out.println("After changing name of t1:"+t1.getName());  
 }  
}  
    


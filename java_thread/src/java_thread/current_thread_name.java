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
public class current_thread_name extends Thread {  
 public void run(){  
  System.out.println(Thread.currentThread().getName());  //prints name
 }  
 
 public static void main(String args[]){  
  current_thread_name t1=new current_thread_name();  
  current_thread_name t2=new current_thread_name();  
  t1.getState();
  t1.start(); 
  t2.start(); 
 // System.out.println(t1.getName());
   //  System.out.println(t2.getName());
     System.out.println(t1.getState());//blocked for a time being wapas start ho jayega
     //terminated matlab wapas se start ho jayega
  // System.out.println(t2.getId());
    // System.out.println(t2.getName());
    // System.out.println(t1.getId());
 }  
}  


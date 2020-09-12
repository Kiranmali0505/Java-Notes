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
public class twice_thread_start extends Thread {  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  twice_thread_start t1=new twice_thread_start();  
  t1.start(); 
     System.out.println(t1.getState());
  t1.start(); 
    // System.out.println(t1.getState());
 }  
}  
//since it is a single thread so it is not possible for it to be available in two states simultaneously
//thats why error in  second time calling coz when we print the state for first it prints running
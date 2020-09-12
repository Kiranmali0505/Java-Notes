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
public class join_method extends Thread { 
 public void run(){  
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i);  
  }  
 }  
public static void main(String args[]){  
 join_method  t1=new join_method ();  
 join_method  t2=new join_method ();  
 join_method  t3=new join_method ();  
 t1.start();  

 try{  
  t2.join();  //priority for t1,calls all run of t1 first and then t2 and t3 together
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();  
 t3.start();  
 }  
}  


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
public class call_run_insteadOfstart extends Thread {
   
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(500);}//500 milliseconds k liye sleep and then runs
            catch(InterruptedException e){System.out.println(e.getMessage());}  
	    System.out.println(i); //program ko end nhi kr dega cz band baad me h for loop toh
            // after exception it will run the next values and code
	  }  
	 }  
	 public static void main(String args[]){  
	  call_run_insteadOfstart t1=new call_run_insteadOfstart();  
	  call_run_insteadOfstart t2=new call_run_insteadOfstart();  
	  //t1 and t2 different threads.when we use run(), then it completes one thread and then executes second
          //thread
	  t1.run();  
	  t2.run();  
          //t1.start();
          //t2.start();
	 }  
	}  //if we use start()instead of run(), then it executes both together but first executed then sleep then second
//and so on



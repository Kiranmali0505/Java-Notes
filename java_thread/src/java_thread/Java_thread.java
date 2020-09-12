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
public class Java_thread extends Thread{//extending thread class

    /**
     * @param args the command line arguments
     */
    public void run()
    {
       System.out.println("thread is running...");   
    }
    public static void main(String[] args) {
        // TODO code application logic here
    	Java_thread t1=new Java_thread();  
        t1.start();  

    }
    
}

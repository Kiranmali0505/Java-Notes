
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionhandling;
import java.io.IOException;

/**
 *
 * @author Soniya
 */
public class complete {
    
  void mymethod(int num)throws IOException, ClassNotFoundException{ 
     if(num==1)
        throw new IOException("Exception Message1");
     else
        throw new ClassNotFoundException("Exception Message2");
  } 
} 

class Demo{ 
  public static void main(String args[]){ 
   try{ 
     complete obj=new complete(); 
     obj.mymethod(1); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}
    
}

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionhandling;
//import java.lang.(available lot of classes for funtions having messages)
/**
 *
 * @author LENOVO
 */
public class Exceptionhandling {//finally is such a block which will run whether catch runs or try runs or not

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int array[]={20,20,40};
      int num1=15,num2=0;
      int result=10;
      try {
         
         for(int i =2;i >=0; i--) {
            System.out.println
            ("The value of array is" +array[i]);
         }
         result = num1/num2;
         System.out.println("The result is" +result);
      }
      /*catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array is out of Bounds"+e);//is exception me wo wahi se catch me chala jayega so divide nhi hoga
      }//coz wapas upar nhi jaata niche hi chalega
      catch (ArithmeticException e) {
         System.out.println ("Can't divide by Zero"+e);
      }*/
      catch(Exception e)//we can specify different classes but only exception class ka bhi object use kr sakte h
          //toh bhi message print hoga
          //but to avoid heavy code thing we only use different small casses
      {
          System.out.println(e.getMessage());
      }
   }
}
    

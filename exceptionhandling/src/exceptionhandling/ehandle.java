/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package exceptionhandling;

/**
 *
 * @author Soniya
 */
//public class ehandle {
    class Exception2{
   static int sum(int num1, int num2){
      if (num1 == 0)
         throw new ArithmeticException("First parameter is not valid");
      else
         System.out.println("Both parameters are correct!!");
      return num1+num2;
   }
   public static void main(String args[]){
      int res=sum(0,12);
      System.out.println(res);
      System.out.println("Continue Next statements");
   }
}
    

//throws explicitly defines,throws with method can also be used..
//class k saath only throws is called
//throw ko message body k andar call kr sakte h but throws bahar only
//throw se we can only throw one exception but with throws,we can throw multiple exceptions using throws
//for example,if in a method declaration 
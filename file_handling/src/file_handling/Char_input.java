/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package file_handling;
import java.util.Scanner;


/**
 *
 * @author Soniya
 */
public class Char_input {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    char[] name=new char[6];
    int i;
    System.out.println("Please enter characters of name");
    for(i=0;i<6;i++)
    {
        name[i]=sc.next().charAt(0);
    }
    for(i=0;i<6;i++)
    {
        System.out.print(name[i]);
    }   
}
}
 
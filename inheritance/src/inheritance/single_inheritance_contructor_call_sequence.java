/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

/**
 *
 * @author LENOVO
 */
class First
{
    public First()
    {
        System.out.println("contructor of First");
    }
}
class second extends First
{
    public second()
    {
        System.out.println("constructor of second");
    }
}
public class single_inheritance_contructor_call_sequence {
    public static void main(String[] args)
    {
        second s=new second();
        
    }
            
}

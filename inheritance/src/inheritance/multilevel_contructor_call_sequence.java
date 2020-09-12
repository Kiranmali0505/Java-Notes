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
class First1
{
    public First1()
    {
        System.out.println("contructor of First");
    }
}
class second1 extends First1
{
    public second1()
    {
        System.out.println("constructor of second");
    }
}
class third extends second1
{
    public third()
    {
        System.out.println("constructor of third");
    }
}
public class multilevel_contructor_call_sequence {
    public static void main(String[] args)
    {
        third th=new third();
    }
    
}

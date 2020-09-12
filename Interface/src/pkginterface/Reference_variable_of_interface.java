/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package pkginterface;

/**
 *
 * @author LENOVO
 */
interface First
{
    public void display();
}
class A implements First
{
    public void display()
    {
        System.out.println("display called");
    }
}

public class Reference_variable_of_interface {
    public static void main(String[] args)
    {
        First fr=new A();
    
         fr.display();
    }
}

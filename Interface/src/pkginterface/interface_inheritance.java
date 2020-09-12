/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkginterface;

/**
 *
 * @author LENOVO
 */
interface first2
{
    public void display();
}
interface second2 extends first2
{
    public void show();
}
class tu implements second2
{
    public void display()
    {
        System.out.println("display called");
    }
    public void show()
    {
        System.out.println("show called");
    }
}
public class interface_inheritance {
    public static void main(String[] args)
    {
        tu a=new tu();
        
        a.display();
        a.show();
    }
    
}

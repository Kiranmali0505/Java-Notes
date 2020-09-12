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
interface first3
{
    void display();
}
interface second3
{
    void show();
}
interface third extends first3,second3
{
    void ohhooo();
}

class teri implements third
{
    public void display()
    {
        System.out.println("first display called");
    }
    public void show()
    {
        System.out.println("seconds show called");
    }
    public void ohhooo()
    {
        System.out.println("achaa third ohhooo() called");
    }
}
public class multiple_superInterface {
    public static void main(String[] args)
    {
        teri oye=new teri();
        
        oye.display();
        oye.show();
        oye.ohhooo();
    }
}

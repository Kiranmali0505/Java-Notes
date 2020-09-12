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
interface first1
{
    void show();
}
interface second
{
    void display();
}
class my1 implements first1,second
{
    public void show()
    {
        System.out.println("show called");
    }

    @Override
    public void display() {
        System.out.println("display called");
    }
    
}
public class multipe_by_interface {
    public static void main(String[] args)
    {
        my1 a=new my1();
        a.show();
        a.display();
    }
}

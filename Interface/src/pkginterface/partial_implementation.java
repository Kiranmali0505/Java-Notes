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
interface first4
{
    void display();
    void show();
}
abstract class kya_baat implements first4
{
    public void display()
    {
        System.out.println("kyaa baat display called..!");
    }
}
class achaa extends kya_baat
{
    public void show()
    {
        System.out.println("achaa ab show call hua ...kya baat");
    }
}
public class partial_implementation {
    public static void main(String[] args)
    {
        achaa ab=new achaa();
        
        ab.display();
        ab.show();
    } 
}

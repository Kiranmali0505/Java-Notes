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

class info4
{
    private String fname;
    private  String lname;
    public info4()
    {
        fname="undefined";
        lname="undefined";
    }
    public info4(String fn,String ln)
    {
        fname=fn;
        lname=ln;
    }
    
    public void display()
    {
        System.out.println("name is:"+fname+" "+lname);
        //System.out.println("Age is:"+lname);
    }
}
class singer extends info4
{
    private String catagory;
   
    
    public singer()
    {
        catagory="undefined";
    }
    public singer(String fn,String ln,String ca)
    {
        super(fn,ln);//parent class constructor called as first statement 
        catagory=ca;
        
    }
    public void display()
    {
        
        System.out.println("singer details:");
        super.display();
        System.out.println("catagory is:"+catagory);
    }
}
class album extends singer
{
    private String title;
    public album()
    {
        title="undefined";
    }
    public album(String ti,String fn,String ln,String ca)
    {
        super(fn,ln,ca);
        title=ti;
    }
    public void display()
    {
        System.out.println("Name of album:"+title);
        super.display();
        
    }
    
}
public class multilevel_parameterized_constructor {
    public static void main(String[] args)
    {
        album a=new album();
        System.out.println("Data in A object is:");
        a.display();
        
        album b=new album("jine nahi dunga","khali","the great","WWE");
        System.out.println("Data in B object is:");
        
        b.display();
    }
}

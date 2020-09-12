/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
class info3
{
    private String fname;
    private  String lname;
    public info3()
    {
        fname="undefined";
        lname="undefined";
    }
    public info3(String fn,String ln)
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
class book extends info3
{
    private String title;
    private int price;
    
    public book()
    {
        title="undefined";
        price=0;
    }
    public book(String ti,String fn,String ln,int pr)
    {
        super(fn,ln);//parent class constructor called as first statement 
        title=ti;
        price=pr;
    }
    public void display()
    {
        System.out.println("name of book is:"+title);
        System.out.println("author details:");
        super.display();
        System.out.println("Price of book is:"+price);
    }
}

public class single_inheritance_with_parameterized_constructor {
        public static void main(String ars[])
        {
            book a=new book();
            
            a.display();
            
            book q=new book("map of bones","james","rollins",230);
            q.display();
        }
        
}

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
class vehical 
{
    private String company;
    private String name;
    
    public void accept()
    {
        company=JOptionPane.showInputDialog("enter company:");
        name=JOptionPane.showInputDialog("enter name of vehical:");
    }
    public void display()
    {
        System.out.println("name of vehical is:"+name);
        System.out.println("name of company:"+company);
    }
}
class heavymotor extends vehical
{
    private String permit;
    
    public void accept()
    {
        super.accept();
        permit=JOptionPane.showInputDialog("enter permit");
    }
    public void display()
    {
        super.display();
        System.out.println("permit is:"+permit);
    }
}
class lightmotor extends vehical
{
    private String type;
    
    public void accept()
    {
        super.accept();
        type=JOptionPane.showInputDialog("enter 2,3 or 4 wheeler:");
    }
    public void display()
    {
        super.display();
        System.out.println("type is:"+type);
    }
}
class passenger extends heavymotor
{
    private int sitting_capacity;
    private int standin_capacity;
    
    public void accept()
    {
        super.accept();
        sitting_capacity=Integer.parseInt(JOptionPane.showInputDialog("enter sitting capacity:"));
        standin_capacity=Integer.parseInt(JOptionPane.showInputDialog("enter standing capacity:"));
    }
    public void display()
    {
        super.display();
        System.out.println("sitting capacity is:"+sitting_capacity);
        System.out.println("standing capacity is:"+standin_capacity);
    }
    
}
class goods extends heavymotor
{
    private int loadcapacity;
    
    public void accept()
    {
        super.accept();
        loadcapacity=Integer.parseInt(JOptionPane.showInputDialog("enter load capacity:"));
        
    }
    public void display()
    {
        super.display();
        System.out.println("loading capacity is:"+loadcapacity);
    }
}

class withgear extends lightmotor
{
    private int gearcount;
    public void accept()
    {
        super.accept();
        gearcount=Integer.parseInt(JOptionPane.showInputDialog("enter no. of gear:"));
    }
    public void display()
    {
        super.display();
        System.out.println("no. of gear is:"+gearcount);
    }
}
class nogear extends lightmotor
{
    private String fueltype;
    
    public void accept()
    {
        super.accept();
        fueltype=JOptionPane.showInputDialog("enter type of fuel:");
    }
    public void display()
    {
        super.display();
        System.out.println("fuel type is:"+fueltype);
    }
}
public class hierarchical {
    public static void main(String[] args)
    {
        int choice;
        System.out.println("1. passenger");
        System.out.println("2. goods");
        System.out.println("3. with gear");
        System.out.println("4.no gear");
        
        choice=Integer.parseInt(JOptionPane.showInputDialog("enter your choice:"));
        
       if(choice==1)
       {
            passenger p=new passenger();
            
        p.accept();
        System.out.println("details in P are:");
        p.display();
        System.out.println("\n\n");
       }
       else if(choice==2)
       {
            goods g =new goods();
            
        g.accept();
        System.out.println("details in G are:");
        g.display();
        
        System.out.println("\n\n");
       }
       else if(choice==3)
       {
            withgear wg=new withgear();
            
        wg.accept();
        System.out.println("details in WG are:");
        wg.display();
        System.out.println("\n\n");
       }
       else if(choice==4)
       {
            nogear ng=new nogear();
        ng.accept();
        System.out.println("details in NG are:");
        ng.display();
       }
       else
       {
           System.out.println("invalid option");
       }
        
        
    }
}

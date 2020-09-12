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

class info2
{
    private String name;
    private int age;
    public void accept()
    {
        name=JOptionPane.showInputDialog("enter name:");
        age=Integer.parseInt(JOptionPane.showInputDialog("enter age:"));
    }
    public void display()
    {
        System.out.println("name is:"+name);
        System.out.println("Age is:"+age);
    }
}
class employee2 extends info2
{
    private int empid;
    private int salary;
    
    public void accept()
    {
        empid=Integer.parseInt(JOptionPane.showInputDialog("enter  employee id:"));
        super.accept();
        salary=Integer.parseInt(JOptionPane.showInputDialog("Enter salary:"));
    }

    public void display()
    {
        System.out.println("employee id is:"+empid);
        super.display();
        System.out.println("salary is:"+salary);

    }
}
class manager extends employee2
{
    private int allowances;
    public void accept()
    {
        super.accept();
        allowances = Integer.parseInt(JOptionPane.showInputDialog("enter allowances:"));
        
    }
    public void display()
    {
        super.display();
        System.out.println("Allowances are:"+allowances);
    }
}
public class multilevel {
    public static void main(String[] args)
    {
        manager m=new manager();
        m.accept();
        m.display();
    }
    
}

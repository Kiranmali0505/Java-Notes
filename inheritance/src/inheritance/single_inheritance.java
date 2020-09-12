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
class info
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
class employee extends info
{
    private int empid;
    private int salary;
    
    public void acceptdata()
    {
        empid=Integer.parseInt(JOptionPane.showInputDialog("enter  employee id:"));
        salary=Integer.parseInt(JOptionPane.showInputDialog("Enter salary:"));
    }

    public void displayData()
    {
        System.out.println("employee id is:"+empid);
        System.out.println("salary is:"+salary);

    }
}

public class single_inheritance {
    public static void main(String[] args)
    {
        employee a=new employee();
        a.accept();
        a.acceptdata();
        System.out.println("Employee details:");
        a.display();
        a.displayData();
    }
}

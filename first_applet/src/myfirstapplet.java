/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
/**
 *
 * @author Advance Techno
 */
//here jbutton use kiya h instead of button;phle button tha
public class myfirstapplet extends Applet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    JButton btn1,btn2,btn3;//button class of awt,jbutton class of swing;all are reference variables
    int type=-1;
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        setLayout(null);
        btn1=new JButton("");
        btn2=new JButton("rectangle");
        btn3=new JButton("oval");
        btn1.setText("line");
       
        
        btn1.addActionListener(this);//this for my first applet
        btn2.addActionListener(this);//action listener se saare festures call ho jayenge of Action listener
        btn3.addActionListener(this);
       
        btn1.setBounds(10, 20,100,50);//x-10,120,230;y is same(20)
        btn2.setBounds(120, 20,100,50);
        btn3.setBounds(230, 20,100,50);//100 and 50 are width and height
        
        btn1.setForeground(new Color(255,10,25));//text color set kr rhe h
        btn2.setForeground(new Color(0,255,25));//color set acc to rgb code(0-255)is range
        btn3.setForeground(new Color(55,10,255));
        
        btn1.setFont(new Font("Times New Roman ",Font.BOLD,16));//font,font style,font size
        btn2.setFont(new Font("Times New Roman ",Font.BOLD,16));
        btn3.setFont(new Font("Times New Roman ",Font.BOLD,16));
        
        add(btn1);add(btn2);add(btn3);
        
        
    }
    public void actionPerformed(ActionEvent ev)
    {
        JButton ref;//local reference variable created here of jbutton 
        ref=(JButton)ev.getSource();//id assign ho jayegi reference variable me
        if(ref==btn1)
        {
            type=1;
        }
        else if(ref==btn2)
        {
            type=2;
        }
        else
        {
            type=3;
        }
        
        repaint();//caling paint method again
    }
public void paint(Graphics gr)
{
    if(type==1)
    {
        gr.drawLine(100, 65, 90, 150);
    }
    else if(type==2)
    {
        gr.drawRect(100, 65, 90, 190);
    }
    else if(type==3)
    {
        gr.drawOval(100, 65, 90,175);
    }
}
    // TODO overwrite start(), stop() and destroy() methods
}

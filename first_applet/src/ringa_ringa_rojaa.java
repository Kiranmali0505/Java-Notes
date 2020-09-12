/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Advance Techno
 */
public class ringa_ringa_rojaa extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g)
    {
        int a=150,b=150,c=10,d=10;
        g.setColor(Color.red);
        for(int i=0;i<15;i++)
        {
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                System.out.println(""+ex.getMessage());
            }
            g.drawOval(a,b,c,d);
            a-=10;
            b-=10;
            c+=8;
            d+=8;
            
        }
    }
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}

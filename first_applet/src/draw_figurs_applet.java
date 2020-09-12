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
public class draw_figurs_applet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g)
    {
        g.setColor(Color.magenta);
        g.drawString("abe oye sun...welcome ",50,50);
        g.drawLine(20,30,20,300);
        g.drawRect(70,100,10,10);
        g.fillRect(170,100,30,30);
        g.drawOval(70,200,30,30);
        //g.draw
        
        g.setColor(Color.lightGray);
        g.fillOval(170,200,30,30);
        
        
    }
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}

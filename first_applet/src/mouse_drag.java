/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Advance Techno
 */
public class mouse_drag extends Applet implements MouseMotionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */  
  
@Override
public void init(){  
addMouseMotionListener(this);  
setBackground(Color.red);  
}  
  
public void mouseDragged(MouseEvent me){  
Graphics g=getGraphics();  
g.setColor(Color.white);  
g.fillOval(me.getX(),me.getY(),15,15);  
}  
public void mouseMoved(MouseEvent e){


}  
  

    // TODO overwrite start(), stop() and destroy() methods
}

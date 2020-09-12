/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//init,start,stop,destroy are four methods used in applet
import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Advance Techno
 */
public class applet_string_draw extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
  //  public void paint(Graphics g)
  //  {
  //      g.drawString("welcome to my world",120,20);
        
        
        
  //  }

   public void init() {
       System.out.println("abcd");
        // TODO start asynchronous download of heavy resources
        
        
    }
 public void paint (Graphics g)
 {
     System.out.println("abc");
 }
}
class C
{
    public void paint(Graphics g)
    {
        System.out.println("welcome to my world");
    }
}
    // TODO overwrite start(), stop() and destroy() methods


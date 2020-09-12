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
class Ball
{
  int x,y,radius,dx,dy;
  Color BallColor;
 public Ball(int x,int y,int radius,int dx,int dy,Color bColor)
 {
   this.x=x;//this ka x yaani current object (data members of class) ko x(parametrized) me assign kiya
   this.y=y;//providing value to object
   this.radius=radius;
   this.dx=dx;//displacement of x
   this.dy=dy;//displacement of y
   BallColor=bColor;
 }
}
public class BouncingbALL extends Applet implements Runnable {
Ball redBall,blackBall;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        redBall=new Ball(80,80,20,2,4,Color.red);
    blackBall=new Ball(40,20,20,4,2,Color.black);
    Thread t=new Thread(this);//this here is of Bouncing ball class...(each class has own this)
    t.start();
    }
    public void paint(Graphics g)          
    {
      g.setColor(redBall.BallColor);
       g.fillOval(redBall.x, redBall.y, redBall.radius, redBall.radius);
 
        g.setColor(blackBall.BallColor);
        g.fillOval(blackBall.x, blackBall.y, blackBall.radius, blackBall.radius);
    }
  public void run()//thread ka run
  {
    while(true)
    {
    try
        {
           displacementOperation(redBall);
           displacementOperation(blackBall);
           Thread.sleep(50);
           repaint();//creates again coordinates for ball toh moving lag rhi thi
           //paint and repaint both are predefined functions(if commented,then ball fix ho gyi)
        }
    catch(Exception e){}
    }
  }
//This method checks the boundary condition of ball movement
public void displacementOperation(Ball ball)
 {
  if(ball.y >= 400 || ball.y <= 0)//400 changes the boundary conditions for ball
  {//800 kiya toh zyada area me bounce hui(boundary define kri h)
    ball.dy=-ball.dy;//for displacement
  }
  if(ball.x >= 400 || ball.x <= 0)//for increasig boundary for x
  {
    ball.dx=-ball.dx;//for displacement
  }
  // ball.x=ball.y-ball.dy;//x wali ko poora diagonal mil gya toh poora move kr rhi h(red wali)
  // ball.y=ball.x-ball.dx;//black wali ko poora move krne ko nhi mila toh wo move toh kr rhi h but pas pas
   ball.y=ball.y-ball.dy;
   ball.x=ball.x-ball.dx;
  }
}

    // TODO overwrite start(), stop() and destroy() methods


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * draw_shapes_and_fill_color.java
 *
 * Created on Jan 1, 2002, 12:10:55 AM
 */

package graphics;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Karan
 */
public class draw_shapes_and_fill_color extends javax.swing.JFrame {
    

    /** Creates new form draw_shapes_and_fill_color */
    public draw_shapes_and_fill_color() {
        initComponents();
    }
    
    @Override
    public void paint(Graphics g){
        
     
     //for filled shapes
        g.setColor(Color.blue);
        g.drawRect(40, 40, 200, 200);
     //for face
        g.setColor(Color.yellow);
        g.fillOval(90, 70, 80, 80);
       //g.drawOval(90,70,83,83);
    //for eyes
        g.setColor(Color.black);
        g.fillOval(110, 95, 10, 10);
        g.fillOval(140, 95, 10, 10);
    //for nose
        g.drawLine(130, 95, 130, 115);
        //for smile
        g.setColor(Color.red);
        g.fillArc(113, 115, 35, 20, 0, -180);
        
        

    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i;
        i=Integer.parseInt(JOptionPane.showInputDialog("enter choice"));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new draw_shapes_and_fill_color().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

}
package edu.gwss.mt.ics20.u1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Michael Taciuk
 */
public class Kuwait extends JPanel {

    static Dimension d = new Dimension(700, 700);



    public Kuwait() {
        this.setSize(d);
        this.setPreferredSize(d);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        final int TOP_LEFT_X = 10;
        final int TOP_LEFT_Y = 10;
        final int LENGTH = 600;
        final int HEIGHT = 300;
       
        //Green at top
        Color cGreen = new Color(0, 128 ,0);
        g.setColor(cGreen);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y, LENGTH, HEIGHT/2);
        
        //Red at Bottom
        g.setColor(Color.red);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y + HEIGHT/2, LENGTH, HEIGHT/2);
        
        //Triangle
        g.setColor(Color.black);
        int[] x = { TOP_LEFT_X, LENGTH/100*39, TOP_LEFT_X};
        int[] y = { TOP_LEFT_Y, TOP_LEFT_Y + HEIGHT/2, TOP_LEFT_Y + HEIGHT};
        Polygon p = new Polygon();
        g.fillPolygon(x, y, 3);
        
        //White rectangle
        g.setColor(Color.white);
        g.fillRect(TOP_LEFT_X + LENGTH/4, TOP_LEFT_Y + HEIGHT/3, LENGTH/4*3, HEIGHT/3);
        
       
               
        
        
                
                
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));

        // ADD FLAG TO FRAME
        Kuwait jf = new Kuwait();
        frame.add(jf);

        frame.setVisible(true);
    }
    
}    
          


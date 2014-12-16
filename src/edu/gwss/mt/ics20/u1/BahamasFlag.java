
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
public class BahamasFlag extends JPanel {

    static Dimension d = new Dimension(700, 700);



    public BahamasFlag() {
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
       
        //background
        g.setColor(Color.blue);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y, LENGTH, HEIGHT);
        
        //yello rectangle
        g.setColor(Color.yellow);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y + HEIGHT/300*115, LENGTH, HEIGHT/4);
       
        //triangle
        g.setColor(Color.black);
        int[] x = { TOP_LEFT_X, LENGTH/10*4, TOP_LEFT_X};
        int[] y = { TOP_LEFT_Y, TOP_LEFT_Y + HEIGHT/2, TOP_LEFT_Y + HEIGHT};
        Polygon p = new Polygon();
        g.fillPolygon(x, y, 3);
               
        
        
                
                
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
        BahamasFlag jf = new BahamasFlag();
        frame.add(jf);

        frame.setVisible(true);
    }
    
}    
          


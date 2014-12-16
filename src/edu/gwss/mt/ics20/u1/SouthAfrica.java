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
public class SouthAfrica extends JPanel {

    static Dimension d = new Dimension(700, 700);



    public SouthAfrica() {
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
       
        //Red at top
        g.setColor(Color.red);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y, LENGTH, HEIGHT/2);
        
        //Blue at Bottom
        g.setColor(Color.blue);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y + HEIGHT/2, LENGTH, HEIGHT/2);
        
        //the two white rectangles
        g.setColor(Color.white);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y + (int) (HEIGHT/2.7), LENGTH, (int) (HEIGHT*.25));
        
        //White Triangle
        g.setColor(Color.white);
        int[] x1 = { TOP_LEFT_X + LENGTH/12, LENGTH/100*39, TOP_LEFT_X + LENGTH/12};
        int[] y1 = { TOP_LEFT_Y, TOP_LEFT_Y + HEIGHT/2, TOP_LEFT_Y + HEIGHT};
        Polygon p1 = new Polygon();
        g.fillPolygon(x1, y1, 3);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y, LENGTH/12, HEIGHT);
        
        //the green rectangle
        Color cGreen = new Color(0, 128 ,0);
        g.setColor(cGreen);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y + (int) (HEIGHT/2.4) , LENGTH, (int) (HEIGHT*.15));
               
        
        //Green Triangle
        g.setColor(cGreen);
        int[] x2 = { TOP_LEFT_X + LENGTH/16, LENGTH/100*36, TOP_LEFT_X + LENGTH/16};
        int[] y2 = { TOP_LEFT_Y, TOP_LEFT_Y + HEIGHT/2, TOP_LEFT_Y + HEIGHT};
        Polygon p2 = new Polygon();
        g.fillPolygon(x2, y2, 3);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y, LENGTH/16, HEIGHT);
        
        //Orange Triangle
        g.setColor(Color.orange);
        int[] x3 = { TOP_LEFT_X, LENGTH/100*20, TOP_LEFT_X};
        int[] y3 = { TOP_LEFT_Y + HEIGHT/9, TOP_LEFT_Y + HEIGHT/2, TOP_LEFT_Y + HEIGHT/9*8};
        Polygon p3 = new Polygon();
        g.fillPolygon(x3, y3, 3);
        
        //Black Triangle
        g.setColor(Color.black);
        int[] x4 = { TOP_LEFT_X, LENGTH/100*16, TOP_LEFT_X};
        int[] y4 = { TOP_LEFT_Y + HEIGHT/6, TOP_LEFT_Y + HEIGHT/2, TOP_LEFT_Y + HEIGHT/6*5};
        Polygon p4 = new Polygon();
        g.fillPolygon(x4, y4, 3);
        
        
        
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
        SouthAfrica jf = new SouthAfrica();
        frame.add(jf);

        frame.setVisible(true);
    }
    
}    
          


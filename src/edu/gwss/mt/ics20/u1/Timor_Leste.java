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
public class Timor_Leste extends JPanel {

    static Dimension d = new Dimension(700, 700);



    public Timor_Leste() {
        this.setSize(d);
        this.setPreferredSize(d);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //variables
        final int TOP_LEFT_X = 10;
        final int TOP_LEFT_Y = 10;
        final int LENGTH = 600;
        final int HEIGHT = 300;
       
        //background
        g.setColor(Color.red);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y, LENGTH, HEIGHT);
        
        //orange triangle
        g.setColor(Color.orange);
        int[] x1 = { TOP_LEFT_X, LENGTH/10*5, TOP_LEFT_X};
        int[] y1 = { TOP_LEFT_Y, TOP_LEFT_Y + HEIGHT/2, TOP_LEFT_Y + HEIGHT};
        Polygon p = new Polygon();
        g.fillPolygon(x1, y1, 3);
        
        //black triangle
        g.setColor(Color.black);
        int[] x2 = { TOP_LEFT_X, LENGTH/10*3, TOP_LEFT_X};
        int[] y2 = { TOP_LEFT_Y, TOP_LEFT_Y + HEIGHT/2, TOP_LEFT_Y + HEIGHT};
        Polygon p2 = new Polygon();
        g.fillPolygon(x2, y2, 3);
        
        //star (oval)
        g.setColor(Color.white);
        g.fillOval(TOP_LEFT_X + LENGTH/20, TOP_LEFT_Y + HEIGHT/3,
        TOP_LEFT_X + LENGTH/8, TOP_LEFT_Y + HEIGHT/4);
        
                
                
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
        Timor_Leste jf = new Timor_Leste();
        frame.add(jf);

        frame.setVisible(true);
    }
    
}    
          


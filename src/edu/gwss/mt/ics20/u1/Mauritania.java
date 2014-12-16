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
public class Mauritania extends JPanel {

    static Dimension d = new Dimension(700, 700);



    public Mauritania() {
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
        Color cGreen = new Color(0, 128 ,0);
        g.setColor(cGreen);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y, LENGTH, HEIGHT);
        
        
        //Crecent
        g.setColor(Color.yellow);
        g.fillOval(TOP_LEFT_X + LENGTH/3, TOP_LEFT_Y + HEIGHT/8, LENGTH/3, HEIGHT/3*2);
        g.setColor(cGreen);
        g.fillOval(TOP_LEFT_X + LENGTH/3, TOP_LEFT_Y + HEIGHT/30, LENGTH/3, HEIGHT/3*2);
        
        
       //Star
       g.setColor(Color.yellow);
       g.fillOval(TOP_LEFT_X + LENGTH/20*9, TOP_LEFT_Y + HEIGHT/10, LENGTH/8, HEIGHT/4);
        
        
                
                
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
        Mauritania jf = new Mauritania();
        frame.add(jf);

        frame.setVisible(true);
    }
    
}    
          


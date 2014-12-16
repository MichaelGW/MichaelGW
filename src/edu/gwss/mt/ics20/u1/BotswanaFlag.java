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
public class BotswanaFlag extends JPanel {

    static Dimension d = new Dimension(700, 700);


//Alex was here
    public BotswanaFlag() {
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
        
        //the blue background
        g.setColor(Color.blue);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y, LENGTH, HEIGHT);
        
        //the two white rectangles
        g.setColor(Color.white);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y + (int) (HEIGHT/2.7), LENGTH, (int) (HEIGHT*.25));
       
        //the black rectangle
        g.setColor(Color.black);
        g.fillRect(TOP_LEFT_X, TOP_LEFT_Y + (int) (HEIGHT/2.4) , LENGTH, (int) (HEIGHT*.15));
               
        
        
                
                
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
        BotswanaFlag jf = new BotswanaFlag();
        frame.add(jf);

        frame.setVisible(true);
    }
    
}    
          


package edu.gwss.mt.ics20.u1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Michael Taciuk
 */
public class Paint extends JPanel implements MouseListener {

    static Dimension d = new Dimension(700, 700);

int mouseX;
int mouseY;
    
public Paint() {
        this.setSize(d);
        this.setPreferredSize(d);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        while(true){
        g.setColor(Color.red);
        g.fillOval(20, 20, mouseX, mouseY);
        }
    
                                     
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
        Paint jf = new Paint();
        frame.add(jf);

        frame.addMouseListener(jf);
        
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //this.setBackground(Color.red);
        int mouseX = e.getX();
        int mouseY = e.getY();
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}    
          



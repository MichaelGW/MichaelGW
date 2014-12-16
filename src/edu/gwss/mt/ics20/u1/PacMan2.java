package edu.gwss.mt.ics20.u1;
import hsa.Console;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class PacMan2 extends Console {

    final int PACMAN_RADIUS = 40;
    final int STEP_SIZE = 10;
    final int HEIGHT = 800;
    final int LENGTH = 800;
    int xLocPac = 10;
    int yLocPac = 400;
    int xLocGost = 400;
    int yLocGost = 10;
    boolean n = true;
    

    public PacMan2() {

    }
    
    
    public static void main( String[] args ) {
        PacMan2 p = new PacMan2();
        p.drawPacmanUp();
        p.drawBackground();
    }

    public void keyPressed( KeyEvent e ) {
        int keyPressed = e.getKeyCode();
        switch ( keyPressed ) {
            case KeyEvent.VK_UP:
                drawPacmanUp();
                break;
            case KeyEvent.VK_DOWN: 
                drawPacmanDown();
                break;
            case KeyEvent.VK_LEFT: 
                drawPacmanLeft();
                break;
            case KeyEvent.VK_RIGHT:
                drawPacmanRight();
                break;
        }

        delay();
        
    }
    public void drawBackground() {
        setColour(Color.black);
        fillRect(0, 0, LENGTH, HEIGHT);
        //setColour(Color.blue);
        //fillOval(LENGTH/96*16, HEIGHT/64*17, LENGTH/80*16, HEIGHT/80*16);
        //setColour(Color.black);
        //fillOval(LENGTH/192*33, HEIGHT/64*16, LENGTH/80*15, HEIGHT/80*16);
        //setColour(Color.blue);
        //fillOval(LENGTH/48*9, HEIGHT/4, LENGTH/20, HEIGHT/20);
        //fillOval(LENGTH/48*13, HEIGHT/4, LENGTH/20, HEIGHT/20);
    }
    public void drawPacmanUp() {
        if (n == true){ 
        erasePacman();
        yLocPac = yLocPac - STEP_SIZE; 
        setColor(Color.yellow);
        fillArc(xLocPac, yLocPac, PACMAN_RADIUS, PACMAN_RADIUS, 110, 320);
        setColor(Color.black);
        fillOval(xLocPac+8, yLocPac+10, PACMAN_RADIUS/10, PACMAN_RADIUS/10);
        n = false;
        }else if (n == false){ 
        erasePacman();
        yLocPac = yLocPac - STEP_SIZE; 
        setColor(Color.yellow);
        fillArc(xLocPac, yLocPac, PACMAN_RADIUS, PACMAN_RADIUS, 0, 360);
        setColor(Color.black);
        fillOval(xLocPac+8, yLocPac+10, PACMAN_RADIUS/10, PACMAN_RADIUS/10);
        n = true;
        } 
    }

    public void drawPacmanDown() {
         
        
        if (n == true){ 
        erasePacman();
        yLocPac = yLocPac + STEP_SIZE; 
        setColor(Color.yellow);
        fillArc(xLocPac, yLocPac, PACMAN_RADIUS, PACMAN_RADIUS, 290, 320);
        setColor(Color.black);
        fillOval(xLocPac+28, yLocPac+16, PACMAN_RADIUS/10, PACMAN_RADIUS/10);
        n = false;
        }else if (n == false){ 
         erasePacman();
        yLocPac = yLocPac + STEP_SIZE; 
        setColor(Color.yellow);
        fillArc(xLocPac, yLocPac, PACMAN_RADIUS, PACMAN_RADIUS, 0, 360);
        setColor(Color.black);
        fillOval(xLocPac+28, yLocPac+16, PACMAN_RADIUS/10, PACMAN_RADIUS/10);
        n = true;
        } 
        
       
    }

    public void drawPacmanLeft() {
        
        
        if (n == true){ 
        erasePacman();
        xLocPac = xLocPac - STEP_SIZE;
        setColor(Color.yellow);
        fillArc(xLocPac, yLocPac, PACMAN_RADIUS, PACMAN_RADIUS, 200, 320);
        setColor(Color.black);
        fillOval(xLocPac+18, yLocPac+6, PACMAN_RADIUS/10, PACMAN_RADIUS/10);
        n = false;
        }else if (n == false){ 
        erasePacman();
        xLocPac = xLocPac - STEP_SIZE;
        setColor(Color.yellow);
        fillArc(xLocPac, yLocPac, PACMAN_RADIUS, PACMAN_RADIUS, 0, 360);
        setColor(Color.black);
        fillOval(xLocPac+18, yLocPac+6, PACMAN_RADIUS/10, PACMAN_RADIUS/10);
        n = true;
        } 
        
        

    }

    public void drawPacmanRight() {

        
        if (n == true){ 
        erasePacman();
        xLocPac = xLocPac + STEP_SIZE;
        setColor(Color.yellow);
        fillArc(xLocPac, yLocPac, PACMAN_RADIUS, PACMAN_RADIUS, 20, 320);
        setColor(Color.black);
        fillOval(xLocPac+18, yLocPac+6, PACMAN_RADIUS/10, PACMAN_RADIUS/10);
        n = false;
        }else if (n == false){ 
        erasePacman();
        xLocPac = xLocPac + STEP_SIZE;
        setColor(Color.yellow);
        fillArc(xLocPac, yLocPac, PACMAN_RADIUS, PACMAN_RADIUS, 0, 360);
        setColor(Color.black);
        fillOval(xLocPac+18, yLocPac+6, PACMAN_RADIUS/10, PACMAN_RADIUS/10);
        n = true;
        } 
        
    }

    public void erasePacman() {        
        setColor( Color.black );
        fillArc( xLocPac - 10, yLocPac - 10, PACMAN_RADIUS + 20, PACMAN_RADIUS + 20, 0, 360 );      
    }

    
    public void delay() {
        try {
            Thread.sleep( 10 );
        } catch ( Exception ignore ) {
        }
    }
}

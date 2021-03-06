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
    int xfood = 400;
    int yfood = 10;
    int xdiff = Math.abs (xLocPac - xfood);
    int ydiff = Math.abs (yLocPac - yfood);
    boolean n = true;
    
    
    
    public PacMan2() {
      
    }
    
   
    
    
    public static void main( String[] args ) {
        PacMan2 p = new PacMan2();
        p.drawPacmanUp();
        p.drawBackground();
        p.food();
    }

    public void food(){
      
        
      setColour(Color.yellow);
      while (true){
          
          
          
          xdiff = Math.abs (xLocPac - xfood);
          ydiff = Math.abs (yLocPac - yfood);
          
          
          
          
      if(xdiff == 0){
        
        xfood = (int) (Math.random() * 200) + 1;
          
      }else{
        
        setColor(Color.yellow);
        fillArc(xfood, yfood, 10, 10, 110, 360);
          
          
      }
      
      
      }
        
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
        fillArc( xLocPac - 10, yLocPac - 10, PACMAN_RADIUS + 20, PACMAN_RADIUS + 40, 0, 360 );      
    }

    
    public void delay() {
        try {
            Thread.sleep( 10 );
        } catch ( Exception ignore ) {
        }
    }
}

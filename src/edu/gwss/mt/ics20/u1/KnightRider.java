package edu.gwss.mt.ics20.u1;
import hsa.Console;
import java.awt.Color;
public class KnightRider extends Console {    
    final int HEIGHT = 800;
    final int LENGTH = 800;
    final int startX = 150;
    int fullLightLoc = 0;
    int dimLightLoc = 0;
     int dimLight2Loc = 0;
    int lightNum = 0;     
    public static void main( String[] args ) {
        KnightRider p = new KnightRider();
        p.drawBackground();
        p.doKnightRider();        
    }    
    public void doKnightRider() {     
        while (true){       
            while (lightNum < 7){                  
                fullLightLoc = startX + (lightNum * 40);
                if (lightNum == 0){
                  dimLightLoc = fullLightLoc + 40;  
                }else {
                  dimLightLoc = fullLightLoc - 40; 
                }
                if (lightNum <= 1){
                  dimLight2Loc = dimLightLoc + 40;  
                }else {
                  dimLight2Loc = dimLightLoc - 40; 
                }
                drawBackground();
                drawLights();
                lightNum++;
                delay();
            }        
            while (lightNum > 0){  
                fullLightLoc = startX + (lightNum * 40);
                if (lightNum == 7){
                  dimLightLoc = fullLightLoc - 40; 
                }else {
                  dimLightLoc = fullLightLoc + 40; 
                }
                if (lightNum >= 6){
                  dimLight2Loc = dimLightLoc - 40; 
                }else {
                  dimLight2Loc = dimLightLoc + 40; 
                }
                drawBackground();
                drawLights();
                lightNum--; 
                delay();
            }            
        }     
    }    
    public void drawBackground() {       
        setColor(Color.white);
        fillRect(0, 0, LENGTH, HEIGHT);
    }    
    public void drawLights() {        
        setColour(Color.black);
        fillRect(startX, 200, 320, 20);
        Color dim = new Color(195, 50 ,50);
        setColor(dim);
        fillRect(dimLightLoc, 200, 40, 20);
        Color dim2 = new Color(134, 59 ,59);
        setColor(dim2);
        fillRect(dimLight2Loc, 200, 40, 20);
        Color full = new Color(255, 0 ,0);
        setColor(full);
        fillRect(fullLightLoc, 200, 40, 20);       
    }   
    public void delay() {
        try {
            Thread.sleep( 100 );
        } catch ( Exception ignore ) {
        }
    }
}
package edu.gwss.mt.ics20.u1;
import static edu.gwss.mt.ics20.u1.Exam.bally;
import hsa.Console;
import java.awt.Color;

public class Exam {

    static Console c = new Console();
    static int bally = 0;
    
    

    public static void main(String[] args) {
        
        for (int x = 1; x <= 10; x++ ){
            
            while(bally < 200){
                draw();
                bally = bally + 10;
                delay();
            }
            
            while(bally > 0){
                draw(); 
                bally = bally - 10;
                delay();
            }
            
        
        }
        
    }

    

    public static void draw() {
        
        c.clear();
        c.setColor(Color.black);
        c.fillOval(100, bally, 20, 20); 
//        
        
    }

    public static void delay() {
        try {
            Thread.sleep(100);
        } catch (Exception ignore) {
        }
    }
}


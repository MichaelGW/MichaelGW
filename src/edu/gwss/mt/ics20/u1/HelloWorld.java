
package edu.gwss.mt.ics20.u1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author michaeltaciuk Nov 5, 2014 Description: This is a Hello World Program!
 */

public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String monthW; 
        int monthN;
        
        
        System.out.println("What is your Name?");
        String user = input.nextLine();
        System.out.print("Hello ");
        System.out.println(user);
        
        int age = -1;
        int currentYear = 2014;
        while (age < 0) {
            System.out.println( "What is your age?");
            try {
                
     
                age = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("That isn't a number.");
            }
        }
        System.out.print("You were born in ");
        System.out.print(currentYear - age);
        System.out.print(" or ");
        System.out.println(currentYear - age - 1);
        
        Date date = new Date( System.currentTimeMillis() );
        Date birthDate = new Date();
        Calendar c = Calendar.getInstance();
        c.set( Calendar.YEAR, currentYear - age );
        System.out.println(c.get( Calendar.YEAR));
        }

    }



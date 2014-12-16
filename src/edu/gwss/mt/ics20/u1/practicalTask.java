
package edu.gwss.mt.ics20.u1;

import java.util.Scanner;

/**
 *
 * @author michaeltaciuk
 */
public class practicalTask {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double total;
        double subTotal;
        double totalhst;
        double costpc;
        
        
        System.out.println("Enter the number of copies to be printed:");
        
        int numberOfCopies = input.nextInt();
        
        if (numberOfCopies < 100) {
            costpc = 0.3;
        }else if (numberOfCopies < 500) {
            costpc = 0.28;
        }else if (numberOfCopies < 750) {
            costpc = 0.27;
        }else if (numberOfCopies < 1001) {
            costpc = 0.26;
        }else {
            costpc = 0.25;
        }
        subTotal = (costpc * numberOfCopies);
        totalhst = (subTotal * 0.13);
        total =  (subTotal * 1.13);
        
        System.out.println("Price per copy is : $" + costpc);
        System.out.println("Subtotal : $" + subTotal);
        System.out.println("HST (13%) : $" + totalhst);
        System.out.println("Total : $" + total);
        
        
    }

}

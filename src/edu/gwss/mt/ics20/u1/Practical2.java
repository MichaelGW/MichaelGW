package edu.gwss.mt.ics20.u1;

public class Practical2 {

    public static void main(String[] args) {
        final double INCREASE = 1.055;
        double population = 24000000;
        int year = 1980;
        
        while(population < 100000000){
            population = population * INCREASE;
            year++;
        }
        
        System.out.println("The population will be over 100,000,000 in the year " + year);
    }

}

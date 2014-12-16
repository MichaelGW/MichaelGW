package edu.gwss.mt.ics20.u1;

import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String dateBorn;
        String ageDay;
        String ageMonth;
        String ageYear;
        long ctms = System.currentTimeMillis();
        long cts = ctms/1000;
        long ctm = cts/60;
        long cth = ctm/60;
        long ctd = cth/24;
        long cty = ctd/365;
        
        System.out.println("When were you born? Use the format YYYY/MM/DD");
        dateBorn = input.nextLine();
        ageYear = dateBorn.substring(0, 4);
        ageMonth = dateBorn.substring(5, 7);
        ageDay = dateBorn.substring(8, 10);

        int month = Integer.parseInt(ageMonth);
        int year = Integer.parseInt(ageYear);
        int day = Integer.parseInt(ageDay);

        System.out.print("Your Birthday is ");
        if (month == 1) {
            System.out.print("January ");
        } else if (month == 2) {
            System.out.print("Febuary ");
        } else if (month == 3) {
            System.out.print("March ");
        } else if (month == 4) {
            System.out.print("April ");
        } else if (month == 5) {
            System.out.print("May ");
        } else if (month == 6) {
            System.out.print("June ");
        } else if (month == 7) {
            System.out.print("July ");
        } else if (month == 8) {
            System.out.print("August ");
        } else if (month == 9) {
            System.out.print("September ");
        } else if (month == 10) {
            System.out.print("October ");
        } else if (month == 11) {
            System.out.print("November ");
        } else if (month == 12) {
            System.out.print("December ");
        } else {
            System.out.print("N/A ");
        }
        
        System.out.print(day + ", ");
        System.out.println(year);
        
        
        /**
        * System.out.print(cts + " Seconds ");
        * System.out.print(ctm +" Minutes ");
        * System.out.print(cth + " Hours ");
        * System.out.print(ctd + " Days ");
        * System.out.print(cty + " Years ");
        * System.out.println("Have Past synce 1970.");
        */
        
        Calendar rightNow = Calendar.getInstance();
        
        
        
    }

}

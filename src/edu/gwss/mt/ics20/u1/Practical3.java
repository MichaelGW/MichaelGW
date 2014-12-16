package edu.gwss.mt.ics20.u1;

public class Practical3 {

    public static void main(String[] args) {
        
        int numOfEyes = 0;
        int luckySeven = 0;
        int die1;
        int die2;
        
        for(int i = 1; i < 100; i++){
           die1 = (int) (Math.random()*6)+1;
           die2 = (int) (Math.random()*6)+1;
           if(die1 + die2 == 2){
              numOfEyes++;
              System.out.println("Snake Eyes");
           }else if (die1 + die2 == 7){
              luckySeven++;
              System.out.println("Lucky Seven");
           }
        }
        System.out.println(numOfEyes + " Snake Eyes");
        System.out.println(luckySeven + " Lucky Sevens");
        
        
    }

}

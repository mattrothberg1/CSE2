/////////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//hw06
//Roulette.java

import java.util.Scanner;
public class Roulette {
    public static void main(String [] args){
        
        Scanner myScanner; //declaring scanner
        myScanner = new Scanner(System.in); //defining myScanner
        
        
        int counter2 = 0; //counting up too 1000
        int zeroCalculator = 0; //how many times loose money
         int totalmoney$ = 0; //total count of overall money
         int profit = 0; //how many times per 100 you win money
        while(counter2 < 1000){ //loop 1
        int guessedNumber = (int)((Math.random() * 37 + 1));  //number guessed
      
       int money$ = 100; //resetting money to $100
       int counter = 0; //counter up to 100

       while(counter < 100) { //loop 2 
        
        int correctSpin = (int)((Math.random() * 37 + 1)); //random picked spin
       if(guessedNumber == correctSpin) { //if correct
           money$ +=  36; //if won add $36
           totalmoney$ +=36; //adding to overall money
           counter++; //add to 100 counter
           
       }
       else{ //if incorrect
           money$--; //minus $1
           counter++; //add to 100 counter
           totalmoney$--; //minus $1
       }

        
        
        if(money$==0){ //zero counter

            zeroCalculator++;

       }   
    
    
       }
       if(money$ > 0){ //if made a profit
           profit++;
       }
        counter2++; //1000 counter
           
        }
        System.out.println("Your total winnings are $" + totalmoney$); //overall winnings
        System.out.println("You lost all your money " + zeroCalculator + " times"); //overall lost all money
        System.out.println("You made a profit " + profit + " times"); //number of times made a profit 
}
}
/* This program works by computing two random number, the guessed and the correct. the guessed stays constant per 100 tries, and the correct changes. It uses loops to count to 100 on the innter loop.
If the correct is equal to guessed a value, money$, gets $36. If not, it subtracts 1. It then repeats this 1000 times using an outside loops and calculates the overall winnings per 1000 times,
the number of times there was a loss of all money per 100 spins, and the total profit (or loss) */
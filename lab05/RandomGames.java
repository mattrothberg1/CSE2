/////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//Lab05
//RandomGames.java

//importing scanner
import java.util.Scanner;

public class RandomGames {
    
    public static void main(String[] args) {
        
        //define scanner
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        //defining input
        String input;
        input = myScanner.next();
        if(input.length()>1) { //if longer character is entered
            System.out.println("A single character is expected.");
        }
        
        else {
            
        //defining
        int randomRoulette = (int)(Math.random() * ((37-0)+1)); //roulette
        int randomDice = (int)(Math.random() * ((7-1)+1)); //dice 1
        int randomDice1 = (int)(Math.random() * ((7-1)+1)); //dice 2
        int suit = (int)(Math.random()*4)+1; //suit
        int card = (int)(Math.random()*13)+1; //card
        String A1 = Integer.toString(suit); //suit
        String card2; //declaring card
        String randomRoulette2 = Integer.toString(randomRoulette); //converting to string
        String randomRoulette1; //declaring
        
        switch(input){
            case "r":  //input r
                switch(randomRoulette2){
                    case "37":
                        
                        randomRoulette1 = "00";
                        break;
                        
                    default:
                        
                         randomRoulette1 = randomRoulette2;
                         break;
                }
                System.out.println("Roulette: " + randomRoulette1); //outprint for r
                break;
            
            case "R": //input R
                 switch(randomRoulette2){
                    case "37":
                        randomRoulette1 = "00"; //if double 0
                        break;
                        
                    default:
                         randomRoulette1 = randomRoulette2;
                         break;
                }
                System.out.println("Roulette: " + randomRoulette1); //outprint
                break;
                
                
            case "C":
                System.out.println("Craps: " + randomDice1 + " + " + randomDice + " = " + (randomDice1+randomDice)); //input C
                break;
                
            case "c":
                System.out.println("Craps: " + randomDice1 + " + " + randomDice + " = " + (randomDice1+randomDice));   //input c
                break;
                
            case "P": //input P
                switch (suit) { //switch statement
                    case 1: 
                      A1 = "Hearts"; 
                       break; 
                        
                    case 2:
                      A1 = "Diamonds";
                      break;
                      
                    case 3:
                        A1 = "Clubs";
                        break;
                        
                    case 4:
                       A1 = "Spades";
                       break;
                        
            }
            
                switch (card) { //card randomizer
                    case 14:
                        card2 = "Jack";
                        break;
                        
                    case 15:
                        card2 = "Queen";
                        break;
                        
                    case 16:
                        card2 = "King";
                        break;
                        
                    case 17: 
                        card2 = "Ace";
                        break;
                
                    default:
                       card2 = Integer.toString(card);
                       break;
                       
                      
                }
                   System.out.println(card2 + " of " + A1); //output blank of blank
               break;
               
               case "p":
                switch (suit) {
                    case 1: 
                      A1 = "Hearts"; 
                       break; 
                        
                    case 2:
                      A1 = "Diamonds";
                      break;
                      
                    case 3:
                        A1 = "Clubs";
                        break;
                        
                    case 4:
                       A1 = "Spades";
                       break;
                        
            }
            
                switch (card) {
                    case 14:
                        card2 = "Jack";
                        break;
                        
                    case 15:
                        card2 = "Queen";
                        break;
                        
                    case 16:
                        card2 = "King";
                        break;
                        
                    case 17: 
                        card2 = "Ace";
                        break;
                
                    default:
                       card2 = Integer.toString(card); //outprint for card
                       break;
                       
                      
                }
                   System.out.println(card2 + " of " + A1);
               break;
    
            default: 
                System.out.println(input + " is not one of 'R', 'r', 'C', 'c', 'P', 'p'"); //if bad input
                break;
        }
        
        }
        
    }
    
    
    
}
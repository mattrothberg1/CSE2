/*this program works by first creating a deck of cards, and randomlly picking from the deck.
it removes the card from the deck array after it pulls the card out. It'll put these cards
in a hand and print it out. It then runs this program 10000 more times and checks for 
pairs. It adds up these pairs using arrays as counters, and then prints out these arrays
along with a counter of how many times there wasn't exactly one pair*/

import java.util.Random; 
import java.util.Scanner; 
public class PokerOdds{
    public static void main(String [] arg){ 
    showHands();
   simulateOdds();
    } 
        
   public static void showHands(){
           Scanner scan=new Scanner(System.in);

       Boolean question = true; //used to run program again
       String question1; //declaring string
       while(question == true){ //repeats program
       String labels[]={"Clubs", "Diamonds", "Hearts", "Spades"}; //inputting suits into array
       String cardName[]={"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"}; //inputting cards into array
       
       int showOneHand[] = new int[52]; //deck of cards
       int hand[] = new int[5]; //array for cards in hand
       int temp = 0; //temp value
       int b = 51; //max card able to be picked
       int random = 0; //setting value for random
       int cardCounter = 51; //used to take cards out of deck
        int cardsuits[]= new int[5]; // inputting suits of hand in array
       int cardType[] = new int[5]; //inputting type of card in array
       int d = 0; //used later
       for(int h = 0; h<5; h++){ //setting hand originally equal to -1
           hand[h] = -1;
       }

       for(int i = 0; i<52; i++){ //setting deck values
           showOneHand[i] = i;
       }
       for(int x = 0; x<5; x++){
           
         random =  0 + (int)(Math.random()*cardCounter); //randomly draws cards
         hand[x] = showOneHand[random];//randomly draws cards
         showOneHand[random] = -1; //randomly draws cards
         temp = showOneHand[cardCounter];//sets temp value
         showOneHand[cardCounter] = showOneHand[random];//randomly draws cards
         showOneHand[random] = temp; //returns that temp value 
         
         
         cardCounter--; //take one card out of deck

       }

       String cardType1[] = new String[5];
       for(int h = 0, j=0; j<5; h++, j++){
           
           cardsuits[h] = (hand[j] / 13); //returns the card suits

       }
       for(int w = 0; w<5; w++){
           cardType[w] = hand[w] % 13; //returns the card type 

       }

       
       for(int j = 0; j<4; j++){
           System.out.print(labels[j] + " "); //prints out hand
           for(int h = 0; h<5; h++){
           if(cardsuits[h] == j){
               d = cardType[h];
               System.out.print(cardName[d] + " "); //prints out hand
           }
           }
           System.out.println();
       }
       System.out.println("Go again? Enter 'y' or 'Y', anything else to quit- "); //asking to run program again
       String answer = scan.next();
       if(answer.equals("Y") || answer.equals("y")){ //if input is yes
           question = true; //return true and run again
    }
       else{
           question = false; //next program
       }
       }
   }
   
   public static void simulateOdds(){
       /*copied program from above*/
    int    i = 0;
    int d = 0;
    int j = 0;
       int s = 0;
       int checker;
       int badPairs = 0;
      int cardCounter1[] = new int[13];
      
         String labels[]={"Clubs", "Diamonds", "Hearts", "Spades"};
       String cardName[]={"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
       
       int showOneHand[] = new int[52];
       int hand[] = new int[5];
       int temp = 0;
       int b = 51; //max card able to be picked
       
       while(i<10000){
           checker = 0;
           //start of program checker

       for(int h = 0; h<5; h++){
           hand[h] = -1;
       }
       int random = 0;
       int cardCounter = 51;
       for(int qq = 0; qq<52; qq++){
           showOneHand[qq] = qq;
       }
       for(int x = 0; x<5; x++){
           
         random =  0 + (int)(Math.random()*cardCounter);
         hand[x] = showOneHand[random];
         showOneHand[random] = -1; 
         temp = showOneHand[cardCounter];
         showOneHand[cardCounter] = showOneHand[random];
         showOneHand[random] = temp;
         
         cardCounter--;

       }
       int cardsuits[]= new int[5];
       int cardType[] = new int[5];
       String cardType1[] = new String[5];
       for(int h = 0; j<5; h++, j++){
           
           cardsuits[h] = (hand[j] / 13);

       }
       for(int w = 0; w<5; w++){
           cardType[w] = hand[w] % 13;

       }
         for(int h = 0; h<5; h++){
           if(cardsuits[h] == j){
               d = cardType[h];
 
           }
           }
          
           
           //start of duplicate checker
           //copied from FindDuplicates.java
            
            
            for(int x = 0; x<cardType.length; x++){
                for(int ii = 0; ii<cardType.length; ii++){
                    if(x==ii){
                        continue;
                    }
                    else{
                    if(cardType[x] == cardType[ii]){
                        checker++; 
                      s = cardType[x];
                      cardCounter1[s] = cardCounter1[s] + 1;
                    }
                
                   } 
                }
            }
            if(checker==0){
                badPairs++; //increase no pair count
            }
            
            

           
           
           i++; //up to 10000
       }
       
       System.out.println("rank  freq of exactly one pair"); //print out
       for(int x = 0; x<13; x++){
           System.out.println(cardName[x] + "    " +  cardCounter1[x]/2); //card name array and card counter. divide by two becuase pairs repeat when checked ex: x==y & y==x
           
       }
       System.out.println("total not exactly one pair: " + badPairs); //bad pair counter
       
   }
   
        
} //end program
////////////////////////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//hw11
//PokerHands.java

import java.util.Scanner;
public class PokerHands{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        
        String face[]={"a","k","q","j","10","9","8","7","6","5", "4","3","2"};
    Boolean question = true;
    String question1;
    System.out.print("Enter 'y' or 'Y' to enter another hand- ");
    String answer = scan.next();
       if(answer.equals("Y") || answer.equals("y")){ //if input is yes
           question = true; //return true and run again
    }
       else{
           question = false; //next program
       }
    while(question == true){
        int cCounter = 0;
        int sCounter = 0;
        int dCounter = 0;
        int hCounter = 0;
        int showOneHand[][] = new int[4][13]; //deck of cards
       int hand[] = new int[5]; //array for cards in hand
        
        int numberCounter = 0; //used to program number in array
        for(int a = 0; a<4; a++){ //creating deck of cards array
        for(int  b=0; b<13; b++){
            showOneHand[a][b] = numberCounter;
            numberCounter++;
        }
}

int cardCounter=0;
       String input = "";
       for(int x = 0; x<5; x++){
        System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
       input = scan.next();

        if(input.equals("c") ){
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
            input = scan.next();
            
            for(int c = 0; c<13; c++){
                if(input.equals(face[c])){
                    hand[x] = cardCounter;
                    cardCounter++;
                    
                    break;
                }
                else{
                    cardCounter++;
                    
                }
                
            }
            cardCounter = 0;    
            
        }
                if(input.equals("d") ){
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
            input = scan.next();
            cardCounter = 13;
          
            for(int c = 0; c<13; c++){
                if(input.equals(face[c])){
                    hand[x] = cardCounter;
                    cardCounter++;
                   
                    break;
                }
                else{
                    cardCounter++;
                    
                }
                
            }
            cardCounter = 13;    
            
        }
         if(input.equals("h") ){
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
            input = scan.next();
            cardCounter = 26;
          
            for(int c = 0; c<13; c++){
                if(input.equals(face[c])){
                    hand[x] = cardCounter;
                    cardCounter++;
                    
                    break;
                }
                else{
                    cardCounter++;
                    
                }
                
            }
            cardCounter = 26;    
            
        }
        if(input.equals("s") ){
           
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
            input = scan.next();
            cardCounter = 39;
            for(int c = 0; c<13; c++){
                if(input.equals(face[c])){
                    hand[x] = cardCounter;
                    cardCounter++;
                    
                    break;
                }
                else{
                    cardCounter++;
                    
                }
                
            }
            cardCounter = 39;    
            
        }
        
        
        
       }
        showOneHand(hand);
        

       System.out.print("Enter 'y' or 'Y' to enter another hand- ");
     answer = scan.next();
       if(answer.equals("Y") || answer.equals("y")){ //if input is yes
           question = true; //return true and run again
    }
       else{
           question = false; //next program
       } 
    }
    
    
    
    }
    
public static void showOneHand(int hand[]){ 
int rankFreq[] = new int[13];
int suitFreq[] = new int[4];
String suit[]={"Clubs: ","Diamonds:","Hearts: ","Spades: "}; 
String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ", "4 ","3 ","2 "};
String out="";
for(int s=0;s<4;s++){
out+=suit[s];
for(int rank=0;rank<13;rank++) 
for(int card=0;card<5;card++)
if(hand[card]/13==s && hand[card]%13==rank)
out+=face[rank]; out+='\n';
}


System.out.println(out); 
    for(int card = 0; card<5; card++){
        for(int j = 0; j<13; j++){
       
      if(hand[card]%13==j){
          rankFreq[j] = rankFreq[j] + 1;
      }
    }
    }
    
    
    int straightCounter = 0;
    int fourOfAKind = 0;
    int RoyalFlush = 0;
    int flushCounter = 0;
    int fullHouse = 0;
    int twoPair = 0;
    for(int u = 0; u<13; u++){
        if(rankFreq[u] == 1){
            straightCounter++;
        }
        else{
            straightCounter=0;
        }
        if(rankFreq[u]==4){
            fourOfAKind++;
        }
        if(rankFreq[u]==3){
            fullHouse++;
        }
        if(rankFreq[u]==2){
            fullHouse++;
            twoPair++;
        }
        
    }
    if(rankFreq[0] == 1 && rankFreq[1] == 1 && rankFreq[2] == 1 && rankFreq[3] == 1 && rankFreq[4] == 1){
        RoyalFlush++;
    }
        for(int w = 0; w<5; w++){
            for(int e = 0; e<4; e++){
                if(hand[w]/13 == e){
                    suitFreq[e] = suitFreq[e] + 1;
                }
            }
        }
        
        for(int r = 0; r<4; r++){
            if(suitFreq[r]==5){
                flushCounter++;
            }
        }
         
            
        
        if(RoyalFlush==1){
            System.out.println("This is a Royal Flush");
            
        }
        else if(flushCounter == 1 && straightCounter == 1){
            System.out.println("This is a Straight Flush");
            
        }
        else if(fourOfAKind == 1){
            System.out.println("This is Four of A Kind");
          
        }
        else if(fullHouse == 2){
            System.out.println("This is a Full House");
           
        }
        else if(flushCounter == 1){
            System.out.println("This is a Flush");
          
        }
        else if(straightCounter == 5){
            System.out.println("This is a straight");
            
        }
        else if(twoPair == 2){
            System.out.println("This is a Two Pair");
          
        }
        else if(twoPair == 1){
            System.out.println("This is a pair");
          
        }
        else{
            System.out.println("This hand only has a High Card");
           
        }
        
        
}
}

/*
            if(scan.next().equals("a")){
                hand[x] = 0;
            }
            else if(scan.next().equals("k")){
                hand[x] = 1;
            }
            else if(scan.next().equals("q")){
                hand[x] = 2;
            }
            else if(scan.next().equals("j")){
                hand[x] = 3;
            }  
            else if(scan.next().equals("10")){
                hand[x] = 4;
            }  
            else if(scan.next().equals("9")){
                hand[x] = 5;
            }  
            else if(scan.next().equals("8")){
                hand[x] = 6;
            }  
            else if(scan.next().equals("7")){
                hand[x] = 7;
            }  
            else if(scan.next().equals("6")){
                hand[x] = 8;
            }  
            else if(scan.next().equals("5")){
                hand[x] = 9;
            }  
            else if(scan.next().equals("4")){
                hand[x] = 10;
            }  
            else if(scan.next().equals("3")){
                hand[x] = 11;
            }  
            else if(scan.next().equals("2")){
                hand[x] = 12;
            }  
            else{System.out.println("error");}
*/
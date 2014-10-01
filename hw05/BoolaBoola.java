//////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//HW05
//BoolaBoola.java

//importing scanner
import java.util.Scanner;

//class
public class BoolaBoola {
    
    //main method
    public static void main(String[] args) {
                Scanner myScanner;
        myScanner = new Scanner(System.in);//scanner
        
        int random1 = (int)((Math.random() * (1 + 1)));//0 or 1
        int random2 = (int)((Math.random() * (1 + 1)));//0 or 1
        int random3 = (int)((Math.random() * (1 + 1)));//0 or 1
        int random4 = (int)((Math.random() * (3 + 1)));//0 or 1


        boolean result1;//declare
        boolean result2;//declare
        boolean result3;//declare
        

        if (random1 == 0) { //true or false
       result1 = true;
        }
        else {
           result1 = false;
        }
        

        if (random2 == 0){ //boolean
        result2 = true; }
        else {
            result2 = false;
        }
        
 
        if (random3 == 0) { //boolean
        result3 = true;
        }
        else {
            result3 = false;
        }    

    boolean boola1 = result1||result2||result3; //possible statement 1
    boolean boola2 = result1||result2&&result3; //possible statement 2
    boolean boola3 = result1&&result2||result3;//possible statement 3
    boolean boola4 = result1&&result2&&result3;//possible statement 4
    
String input=""; //declare
    switch(random4){ 
        case 0: //if random is 0
            System.out.println("does " + result1 + " || " + result2 + " || " + result3 + " have the value true (t/T) or false (f/F)? "); //print out statement 
            input = myScanner.next(); //scanner
            if (input.equals("t")||input.equals("T")||input.equals("f")||input.equals("F")){ //if input is t or f
                if (input.equals("t")||input.equals("T")&&boola1==true){ //if input is correct
                    System.out.println("Correct!");}
                else if (input.equals("f")||input.equals("F")&&boola1==false){ //correct input
                    
            else {
                System.out.println("Sorry you are incorrect! Try again!"); //if input isnt correct
            }} 
                else {
                    System.out.println("Not an answer option! Please type t, T, f, or F!"); //if bad input 
                }
                
                break; //end  

        case 1: //if random is 1
            System.out.println("does " + result1 + " || " + result2 + " && " + result3 + " have the value true (t/T) or false (f/F)? "); //print out
            input = myScanner.next(); //scanner
            if (input.equals("t")||input.equals("T")||input.equals("f")||input.equals("F")){ //valid input
                if (input.equals("t")||input.equals("T")&&boola2==true){ //input is true correct
                    System.out.println("Correct!");}
                else if (input.equals("f")||input.equals("F")&&boola2==false){ //input is false but correct
                    System.out.println("Correct");}
                    
            else {
                System.out.println("Sorry you are incorrect! Try again!"); //wrong answer
            }} 
                else {
                    System.out.println("Not an answer option! Please type t, T, f, or F!"); //bad input
                }
                
                break;             
        
        case 2: //random is 2
            System.out.println("does " + result1 + " && " + result2 + " || " + result3 + " have the value true (t/T) or false (f/F)? "); //print out 
            input = myScanner.next(); //scanner
            if (input.equals("t")||input.equals("T")||input.equals("f")||input.equals("F")){ //valid input
                if (input.equals("t")||input.equals("T")&&boola3==true){ //true input
                    System.out.println("Correct!");}
                else if (input.equals("f")||input.equals("F")&&boola3==false){ //correct false input
                    System.out.println("Correct");}
                    
            else {
                System.out.println("Sorry you are incorrect! Try again!"); //wrong
            }} 
                else {
                    System.out.println("Not an answer option! Please type t, T, f, or F!"); //bad input
                }
                
                break;      
             
                case 3: 
            System.out.println("does " + result1 + " && " + result2 + " && " + result3 + " have the value true (t/T) or false (f/F)? "); //print out
            input = myScanner.next(); //scanner
            if (input.equals("t")||input.equals("T")||input.equals("f")||input.equals("F")){ //good input
                if (input.equals("t")||input.equals("T")&&boola4==true){ //true correct
                    System.out.println("Correct!");}
                else if (input.equals("f")||input.equals("F")&&boola4==false){ //false correct
                    System.out.println("Correct");}
                    
            else {
                System.out.println("Sorry you are incorrect! Try again!"); //wrong
            }} 
                else {
                    System.out.println("Not an answer option! Please type t, T, f, or F!"); //bad input
                }
                
                break;     
             
                
            }

    }
    
  
    

        
    }
    
//end program
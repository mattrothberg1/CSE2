///////////////////////////////////////////
//Matt Rothberg
//CSE 02
//Lab04
//BigMacAgain.java

//importing scanner
import java.util.Scanner;

public class BigMacAgain {
    //main method
    
    public static void main(String[] args) {
        //input data
        
        //Defining Scanner
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
            //input1$ = myScanner.nextInt();
            
        //printing out 1st question
        System.out.print("Enter the number of Big Macs: ");
                
         int input1$;
         if(myScanner.hasNextInt() ) {
             input1$ = myScanner.nextInt();
            
            //If/else statement 
             if( input1$ > 0 ) {
            
            int output2$ = (int)(input1$*2.22*100)/100;
            System.out.println("You ordered " + input1$ + " Big Macs for a cost of " + input1$ + "x2.22 = $" + (output2$*2.22));
            
         }
         
         else {
            System.out.println("You did not enter a number > 0");
            return;
            
         }
         }
       
        else {
            System.out.println("you did not enter an int");
            return;   //leaves the program, i.e.
                        //the program terminates
                        
        }
        
       
       
        
     //  myScanner2 = new Scanner(System.in);
            
        
        //Second question
        System.out.print("Do you want an order of fries (Y/y/N/n)?");
        
        //Enter Y/y/N/n
        String fries = myScanner.next();
        if( fries.equals("Y") || fries.equals("y") || fries.equals("N") || fries.equals("n") ) {
             //fries = myScanner.next();
             
             if( fries.equals("Y") || fries.equals("y") ) {
            
            //defining burger and fries
            double number1$ = 2.22;
            double number2$ = 2.15;
            int output1$ = (int)((input1$*number1$ + 2.15)*100)/100;
            System.out.println("The Total Cost of your meal is $" + (output1$));
            
         }
         //if/else and output
         if (fries.equals("n") || fries.equals("N")) {
         int output3$ = (int)(input1$*2.22*100)/100;
         System.out.println("The Total Cost of your Meal is $" + (output3$));    
             
         }
        }
         
         else{
            System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
            return;
         }
         
         
     
                        
        
        
        
        
    }
    
}
///////////////////////////////////////////
//Matt Rothberg
//CSE 02
//Lab04
//Month.java

//importing scanner
import java.util.Scanner;

public class Month {
    //main method
    
    public static void main(String[] args) {
        //input data
        
        //Defining Scanner
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
            //input1$ = myScanner.nextInt();
            
        //printing out 1st question
        System.out.print("Enter an int giving the number of the month (1-12)- ");
        
        int input1$;
          if(myScanner.hasNextInt() ) {
             input1$ = myScanner.nextInt();
          if(input1$ == 1) {
              System.out.println("The month has 31 days");
              
          }   
            else if(input1$ == 2) {
              System.out.print("Enter an int giving the year: ");
              int year = myScanner.nextInt();
              
              boolean Leap = ((year % 4 == 0));
              
              if (Leap) {
                  System.out.println ("The month has 29 days");
              }
             
             else{
                 System.out.println("The month has 28 days");
                 return;
             }
              }
             else if(input1$ == 3) {
              System.out.println("The month has 31 days");
              //return;
             }
             
            else if(input1$ == 4) {
              System.out.println("The month has 30 days");
              //return;
             }
             
            else if(input1$ == 5) {
              System.out.println("The month has 31 days");
              //return;
             }
             
            else if(input1$ == 6) {
              System.out.println("The month has 30 days");
              //return;
             }
             
            else if(input1$ == 7) {
              System.out.println("The month has 31 days");
              //return;
             }
             
            else if(input1$ == 8) {
              System.out.println("The month has 31 days");
             // return;
             }
             
            else if(input1$ == 9) {
              System.out.println("The month has 30 days");
             // return;
             }
             
            else if(input1$ == 10) {
              System.out.println("The month has 31 days");
             // return;
             }
             
            else if(input1$ == 11) {
              System.out.println("The month has 30 days");
              //return;
             }
             
            else if(input1$ == 12) {
              System.out.println("The month has 31 days");
              //return;
             }
             
             else if(input1$ < 1 || input1$ > 12) {
               System.out.println("You did not enter an int between 1 and 12");
              //  return;
                
           }
            
         
          }
          else {
             System.out.println("You did not enter an int between 1 and 12");
             return;
         } 
          
         
    }
    
}
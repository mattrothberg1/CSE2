///////////////////////////////////////////
//Matt Rothberg
//CSE 02
//Lab04
//CourseNumber.java

//importing scanner
import java.util.Scanner;

public class CourseNumber {
    //main method
    
    public static void main(String[] args) {
        //input data
        
        //Defining Scanner
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
            //input1$ = myScanner.nextInt();
            
        //printing out 1st question
        System.out.print("Enter a six digit number giving the course semester- ");
             
        //defining input        
        
          
         //input1 = myScanner.nextInt();
         
         if(myScanner.hasNextInt()) {
           int input1;
         input1 = myScanner.nextInt();
         if (input1 > 201440 || input1 < 186510 ) {
             System.out.println("The number was outside the range [186510,201440]");
             
         }
         else {
         
         //get rid of extra digits for year
         int A;
         A = (input1/100);
         
         //convert to year
         int year;
         year = (int)A;
         
         //getting term number
         int term;
         term = input1 - (A*100);
         
         
         //if it's term one
         if (term == 10) {
             System.out.println("The course was offered in the Spring Semester of " + year);
             
         }
         
         //if it's summer 1
         else if(term == 20){
             System.out.println("The course was offered in the Summer 1 semester of " + year);
         }
         
         //or summer 2
         else if(term == 30) {
             System.out.println("The course was offered in the Summer 2 semester of " + year);
             
         }
         
         //fall 
         else if(term == 40) {
             System.out.println("The course was offered in the Fall semester of " + year);
             
             
         }
           
         
         }
         }
           //if bad input 
         else {
             System.out.println(myScanner + "is not a legitimate semester.");
             return;
         }
          
    }
    
}
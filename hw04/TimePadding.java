//////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//hw04
//TimePadding.java

//importing scanner
import java.util.Scanner;

public class TimePadding {
    //defining class
    
    
    public static void main(String[] args) {
        //input data
        
        //Defining Scanner
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
            
            
        //printing out 1st question
        System.out.print("Enter the time in seconds: ");
        
        int input;
        input = myScanner.nextInt();
        
        //Finding hours
        int A;
        A = (input/60)/60;
        
        //converting hours to int
       int hours = (int)A;
       
       //Converting back to seconds
       int C;
       C = (hours * 60) * 60;
       
       //Remaining seconds
       int D;
       D = (input - C);
       
       //Converting to minutes
       int E;
       E = D/60;
       
       //Converting min to int
       int minutes = (int)E;
       
       //converting back to seconds
       int G;
       G = minutes*60;
       
       //Seconds remaining
       int seconds;
       seconds = D-G;
        // if min and sec < 10
        if (minutes < 10 && seconds < 10) {
          int seconds1 = seconds;
          int minutes1 = minutes;
          System.out.println("The time is   " + hours + ":0" + minutes1 + ":0" + seconds1 + "." );
      }
      // if min < 10
      else if (minutes < 10) {
          int minutes1 = minutes;
          System.out.println("The time is   " + hours + ":0" + minutes1 + ":" + seconds + "." );
       
          
      }
      //if sec < 10
      else if (seconds < 10) {
            int seconds1 = seconds;
            System.out.println("The time is   " + hours + ":" + minutes + ":0" + seconds1 + "." );
       
      }
      

       else {
       System.out.println("The time is   " + hours + ":" + minutes + ":" + seconds + "." );
       }
       
      
    }
}

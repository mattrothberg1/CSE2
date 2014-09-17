/////////////////////////////////////////////////////
//Matthew Rothberg
//hw03
//CSE02

//importing scanner
import java.util.Scanner;

public class Bicycle {
    //main method
    
    public static void main(String[] args) {
        //input data
        
        //Defining Scanner
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        
        //printing out 1st question
        System.out.print("Enter the number of seconds: ");
        
        //define input
        int seconds = myScanner.nextInt();
        
        //Second question
        System.out.print("Enter the number of counts: ");
        
        //second input defining
        int ncounts = myScanner.nextInt();
        
        
        //variables
        int wheelDiameter = 27; //Diameter of the wheel
        double PI=3.14159; //Value of Pi
        int feetPerMile=5280; //Number of feet per mile
        int inchesPerFoot=12; //Number of inches per food
        int secondsPerMinute=60; //number of seconds per minute
        double tdistance = (ncounts*wheelDiameter*PI/inchesPerFoot/feetPerMile)*100;
        int distance2 = (int)tdistance;
        double distance3 = (double)distance2;
        double minutes = seconds/secondsPerMinute;
        double hours = minutes/60;
        double mph = (tdistance/hours);
        int mph2 = (int)mph;
        double mph3 = (double)mph2;
        
       // double distance3 = (ncounts*wheelDiameter*PI/inchesPerFoot/feetPerMile);
       // double distance4 = (distance3*100);
        //int distance5 = (int)(distance4);
        //double mph = distance3/hours;
        // int mph2 = (int)mph;
        // double mph3 = (double)mph2;
        
        
        
        System.out.println("The distance was " + ((distance3)/100) + " miles and took " + (seconds/secondsPerMinute) + " minutes.");
        System.out.println("The average mph is " + (mph3/100));
        
        
    }
}
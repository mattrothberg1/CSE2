////////////////////////////////////////////////////
//Matthew Rothberg
//lab03
//CSE02

//importing Scanner
import java.util.Scanner;

public class BigMac {
// main method required for every Java program
    public static void main(String[] args) {
    
    //Defining scanner
    Scanner myScanner;    
        
    myScanner = new Scanner( System.in );
    
    //printing out first question
    System.out.print("Enter the number of Big Maccs(an integer > 0): ");
    
    //defining
    int nBigMacs = myScanner.nextInt();
        
    System.out.print
        ("Enter the cost per Big Mac as" + " a double (in the form xx.xx): " );
        
    double bigMac$ = myScanner.nextDouble(); System.out.print(
    "Enter the percent tax as a whole number (xx): "); double taxRate = myScanner.nextDouble(); taxRate/=100; //user enters percent, but I want
    //proportion
    
    double cost$;
    int dollars,   //whole dollar amount of cost
        dimes, pennies; //for storing digits
            //to the right of the decimal point
            //for the cost$
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    //get teh whole amount, dropping decimal fraction
    dollars=(int)cost$;
    //get dimes amount, e.g.,
    // int)(6.73 * 10) % 10 ­> 67 % 10 ­> 7
    // wherethe%(mod)operatorreturnstheremainder // afterthedivision: 583%100­>83,27%5­>2
    dimes=(int)(cost$*10)%10;
    pennies=(int)(cost$*100)%10;
    System.out.println("The total cost of "  +nBigMacs +" BigMacs, at $"+bigMac$ +" per bigMac, with a" + "sales tax of " + (int) (taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
    
    
    } //endofmainmethod } //end of class
    
}
///////////////////////////////////////////
//Matthew Rothberg
//CSE 02
//HW03

import java.util.Scanner;

//  define a class
public class Root{
    
//   add main method
  public static void main(String[] args) {
      
     //Defining scanner
    Scanner myScanner;    
        
    myScanner = new Scanner( System.in );
    
    //Printing out first question
    System.out.print("Enter a double, and I print its cube root- ");
    
    //defining
    int ndigits = myScanner.nextInt();
    
    //guess
    double guess = (ndigits/3);
    double guess2 = ((2*guess*guess*guess+ndigits)/(3*guess*guess));
    double guess3 = ((2*guess2*guess2*guess2+ndigits)/(3*guess2*guess2));
    double guess4 = ((2*guess3*guess3*guess3+ndigits)/(3*guess3*guess3));
    double guess5 = ((2*guess4*guess4*guess4+ndigits)/(3*guess4*guess4));
    double guess6 = ((2*guess5*guess5*guess5+ndigits)/(3*guess5*guess5));
    
    //outputing
    System.out.println("The cube root is: " + guess2/2 + ":  ");
    System.out.println(guess6 + "*" + guess6 + "*" + guess6 + "= " + (guess6*guess6*guess6));
   
    
    
  }
}
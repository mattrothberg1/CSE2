///////////////////////////////////////////
//Matt Rothberg
//CSE 02
//HW03
//FourDigits.java

//importing scanner
import java.util.Scanner;

public class FourDigits {
    //main method
    
    public static void main(String[] args) {
        //input data
        
        //Defining Scanner
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
        
        //printing out 1st question
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        
         //define input
        double input = myScanner.nextDouble();
        
        int input2 = (int)input;
        double input3 = input-input2;
        double input4 = (input3*10000);
        int input5 = (int)(input4/1000)%10;
        int input6 = (int)(input4/100)%10;
        int input7 = (int)(input4/10)%10;
        int input8 = (int)(input4)%10;
        
        //output
        System.out.print("The four digits are " + input5 + input6 + input7 + input8);
        
    }
}
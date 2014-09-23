///////////////////////////////////////////
//Matt Rothberg
//CSE 02
//Lab04
//IncomeTax.java

//importing scanner
import java.util.Scanner;

public class IncomeTax {
    //main method
    
    public static void main(String[] args) {
        //input data
        
        //Defining Scanner
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
            //input1$ = myScanner.nextInt();
            
        //printing out 1st question
        System.out.print("Enter an int giving the number of thousands- ");
        
        //definint input
        // int input1$ = myScanner.next();
        // int input1$ = income;
        //converting to thousands
        // int input2$ = input1$*1000;
        
        int input1$;
         if(myScanner.hasNextInt() ) {
             input1$ = myScanner.nextInt();
             int input2$ = input1$*1000;
        if(input1$ < 20 && input1$ > 0) {
            
            System.out.println("The tax rate on $" + input2$ + " is 5%, and the tax is $" + (input2$*.05));
            return;
        } 
            if (input1$ >=20 && input1$ <40) {
                
                System.out.println("The tax rate on $" + input2$ + " is 7%, and the tax is $" + (input2$*.07));
                return;
            }
            
            if(input1$ >=40 && input1$ <78) {
            System.out.println("The tax rate on $" + input2$ + " is 12%, and the tax is $" + (input2$*.12));
            return;
            }
        
            if(input1$ >=78) {
                
                System.out.println("The tax rate on $" + input2$ + " is 14%, and the tax is $" + (input2$*.14));
                return;
            }
            
            if(input1$ <= 0) {
                System.out.println("You did not enter a positive int");
                return;
        
        }
        
        else {
            System.out.println("You did not enter a positive int");
            return;
        }
        
    }
    
}
}
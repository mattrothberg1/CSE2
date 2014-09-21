/////////////////////////////////////////// 
//Matt Rothberg 
//CSE 02 
//Lab04 
//BigMacAgain.java 
//importing scanner import 

java.util.Scanner; public class BigMac2 {
    //main method
    
    public static void main(String[] args) {
        //input data
        
        //Defining Scanner
        Scanner myScanner;
        
        myScanner = new Scanner(System.in);
            //input1$ = myScanner.nextInt();
            
        //printing out 1st question
        System.out.print("Enter the number of Big Macs: ");
                
         
         if(myScanner.hasNextInt() ) {
            int input1$ = myScanner.nextInt();
            
         }
       
        else {
            System.out.println("you did not enter an int");
            return; //leaves the program, i.e.
                        //the program terminates
                        
        }
         int userinput = (myScanner.nextInt());
         if( myScanner.nextInt() ) {
             int input1$ = myScanner.nextInt();
            System.out.println("You ordered " + myScanner + " Big 
Macs for a cost of " + myScanner + "2.22 = $" + input1$);
            
         }
         
         else {
            System.out.println("You did not enter a number > 0");
            return;
            
         }
         
         
        //Printout
        //System.out.print("You ordered " + myScanner + " Big Macs 
for a cost of " + myScanner + "2.22 = $" + input1$);
        
       
        
       
            
        
        //Second question
        //System.out.print("Do you want an order of fries 
(Y/y/N/n)?");
        
        
    }
    
}

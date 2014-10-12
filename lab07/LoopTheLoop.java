/////////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//Lab07
import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String [] args){
        
        Scanner myScanner; //declaring scanner
        myScanner = new Scanner(System.in); //defining myScanner
        Boolean secondinput = true; //setting initial value to run the program 
        while(secondinput = true){ //starting loop
                System.out.println("Enter an Int between 1 and 15"); //question
        
        if (myScanner.hasNextInt()) {

                    int nStarts= myScanner.nextInt(); //setting input 
        if (nStarts > 0 && nStarts <16) { //if correct value
        int seconduse = nStarts; 
        while(nStarts>0) { //prints out ten stars
            String stars = "*"; //what to print
        System.out.print(stars);
            nStarts--; //subtract 1 from stars
        }
        
        String nStarts1 = "";
       
        while(seconduse > -1) {
            //what to print
        System.out.println(nStarts1);
            nStarts1+="*"; //subtract 1 from stars 
            seconduse--; 

            
        }
        
        }
        else{
          System.out.println("Your int was not in the range of [0.15]"); //bad input
        }
        }
        else {
            System.out.println("You did not enter an int"); //bad input
            break;
        }
        System.out.println("Do you want to run the program again? (Y.y.N.n)"); //nested loop to re-run program
            String again = myScanner.next();

           if (again.equals("Y") || again.equals("y")) { //if yes to running again
                secondinput = true;
            }
            else if(again.equals("n")|| again.equals("N")) { //ending program
               
                secondinput=false;
                break;
                
            }
    
        }
    }
}

/* this program works by taking an input, an int between 1 and 15, and using loops to output stars. it then uses if and else statements to 
ask if they want to run the program again. If they do, is goes to the start of the loop */
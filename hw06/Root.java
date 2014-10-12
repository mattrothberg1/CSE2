/////////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//hw06
//Root.java

import java.util.Scanner;
public class Root {
    public static void main(String [] args){
        
        Scanner myScanner; //declaring scanner
        myScanner = new Scanner(System.in); //defining myScanner
        System.out.println("Enter a double that is greater than 0: "); //prompt
       
        double x = myScanner.nextDouble(); //scanner to x
        if(x>0) { //checking for correct input
        double low = 0.0; //begining low value
        double high = x+1.0; //begining high value
        double middle; //declaring initial middle
        
        
        while((high-low) > (.0000001*(1+x))) { //first loop
         middle = (low+high)/2.0; //getting middle value
        if(middle*middle > x) { //if middle^2 is more than x
            high = middle; //make high equal to middle
        }
        else { //if it isn't
            low = middle; //make low equal to middle
        }
        if((high-low) > (.0000001*(1+x))){
            
        } //used to print out answer
        else {
               System.out.println(middle); //printing out answer
        }
        }
}
    else {
        System.out.println("you did not enter a double greater than zero." ); //if bad input 
    }
    }
}
/* THe program works by taking an input and taking the low of zero and the high of the input plus one, and making the high the middle value if 
it is greater than x. it uses loops to do this. It then prints out the middle value after the threshold is reached */
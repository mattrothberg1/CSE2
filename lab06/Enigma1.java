/* The user is supposed to enter a number between 0 and 99.
* The program interprets that as a percentage, converts it to 
* a prorportion and then displays the proportion (out of 1)
* remaining. It does not always work. Find out when it doesn't 
*/
import java.util.Scanner; 

public class Enigma1{

public static void main(String []arg){

double percent;

System.out.print("Enter a value for the percent (0, 1,...99)- "); 

double x=((new Scanner(System.in)).nextDouble()); //scanner
double remaining = (1-x/100); //will convert to decimal
double remaning1 = (remaining*100)/100; //remove decimal places

System.out.println("You entered "+x+"%"); //input in percent

//print out the proportion remaining for select percentages 

System.out.println("The proportion remaining is " + remaning1); //answer works with everythign


}
}
/* Error report:
* * * * * * * * 
(Exlain the error(s) that occur here, in this comment, and fix the errors)
* inserted brackets after the begining and ending of each if and else if statement b/t lines 22 to 38
Hint: What kinds of input are unacceptable? What kinds of
acceptable input don't produce the correct answer?
*replaced code to allow any input
*old input would only allow certain numbers entered becuase of the use of if and if else statements
*/
////////////////////////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//HW 08
//HW8.java


import java.util.Scanner; //import scanner 
public class HW8{ //opening class 
    
    public static void main(String []arg){ //main method
        char input; //declaring input name 
Scanner scan=new Scanner(System.in); //declaring scan 
System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //output
input=getInput(scan,"Cc");
System.out.println("You entered '"+input+"'"); 

System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); 
input=getInput(scan,"yYnN",5); //give up after 5 attempts
if(input!=' '){
    
System.out.println("You entered '"+input+"'");
}

input=getInput(scan,"Choose a digit.","0123456789"); 
System.out.println("You entered '"+input+"'"); 
 

}
public static char getInput(Scanner scan, String input)  { //first getInput  method 
        String scan1 = scan.next(); //declaring and defining scan1
        
while(scan1.length()>1){ //if too many characters entered
    System.out.print("You should enter exactly one character: "); //print out
     scan1 = scan.next(); //redo program
}
while(scan1.charAt(0)!=input.charAt(0)&&scan1.charAt(0)!=input.charAt(1)){  //if bad input
    System.out.print("Try again - "); //print out
    scan1 = scan.next(); //redo program
}
  	  	char result = scan1.charAt(0); //declare and define result
  	  
  	
		return result; //set return value
    
    
}  

public static char getInput(Scanner scan, String input, int x){ //second getInput
           String scan1 = scan.next(); //scan 1 declaration
            int counter = 0; //count up to five
        
while(scan1.length()>1){ //checking input length 
    if(counter==x){ //if too long, stop program
        return(' '); //return nothing
        
    }
    counter++; //add to counter
    System.out.print("You should enter exactly one character: "); //too many characters
     scan1 = scan.next(); //redo program
    
}
while(scan1.charAt(0)!=input.charAt(0)&&scan1.charAt(0)!=input.charAt(1)&&scan1.charAt(0)!=input.charAt(2)&&scan1.charAt(0)!=input.charAt(3)){ //while too many characteres
        if(counter==x){ //if counter reaches max
        return(' '); //stop program
        
    }
    counter++; //increase counter
    System.out.print("Try again - "); //try again if bad input
    scan1 = scan.next(); //redo program
    
}
  	  	char result = scan1.charAt(0); //set result
  	  
  	
		return result; //set return value
    
   
}

 public static char getInput(Scanner scan, String digit, String numbers){
   
    
    System.out.println("Enter one of " + numbers.charAt(0) + ", " + numbers.charAt(1) + ", " + numbers.charAt(2) + ", " + numbers.charAt(3) + ", " + numbers.charAt(4) + ", " + numbers.charAt(5) + ", " + numbers.charAt(6) + ", " +numbers.charAt(7) + ", " +numbers.charAt(8) + ", " +numbers.charAt(9) + "- "); //print out question 
     String scan1 = scan.next(); //set input as scan 1
    while(scan1.charAt(0)!=numbers.charAt(0)&&scan1.charAt(0)!=numbers.charAt(1)&& scan1.charAt(0)!=numbers.charAt(2)&&scan1.charAt(0)!=numbers.charAt(3)&&scan1.charAt(0)!=numbers.charAt(4)&&scan1.charAt(0)!=numbers.charAt(5)&& scan1.charAt(0)!=numbers.charAt(6)&&scan1.charAt(0)!=numbers.charAt(7)&&scan1.charAt(0)!=numbers.charAt(8)&&scan1.charAt(0)!=numbers.charAt(9)|| scan1.length()>1){
    while(scan1.length()>1){ //if to many characters entered
    System.out.println("You should enter exactly one character: ");  //print out 
    System.out.println("Enter one of " + numbers.charAt(0) + ", " + numbers.charAt(1) + ", " + numbers.charAt(2) + ", " + numbers.charAt(3) + ", " + numbers.charAt(4) + ", " + numbers.charAt(5) + ", " + numbers.charAt(6) + ", " +numbers.charAt(7) + ", " +numbers.charAt(8) + ", " +numbers.charAt(9) + "- "); //restart program
     scan1 = scan.next(); //input
}
while(scan1.charAt(0)!=numbers.charAt(0)&&scan1.charAt(0)!=numbers.charAt(1)&& scan1.charAt(0)!=numbers.charAt(2)&&scan1.charAt(0)!=numbers.charAt(3)&&scan1.charAt(0)!=numbers.charAt(4)&&scan1.charAt(0)!=numbers.charAt(5)&& scan1.charAt(0)!=numbers.charAt(6)&&scan1.charAt(0)!=numbers.charAt(7)&&scan1.charAt(0)!=numbers.charAt(8)&&scan1.charAt(0)!=numbers.charAt(9) && scan1.length()==1){
    System.out.println("You did not enter an acceptable character, try again - "); //too many charcters print out
    System.out.println("Enter one of " + numbers.charAt(0) + ", " + numbers.charAt(1) + ", " + numbers.charAt(2) + ", " + numbers.charAt(3) + ", " + numbers.charAt(4) + ", " + numbers.charAt(5) + ", " + numbers.charAt(6) + ", " +numbers.charAt(7) + ", " +numbers.charAt(8) + ", " +numbers.charAt(9) + "- "); //redo question
    scan1 = scan.next(); //redo program
}

  	  
  	  
    }
    	char result = scan1.charAt(0); //set result value
		return result; //set return value
    
    
    
    
    
} 

}
	
////////////////////////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//HW 09
//BlockedAgain.java

import java.util.Scanner;//import scanner
public class BlockedAgain{
     public static void main(String []s){
          int m;
          //force user to enter int in range 1-9, inclusive.
          m = getInt();
     
          allBlocks(m);
} 

    public static int getInt(){ //first method
        System.out.print("Enter an int between 1 and 9:"); //statement asking for input 
       Scanner scan=new Scanner(System.in); //declaring scan
     int result = checkint(scan); //calling upon checkint method
     int result1 = checkRange(result); //calling upon checkRange method
      return result1; //returning value
    }
    
    
    public static int checkint(Scanner scan){ //second method 
       
       int result = 0; //declaring variable
        
        while(!scan.hasNextInt()){
            System.out.print("YOu did not enter an int, try again: ");
            scan.next();
        }
       result = scan.nextInt();
       return result;
    }

    public static int checkRange(int input){ //third method
        int result = 0; //declaring variable

        
        if(input >0 && input < 10){ //if input is in range
            result = input; //set input equal to return if in range
            return result; //return value
        }
        else{ //if it isn't in range
            System.out.println("You did not anter an int within the acceptable range, try again:"); //print out if bad entry
            result = getInt(); //calling upon method getInt
            return result; //returning varibale
        }
        
    }    
    
    
    public static void allBlocks(int input){ //method if all inputs are good
			
		block(input);	
		 

	

			  
    }
    
    public static void block(int input){
       for(int j=1;j<input+1;j++){ //outside for loop
	    for(int k=0;k<j; k++){ //second for loop
	    			    for( int u=input; u>j; u--) { //printing out spacing
		    	System.out.print(" ");
		    }
	    	for(int h=0; h<j-1; h++) { //for loop for the number output
		System.out.print(j + "" + j);

}
		    

	    System.out.println(j); //printing out basic output
	    }
	    		    for( int u=input; u>j; u--) { //for loop for spacing
		    	System.out.print(" "); //spacing
		    	
		    }
		    
        line(j);
    }
    }
    public static void line(int j){
        	for(int k=0; k<j-1; k++) { //for loop for dashes
		System.out.print("--");
	}
	System.out.println("-"); //dashes
	    
    } 
        
    
    
    
}

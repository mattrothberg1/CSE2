/////////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//hw06
//NumberStacks.java

import java.util.Scanner;
public class NumberStack1 {
    public static void main(String [] args){
        
        Scanner myScanner; //declaring scanner
        myScanner = new Scanner(System.in); //defining myScanner
        System.out.print("Enter an int between 1 and 9, inclusive: "); //prompt
        
                
        int input = myScanner.nextInt(); //declare and initialize scanner

			if(input>0 && input<10) { //checking if int is in the correct range

		System.out.println("Program 1, using for Statements: ");
		System.out.println("");
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
	for(int k=0; k<j-1; k++) { //for loop for dashes
		System.out.print("--");
	}
	System.out.println("-"); //dashes
	    
    }    
    System.out.println("Program 2, using While Statements: "); //starting second program
    System.out.println("");

      
      int j=1; //declaring and initializing 
     while(j<input+1){ //outside while statement
     int	k=0; //declaring and initializing
     	while(k<j){ //if k<j
     		int u=input; //declaring u equal to the number entered 
     		while(u>j){ //checking if input is greater than j
     			System.out.print(" "); //spacing
     			u--;
     		}
		int h=0; //declaring and initializing
			while(h<j-1){ //while loop for printout
				System.out.print(j + "" + j); //number printout
				h++; //increase by 1 increment 
			}
			System.out.println(j); //printout number
     		k++; //increase by 1 increment
     		
     	}
     	int u=input; //repeat declaration
     	while(u>j){
     			System.out.print(" "); //spacing
     			u--; //decrease by 1 increment
     		}
     		k=0; //setting equal to zero
     		while(k<j-1){ //while loop for dashes
     			System.out.print("--"); //dashes
     			k++; //increase by increment by 1 
     		}
     		System.out.println("-"); //dashes
     		
     	j++; //increase by increment by 1
     } 
  
    System.out.println("Program 3, using Do-While Statements: ");
    System.out.println(""); 
      
            j=1; //setting equal to 1
            do{int	k=0; //outside do statement
            do{int u=input; //setting input from zero to input
     		while(u>j){
     			System.out.print(" "); //spacing
     			u--; //decreasing by increment of 1
     		}
		int h=0; //declaring and initializng 
			while(h<j-1){
				System.out.print(j + "" + j); //printout
				h++;
			}
			System.out.println(j); //printout
     		k++; }while(k<j);
     		
     		
     	
     	int u=input; //setting u equal to the int entered
     	do{System.out.print(" "); //spacing
     			u--;}
     	while(u>j); 
     			
     		
     		 k=0; //setting k equal to zero 
     		do{
     			System.out.print("-"); //dashes 
     			k++;} //increase by increment of 1
     		while(k<=2*j-2); //used for dashes
     			
     		
     		System.out.println(); //fix lining
     		
     		
     	j++;}//increase increment by 1 
     	while(j<input+1); //end loop
     
     
      
      
			}
			else{
				System.out.println("You did not enter an Int between 1 and 9"); //if int is not in the range 
			
			}
    }
        
    }
    
//end program
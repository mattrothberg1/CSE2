////////////////////////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//Lab 09
//Methods.java


import java.util.Scanner;
public class Methods{
	

	
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
  
  	public static int getInt(Scanner scan){ //first method to set values 
  
  	
  	
  		System.out.println("Enter an int- "); //prompting for an int 
							int result=0;  	//initialize and declare
							scan = new Scanner(System.in); //declare scanner
  	  		if(scan.hasNextInt()){ //checking if int was entered
  	
  		
  
  		int myScanner = scan.nextInt(); //setting myscanner = input

  		 result = myScanner; //return scanner
  		} 
  		else{
  			System.out.println("You did not enter a valid int, try again - "); //incorrect int entered 
  			
  			result = getInt(scan); //redo program and set result 
  		}
  	
		return result; //set return value
  	
	}
	public static int larger(int num1, int num2){ //method to check which numbers are larger
		int result=0; //initalize and declare
		if(num1 > num2){ //checking if first entered is greater than second 
			result = num1; //setting result 
		}
		else{
			result = num2; //if second is larger
		}
		return result; //setting return value 
	}
	
	public static boolean ascending(int a, int b, int c){ //checking for ascending order
boolean result; //declare boolean 
if(a<b && b<c){ //if it is in ascending order
	 result = true; //return boolean value
}
	else{
		 result = false;  //if it is not in ascending order
	}
	
	
	return result; //return result
		
	}
  
  
}
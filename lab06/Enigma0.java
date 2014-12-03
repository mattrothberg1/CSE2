/*Sample of expected output: 
* Enter an int- 9
* You entered 9
* sum is 25
* Again,you entered 9 */
import java.util.Scanner; 

public class Enigma0{

public static void main(String arg []){
    
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in); 
int n= scan.nextInt();
    if(n == (int)n ){
         
   
System.out.println("You entered "+n); }
else{

 n=4; 
System.out.println("You entered "+n);

    
}

int k=4,p=6,q=7,r=8; //take away "n" becuase it is already initilized 

switch(k+p+q+r){

case 24:
    System.out.println("sum is 24");
    break;
case 25: 
    System.out.println("sum is 25"); 
    break;
    


} //switch end

System.out.println("To repeat, you entered "+ n); 
    
} 
    
}
/* Error report:
* Expandthiscomment:
* took away n on line 23 becuase it is already initilized
*changed if statement to check if n is an int
*moved line 37 ("System.out.println("To repeat, you entered "+ n);") to after the end of the switch statement
*defined n before the if statement
*removed "int" on line 21 becuase it is already initilized
* Explaintheerror(s)thatoccurredhere,andthenfixthem */

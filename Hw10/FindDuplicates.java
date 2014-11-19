///Matt Rothberg
///CSE 02
///HW10
//FindDuplicates.java
/*this program works by taking a certain int input and placing the values in the array
it then compares the values to see if there are any duplicates. If there are duplicates 
adds to a certain counter. For any duplicates, the counter just needs to be greater
than zero. For exactly one dup, it needs to be equal to 2 to be true. The reason it's
two and not 1 is becuase something such as x==y will also produce y==x, therefore 
the result would be overstated. */

import java.util.Scanner;
public class FindDuplicates{
        public static void main(String[] arg){
            Scanner scan = new Scanner(System.in); //scanner
            int num[] = new int[10]; //creating array
            String answer=""; //used later
            do{
                System.out.print("Enter 10 ints- "); //question output
                for(int j=0; j<10; j++){ //for loop to set array variables
                    
                num[j]=scan.nextInt(); //inputing into array
            }
            
          String out = "The array "; //declaring out
          out+=listArray(num); //return a string of the form ""{2, 3, -9}"
          if(hasDups(num)){
                out+="has "; } 
                else{
                out+="does not have ";
                }
                out+="duplicates."; 
                System.out.println(out); 
                
                out="The array "; 
                
                out+=listArray(num); 
                
                if(exactlyOneDup(num)){
                    
                out+="has "; 
                    
                }
                else{
                out+="does not have ";
                }
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
            }while(answer.equals("Y") || answer.equals("y")); 
        }
        
        public static String listArray(int num[]){
            String out = "{"; 
            for(int j=0; j<num.length; j++){
                if(j>0){
                    out+=", ";
                }
                out+=num[j];
            }
            out+="} ";
            return out;
        }
        
        public static boolean hasDups(int num[]){
            int checker = 0; //used to check for repeats
            for(int x = 0; x<num.length; x++){ //outside for loop
                for(int i = 0; i<num.length; i++){ //inside for loop for numbers
                   if(x==i){ //prevent duplicates 
                       continue;
                   }
                   else{ 
                    if(num[x] == num[i]){ //if numbers are equal
                        checker++;  //add to repeat counter
                    }
                   }
                }
            }
            if(checker>0){
                return true; //return true if there's a duplicate
            }
            else{
                return false; //if no duplicates return false 
            }
            
        }
        public static boolean exactlyOneDup(int num[]){ //method
                        int checker = 0; //duplicate checker
            for(int x = 0; x<num.length; x++){
                for(int i = 0; i<num.length; i++){
                    if(x==i){
                        continue;
                    }
                    else{
                    if(num[x] == num[i]){
                        checker++; //add to counter
                      
                    }
                    } 
                }
            }
            if(checker==2){ //if there's only one duplicate
                return true;
            }
            else{
                
                return false; //if there is more than or less than one duplicate
            }
            
        } 
        
} //close program


      
////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//HW05
//BurgerKing.java


//import scanner
import java.util.Scanner; 

//public class
public class BurgerKing {
    
    //main method
    public static void main(String[] args) {
        //scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //First message
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("   Burger (B or b)");
        System.out.println("   Soda (S or s)");
        System.out.println("   Fries (F or f)");
        
        String input1 = myScanner.next(); //defining input
        String input2; //declaring second input
        if(input1.length()>1) { //if wrong input
            System.out.println("a single character expexted");
            
        }
        
        //start program
        else {
            
            switch(input1) {
                
                
                case "B": //burger
                    System.out.println("Enter A or a for all fixins");
                    System.out.println("C or c for cheese");
                    System.out.println("N or n for none of the above");
                    
                    
                    input2 = myScanner.next();
                    
                    switch(input2) {
                        
                        case "A": //all fixins
                        System.out.println("You ordered a burger with all fixins.");
                        break;
                    
                        case "a"://all fixins
                          System.out.println("You ordered a burger with all fixins.");
                            break; 
                            
                        case "C": //cheese
                            System.out.println("You ordered a burger with cheese.");
                            break;
                        
                         case "c": //cheese
                            System.out.println("You ordered a burger with cheese.");
                            break;
                            
                        case "N": //none of the aboce
                            System.out.println("you ordered a burger with none of the above");
                            break;
                        case "n": //none of the aboce
                            System.out.println("you ordered a burger with none of the above");
                            break;    
                        } 
                        //B break
                        break;
                        
                        
                     case "b":
                    System.out.println("Enter A or a for all fixins");
                    System.out.println("C or c for cheese");
                    System.out.println("N or n for none of the above");
                    
                   //String input2;
                    input2 = myScanner.next();
                    
                    switch(input2) {
                        
                        case "A":
                        System.out.println("You ordered a burger with all fixins.");
                        break;
                    
                        case "a":
                          System.out.println("You ordered a burger with all fixins.");
                            break; 
                            
                        case "C":
                            System.out.println("You ordered a burger with cheese.");
                            break;
                        
                         case "c":
                            System.out.println("You ordered a burger with cheese.");
                            break;
                            
                        case "N":
                            System.out.println("you ordered a burger with none of the above");
                            break;
                            
                        case "n": //none of the aboce
                            System.out.println("you ordered a burger with none of the above");
                            break;    
                        }     
                    //b break
                    break;
                    
                    
                    case "S"://soda
                        
                        System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)?");
                        
                        //String input2;
                        input2 = myScanner.next();
                        
                        switch(input2){
                            
                            case "p":
                                System.out.println("You ordered a Pepsi");//pepsi
                                break;
                                
                             case "P": //pepsi
                                System.out.println("You ordered a Pepsi");
                                break;  
                            
                            case "C"://coke
                                System.out.println("You ordered a coke");
                                break;
                              
                            case "c"://coke
                                System.out.println("You ordered a coke");
                                break;  
                                
                            case "s"://sprite
                                System.out.println("You ordered a sprite");
                                break;
                                
                            case "S"://sprite
                                System.out.println("You ordered a sprite");
                                break;   
                                
                            case "m"://mountain dew
                                System.out.println("You ordered a Mountain Dew");
                                break;
                                
                            case "M"://mountain dew
                                System.out.println("You ordered a Mountain Dew");
                                break;   
                                
                        }
                        
                        //S break
                        break;
                        
                    case "s"://soda
                        //message
                        System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)?");
                        
                        //String input2;
                        input2 = myScanner.next();
                        
                        switch(input2){
                            
                            case "p"://pepsi
                                System.out.println("You ordered a Pepsi");
                                break;
                                
                             case "P"://pepsi
                                System.out.println("You ordered a Pepsi");
                                break;  
                            
                            case "C"://coke
                                System.out.println("You ordered a coke");
                                break;
                              
                            case "c"://coke
                                System.out.println("You ordered a coke");
                                break;  
                                
                            case "s"://soda
                                System.out.println("You ordered a sprite");
                                break;
                                
                            case "S"://soda
                                System.out.println("You ordered a sprite");
                                break;   
                                
                            case "m"://mountain dew
                                System.out.println("You ordered a Mountain Dew");
                                break;
                                
                            case "M"://mountain dew
                                System.out.println("You ordered a Mountain Dew");
                                break;   
                                
                        }
                        
                        //s break
                        break;                           
                   
                   case "F"://fries
                       //message
                       System.out.println("Do you want a large or small order of fries (l, L, s, S) - ");
                       
                       //String input2;
                       input2 = myScanner.next();
                       
                       switch(input2) {
                           
                           case "l"://large
                               System.out.println("You ordered a large order of fries");
                               break;
                            case "L"://large
                               System.out.println("You ordered a large order of fries");
                               break;   
                               
                            case "s"://small
                                System.out.println("You ordered a small order of fries");
                                break;
                            case "S"://small
                                System.out.println("You ordered a small order of fries");
                                break;  
                        
                       }
                       //F break
                       break;
                    
                    case "f"://fries
                       
                       System.out.println("Do you want a large or small order of fries (l, L, s, S) - ");
                       
                      // String input2;
                       input2 = myScanner.next();
                       
                       switch(input2) {
                           
                           case "l"://large
                               System.out.println("You ordered a large order of fries");
                               break;
                            case "L"://large
                               System.out.println("You ordered a large order of fries");
                               break;   
                               
                            case "s"://small
                                System.out.println("You ordered a small order of fries");
                                break;
                            case "S"://small
                                System.out.println("You ordered a small order of fries");
                                break;  
                        
                       }
                       //f break
                       break;   
            
            default: {   //wrong character
                System.out.println("You did not enter any of B, b, S, s, F, or f");
                break;
                
            }   
            }
            
           
            
        }
        
        
        
    }
}
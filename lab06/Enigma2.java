import java.util.Scanner;

public class Enigma2{

    public static void main(String [] arg){ 
    
    int n=40, k=60;
    String out="";
    switch(n){
    case 12:
    case 13: 
        out+=13; 
    case 40: 
        out+=40; //can't divide by zero
    }
    
    System.out.println(out); }
    }
    /*
    * Error Report: Explain how you can use the java.lang exception to identify the runtime error in the above code
    * You can't divide by zero, answer is undefined. fixed 
    * java.lang is automatically imported into java and becuase of that, allows mathamatical expressions
    *
    *
    *
    * 
    */
    

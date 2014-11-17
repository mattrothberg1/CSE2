////////////////////////////////////////////////////////////////////////
//Matt Rothberg
//CSE 02
//Lab 10
//arrays.java


import java.util.Scanner;
public class arrays{
    	
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
	int[] array1 = new int[10]; //allocates memory for 10 ints
System.out.print("Enter 10 ints- ");
    for(int x=0; x<10; x++){
        array1[x] = scan.nextInt();
    }
    
    int min = array1[0];
    for(int i=1; i<array1.length; i++){
        if(array1[i] < min){
            min = array1[i];
        }
    }
    System.out.println("The lowest entry is " + min);
    
    
    int max = array1[0];
    for(int b=1; b<array1.length; b++){
        if(array1[b] > max){
            max = array1[b];
        }
    }
    System.out.println("The highest entry is " + max);
    
    
    int sumCount = 0;
    for(int x = 0; x<array1.length; x++){
        sumCount += array1[x];
    }
    System.out.println("The sum is " + sumCount);
    
    
    int[] array2 = new int[array1.length];
  
    
    
    
    int d = 9;
    int e = 0;
    while( d >= 0){
        array2[e] = array1[d];
        d--;
        e++;
    }
    
    for(int x = 0; x<10; x++){
        System.out.println(array1[x] + " " + array2[x]);
    }
    
    
}
}
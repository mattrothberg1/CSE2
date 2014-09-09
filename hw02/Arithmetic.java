////////////////////////////////////////////////////
//Matt Rothberg
//Arithmetic Java Program
//
// First compile the program
//      javac Arithmetic.java
//  Run the Program
//      java Arithmetic

// define a class
public class Arithmetic{
    
// add main method
    public static void main(String[] args) {
        
    // Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //('$' is part of the variable name)
    double sockCost$=2.29;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;
    
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
    //total cost of socks
    double totalSockCost$=6.87;
    
    //total cost of drinking glasses
    double totalglassCost$=13.74;
    
    //total cost of boxes of envelopes
    double totalenvelopeCost$=3.25;
    
    //converting to interger forms
    int isockCost$ = (int)sockCost$;
    int i2sockCost$ = ((isockCost$ * 100) / 100);
    int itotalsockcost$ = (int)totalSockCost$;
    int i2totalsockcost$ = ((itotalsockcost$ * 100) / 100);
    
    
    int iglasscost$ = (int)glassCost$;
    int i2glasscost$ = ((iglasscost$* 100) / 100);
    int itotalglasscost$ = (int)totalglassCost$;
    int i2totalglasscost$ = ((itotalglasscost$ * 100) / 100);
    
    int ienvelopecost$ = (int)envelopeCost$;
    int i2envelopecost$ = ((ienvelopecost$ * 100) / 100);
    int itotalenvelopecost$ = (int)totalenvelopeCost$;
    int i2totalenvelopecost$ = ((itotalenvelopecost$ * 100) / 100);
    
 
    //print out total cost of socks
    System.out.println();
    System.out.println("Socks");
    System.out.println("3 Pairs");
    System.out.println("Cost per pair" + "= $" + sockCost$);
    System.out.println("Sales tax per pair" + "= $" + i2sockCost$*.06);
    System.out.println("total cost of purchases before tax" + "= $" + totalSockCost$);
    System.out.println("total sales tax" + "= $" + i2totalsockcost$*.06);
    System.out.println("total cost of purchases including tax = $" + ((i2totalsockcost$*.06)+i2totalsockcost$));
    
    //print out total cost of glasses
    System.out.println();
    System.out.println("Glasses");
    System.out.println("6 Glasses");
    System.out.println("Cost per Glass" + "= $" + iglasscost$);
    System.out.println("Sales tax per Glass" + "= $" + i2glasscost$*.06);
    System.out.println("total cost of purchases before tax" + "= $" + totalglassCost$);
    System.out.println("total sales tax" + "= $" + i2totalglasscost$*.06);
    System.out.println("total cost of purchases including tax" + "= $" + (i2totalglasscost$ * taxPercent + i2totalglasscost$));
    
    //print out total envelope cost
    System.out.println();
    System.out.println("Boxes of Envelopes");
    System.out.println("1 Box");
    System.out.println("Cost per box" + "= $" + envelopeCost$);
    System.out.println("Sales tax per box" + "= $" + i2envelopecost$*.06);
    System.out.println("total cost of purchases before tax" + "= $" + totalenvelopeCost$);
    System.out.println("total sales tax" + "= $" +i2totalenvelopecost$*.06);
    System.out.println("total cost of purchases including tax" + "= $" + (i2totalenvelopecost$ * taxPercent +i2envelopecost$));
    
    //Total costs
    System.out.println();
    System.out.println("Totals");
    System.out.println("total cost of purchases" + "= $" + totalenvelopeCost$ + totalglassCost$ + totalSockCost$);
    System.out.println("total sales tax" + "= $" + ((i2totalenvelopecost$ + i2totalglasscost$ + i2totalsockcost$) *.06));
    System.out.println("total cost of the purchases including sales tax" + "= $" + (((i2totalenvelopecost$ + i2totalglasscost$ + i2totalsockcost$))*.06 + (i2totalenvelopecost$ + i2totalglasscost$ + i2totalsockcost$)));
    
    
    }
}
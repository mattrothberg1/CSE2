public class repeathw01 {
    
    public static void  main(String[] args) {
        
        //Number of pairs of socks
          
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name) 
double sockCost$=2.58;
//Number of drinking glasses 
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;
//Number of boxes of envelopes 
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25; 
double taxPercent=0.06;
double TotalBeforeTax1 = (((nSocks*sockCost$) + (nGlasses*glassCost$) + (nEnvelopes*envelopeCost$)));
int TotalBeforeTax = (int)TotalBeforeTax1;
double totaltax= (TotalBeforeTax*taxPercent);


System.out.println("total cost of socks: $" + (nSocks * sockCost$));
System.out.println("Total cost of glasses: $" + (nGlasses * glassCost$));
System.out.println("Total cost of envelopes: $" + (nEnvelopes * envelopeCost$));
System.out.println("Total tax cost: $" + totaltax);

  
    }
}
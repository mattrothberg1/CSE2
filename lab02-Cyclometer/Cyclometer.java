// Matt Rothberg, 09/05/2014, CSE 02, Cyclometer is used to record time elapsed & number of rations
// Print number of minutes, number of counts, distance of one trip, distance of both trips
//define a class

public class Cyclometer {
// main method required for every Java program public static void main(String[] args) {
 //endofmainmethod } //end of class
    
    public static void main(String[] args) {
        // our input data. Document your variables by placing your
        // comments after the “//”. State the purpose of each variable.
        int secsTrip1=480; //Time length of trip one
        int secsTrip2=3220;  //Time length of trip two
        int countsTrip1=1561; //Number of roatations of trip one
        int countsTrip2=9037; //Numebr of roatations of trip two
        
        // our intermediate variables and output data. Document!
        double wheelDiameter=27.0; //Diameter of the wheel
        double PI=3.14159; //Value of Pi
        int feetPerMile=5280; //Number of feet per mile
        int inchesPerFoot=12; //Number of inches per food
        int secondsPerMinute=60; //number of seconds per minute
        double distanceTrip1,distanceTrip2,totalDistance; //Back and forth for each distance
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts."); System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        
        //run the calculations; store the values. Document your //calculation here. What are you calculating?
        //
        //
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI) 
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out the output data. System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); System.out.println("The total distance was "+totalDistance+" miles");
    
        }
}
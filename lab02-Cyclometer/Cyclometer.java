//  Katherine Porfirio
//  CSE 002 Section 110
//  09/05/2014

//  define a class
public class Cyclometer {
    
    //  main method required for every Java program
    public static void main(String[] args) {
        
        //  the input data:
        int secsTrip1=480;      //  number of seconds for Trip 1
        int secsTrip2=3220;     //  number of seconds for Trip 2
        int countsTrip1=1561;   //  number of counts for Trip 1
        int countsTrip2=9037;   //  number of counts for Trip 2
        
        //  the intermediate variables and output data
        double wheelDiameter=27.0;      //  diameter of the wheel, in inches
        double PI=3.14159;              //  define pi
        double feetPerMile=5280;        //  the number of feet in one mile
        double inchesPerFoot=12;        //  the number of inches in one foot
        double secondsPerMinute=60;     //  the number of seconds in one minute
        double distanceTrip1;           //  distanceTrip1 is a variable
        double distanceTrip2;           //  distanceTrip2 is a variable
        double totalDistance;           //  totalDistance is a variable   
        
        //  print the numbers
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+(countsTrip1)+" counts.");   
            //  print the number of minutes for Trip 1
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+(countsTrip2)+" counts.");
            //  print the number of minutes for Trip 2
        
        //  run the calculations; store the values
        distanceTrip1=countsTrip1*wheelDiameter*PI;     //  calculates the distance of Trip 1, in inches
            //  for each count, a rotation of the wheel travels the diameter in inches times pi
        distanceTrip1/=inchesPerFoot*feetPerMile;       //  calculates the distance of Trip 1, in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;   //  calculates the distance of Trip 2, in miles
        totalDistance=distanceTrip1+distanceTrip2;       //  calculates the total distance
        
        //  print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");   //  prints the distance of Trip 1, in miles
        System.out.println("Trip 2 was "+distanceTrip2+" miles");   //  prints the distance of Trip 2, in miles
        System.out.println("The total distance was "+totalDistance+" miles");   //  prints the total distance
        
        
    }   //  end of main method
}   // end of class
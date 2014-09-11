//  Katherine Porfirio
//  CSE 002 Section 110
//  09/11/2014

//  Bicycle program

//  scanner is in the java.util package
import java.util.Scanner;

//  define a class
public class Bicycle {
    
    //  main method
    public static void main(String[] args) {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to enter the number of counts
        System.out.print("Enter the number of counts on the cyclometer: ");
        double numberOfCounts = input.nextDouble();
        
        //  prompt the user to enter the number of seconds
        System.out.print("Enter the number of seconds for the trip: ");
        double numberOfSeconds = input.nextDouble();
        
        //  numbers needed for calculations:
            
            //  diameter of the wheel, in inches
            double wheelDiameterInches = 27;
            
            //  pi
            double pi = 3.141592654;
            
            //  number of feet in one mile
            double feetPerMile = 5280;
            
            //  number of inches in one foot
            double inchesPerFoot = 12;
            
            //  number of seconds in one minute
            double secondsPerMinute = 60;
            
            //  number of minutes in one hour
            double minutesPerHour = 60;
        
        //  calculations
        
            //  calculate the distance traveled
            
                //  first convert units, to get wheel diameter in miles
                double wheelDiameterFeet = wheelDiameterInches / inchesPerFoot;
                double wheelDiameterMiles = wheelDiameterFeet / feetPerMile;
                
                //  calculate distance, in miles
                double distance = numberOfCounts * wheelDiameterMiles * pi;
        
            //  calculate the number of minutes
            double minutes = numberOfSeconds / secondsPerMinute;
        
            //  calculate the number of hours
            double hours = minutes / minutesPerHour;
        
            //  calculate the speed in miles per hour
            double speed = distance / hours;
        
        //  reduce the number of decimal places of the calculations
        
            //  distance
            distance = distance * 100;
            distance = (int) distance;
            distance = (double) distance;
            distance = distance / 100;
            
            //  minutes
            minutes = minutes * 100;
            minutes = (int) minutes;
            minutes = (double) minutes;
            minutes = minutes / 100;
            
            //  speed
            speed = speed * 100;
            speed = (int) speed;
            speed = (double) speed;
            speed = speed / 100;
            
        //  print statements
        
            //  empty space
            System.out.println("");
            
            //  distance traveled
            System.out.println("The distance traveled was " +distance+ " miles");
            
            //  minutes
            System.out.println("The trip lasted " +minutes+ " minutes");
            
            //  miles per hour
            System.out.println("The average speed was " +speed+ " miles per hour");
        
    }
}
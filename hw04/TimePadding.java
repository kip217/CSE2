//  Katherine Porfirio
//  CSE 002 Section 110
//  09/22/2014

//  Homework #4
//  program asks the user for the time (in seconds)
//  program makes sure the input is a positive integer that does not exceed the amount of seconds in a day
//  program prints the time (24-hour time)

//  import scanner
import java.util.Scanner;

//  define a class
public class TimePadding    {
    
    //  main method
    public static void main(String[] args)  {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to enter the time, accept user input
        System.out.print("Enter the time, in seconds: ");
        int seconds = input.nextInt();
        
        //  if the input is an integer
        if (input.hasNextInt()) {
            
            //  if the integer is positive and does not exceed the number of seconds in a day
            if (seconds >= 0 && seconds <= 86400)    {

            //  get the hour
            int hours = seconds / 3600;
            
            //  get the minutes
            int minutes = ((seconds - (hours * 3600)) / 60);
            
            //  get the seconds
            int secondsLeft = (seconds - (hours * 3600) - (minutes * 60));
            
            //  print the time
            System.out.println("The 24-hour time is " +hours+ ":" +minutes+ ":" +secondsLeft+ "");
                
            }   //  end of if statement if the integer is positive and does not exceed the number of seconds in a day
            
            else    {
                //  print error statement
                System.out.println("Error: You must enter an integer within the range [0, 86,400]");
                //  terminate program
                return;
            }   //  end of else statement for negative integers and/or integers that exceed the number of seconds in a day
            
        }   //  end of if statement if input is an integer
        
        else    {
            //  print error statement
            System.out.println("Error: You must enter an integer");
            //  terminate program
            return;
        }   //  end of else statement if input is not an integer
        
    }   //  end of main method
    
}   //  end of class
//  Katherine Porfirio
//  CSE 002 Section 110
//  09/27/2014

//  Homework #6
//  program asks the user to input a number, and will only accept positive numbers
//  program calculates the square root of that input

//  import scanner
import java.util.Scanner;

//  define a class
public class Root   {
    
    //  main method
    public static void main(String[] args)  {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to enter a number
        System.out.println("Square Root Calculator!");
        System.out.println("");
        System.out.print("Please enter a positive number: ");
        
        //  if the input is a number
        if (input.hasNextDouble())  {
            
            //  accept user input
            double number = input.nextDouble();
            
            //  declare and initialize variables high and low
            double low = 0;
            double high = number + 1;
            double difference = high - low;
            double endLoop = .0000001 * (number + 1);
            double middle = 0;
            double middleSquared = 0;
            double squareRoot = 0;
            double tolerance = 0;
            
            // if the input is positive
            if (number > 0) {
                
                //  while statement for getting the square root
                while (difference > endLoop)    {
                    
                    //  get the middle of high and low
                    middle = (high + low) / 2;
                    
                    //  get the square of the middle
                    middleSquared = middle * middle;
                    
                    //  if the square of the middle is greater than the number
                    if (middleSquared > number) {
                        //  change high to middle
                        high = middle;
                    }   //  end of if statement if the square of the middle is greater than the number
                    
                    //  if the square of the middle is not greater than the number
                    else    {
                        //  change low to middle
                        low = middle;
                    }   //  end of else statement if the square of the middle is not greater than the number

                    difference = high - low;
                    
                }   //  end of while statement for getting the square root
            
            //  tolerance  
            tolerance = (high - low) / 2;
            
            //  approximate square root
            squareRoot = low + tolerance;
            
            //  print the approximate square root
            System.out.println("");
            System.out.println("The square root of " +number+ " is " +squareRoot+ ", plus or minus " +tolerance);
                
            }   //  end of if statement if the input is positive
            
            //  if the input is not a positive number
            else    {
                //  print error statement
                System.out.println("");
                System.out.println("Error: You must enter a positive number");
                //  terminate program
                return;
            }   //  end of else statement if the input is not a positive number
            
        }   //  end of if statement if the input is a number
        
        //  if the input is not a number
        else    {
            //  print error statement
            System.out.println("");
            System.out.println("This is a square root calculator!");
            System.out.println("You must enter a positive number");
            //  terminate program
            return;
        }   //  end of else statement if the input is not a number
        
    }   //  end of main method
    
}   //  end of class
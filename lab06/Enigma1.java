//  Katherine Porfirio
//  CSE 002 Section 110
//  10/10/2014

//  Lab #6

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

//  import scanner
import java.util.Scanner;

//  define a class
public class Enigma1    {
    
    //  main method
    public static void main(String []arg)   {
        
        //  declare percent
        double percent;
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt user to enter an input
        System.out.print("Enter a value for the percent (0, 1,...99)- ");
        
        //  if the user entered a number
        if (input.hasNextDouble())  {
             
            //  accept user input
            double x = input.nextDouble();
            
            //  make sure the input is between 0 and 99
            if (x >= 0 && x <= 99)  {
            
            //  print out the percent they entered
            System.out.println("You entered "+x+"%");
        
            //  print out the remaining proportion
            
                double decimal = x / 100;
                double remainingPercentage = 1 - decimal;
                
                System.out.println("The proportion remaining is: " +remainingPercentage);
        
            }   //  end of if statement if the input is between 0 and 99
            
            //  if the input is not within range
            else    {
                //  print error statement
                System.out.println("Error: You must enter a number between 0 and 99");
                //  terminate program
                return;
            }   //  end of else statement if the input is not within range
        
        }   //  end of if statement if the user entered a number
        
        //  if the user did not enter a number
        else    {
            //  print error statement
            System.out.println("Error: You must enter a number");
            //  terminate program
            return;
        }   //  end of else statement if the user did not enter a number
        
   }    //  end of main method
   
}   //  end of class

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 *  Errors:
 *          The creation of a scanner object was moved outside the statement
 *      accepting the user input so that the program can recognize invalid
 *      inputs and print error statements for them. A series of if and else
 *      statements were added to recognize invalid inputs and print error
 *      statements for them. The method for determining the remaining
 *      proportion was changed so that it works for all inputs.
 * 
 */

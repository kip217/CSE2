//  Katherine Porfirio
//  CSE 002 Section 110
//  09/21/2014

//  Homework #4
//  program asks the user to enter a number representing the month
//  program then prints out the number of days in that month
//  if the month is February, the program asks the user for the year to help determine the number of days

//  import scanner
import java.util.Scanner;

//  define a class
public class Month  {
    
    //  main method
    public static void main(String[] args)  {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to enter an integer, accept user input
        System.out.print("Enter an integer between 1 and 12 representing a month: ");
        int month = input.nextInt();
        
        //  continue with program if the input is an integer
        if (input.hasNextInt()) {
            
            //  continue with program if integer is between 1 and 12
            if (month > 0 && month <= 12)   {
                
                //  31 days for January, March, May, July, August, October, December
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)  {
                    int days = 31;
                    System.out.println("There are " +days+ " days in this month");
                }   //  end of if statement for months with 31 days
            
                //  variable amount of days for February
                else if (month == 2)  {
                    //  ask the user for the year, accept user input
                    System.out.print("Enter an integer representing the year: ");
                    int year = input.nextInt();
                    //  make sure the user entered an integer for the year
                    if (input.hasNextInt()) {
                        //  2016 is a leap year, so subtract year from 2016
                        int afterSubtraction = 2016 - year;
                        //  divide the result by 4, take the remainder
                        int remainder = afterSubtraction % 4;
                        
                        //  if remainder is 0 - leap year
                        if (remainder == 0)  {
                            //  leap year - February has 29 days, print result
                            int days = 29;
                            System.out.println("There are " +days+ " days in February in the year " +year+ "");
                        }   //  end of if statement for leap year condition
                        
                        //  if remainder is not 0 - not a leap year
                        else    {
                            //  not a leap year - February has 28 days, print result
                            int days = 28;
                            System.out.println("There are " +days+ " days in February in the year " +year+ "");
                        }   //  end of if statement for not leap year condition
                    
                    }   //  end of if statement makeing sure the user entered an integer for the year
                    
                    //  if the user did not enter an integer for the year
                    else    {
                        //  print an error message
                        System.out.println("Error: You must enter an integer for the year");
                        //  terminate the program
                        return;
                    }   //  end of else statement if the user did not enter an integer

                }   //  end of if statement for February
                
                //  30 days for April, June, September, November
                else if (month == 4 || month == 6 || month == 9 || month == 11)  {
                    int days = 30;
                    System.out.println("There are " +days+ " days in this month");
                }   //  end of if statement for months with 30 days    
                
            }   //  end of if statement for integer between 1 and 12
            
            //  terminate the program if the integer is not between 1 and 12
            else    {
                //  print an error message
                System.out.println("Error: You must enter an integer between 0 and 12");
                //  terminate program
                return;
            }   //  end of else statement checking to make sure it is between 1 and 12
        
        }   //  end of if statement for integer
        
        //  terminate the program if the input is not an integer
        else    {
            //  print an error message
            System.out.println("Error: You must enter an integer between 0 and 12");
            //  terminate program
            return;
        }   //  end of else statement if the input is not an integer
        
    }   //  end of main method
    
}   //  end of class

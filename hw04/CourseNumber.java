//  Katherine Porfirio
//  CSE 002 Section 110
//  09/21/2014

//  Homework #4
//  program asks the user for a course number
//  program makes sure the course number is valid
//  program prints the semester and year if the course number is valid

//  import scanner
import java.util.Scanner;

//  define a class
public class CourseNumber   {
    
    //  main method
    public static void main(String[] args)  {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to enter an integer
        System.out.print("Enter a six-digit number that gives the course number: ");
        
        //  if the input is an integer
        if (input.hasNextInt()) {
            
            //  accept user input
            int courseNumber = input.nextInt();
            
            //  if the input is within the allowed range
            if (courseNumber >= 186510 && courseNumber <= 201440)   {
                
                //  get the year
                    //  convert the course number to a double
                    double number = (int) courseNumber;
                    //  divide the course number by 100
                    number = number / 100;
                    //  convert that number back to an int to get the year
                    int year = (int) number;
                //  get the semester
                    //  multiply the year by 100
                    int yearTimes100 = year * 100;
                    //  subtract the year times 100 from the original course number
                    int semester = courseNumber - yearTimes100;
                    //  find the digit in the ones place
                    int onesDigit = (semester %10);
                    
                    //  course number is only valid if the digit in the ones place is 0
                    if (onesDigit == 0) {
                        
                        //  find the digit in the tens place
                        int tensDigit = (semester / 10) %10;
                        
                        //  if the digit in the tens place is 1
                        if (tensDigit == 1)   {
                            //  print the year and semester
                            System.out.println("This course was offered in the Spring semester of " +year+ "");
                        }   //  end of if statement if the digit in the tens place is 1
                        
                        //  if the digit in the tens place is 2
                        else if (tensDigit == 2)   {
                            //  print the year and semester
                            System.out.println("This course was offered in the Summer 1 semester of " +year+ "");
                        }   //  end of if statement if the digit in the tens place is 2
                        
                        //  if the digit in the tens place is 3
                        else if (tensDigit == 3)   {
                            //  print the year and semester
                            System.out.println("This course was offered in the Summer 2 semester of " +year+ "");
                        }   //  end of if statement if the digit in the tens place is 3
                        
                        //  if the digit in the tens place is 1
                        else if (tensDigit == 4)   {
                            //  print the year and semester
                            System.out.println("This course was offered in the Fall semester of " +year+ "");
                        }   //  end of if statement if the digit in the tens place is 4
                        
                        //  if the digit in the tens place is not 1, 2, 3, or 4
                        else    {
                            //  print error message
                            System.out.println("Error: You must enter a valid course number");
                            //  terminate program
                            return;
                        }   //  end of else statement if the digit in the tens place is not 1, 2, 3, or 4
                        
                    }   //  end of if statement for if digit in ones place is zero
                    
                    else    {
                        //  print error message
                        System.out.println("Error: You must enter a valid course number");
                        //  terminate program
                        return;
                    }   //  end of else statement for if digit in ones place is not zero
                
            }   //  end of if statement if the input is within the allowed range
            
            //  if the input is not within the allowed range
            else    {
                //  print out an error message
                System.out.println("Error: You must enter a course number within the range [186510, 201440]");
                //  terminate program
                return;
            }   //  end of else statement if the input is not within the allowed range
            
        }   //  end of if statement if the input is an integer
        
        //  if the input is not an integer
        else    {
            //  print out an error message
            System.out.println("Error: You must enter an integer");
            //  terminate program
            return;
        }   //  end of else statement if input is not an integer
        
    }   //  end of main method
    
}   //  end of class

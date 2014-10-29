//  Katherine Porfirio
//  CSE 002 Section 110
//  10/24/2014

//  Lab #9

//  import scanner
import java.util.Scanner;

//  define class
public class Methods    {
    
    //  main method
    public static void main(String [] arg)  {
        
        //  scanner
        Scanner scan = new Scanner(System.in);
        
        //  declare integers
        int a,b,c;
        int input = 0;
        int largerNumber = 0;
        int largestInt = 0;
        int middleInt = 0;
        int smallestInt = 0;
        boolean ascendingBoolean = true;
        String intMessage = "a";
        
        //  prompt user to enter three integers
        System.out.println("Enter three ints: ");
        
        //  accept integers
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        
        //  print the larger integer of a and b
        System.out.println("The larger of " +a+ " and " +b+ " is " +larger(a,b));
        
        //  print the larger integer of a, b, and c
        System.out.println("The larger of " +a+ ", " +b+ ", and " +c+ " is " +larger(a,larger(b,c)));
        
        //  print integers in ascending order
        System.out.println("It is " +ascending(a,b,c)+ " that " +a+ ", " +b+ ", and " +c+ " are in ascending order");
        
    }   //  end of main method
    
    //  method for getting the integers
    public String getInt(Scanner scan)    {
        
        //  if the user input is an integer
        if (scan.hasNextInt())  {
            
            //  accept user input
            int input = scan.nextInt();
            
            //  convert to a string
            intMessage = (String) input;
            
        }   //  end of if statement if the user input is an integer
        
        //  if the user input is not an integer
        else    {
            //  give error message
            intMessage = "Error: You must enter an integer";
        }   //  end of else statement if the user input is not an integer
        
    }   //  end of method for getting the integers
    
    //  method for getting the larger integer
    public boolean larger(int a, int b) {
        
        //  if number1 is larger than number2
        if (number1 - number2 > 0)  {
            //  initialize largerNumber
            largerNumber = number1;
        }   //  end of if statement if number1 is larger than number2
        
        //  if number2 is larger than number1 or number2 = number1
        else    {
            //  initialize largerNumber
            largerNumber = number2;
        }   //  end of if statement if number1 is larger than number2
        
        return largerNumber;
        
    }   //  end of method for getting the larger integer
    
    //  method for getting the ascending order of the integers
    public boolean ascending(int a, int b, int c)  {
        
        //  initialize variables
        num1 = a;
        num2 = b;
        num3 = c;
        
        //  if num1 is the largest integer
        if  (num1 >= num2 && num1 >= num3)  {
            
            //  initialize largestInt
            largestInt = num1;
            
            //  if num2 is the middle integer
            if (num2 >= num1)   {
                //  initialize variables
                middleInt = num2;
                smallestInt = num1;
            }   //  end of if statment if num2 is the middle integer
            
            //  if num1 is the middle integer
            else    {
                //  initialize variables
                middleInt = num1;
                smallestInt = num2;
            }   //  end of else statment if num1 is the middle integer
            
        }   //  end of else statement if num1 is the largest integer
        
        //  if num2 is the largest integer
        else if  (num2 >= num1 && num2 >= num3)  {
            
            //  initialize largestInt
            largestInt = num2;
            
            //  if num1 is the middle integer
            if (num1 >= num3)   {
                //  initialize variables
                middleInt = num1;
                smallestInt = num3;
            }   //  end of if statment if num2 is the middle integer
            
            //  if num3 is the middle integer
            else    {
                //  initialize variables
                middleInt = num3;
                smallestInt = num1;
            }   //  end of else statment if num3 is the middle integer
            
        }   //  end of else if statement if num2 is the largest integer
        
        //  if num3 is the largest integer
        else    {
            
            //  initialize largestInt
            largestInt = num3;
            
            //  if num1 is the middle integer
            if (num1 >= num2)   {
                //  initialize variables
                middleInt = num1;
                smallestInt = num2;
            }   //  end of if statment if num1 is the middle integer
            
            //  if num2 is the middle integer
            else    {
                //  initialize variables
                middleInt = num2;
                smallestInt = num1;
            }   //  end of else statment if num2 is the middle integer
            
        }   //  end of else statement if num3 is the largest integer
        
        //  true or false?
        ascendingBoolean = (largestInt >= middleInt) && (middleInt >= smallestInt);
        
        return ascendingBoolean;
        
    }   //  end of method for getting the ascending order
  
}   //  end of class
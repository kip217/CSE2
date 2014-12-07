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
    
    //
    //  method for getting the integers
    //
    
        public static int getInt(Scanner scan) {
            
            int integer = 0;
            
            if (scan.hasNextInt())  {
                integer = scan.nextInt();
                return integer;
            }
            
            while (!scan.hasNextInt())  {
                System.out.println("You did not enter an int; try again: ");
                if (scan.hasNextInt())  {
                    break;
                }
            }
            integer = scan.nextInt();
            
            return integer;
            
        }
    
    //
    //  method for getting the larger integer
    //
    
    public static int larger(int number1, int number2) {
        
        int largerNumber;
        
        //  if number1 is larger than number2
        if (number1 - number2 > 0)  {
            //  initialize largerNumber
            largerNumber = number1;
        }   //  end of if statement if number1 is larger than number2
        
        //  if number2 is larger than number1
        else    {
            //  initialize largerNumber
            largerNumber = number2;
        }   //  end of if statement if number2 is larger than number1
        
        return largerNumber;
        
    }   //  end of method for getting the larger integer
    
    //
    //  method for getting the ascending order of the integers
    //
    
    public static boolean ascending(int num1, int num2, int num3)  {
        
        //  declare variables
        int largestInt;
        int middleInt;
        int smallestInt;
        
        if ((num3 >= num2) && (num3 >= num1) && (num2 >= num1)) {
            return true;
        }
        
        else    {
            return false;
        }
        
    }   //  end of method for getting the ascending order
  
}   //  end of class
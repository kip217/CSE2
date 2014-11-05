//  Katherine Porfirio
//  CSE 002 Section 110
//  11/02/2014

//  Homework #9

//  program asks the user to enter an integer between 1 and 9, inclusive
//  program does not accept any other input and will repeat if the user enters incorrect input
//  program prints out the number stack thing based on the user's input


//  import scanner
import java.util.Scanner;

//  define class
public class BlockedAgain   {
    
    //  main method
    public static void main(String []s) {
        
        //  declare and initialize int
        int m;
        
        //  force user to enter int in range 1-9, inclusive
        m = getInt();
        allBlocks(m);
        
    }   //  end of main method
    
    //
    //  getInt method
    //
    
    public static int getInt()  {
        
        //  declare scanner
        Scanner input = new Scanner(System.in);
        
        //  prompt user to enter an input
        System.out.print("Please enter an integer between 1 and 9, inclusive: ");
        
        //  variable for checkInt method
        String resultCheckInt = checkInt(input);
        
        //  if user input is an int
        if (resultCheckInt.equals("y")) {
            
            //  make input a variable
            int userInput = input.nextInt();
            
            //  variable for checkRange method
            String resultCheckRange = checkRange(userInput);
            
            //  if user input is within range
            if (resultCheckRange.equals("y"))    {
                //  return input
                return userInput;
            }   //  end of if statement if user input is within range
            
            //  if user input is not within range
            else    {
                //  print error message, return 0 so program repeats
                System.out.println("");
                System.out.println("You did not enter an integer between 1 and 9; try again: ");
                return 0;
            }   //  end of else statement if user input is not within range
        
        }   //  end of if statement if user input is an int
        
        //  if user input is not an int
        else    {
            //  print error message, return 0 so program repeats
            System.out.println("");
            System.out.println("You did not enter an integer; try again: ");
            return 0;
        }   //  end of else statement if user input is not an int
        
    }   //  end of getInt method
    
    //
    //  checkInt method
    //
    
    public static String checkInt(Scanner input)  {
        
        //  if input is an int
        if (input.hasNextInt()) {
            return "y";
        }   //  end of if statement if input is an int
        
        //  if input is not an int
        else    {
            return "n";
        }   //  end of else statement if input is not an int
        
    }   //  end of checkInt method
    
    //
    //  checkRange method
    //
    
    public static String checkRange(int number)   {
        
        //  if input is within range
        if (number <= 9 && number >= 1)   {
            return "y";
        }   //  end of if statement if input is within range
        
        //  if input is not within range
        else    {
            return "n";
        }   //  end of else statement if input is not within range
        
    }   //  end of checkRange method
    
    //
    //  allBlocks method
    //
    
    public static void allBlocks(int num1)   {
        //  call block method
        block(num1);
    }   //  end of allBlocks method
    
    //
    //  block method
    //
    
    public static void block(int num2)    {
        
        //  if invalid input
        if (num2 == 0)  {
            //  repeat process
            int m;
            m = getInt();
            allBlocks(m);
        }   //  end of if statement for invalid input
        
        //  variables for loops to print number stack thing
        int counter = num2;
        int i1;
        int k1;
        int k2;
        int k3;
        
        //  for loop to print number pyramid
        for (i1 = 1; i1 <= counter; i1++) {
            
            //  for loop for number of number rows
            for (k3 = 1; k3 <= i1; k3++)  {
                
                //  for loop for spaces
                for (k1 = 1, k2 = i1; k1 <= num2 - k2; k1++)   {
                    //  print the row
                    System.out.print(" ");
                }   //  end of for loop for spaces
                
                //  for loop for number rows
                for (k1 = 1, k2 = i1; k1 <= i1 + (i1 - 1); k1++)   {
                    //  print the row
                    System.out.print(k2);
                }   //  end of for loop for rows
                
                //  next line
                System.out.println("");
                
            }   // end of for loop for number of number rows
              
            //  for loop for spaces
            for (k1 = 1, k2 = i1; k1 <= num2 - k2; k1++)   {
                //  print the row
                System.out.print(" ");
            }   //  end of for loop for rows
            
            //  for loop for - rows
            for (k1 = 1; k1 <= i1 + (i1 - 1); k1++)   {
                //  print the row
                System.out.print("-");
            }   //  end of for loop for rows
            
            //  next line
            System.out.println("");
            
        }   //  end of for loop for number pyramid
                
    }   //  end of block method
    
}   //  end of class

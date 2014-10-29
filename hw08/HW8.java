//  Katherine Porfirio
//  CSE 002 Section 110
//  10/27/2014

//  Homework #8
//  program asks the user to enter an input
//  program only gives the user 5 tries to enter an acceptable input

//  import scanner
import java.util.Scanner;

//  define class
public class HW8	{
    
    //  main method
    public static void main(String []arg)   {
        
        //  declare char variable
        char input;
        
        //  declare scanner
        Scanner scan = new Scanner(System.in);
        
        //  prompt user to enter a character to continue
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        
        //  method for user input
        input = getInput(scan,"Cc");
        
        //  pring user input
        System.out.println("You entered '"+input+"'");
        
        //  prompt user to enter a character again
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        
        //  method for user input
        input = getInput(scan,"yYnN", 5);	//	give up after 5 attempts
        
        //  if input is not equal to a space
        if (input != ' ')   {
            System.out.println("You entered '"+input+"'");
        }   //  end of if statement
        
        //  prompt again
        System.out.println("Choose a digit.");
        System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-");
        
        //  method for user input
        input = getInput(scan, "Choose a digit." , "0123456789");
        
        //  print user input
        System.out.println("You entered '"+input+"'");
        
    }   //  end of main method
      
    //  getInput method 1  
    public static char getInput(Scanner scan, String string1)  {
        
        //  define counter
        int counter = 5;
        
        while (counter > 0) {
        
            if (scan.hasNextLine()) {
                 
                String scan1 = scan.nextLine();
                
                //  if "C"
                if (scan1.equals("C"))   {
                    //  return correct input
                    return 'C';
                }   //  end of if statement for "C"
                
                //  if "c"
                else if (scan1.equals("c"))  {
                    //  return correct input
                    return 'c';
                }   //  end of else if statement for "c"
                
                //  if incorrect input
                else    {
                    System.out.print("You did not enter a character from the list 'Cc'; try again - ");
				    				counter --;
                }   //  end of else statement for incorrect input
                
            }   //  end of if statement if input is a string
            
            //  if input is not a string
            else    {
                counter--;
            }   //  end of else statement if input is not a string
            
        }   //  end of while loop for trials
        
        //	fail message, required return
        System.out.println("");
        System.out.println("You failed after 5 tries");
        return ' ';
        
    }   //  end of getInput method 1
    
    //  getInput method 2
    public static char getInput(Scanner scan, String string1, int int1)  {
        
        //  define counter
        int counter = 5;
        
        while (counter > 0) {
        
            if (scan.hasNextLine()) {
                 
                String scan1 = scan.nextLine();
                
                //  if "Y"
                if (scan1.equals("Y"))   {
                    //  return correct input
                    return 'Y';
                }   //  end of if statement for "Y"
                
                //  if "y"
                else if (scan1.equals("y"))  {
                    //  return correct input
                    return 'y';
                }   //  end of else if statement for "y"
                
                //  if "N"
                else if (scan1.equals("N"))   {
                    //  return correct input
                    return 'N';
                }   //  end of if statement for "N"
                
                //  if "n"
                else if (scan1.equals("n"))  {
                    //  return correct input
                    return 'n';
                }   //  end of else if statement for "n"
                
                //  if incorrect input
                else    {
                    System.out.print("You did not enter a character from the list 'yYnN'; try again - ");
				    counter --;
                }   //  end of else statement for incorrect input
                
            }   //  end of if statement if input is a string
            
            //  if input is not a string
            else    {
                counter--;
            }   //  end of else statement if input is not a string
            
        }   //  end of while loop for trials
        
        //	fail message, required return
        System.out.println("");
        System.out.println("You failed after 5 tries");
        return ' ';
        
    }   //  end of getInput method 2
    
    //  getInput method 3
    public static char getInput(Scanner scan, String string1, String string2)  {
        
        //  define counter
        int counter = 5;
        
        while (counter > 0) {
        
            if (scan.hasNextLine()) {
                 
                String scan1 = scan.nextLine();
                
                //  if "0"
                if (scan1.equals("0"))   {
                    //  return correct input
                    return '0';
                }   //  end of if statement for "0"
                
                //  if "1"
                else if (scan1.equals("1"))  {
                    //  return correct input
                    return '1';
                }   //  end of else if statement for "1"
                
                //  if "2"
                else if (scan1.equals("2"))   {
                    //  return correct input
                    return '2';
                }   //  end of if statement for "2"
                
                //  if "3"
                else if (scan1.equals("3"))  {
                    //  return correct input
                    return '3';
                }   //  end of else if statement for "3"
                
                //  if "4"
                else if (scan1.equals("4"))   {
                    //  return correct input
                    return '4';
                }   //  end of if statement for "4"
                
                //  if "5"
                else if (scan1.equals("5"))  {
                    //  return correct input
                    return '5';
                }   //  end of else if statement for "5"
                
                //  if "6"
                else if (scan1.equals("6"))   {
                    //  return correct input
                    return '6';
                }   //  end of if statement for "6"
                
                //  if "7"
                else if (scan1.equals("7"))  {
                    //  return correct input
                    return '7';
                }   //  end of else if statement for "7"
                
                //  if "8"
                else if (scan1.equals("8"))   {
                    //  return correct input
                    return '8';
                }   //  end of if statement for "8"
                
                //  if "9"
                else if (scan1.equals("9"))  {
                    //  return correct input
                    return '9';
                }   //  end of else if statement for "9"
                
                //  if incorrect input
                else    {
                    System.out.println("You did not enter an acceptable character");
                    System.out.println("Choose a digit");
                    System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
				    counter --;
                }   //  end of else statement for incorrect input
                
            }   //  end of if statement if input is a string
            
            //  if input is not a string
            else    {
                counter--;
            }   //  end of else statement if input is not a string
            
        }   //  end of while loop for trials
        
        //	fail message, required return
        System.out.println("");
        System.out.println("You failed after 5 tries");
        return ' ';
        
    }   //  end of getInput method 3

}   //  end of class
//  Katherine Porfirio
//  CSE 002 Section 110
//  10/10/2014

//  Lab #7

//  import scanner
import java.util.Scanner;

//  define a class
public class LoopTheLoop    {
    
    //  main method
    public static void main(String[] args)  {
        
        //  create scanner object
        Scanner input = new Scanner(System.in);
        
        //  variable for stars
        int nStars = 10;
        
        //  while loop to print out stars
        while (nStars >= 1) {
            System.out.print("*");
            nStars--;
        }   //  end of while loop to print out stars
        
        //  empty space
        System.out.println("");
        
        //  while loop for pyramid of stars
        int counter = 10;
        nStars = 2;
        int other = 1;
        int difference = nStars - other;
        while (counter >=1) {
            while (difference >= 1)    {
                System.out.print("*");
                difference--;
            }   //  end of nested while statement
            System.out.println("");
            nStars++;
            counter--;
            difference = nStars - other;
        }   //  end of while loop for pyramid of stars
        
        //  prompt the user to enter an integer between 1 and 15
        System.out.print("Please enter an integer between 1 and 15: ");
        
        // while statement if input is an int
        while (input.hasNextInt())  {
            //  accept user input
            int userInput = input.nextInt();
            
            //  if the input is within range
            if (userInput <= 15 && userInput >= 1)  {
                
                //  print the line of stars
                
                    //  variable for stars
                    int nStars = userInput;
                    
                    //  while loop to print out stars
                    while (nStars >= 1) {
                        System.out.print("*");
                        nStars--;
                    }   //  end of while loop to print out stars
                    
                    //  empty space
                    System.out.println("");
                
                //  print the pyramid of stars
                
                    int counter = userInput;
                    nStars = 2;
                    int other = 1;
                    int difference = nStars - other;
                    while (counter >=1) {
                        while (difference >= 1)    {
                            System.out.print("*");
                            difference--;
                        }   //  end of nested while statement
                        System.out.println("");
                        nStars++;
                        counter--;
                        difference = nStars - other;
                        
                    }   //  end of while loop for pyramid of stars
                
            }   //  end of if statement if the input is within range
                
            //  if the input is not within range
            else    {
                System.out.println("Error: You must enter an integer input");
                System.out.println("Please enter an integer between 1 and 15: ");
                
            }   //  end of else statement if the input is not within range
            
        }   //  end of while statement if input is an int
        
        //  while statement if input is not an int
        while (input!hasNextInt()) {
            System.out.println("Error: You must enter an integer input");
            System.out.println("Please enter an integer between 1 and 15: ");
            
        }   //  end of while statement if input is not an int
            
    }   //  end of main method
    
}   //  end of class
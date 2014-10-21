//  Katherine Porfirio
//  CSE 002 Section 110
//  10/10/2014

//  Lab #8

//  import scanner
import java.util.Scanner;

//  define class
public class MoreLoops  {

    //  main method
    public static void main(String[] arg)   {
    
        //  create scanner object
        Scanner scan=new Scanner(System.in);
        
        //  1st loop - while loop
        System.out.println("First loop is a while loop: ");
        System.out.println("");
        
        //  declare and initialize n outside of loop
        int n=0;
        
        //  prompt user to enter an integer
        System.out.print("Enter an int- ");
        
        //  while loop
        while(!scan.hasNextInt())   {
        
            scan.next(); // get rid of the junk entered by user
            System.out.print("You did not enter an int; try again- ");
            
        }   //  end of while loop
        
        //  1st loop changed to a do-while loop
        System.out.println("");
        System.out.println("First loop changed to a do-while loop: ");
        System.out.println("");
        
        //  prompt user to enter an integer
        System.out.print("Please enter an integer: ");
         
        n = 0;
        
        //  create scanner object
        Scanner scan2 = new Scanner(System.in);
         
        //  do-while loop
        do  {
            
            //  if the input is an integer
            if (scan2.hasNextInt()) {
                //  condition to get out of do-while loop
                n = 1;
                //  accept user input
                int userInt = scan2.nextInt();
            }   //  end of if statement if the input is an integer
            
            //  if the input is not an integer
            else    {
                // get rid of user input
                scan2.next();
                // print error message
                System.out.print("You did not enter an integer. Please try again: ");
                //  do not break out of do-while loop
                n = 0;
            }   //  end of else statement if the input is not an integer
            
        }   while (n == 0); //  end of do-while loop
        
        //  2nd loop
        System.out.println("");
        System.out.println("Second loop is a for loop: ");
        System.out.println("");
        
        //  create scanner object
        Scanner scan3 = new Scanner(System.in);
        
        //  accept user input 
        n = scan3.nextInt();
        
        //  for loop - based on user input
        for(int j = 0; j < n && j < 40; j++){
            
            //  for loop - to print stars
            for(int k = 0; k < j + 1; k++)  {
                
            System.out.print('*');
            
            }   //  end of for loop to print stars
            
            System.out.println();
            
        }   //  end of for loop based on user input
    
        //  2nd loop changed to a while loop
        System.out.println("");
        System.out.println("First loop changed to a do-while loop: ");
        System.out.println("");
        
        //  create scanner object
        Scanner scan4 = new Scanner(System.in);
        
        //  accept user input
        n = scan4.nextInt();
        
        //  declare variables
        int a = 0;
        int b = n;
        int c = n; // stays at the original n
        int d = (c - b) + 1;
        
        //  while loop to print stars
        while (n > 0)   {
            
            //  another while loop
            while (d > 0)   {
                
                //  print star
                System.out.print("*");
                //  decrement b
                b--;
                
                //  when to break
                if (b == -1) {
                    break;
                }   //  end of if statement to break
                
            }   // end of another while loop
            
        }   //  end of while loop to print stars
        
    }   //  end of main method

}   //  end of class

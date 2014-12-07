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
        
    int nStars = 10;
    int counter = 0;
    
    //  Task #1:
    
    while (counter < nStars)    {
        System.out.print("*");
        counter ++;
    }   
    
    System.out.println("");
    System.out.println("");
    
    //  Task #2:
    
    counter = 0;
    int i = 1;
    int j = 1;
    int k = 10;
    nStars = 10;
    
    while (counter < nStars)    {
        
        while (i <= j)  {
            System.out.print("*");
            i++;
        }
        
        System.out.println("");
        System.out.println("");
        
        j++;
        i = 1;
        counter++;
    }
    
    Scanner input = new Scanner(System.in);
    
    String again = "y";
    int counter1 = 0;
    
    while (again.equals("Y") || again.equals("y"))  {
        
        //  prompt user
        System.out.print("Please enter an integer between 1 and 15: ");
        
        while (!input.hasNextInt()) {
            input.next();
            System.out.print("You did not enter an integer; try again: ");
        }
        
        if (input.hasNextInt()) {
            counter1 = input.nextInt();
        }
        
        while (counter1 < 1 || counter1 > 15)   {
            
            System.out.print("Your integer is not within range; try again: ");
            
            if (input.hasNextInt()) {
                counter1 = input.nextInt();
                break;
            }
            
            while (!input.hasNextInt()) {
                input.next();
                System.out.print("You did not enter an integer; try again: ");
            }
            
        }
        
        nStars = counter1;
        
    //  Task #1:
    
    counter = 0;
    
    while (counter < nStars)    {
        System.out.print("*");
        counter ++;
    }   
    
    System.out.println("");
    System.out.println("");
    
    //  Task #2:
    
    counter = 0;
    i = 1;
    j = 1;
    
    while (counter < nStars)    {
        
        while (i <= j)  {
            System.out.print("*");
            i++;
        }
        
        System.out.println("");
        System.out.println("");
        
        j++;
        i = 1;
        counter++;
    }
        
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter 'Y' or 'y' to go again: ");
        again = input2.nextLine();
        
    }   //  end of while loop for y or Y
            
    }   //  end of main method
    
}   //  end of class
//  Katherine Porfirio
//  CSE 002 Section 110
//  10/27/2014

//  Homework #8
//  program asks the user to enter an input
//  program only gives the user 5 tries to enter an acceptable input

//  import scanner
import java.util.Scanner;

//  define class
public class Practice2  {
    
    //  main method
    public static void main(String []arg)   {
        
        Scanner scan = new Scanner(System.in);
        int n = 0;
        
        System.out.print("Enter an int- ");
        
        //  LOOP #1
        //  do-while loop
        
        do  {
            
            //  if the user entered an integer
            if (scan.hasNextInt())  {
                n = scan.nextInt();
                break;
            }
            
            //  if the user did not enter an integer
            else    {
                scan.next();
                System.out.print("You did not enter an int; try again- ");
            }
            
        }   while (!scan.hasNextInt());
        
        //  LOOP #2
        //  while loops
        
        //  declare and initialize variables
        int j = 0;
        int k = 0;
        
        while (j < n && j < 40) {
            
            while (k < j + 1)   {
                
                //  print stars
                System.out.print("*");
                
                //  control while loop
                k++;
            }
            
            //  next line
            System.out.println();
            
            //  control while loop
            j++;
        }
        
        //  LOOP #3
        //  while loop
        
        //  first run of do-while loop
        k = 4;
        System.out.println("k=" +k);
        k++;
        
        //  replace with while loop
        while (k < 4)   {
            System.out.println("k=" +k);
            k++;
        }
        
        //  LOOP #4
        //  replace switch statement with loops
        
        int count = 0;
        
        while (count <= 10) {
            
            if (n == 1 || n == 2) {
                System.out.print("Case 2");
            }
            
            else if (n == 4) {
                System.out.println("Case 4");
                System.out.println("Case 5");
            }
            
            else if (n == 5)    {
                System.out.println("Case 5");
            }
            
            else    {
                System.out.println(n+ " is > 5 or < 1");
            }
            
            count++;
            
        }   //  end of big while loop
        
    }   //  end of getInput method 3

}   //  end of class
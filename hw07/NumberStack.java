//  Katherine Porfirio
//  CSE 002 Section 110
//  10/10/2014

//  Homework #7

//  import scanner
import java.util.Scanner;

//  define a class
public class NumberStack    {
    
    //  main method
    public static void main(String[] args)  {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to enter an integer between 1 and 9
        System.out.print("Please enter an integer between 1 and 9: ");
        
        //  if the input is an integer
        if (input.hasNextInt()) {
            
            //  accept user input
            int number = input.nextInt();
            
            //  if the number is between 1 and 9
            if (number >= 1 && number <= 9) {
                
                //
                //  USING FOR LOOP
                //
                
                //  title
                System.out.println("");
                System.out.println("For Loop:");
                System.out.println("");
                
                //  variables for loops
                int counter = number;
                int i1;
                int k1;
                int k2;
                int k3;
                
                //  for loop to print number pyramid
                for (i1 = 1; i1 <= counter; i1++) {
                    
                    //  for loop for number of number rows
                    for (k3 = 1; k3 <= i1; k3++)  {
                        
                        //  for loop for spaces
                        for (k1 = 1, k2 = i1; k1 <= number - k2; k1++)   {
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
                    for (k1 = 1, k2 = i1; k1 <= number - k2; k1++)   {
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
                
                //
                //  USING WHILE LOOP
                //
                
                //  title
                System.out.println("");
                System.out.println("While Loop:");
                System.out.println("");
                
                //  initialize variables
                counter = number;
                i1 = 1;
                
                //  while loop to print number pyramid
                while (i1 <= counter) {
                    
                    //  initialize variable
                    k3 = 1;
                    
                    //  while loop for number of number rows
                    while (k3 <= i1)  {
                        
                        //  initialize variables
                        k1 = 1;
                        k2 = i1;
                        
                        //  while loop for spaces
                        while (k1 <= number - k2)   {
                            //  print the row
                            System.out.print(" ");
                            //  increment k1
                            k1++;
                        }   //  end of while loop for spaces
                        
                        //  initialize variables
                        k1 = 1;
                        k2 = i1;
                        
                        //  while loop for number rows
                        while (k1 <= i1 + (i1 - 1))   {
                            //  print the row
                            System.out.print(k2);
                            //  increment k1
                            k1++;
                        }   //  end of while loop for rows
                        
                        //  next line
                        System.out.println("");
                        
                        //  increment k3
                        k3++;
                        
                    }   // end of while loop for number of number rows
                    
                    //  initialize variables
                    k1 = 1;
                    k2 = i1;
                    
                    //  while loop for spaces
                    while (k1 <= number - k2)   {
                        //  print the row
                        System.out.print(" ");
                        //  increment k1
                        k1++;
                    }   //  end of while loop for rows
                    
                    //  initialize variable
                    k1 = 1;
                    
                    //  while loop for - rows
                    while (k1 <= i1 + (i1 - 1))   {
                        //  print the row
                        System.out.print("-");
                        //  increment k1
                        k1++;
                    }   //  end of while loop for rows
                    
                    //  next line
                    System.out.println("");
                    
                    //  increment i1
                    i1++;
                    
                }   //  end of while loop for number pyramid
                
                //
                //  DO-WHILE LOOP
                //  
                
                //  title
                System.out.println("");
                System.out.println("Do-While Loop:");
                System.out.println("");
                
                //  initialize variables
                counter = number;
                i1 = 1;
                
                //  do-while loop to print number pyramid
                do  {
                    
                    //  initialize variable
                    k3 = 1;
                    
                    //  do-while loop for number of number rows
                    do  {
                        
                        //  initialize variables
                        k1 = 0;
                        k2 = i1;
                        
                        //  do-while loop for spaces
                        do  {
                            //  print the row
                            System.out.print(" ");
                            //  increment k1
                            k1++;
                        }   while (k1 <= number - k2);
                        
                        //  initialize variables
                        k1 = 1;
                        k2 = i1;
                        
                        //  do-while loop for number rows
                        do  {
                            //  print the row
                            System.out.print(k2);
                            //  increment k1
                            k1++;
                        }   while (k1 <= i1 + (i1 - 1));
                        
                        //  next line
                        System.out.println("");
                        
                        //  increment k3
                        k3++;
                        
                    }   while (k3 <= i1);
                    
                    //  initialize variables
                    k1 = 0;
                    k2 = i1;
                    
                    //  do-while loop for spaces
                    do  {
                        //  print the row
                        System.out.print(" ");
                        //  increment k1
                        k1++;
                    }   while (k1 <= number - k2);
                    
                    //  initialize variable
                    k1 = 1;
                    
                    //  do-while loop for - rows
                    do  {
                        //  print the row
                        System.out.print("-");
                        //  increment k1
                        k1++;
                    }   while (k1 <= i1 + (i1 - 1));
                    
                    //  next line
                    System.out.println("");
                    
                    //  increment i1
                    i1++;
                    
                }   while (i1 <= counter);
                
            }   //  end of if statement if the number is between 1 and 9
            
            //  if the number is not between 1 and 9
            else    {
                //  print error statement
                System.out.println("Error: You must enter a number between 1 and 9");
                //  terminate program
                return;
            }   //  end of else statement if the number is not between 1 and 9
            
        }   //  end of if statement if the input is an integer
        
        //  if the input is not an integer
        else    {
            //  print error statement
            System.out.println("Error: You must enter an integer");
            //  terminate program
            return;
        }   //  end of else statement if the input is not an integer
        
        
    }   //  end of main method
    
}   //  end of class
//  Katherine Porfirio
//  CSE 002 Section 110
//  11/29/2014

//  Lab #11

//  import scanner
import java.util.Scanner;

//  define class
public class Arrays {
    
    //  main method
    public static void main(String[] args)  {
        
        //  scanner
        Scanner input = new Scanner(System.in);  
        
        //  create array that can hold 10 integers
        int array[] = new int[10];
        
        //  prompt user to enter integers (assume user enters integers)
        System.out.print("Enter the first integer: ");
        array[0] = input.nextInt();
        System.out.print("Enter the second integer: ");
        array[1] = input.nextInt();
        System.out.print("Enter the third integer: ");
        array[2] = input.nextInt();
        System.out.print("Enter the fourth integer: ");
        array[3] = input.nextInt();
        System.out.print("Enter the fifth integer: ");
        array[4] = input.nextInt();
        System.out.print("Enter the sixth integer: ");
        array[5] = input.nextInt();
        System.out.print("Enter the seventh integer: ");
        array[6] = input.nextInt();
        System.out.print("Enter the eighth integer: ");
        array[7] = input.nextInt();
        System.out.print("Enter the ninth integer: ");
        array[8] = input.nextInt();
        System.out.print("Enter the tenth integer: ");
        array[9] = input.nextInt();
        
        //  find the lowest integer
        int lowest = array[0];
        for (int j = 1; j < 10; j++)    {
            if (array[j] < lowest)  {
                lowest = array[j];
            }
        }   //  end of loop to find lowest integer
        
        //  print the lowest integer
        System.out.println("");
        System.out.println("The lowest entry is: " +lowest);
        
        //  find the highest integer
        int highest = array[0];
        for (int j = 1; j < 10; j++)    {
            if (array[j] > highest) {
                highest = array[j];
            }
        }   //  end of loop to find highest integer
        
        //  print the highest integer
        System.out.println("The highest entry is: " +highest);
        
        //  find the sum
        int sum = 0;
        for (int j = 0; j < 10; j++)    {
            sum += array[j];
        }   //  end of loop to find sum
        
        //  print the sum
        System.out.println("The sum of the entries is: " +sum);
        
        //  create another array, with entries in reverse order
        int array2[] = new int[10];
        for (int i = 0, j = 9; j >= 0; j--, i++)    {
            array2[j] = array[i];
        }   //  end of loop for reverse order
        
        //  print arrays in specified order
        System.out.println("");
        for (int j = 0; j < 10; j++)    {
            System.out.println("\t" +array[j]+ "\t" +array2[j]);
        }
        
    }   //  end of main method
    
}   //  end of class
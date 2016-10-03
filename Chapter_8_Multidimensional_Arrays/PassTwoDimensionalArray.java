//  program uses a method to create an array from user input values
//  program uses another array to get the sum of all the elements in that array

import java.util.Scanner;

public class PassTwoDimensionalArray    {
    
    public static void main(String[] args)  {
        
        //  get an array
        int[][] m = getArray();
        
        //  display sum of all elements
        System.out.println(" \n Sum of all elements is: " +sum(m));
        
    }
    
    public static int[][] getArray()    {
        
        //  create a scanner
        Scanner input = new Scanner(System.in);
        
        //  enter array values
        int[][] m = new int[3][4];
        System.out.println("Enter " +m.length+ " rows and " +m[0].length+ " columns: ");
        
        for (int i = 0; i < m.length; i++)  {
            
            for (int j = 0; j < m[i].length; j++)   {
                m[i][j] = input.nextInt();
            }
            
        }
        
        return m;
        
    }
    
    public static int sum(int[][] m)    {
        
        int total = 0;
        
        for (int row = 0; row < m.length; row++)    {
            
            for (int column = 0; column < m[row].length; column++)  {
                total += m[row][column];
            }
            
        }
        
        return total;
        
    }
    
}
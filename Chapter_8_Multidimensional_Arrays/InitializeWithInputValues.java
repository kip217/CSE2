//  program creates a 2D array with a random number of rows and columns
//  user inputs values for all elements of the array

import java.util.Scanner;

public class InitializeWithInputValues  {
    
    public static void main(String[] args)  {
        
        Scanner input = new Scanner(System.in);
        
        int a = (int)((Math.random() * 10) + 1);
        int b = (int)((Math.random() * 10) + 1);
        
        int[][] matrix = new int[a][b];
        
        System.out.println("Enter " +matrix.length+ " rows and " +matrix[0].length+ " columns: ");
        
        for (int row = 0; row < matrix.length; row++)   {
            
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
            
        }
        
    }
    
}
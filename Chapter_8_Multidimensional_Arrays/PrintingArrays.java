//  program creates a 2D array with a random number of rows and columns
//  program initializes the array with random values from 0 to 99
//  program prints out the array

public class PrintingArrays {
    
    public static void main(String[] args)  {
        
        int a = (int)((Math.random() * 10) + 1);
        int b = (int)((Math.random() * 10) + 1);
        
        int[][] matrix = new int[a][b];
        
        for (int row = 0; row < matrix.length; row++)   {
            
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 100);
            }
            
        }
        
        for (int row = 0; row < matrix.length; row++)   {
            
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+ " ");
            }
            
            System.out.println();
            
        }
        
    }
    
}
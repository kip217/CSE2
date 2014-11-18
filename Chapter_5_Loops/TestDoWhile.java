//  program asks the user to enter integers, and adds the sum of the integers
//  program stops adding numbers when the user inputs 0

import java.util.Scanner;

public class TestDoWhile    {
    
    public static void main(String[] args)  {
        
        int data;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        do  {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum += data;
        }   while (data != 0);
        
        System.out.println("The sum is " +sum);
        
    }
    
}
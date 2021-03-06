//  program randomly generates a subtraction problem and asks the user to answer it
//  program grades the subtraction problem

import java.util.Scanner;

public class SubtractionQuiz    {
    
    public static void main(String[] args)  {
        
        //  generate two random single-digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        
        //  if number1 < number2, swap number1 with number2
        if (number1 < number2)  {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        Scanner input = new Scanner(System.in);
        
        //  prompt user to answer subtraction problem
        System.out.print("What is " +number1+ " - " +number2+ "? ");
        int answer = input.nextInt();
        
        //  grade answer and display result
        if (number1 - number2 == answer)    {
            System.out.println("You are correct!");
        }
        
        else    {
            System.out.println("Your answer is wrong");
            System.out.println(number1+ " - " +number2+ " is " +(number1 - number2));
        }
        
    }
    
}
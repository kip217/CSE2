//  Katherine Porfirio
//  CSE 002 Section 110
//  09/13/2014

//  program prompts the user to enter a double
//  program then prints out the first four digits to the right of the decimal point

//  import scanner
import java.util.Scanner;

//  define a class
public class FourDigits {
    
    //  main method
    public static void main(String[] args) {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to enter a number; accept user input
        System.out.print("Enter a double: ");
        double userInput = input.nextDouble();
        
        //  find the first four digits to the right of the decimal point:
            
            //  get the digit in the tenths place
            int firstDigit = (int) (userInput * 10) %10;
            
            //  get the digit in the hundredths place
            int secondDigit = (int) (userInput * 100) %10;
            
            //  get the digit in the thousandths place
            int thirdDigit = (int) (userInput * 1000) %10;
            
            //  get the digit in the ten thousandths place
            int fourthDigit = (int) (userInput * 10000) %10;
            
        //  print out the first four digits
        
            //  empty space
            System.out.println("");
            
            //  print out the first four digits together
            System.out.println("The first four digits are: " +firstDigit+secondDigit+thirdDigit+fourthDigit+ "");
            
            //  empty space
            System.out.println("");
            
            //  print out the first four digits individually
            System.out.println("First digit: " +firstDigit+ "");
            System.out.println("Second digit: " +secondDigit+ "");
            System.out.println("Third digit: " +thirdDigit+ "");
            System.out.println("Fourth digit: " +fourthDigit+ "");

    }   //  end of main method
        
}   //  end of class
//  Katherine Porfirio
//  CSE 002 Section 110
//  09/12/2014

//  program prompts the user to enter a double
//  program prints out a crude estimate of the cube root of that double and the value of that guess when cubed

//  import scanner
import java.util.Scanner;

//  define a class
public class Root {
    
    //  main method
    public static void main(String[] args) {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to enter a number, accept user input
        System.out.print("Enter a double: ");
        double numberInput = input.nextDouble();
        
        //  method for guessing the square root of the number input:
            
            //  start by guessing that the square root is x/3
            double guess = numberInput / 3;
            
            //  "replace guess with (2*guess*guess*guess+x)/(3*guess*guess)"
            guess = (2 * guess * guess * guess + numberInput) / (3 * guess * guess);
            
            //  "improve the guess four more times by coding the substitution"
            guess = (2 * guess * guess * guess + numberInput) / (3 * guess * guess);
            guess = (2 * guess * guess * guess + numberInput) / (3 * guess * guess);
            guess = (2 * guess * guess * guess + numberInput) / (3 * guess * guess);
            guess = (2 * guess * guess * guess + numberInput) / (3 * guess * guess);
            
        //  find the cube root of the guess
        double guessCubed = guess * guess * guess;
        
        //  print the approximation, and the cube of the approximation
        System.out.println("The cube root of " +numberInput+ " is approximately " +guess+ "");
        System.out.println("The cube of " +guess+ " is equal to " +guessCubed+ "");
        
        
    }   //  end of main method
    
}   //  end of class
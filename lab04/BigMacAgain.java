// Katherine Porfirio

//  import scanner
import java.util.Scanner;

//  define a class
public class BigMacAgain {
    
    //	main method
    public static void main(String[] args) {
    
    //	create a scanner object
    Scanner input = new Scanner(System.in);
    
    //	prompt the user to enter the number of Big Macs; accept user input
    System.out.print("Enter the number of Big Macs: ");
    double bigMacs = input.nextDouble();
        
        //  make sure the input is an integer
        if(input.hasNextInt()) {
            bigMacs = bigMacs;
        }
        
        else {
            System.out.println("Error: You must enter an integer");
            return;     //  program terminates
        }
        
        //  make sure the input is a positive number
        if(bigMacs > 0) {
            bigMacs = bigMacs;
        }
        
        else {
            System.out.println("Error: You must enter a positive number");
            return;     //  program terminates
        }
        
    //  ask if the user wants fries; accept user input
    
    String Y = (Boolean) true;
    String N = (Boolean) false;
    
    System.out.println("Do you want french fries?");
    System.out.print("Enter 'Y' for yes and 'N' for no: ");
    Boolean fries = input.next();
    
    //  fries
    
    if (input == Y) {
        bigMacs = bigMacs;
    }
    
    
        
        
    
    

    }	//	end of main method

}	//	end of class

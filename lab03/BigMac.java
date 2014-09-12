//  Katherine Porfirio
//  CSE 002 Section 110
//  09/12/2014

//  program uses the Scanner class to obtain from the user the number of Big Macs, the cost per Big Mac, and the percentage tax
//  program generates the total cost of the Big Macs

//  import scanner
import java.util.Scanner;

//  define a class
public class BigMac {
    
    //  main method required for every java program
    public static void main(String[] args) {
        
        //  declare an instance of the Scanner object
        Scanner myScanner;
        
        //  call the Scanner constructor
        myScanner = new Scanner(System.in);
        
        //  prompting the user for input
        
            //  prompt the user for the number of Big Macs, accept user input
            System.out.print("Enter the number of Big Macs (an integer > 0): ");
            int nBigMacs = myScanner.nextInt();
        
            //  prompt the user for the cost of the Big Macs, accept user input
            System.out.print("Enter the cost per Big Mac as "+" a double (in the form xx.xx): $");
            double bigMac$ = myScanner.nextDouble();
            
            //  prompt the user for the percent tax, accept user input
            System.out.print("Enter the percent tax as a whole number (xx): ");
            double taxRate = myScanner.nextDouble();
            
        //  variables, calculations
            
            //  make tax rate a proportion
            taxRate = taxRate / 100;
        
            //  declare a variable for total cost
            double cost$;
        
            //  declare variables for storing digits
            int dollars, dimes, pennies;
        
            //  calculate the total cost
            cost$ = nBigMacs * bigMac$ * (1 + taxRate);
        
            //  get the dollar amount, dropping the decimal
            dollars = (int) cost$;
        
            //  get the dimes amount; % (mod) operator returns the remainder
            dimes = (int) (cost$ * 10)%10;
        
            //  get the pennies amount; %(mod) operator returns the remainder
            pennies = (int) (cost$ * 100)%10;
            
        //  print statement
        System.out.println("The total cost of " +nBigMacs+ " Big Macs, at $" +bigMac$+ " per Big Mac, with a sales tax of " +(int)(taxRate * 100)+ "%, is $" +dollars+'.'+dimes+pennies);

        
    }   //  end of main method
    
}   //  end of class

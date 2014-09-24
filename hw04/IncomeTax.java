//  Katherine Porfirio
//  CSE 002 Section 110
//  09/20/2014

//  Homework #4
//  program prompts the user to enter an integer representing their income (in thousands)
//  program prints the income, the income tax percentage, and the income tax

//  import scanner
import java.util.Scanner;

//  define a class
public class IncomeTax  {
    
    //  main method
    public static void main(String[] args)  {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to enter an integer
        System.out.print("Enter an integer giving the thousands of dollars in income: ");

        //  make sure the user input is an integer
        if (input.hasNextInt()) {
            
            //  accept user input
            int incomeInThousands = input.nextInt();
            
            //  make sure the user input is greater than or equal to zero
            if (incomeInThousands < 0) {
                //  print an error message
                System.out.println("Error: You must enter a value greater than or equal to zero");
                //  terminate program
                return;
            }   //  end of if statement for user input less than zero
            
            //  if the user's income is less than $20,000:
            else if (incomeInThousands < 20 && incomeInThousands >= 0) {
                
                //  make the income a double
                double doubleIncomeInThousands = (double) incomeInThousands;
                //  declare a variable for the income tax percentage
                double incomeTax = .05;
                //  get the actual income (not in thousands)
                double income = doubleIncomeInThousands * 1000;
                //  get the income tax
                double tax = income * incomeTax;
                //  print out the income, the tax rate, and the tax
                System.out.println("The tax rate on $" +income+ " is " +(incomeTax*100)+ "%, and the tax is $" +tax+ "");
                
            }   //  end of if statement for income less than $20,000
            
            //  if the user's income is greater than or equal to $20,000 and less than $40,000
            else if (incomeInThousands >= 20 && incomeInThousands < 40) {
                
                //  make the income a double
                double doubleIncomeInThousands = (double) incomeInThousands;
                //  declare a variable for the income tax percentage
                double incomeTax = .07;
                //  get the actual income (not in thousands)
                double income = doubleIncomeInThousands * 1000;
                //  get the income tax
                double tax = income * incomeTax;
                //  print out the income, the tax rate, and the tax
                System.out.println("The tax rate on $" +income+ " is " +(incomeTax*100)+ "%, and the tax is $" +tax+ "");
                
            }   //  end of if statement for income greater than or equal to $20,000 and less than $40,000
            
            //  if the user's income is greater than or equal to $40,000 and less than $78,000
            else if (incomeInThousands >= 40 && incomeInThousands < 78) {
                    
                //  make the income a double
                double doubleIncomeInThousands = (double) incomeInThousands;
                //  declare a variable for the income tax percentage
                double incomeTax = .12;
                //  get the actual income (not in thousands)
                double income = doubleIncomeInThousands * 1000;
                //  get the income tax
                double tax = income * incomeTax;
                //  print out the income, the tax rate, and the tax
                System.out.println("The tax rate on $" +income+ " is " +(incomeTax*100)+ "%, and the tax is $" +tax+ "");
                
            }   //  end of if statement for income greater than or equal to $40,000 and less than $78,000
            
            //  if the user's income is greater than or equal to $78,000
            else if (incomeInThousands >= 78)   {
                
                //  make the income a double
                double doubleIncomeInThousands = (double) incomeInThousands;
                //  declare a variable for the income tax percentage
                double incomeTax = .14;
                //  get the actual income (not in thousands)
                double income = doubleIncomeInThousands * 1000;
                //  get the income tax
                double tax = income * incomeTax;
                //  print out the income, the tax rate, and the tax
                System.out.println("The tax rate on $" +income+ " is " +(incomeTax*100)+ "%, and the tax is $" +tax+ "");
                
            }   //  end of if statement for income greater than or equal to $78,000
            
        }   //  end of if statement for user entering an integer
        
        else {
            //  print an error message if the user did not enter an integer
            System.out.println("Error: You must enter an integer");
            //  terminate program
            return;
        }
        
    }   //  end of main method
    
}   //  end of class
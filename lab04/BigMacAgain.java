// Katherine Porfirio

//  import scanner
import java.util.Scanner;

//  define a class
public class BigMacAgain {
    
    //	main method
    public static void main(String[] args) {
    
    //	create a scanner object
    Scanner input = new Scanner(System.in);
    
    //	prompt the user to enter the number of Big Macs
    System.out.print("Enter the number of Big Macs: ");
        
        //  if the input is an integer
        if (input.hasNextInt()) {
            
            //  accept user input
            int numberOfBigMacs = input.nextInt();
            
            //  if the integer is greater than zero
            if (numberOfBigMacs > 0)    {
                
                //  calculate the cost of the big macs and print the subtotal
                double bigMacCost = ((double) numberOfBigMacs) * 2.22;
                int intBigMacCost = (int) (bigMacCost * 100);
                double doubleBigMacCost = ((double) intBigMacCost) / 100;
                System.out.println("You ordered " +numberOfBigMacs+ " Big Macs for a subtotal of $" +doubleBigMacCost);
                
                //  determine if the user wants fries
                System.out.println("");
                System.out.println("Do you want fries with that?");
                System.out.println("    Please enter 'Y' or 'y' to answer 'yes'");
                System.out.println("    Please enter 'N' or 'n' to answer 'no'");
                System.out.println("");
                System.out.print("Please enter your choice: ");
                
                //  create a scanner object
                Scanner input2 = new Scanner(System.in);
                
                //  if the input is a string
                if (input2.hasNextLine())    {
                    
                    //  accept user input
                    String friesDecision = input2.nextLine();

                    //  check the length of the string
                    int length = friesDecision.length();
                    
                    //  if the length of the string is 1
                    if (length==1)  {
                        
                        //  if the user wants fries
                        
                        int costWithFries = (int) ((doubleBigMacCost + 2.15) * 100);
                        double realCostWithFries = ((double) costWithFries) / 100;
                        
                        if (friesDecision.equals("Y") || friesDecision.equals("y")) {
                            //  print subtotal of fries and total cost of the order
                            System.out.println("You ordered 1 order of fries for a subtotal of $2.15");
                            System.out.println("");
                            System.out.println("The total cost is: $" +realCostWithFries);
                        }   //  end of if statement if the user wants fries
                        
                        //  if the user does not want fries
                        else if (friesDecision.equals("N") || friesDecision.equals("n"))    {
                            //  print total cost of the order
                            System.out.println("");
                            System.out.println("The total cost is: $" +doubleBigMacCost);
                        }   //  end of else if statement if the user does not want fries
                        
                        //  if the user did not enter a valid character
                        else    {
                            //  print error statement
                            System.out.println("Error: You must enter a valid character");
                            //  terminate program
                            return;
                        }   //  end of else statement if the user did not enter a valid character
                        
                    }   //  end of if statement if the length of the string is 1
                    
                    //  if the length of the string is not 1
                    else    {
                        //  print error statement
                        System.out.println("Error: You must enter a single character");
                        //  terminate program
                        return;
                    }   //  end of else statement if the length of the string is not 1
                    
                }   //  end of if statement if input is a string
                
                //  if the input is not a string
                else    {
                    //  print error statement
                    System.out.println("Error: You must enter a valid input");
                    //  terminate program
                    return;
                }   //  end of else statement if the input is not a string
                
            }   //  end of if statement if integer is greater than zero
            
            //  if the integer is less than or equal to zero
            else    {
                //  print error message
                System.out.println("Error: You must enter an integer greater than zero");
                //  terminate program
                return;
            }   //  end of else statement if the integer is less than or equal to zero
            
        }   //  end of if statement if input is an integer
        
        //  if the input is not an integer
        else    {
            //  print error message
            System.out.println("Error: You must enter an integer value");
            //  terminate program
            return;
        }   //  end of else statement if the integer is not an integer
        
    }	//	end of main method

}	//	end of class

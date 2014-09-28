//  Katherine Porfirio
//  CSE 002 Section 110
//  09/27/2014

//  Homework #5
//  program asks the user if they want a burger, soda, or fries
//  program then asks for more details regarding their preferences
//  program generates an error message if the user enters an invalid input

//  import scanner
import java.util.Scanner;

//  define a class
public class BurgerKing {
    
    //  main method
    public static void main(String[] args)  {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to indicate their choice of food
        System.out.println("Enter a letter 'B', 'S', or 'F' to indicate your choice of food:");
        System.out.println("    Enter 'B' for Burger");
        System.out.println("    Enter 'S' for Soda");
        System.out.println("    Enter 'F' for Fries");
        System.out.println("");
        System.out.print("Please enter your choice: ");
        
        //  if the input is a string
        if (input.hasNextLine())    {
            
            //  accept user input
            String initialDecision = input.nextLine();
            
            //  check the length of the string
            int length = initialDecision.length();
            
            //  if the length of the string is 1
            if (length == 1)    {
                
                //  if the user wants a burger
                if (initialDecision.equals("B") || initialDecision.equals("b")) {
                    
                    //  prompt the user to enter their choice of condiments
                    System.out.println("");
                    System.out.println("Enter a letter 'A', 'C', or 'N' to indicate your choice of condiments:");
                    System.out.println("    Enter 'A' for all the condiments");
                    System.out.println("    Enter 'C' for cheese");
                    System.out.println("    Enter 'N' for no condiments");
                    System.out.println("");
                    System.out.print("Please enter your choice: ");
                    
                    //  if the burger input is a string
                    if (input.hasNextLine())    {
                        
                        //  accept user input
                        String burgerDecision = input.nextLine();
                        
                        //  check the length of the string
                        int lengthBurger = burgerDecision.length();
                        
                        //  if the length of the string is 1
                        if (lengthBurger == 1)  {
                            
                            //  if the user wants all the condiments on their burger
                            if (burgerDecision.equals("A") || burgerDecision.equals("a"))   {
                                //  print result
                                System.out.println("");
                                System.out.println("You ordered a burger with all the condiments on it");
                                System.out.println("Enjoy your burger!");
                            }   //  end of if statement if the user wants all the condiments on their burger
                            
                            //  if the user wants cheese on their burger
                            else if (burgerDecision.equals("C") || burgerDecision.equals("c"))   {
                                //  print result
                                System.out.println("");
                                System.out.println("You ordered a burger with cheese");
                                System.out.println("Enjoy your burger!");
                            }   //  end of else if statement if the user wants cheese on their burger
                            
                            //  if the user does not want anything on their burger
                            else if (burgerDecision.equals("N") || burgerDecision.equals("n"))  {
                                //  print result
                                System.out.println("");
                                System.out.println("You ordered a burger with nothing on it");
                                System.out.println("Enjoy your burger!");
                            }   //  end of else if statement if the user does not want any condiments on their burger
                            
                            //  if the user did not enter a valid character for choice of condiments on burger
                            else    {
                                //  print error statement
                                System.out.println("Error: You must enter a valid character to indicate your choice");
                                //  terminate program
                                return;
                            }   //  end of else statment if user did not enter a valid character for choice of condiments on burger
                            
                        }   //  end of if statement if the length of burgerDecision is 1
                        
                        //  if the length of burgerDecision is not 1
                        else    {
                            //  print error statement
                            System.out.println("Error: You must enter a single character to indicate your choice");
                            //  terminate program
                            return;
                        }   //  end of else statement if the length of burgerDecision is not 1
                        
                    }   //  end of if statement if the burger input is a string
                    
                    //  if burger input is not a string
                    else    {
                        //  print error message
                        System.out.println("Error: You must enter a single character to indicate your choice");
                        //  terminate program
                        return;
                    }   //  end of else statement if the burger input is not a string
                    
                    
                }   //  end of if statement if user wants a burger
                
                //  if the user wants a soda
                else if (initialDecision.equals("S") || initialDecision.equals("s")) {
                    
                    //  prompt the user to enter their choice of soda
                    System.out.println("");
                    System.out.println("Enter a letter 'P', 'C', 'S', or 'M' to indicate your choice of soda:");
                    System.out.println("    Enter 'P' for Pepsi");
                    System.out.println("    Enter 'C' for Coke");
                    System.out.println("    Enter 'S' for Sprite");
                    System.out.println("    Enter 'M' for Mountain Dew");
                    System.out.println("");
                    System.out.print("Please enter your choice: ");
                    
                    //  if the input is a string
                    if (input.hasNextLine())    {
                            
                        //  accept user input
                        String sodaDecision = input.nextLine();
                        
                        //  check the length of the string
                        int lengthSoda = sodaDecision.length();
                        
                        //  if the length of the string is 1
                        if (lengthSoda == 1)    {
                            
                            //  if the user wants a pepsi
                            if (sodaDecision.equals("P") || sodaDecision.equals("p"))   {
                                System.out.println("");
                                System.out.println("You ordered a Pepsi");
                                System.out.println("Enjoy your soda!");
                            }   //  end of if statement if the user wants a pepsi
                            
                            //  if the user wants a coke
                            else if (sodaDecision.equals("C") || sodaDecision.equals("c"))   {
                                System.out.println("");
                                System.out.println("You ordered a Coke");
                                System.out.println("Enjoy your soda!");
                            }   //  end of else if statement if the user wants a coke
                            
                            //  if the user wants a sprite
                            else if (sodaDecision.equals("S") || sodaDecision.equals("s"))   {
                                System.out.println("");
                                System.out.println("You ordered a Sprite");
                                System.out.println("Enjoy your soda!");
                            }   //  end of else if statement if the user wants a sprite
                            
                            //  if the user wants a mountain dew
                            else if (sodaDecision.equals("M") || sodaDecision.equals("m"))   {
                                System.out.println("");
                                System.out.println("You ordered a Mountain Dew");
                                System.out.println("Enjoy your soda!");
                            }   //  end of if statement else if the user wants a mountain dew
                            
                            //  if the user did not enter a valid character
                            else    {
                                //  print error statement
                                System.out.println("Error: You must enter a valid character to indicate your choice");
                                //  terminate program
                                return;
                            }   //  end of else statement if the user did not enter a valid character
                            
                        }   //  end of if statement if the length of the string is 1
                        
                        //  if the length of the string is not 1
                        else    {
                            //  print error statement
                            System.out.println("Error: You must enter a single character to indicate your choice");
                            //  terminate program
                            return;
                        }   //  end of else statement if the length of the string is not 1
                    
                    }   //  end of if statement if the soda input is a string
                    
                    //  if soda input is not a string
                    else    {
                        //  print error statement
                        System.out.println("Error: You must enter a single character to indicate your choice");
                        //  terminate program
                        return;
                    }   //  end of else statement if soda is not a string
                    
                }   //  end of else if statement if user wants a soda
                
                //  if the user wants fries
                else if (initialDecision.equals("F") || initialDecision.equals("f"))    {
                    
                    //  prompt the user to enter their choice of size
                    System.out.println("");
                    System.out.println("Enter a letter 'L' or 'S' to indicate your choice of size:");
                    System.out.println("    Enter 'L' for large fries");
                    System.out.println("    Enter 'S' for small fries");
                    System.out.println("");
                    System.out.print("Please enter your choice: ");
                    
                    //  if the input is a string
                    if (input.hasNextLine())    {
                            
                        //  accept user input
                        String friesDecision = input.nextLine();
                        
                        //  check the length of the string
                        int lengthFries = friesDecision.length();
                        
                        //  if the length of the string is 1
                        if (lengthFries == 1)    {
                            
                            //  if the user wants a large fries
                            if (friesDecision.equals("L") || friesDecision.equals("l"))  {
                                System.out.println("");
                                System.out.println("You ordered a Large Fries");
                                System.out.println("Enjoy your fries!");
                            }   //  end of if statement if the user wants a large fries
                            
                            //  if the user wants a small fries
                            else if (friesDecision.equals("S") || friesDecision.equals("s"))  {
                                System.out.println("");
                                System.out.println("You ordered a Small Fries");
                                System.out.println("Enjoy your fries!");
                            }   //  end of else if statement if the user wants a small fries
                            
                            //  if the user did not enter a valid character
                            else    {
                                //  print error statement
                                System.out.println("Error: You must enter a valid character to indicate your choice");
                                //  terminate program
                                return;
                            }   //  end of else statement if the user did not enter a valid character
                            
                        }   //  end of if statement if the length of the string is 1
                        
                        //  if the length of the string is not 1
                        else    {
                            //  print error statement
                            System.out.println("Error: You must enter a single character to indicate your choice");
                            //  terminate program
                            return;
                        }   //  end of if statement if the length of the string is not 1
                            
                    }   //  end of if statement if the input is a string
                    
                    //  if the fries input is not a string
                    else    {
                        //  print error statement
                        System.out.println("Error: You must enter a single character to indicate your choice");
                        //  terminate program
                        return;
                    }   //  end of else statement if the fries input is not a string
                    
                }   //  end of else if statement if user wants fries
                
                //  if the user did not enter a valid character
                else    {
                    //  print error message
                    System.out.println("Error: You must enter a valid character to indicate your choice");
                    //  terminate program
                    return;
                }   //  end of else statemet if user did not enter a valid character
                
            }   //  end of if statement if length of the initialDecision string is 1
            
            //  if the length of the string is not 1
            else    {
                //  print error message
                System.out.println("Error: You must enter a single character to indicate your choice");
                //  terminate program
                return;
            }   //  end of else statement if length of the initialDecision string is not 1
            
        }   //  end of if statement if input is a string
        
        //  if initial input is not a string
        else    {
            //  print error message
            System.out.println("Error: You must enter a single character to indicate your choice");
            //  terminate program
            return;
        }   //  end of else statement if initial input is not a string
        
        
    }   //  end of main method
    
}   //  end of class
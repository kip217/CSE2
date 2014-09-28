//  Katherine Porfirio
//  CSE 002 Section 110
//  09/26/2014

//  Lab #5

//  import scanner
import java.util.Scanner;

//  define a class
public class RandomGames    {
    
    //  main method
    public static void main(String[] args)  {
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  prompt the user to enter an integer
        System.out.println("Enter a letter 'R', 'C', or 'P' to indicate your choice of game:");
        System.out.println("    Enter 'R' to play Roulette");
        System.out.println("    Enter 'C' to play Craps");
        System.out.println("    Enter 'P' to pick a card from a deck of playing cards");
        System.out.println("");
        System.out.print("Please enter your choice of game: ");
        
        //  if the input is a string
        if (input.hasNextLine()) {
            
            //  accept user input
            String decision = input.nextLine();
            
            //  check the length of the string
            int length = decision.length();
            
            //  if the length of the string is 1 - continue program
            if (length == 1)    {
                
                //  if the user wants to play roulette
                if (decision.equals("R") || decision.equals("r"))    {
                    
                    //  generate a random number between 0 and 1
                    double randomNumber = Math.random();
                    //  multiply random number by 27
                    randomNumber = randomNumber * 37;
                    //  make random number an int
                    int randomInteger = (int) randomNumber;
                    
                    //print the number on the roulette
                    
                        //  if random number is between 0 and 36
                        if (randomInteger >= 0 && randomInteger <= 36)  {
                            //  print the number on the roulette
                            System.out.println("The number on the roulette is: " +randomInteger+ "");
                        }   //  end of if statement for random number between 0 and 36
                        
                        //  if the random number is 37 (print number 00)
                        if (randomInteger == 37)    {
                            //  print the number 00
                            System.out.println("The number on the roulette is: 00");
                        }   //  end of if statement if random number is 37
                    
                }   //  end of if statement if user wants to play roulette
                
                //  if the user wants to play craps
                else if (decision.equals("C") || decision.equals("c"))   {
                    
                    //  die #1
                        //  generate a random number between 0 and 1
                        double randomNumber1 = Math.random();
                        //  multiply random number by 6
                        randomNumber1 = randomNumber1 * 6;
                        //  make random number an int
                        int die1 = (int) randomNumber1;
                        
                    //  die #2
                        //  generate a random number between 0 and 1
                        double randomNumber2 = Math.random();
                        //  multiply random number by 6
                        randomNumber2 = randomNumber2 * 6;
                        //  make random number an int
                        int die2 = (int) randomNumber2;
                        
                    //  find sum of dice
                    int sum = die1 + die2;
                        
                    //  print statements
                        //  print the outcome of each die
                        System.out.println("Die #1: " +die1+ "");
                        System.out.println("Die #2: " +die2+ "");
                        System.out.println("Sum of dice: " +sum+ "");
                    
                }   //  end of if statement if user wants to play craps
                
                //  if the user wants to pick a card from a deck of playing cards
                else if (decision.equals("P") || decision.equals("p"))   {
                    
                    //  number / face on cards
                    
                        //  generate a random number between 0 and 1
                        double randomFace = Math.random();
                        //  multiply random number by 13
                        randomFace = randomFace * 13;
                        //  make random number an int
                        int randomFaceInt = (int) randomFace;
                        
                        //  if number is 1 - 10
                        if (randomFaceInt <= 10)    {
                            int face = randomFaceInt;
                        }   //  end of if statement if number is 1 - 10
                        
                        //  if number is 11 - 13
                        else    {
                            
                            //  face card is a jack
                            if (randomFaceInt == 11) {
                               String face = "Jack";
                           }    //  end of if statement for jacks
                           
                           //   face card is a queen
                           if (randomFaceInt == 12) {
                               String face = "Queen";
                           }    //  end of if statement for queens
                           
                           //   face card is a king
                           if (randomFaceInt == 13) {
                               String face = "King";
                           }    //  end of if statement for kings
                           
                        }   //  end of else statement for face cards
                        
                    //  symbol on cards - hearts, diamonds, spades or clubs
                    
                        //  generate a random number between 0 and 1
                        double randomSymbol = Math.random();
                        //  multiply random number by 4
                        randomSymbol = randomSymbol * 4;
                        //  make random number an int
                        int randomSymbolInt = (int) randomSymbol;
                        
                        //  symbol is heart
                        if (randomSymbolInt == 1)   {
                            String symbol = "Hearts";
                        }   //  end of if statement for heart symbol
                        
                        //  symbol is diamond
                        if (randomSymbolInt == 2)   {
                            String symbol = "Diamonds";
                        }   //  end of if statement for diamond symbol
                        
                        //  symbol is spade
                        if (randomSymbolInt == 3)   {
                            String symbol = "Spades";
                        }   //  end of if statement for spade symbol
                        
                        //  symbol is club
                        if (randomSymbolInt == 4)   {
                            String symbol = "Clubs";
                        }   //  end of if statement for club symbol
                        
                    //  print results
                    System.out.print("Your card is : ");
                    System.out.print(face)
                    
                }   //  end of if statement if user wants to pick a card from a deck
                
                //  if user does not enter a valid character
                else    {
                    //  print error statement
                    System.out.println("Error: You must enter either a valid character");
                    //  terminate program
                    return;
                }   //  end of else statement if user does not enter a valid character
                
            }   //  end of if statement if string is a single character
            
            //  if the length of the string is not 1
            else    {
                //  print error statement
                System.out.println("Error: You must enter a single character");
                //  terminate program
                return;
            }   //  end of else statement if length of string is not 1



        }   //  end of if statement if input is a char
        
        //  if the input is not a char
        else    {
            //  print error message
            System.out.println("Error: You must enter a single character");
            //  terminate program
            return;
        }   //  end of else statement if input is not an integer
        
        
    }   //  end of main method

}   //  end of class
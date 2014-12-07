//  Katherine Porfirio
//  CSE 002 Section 110
//  12/04/2014

//  Homework #11

//  import scanner
import java.util.Scanner;

//  define class
public class PokerHands {
    
    //  main method
    public static void main(String[] args)  {
        
        Scanner input = new Scanner(System.in);
        
        //  condition for loop
        String answer = "y";
        String suit = "a";
        
        //  loop for entering hands
        while (answer.equals("Y") || answer.equals("y"))    {
            
            //  prompt user
            System.out.print("Please enter 'Y' or 'y' to enter a hand: ");
            
            //  accept user input
                
                //  if user entered a string
                if (input.hasNextLine())    {
                    answer = input.nextLine();
                }
                
                //  if user did not enter a string
                else    {
                    answer = "no";
                }
            
            //  variables for user input
            String suitDecision = "0";
            String numDecision = "0";
            String suitDecision2 = "0";
            String numDecision2 = "0";
            String suitDecision3 = "0";
            String numDecision3 = "0";
            String suitDecision4 = "0";
            String numDecision4 = "0";
            String suitDecision5 = "0";
            String numDecision5 = "0";
            int card1 = 0;
            int card2 = 0;
            int card3 = 0;
            int card4 = 0;
            int card5 = 0;
            
            //  if user wants to enter a hand
            if (answer.equals("Y") || answer.equals("y"))   {
                
                System.out.println("");
                
                //
                // CARD #1:
                //
                
                //  which suit?
                    
                    System.out.print("   Enter the suit ('c', 'd', 'h', or 's'): ");
                    
                    //  accept user input
                    suitDecision = input.nextLine();
                    
                    //  if input is not valid
                    while ((suitDecision.equals("c") == false) && (suitDecision.equals("d") == false)    
                        && (suitDecision.equals("h") == false) && (suitDecision.equals("s") == false))    {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        suitDecision = input.nextLine();
                        
                        //  if valid input
                        if (suitDecision.equals("c") || suitDecision.equals("d") || suitDecision.equals("h")
                            || suitDecision.equals("s"))    {
                            break; 
                        }
                    }
                    
                System.out.println("");
                
                //  which number?
                    
                    System.out.print("   Enter one of 'a', 'k', 'q', 'j', '10', ... '2' : ");
                    
                    //  accept user input
                    numDecision = input.nextLine();
                    
                    //  if input is not valid
                    while ((numDecision.equals("a") == false) && (numDecision.equals("k") == false)    
                        && (numDecision.equals("q") == false) && (numDecision.equals("10") == false)
                        && (numDecision.equals("9") == false) && (numDecision.equals("8") == false)
                        && (numDecision.equals("7") == false) && (numDecision.equals("6") == false)
                        && (numDecision.equals("5") == false) && (numDecision.equals("4") == false)
                        && (numDecision.equals("3") == false) && (numDecision.equals("2") == false)
                        && (numDecision.equals("j") == false))  {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        numDecision = input.nextLine();
                        
                        //  if valid input
                        if (numDecision.equals("a") || numDecision.equals("k") || numDecision.equals("q")
                            || numDecision.equals("j") || numDecision.equals("10") || numDecision.equals("9")
                            || numDecision.equals("8") || numDecision.equals("7") || numDecision.equals("6")
                            || numDecision.equals("5") || numDecision.equals("4") || numDecision.equals("3")
                            || numDecision.equals("2")) {
                            break; 
                        }
                    }
                
                //  assign number to card 1
                    
                    if (suitDecision.equals("c"))   {
                        card1 = 0;
                    }
                    if (suitDecision.equals("d"))   {
                        card1 = 13;
                    }
                    if (suitDecision.equals("h"))   {
                        card1 = 26;
                    }
                    if (suitDecision.equals("s"))   {
                        card1 = 39;
                    }
                    
                    if (numDecision.equals("a"))    {
                        card1 += 1;
                    }
                    if (numDecision.equals("2"))    {
                        card1 += 2;
                    }
                    if (numDecision.equals("3"))    {
                        card1 += 3;
                    }
                    if (numDecision.equals("4"))    {
                        card1 += 4;
                    }
                    if (numDecision.equals("5"))    {
                        card1 += 5;
                    }
                    if (numDecision.equals("6"))    {
                        card1 += 6;
                    }
                    if (numDecision.equals("7"))    {
                        card1 += 7;
                    }
                    if (numDecision.equals("8"))    {
                        card1 += 8;
                    }
                    if (numDecision.equals("9"))    {
                        card1 += 9;
                    }
                    if (numDecision.equals("10"))    {
                        card1 += 10;
                    }
                    if (numDecision.equals("j"))    {
                        card1 += 11;
                    }
                    if (numDecision.equals("q"))    {
                        card1 += 12;
                    }
                    if (numDecision.equals("k"))    {
                        card1 += 13;
                    }
                
                System.out.println("");
                
                //
                // CARD #2:
                //
                
                //  which suit?
                    
                    System.out.print("   Enter the suit ('c', 'd', 'h', or 's'): ");
                    
                    //  accept user input
                    suitDecision2 = input.nextLine();
                    
                    //  if input is not valid
                    while ((suitDecision2.equals("c") == false) && (suitDecision2.equals("d") == false)    
                        && (suitDecision2.equals("h") == false) && (suitDecision2.equals("s") == false))    {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        suitDecision2 = input.nextLine();
                        
                        //  if valid input
                        if (suitDecision2.equals("c") || suitDecision2.equals("d") || suitDecision2.equals("h")
                            || suitDecision2.equals("s"))    {
                            break; 
                        }
                    }
                    
                System.out.println("");
                
                //  which number?
                    
                    System.out.print("   Enter one of 'a', 'k', 'q', 'j', '10', ... '2' : ");
                    
                    //  accept user input
                    numDecision2 = input.nextLine();
                    
                    //  if input is not valid
                    while ((numDecision2.equals("a") == false) && (numDecision2.equals("k") == false)    
                        && (numDecision2.equals("q") == false) && (numDecision2.equals("10") == false)
                        && (numDecision2.equals("9") == false) && (numDecision2.equals("8") == false)
                        && (numDecision2.equals("7") == false) && (numDecision2.equals("6") == false)
                        && (numDecision2.equals("5") == false) && (numDecision2.equals("4") == false)
                        && (numDecision2.equals("3") == false) && (numDecision2.equals("2") == false)
                        && (numDecision2.equals("j") == false))  {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        numDecision2 = input.nextLine();
                        
                        //  if valid input
                        if (numDecision2.equals("a") || numDecision2.equals("k") || numDecision2.equals("q")
                            || numDecision2.equals("j") || numDecision2.equals("10") || numDecision2.equals("9")
                            || numDecision2.equals("8") || numDecision2.equals("7") || numDecision2.equals("6")
                            || numDecision2.equals("5") || numDecision2.equals("4") || numDecision2.equals("3")
                            || numDecision2.equals("2")) {
                            break; 
                        }
                    }
                    
                //  assign number to card 2
                    
                    if (suitDecision2.equals("c"))   {
                        card2 += 0;
                    }
                    else if (suitDecision2.equals("d"))   {
                        card2 += 13;
                    }
                    else if (suitDecision2.equals("h"))   {
                        card2 += 26;
                    }
                    else    {
                        card2 += 39;
                    }
                    
                    if (numDecision2.equals("a"))    {
                        card2 += 1;
                    }
                    if (numDecision2.equals("2"))    {
                        card2 += 2;
                    }
                    if (numDecision2.equals("3"))    {
                        card2 += 3;
                    }
                    if (numDecision2.equals("4"))    {
                        card2 += 4;
                    }
                    if (numDecision2.equals("5"))    {
                        card2 += 5;
                    }
                    if (numDecision2.equals("6"))    {
                        card2 += 6;
                    }
                    if (numDecision2.equals("7"))    {
                        card2 += 7;
                    }
                    if (numDecision2.equals("8"))    {
                        card2 += 8;
                    }
                    if (numDecision2.equals("9"))    {
                        card2 += 9;
                    }
                    if (numDecision2.equals("10"))    {
                        card2 += 10;
                    }
                    if (numDecision2.equals("j"))    {
                        card2 += 11;
                    }
                    if (numDecision2.equals("q"))    {
                        card2 += 12;
                    }
                    if (numDecision2.equals("k"))    {
                        card2 += 13;
                    }
                
                while (card2 == card1)  {
                    
                    //  error statement
                    System.out.println("You already entered that card; try again: ");
                    
                    //  ask for input again
                    System.out.print("   Enter the suit ('c', 'd', 'h', or 's'): ");
                    
                    //  accept user input
                    suitDecision2 = input.nextLine();
                    
                    //  if input is not valid
                    while ((suitDecision2.equals("c") == false) && (suitDecision2.equals("d") == false)    
                        && (suitDecision2.equals("h") == false) && (suitDecision2.equals("s") == false))    {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        suitDecision2 = input.nextLine();
                        
                        //  if valid input
                        if (suitDecision2.equals("c") || suitDecision2.equals("d") || suitDecision2.equals("h")
                            || suitDecision2.equals("s"))    {
                            break; 
                        }
                    }
                    
                System.out.println("");
                
                //  which number?
                    
                    System.out.print("   Enter one of 'a', 'k', 'q', 'j', '10', ... '2' : ");
                    
                    //  accept user input
                    numDecision2 = input.nextLine();
                    
                    //  if input is not valid
                    while ((numDecision2.equals("a") == false) && (numDecision2.equals("k") == false)    
                        && (numDecision2.equals("q") == false) && (numDecision2.equals("10") == false)
                        && (numDecision2.equals("9") == false) && (numDecision2.equals("8") == false)
                        && (numDecision2.equals("7") == false) && (numDecision2.equals("6") == false)
                        && (numDecision2.equals("5") == false) && (numDecision2.equals("4") == false)
                        && (numDecision2.equals("3") == false) && (numDecision2.equals("2") == false)
                        && (numDecision2.equals("j") == false))  {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        numDecision2 = input.nextLine();
                        
                        //  if valid input
                        if (numDecision2.equals("a") || numDecision2.equals("k") || numDecision2.equals("q")
                            || numDecision2.equals("j") || numDecision2.equals("10") || numDecision2.equals("9")
                            || numDecision2.equals("8") || numDecision2.equals("7") || numDecision2.equals("6")
                            || numDecision2.equals("5") || numDecision2.equals("4") || numDecision2.equals("3")
                            || numDecision2.equals("2")) {
                            break; 
                        }
                    }
                    
                    //  assign number to card 2
                    
                    card2 = 0;
                    
                    if (suitDecision2.equals("c"))   {
                        card2 += 0;
                    }
                    else if (suitDecision2.equals("d"))   {
                        card2 += 13;
                    }
                    else if (suitDecision2.equals("h"))   {
                        card2 += 26;
                    }
                    else    {
                        card2 += 39;
                    }
                    
                    if (numDecision2.equals("a"))    {
                        card2 += 1;
                    }
                    if (numDecision2.equals("2"))    {
                        card2 += 2;
                    }
                    if (numDecision2.equals("3"))    {
                        card2 += 3;
                    }
                    if (numDecision2.equals("4"))    {
                        card2 += 4;
                    }
                    if (numDecision2.equals("5"))    {
                        card2 += 5;
                    }
                    if (numDecision2.equals("6"))    {
                        card2 += 6;
                    }
                    if (numDecision2.equals("7"))    {
                        card2 += 7;
                    }
                    if (numDecision2.equals("8"))    {
                        card2 += 8;
                    }
                    if (numDecision2.equals("9"))    {
                        card2 += 9;
                    }
                    if (numDecision2.equals("10"))    {
                        card2 += 10;
                    }
                    if (numDecision2.equals("j"))    {
                        card2 += 11;
                    }
                    if (numDecision2.equals("q"))    {
                        card2 += 12;
                    }
                    if (numDecision2.equals("k"))    {
                        card2 += 13;
                    }
                    
                }
                
                System.out.println("");
                
                //
                // CARD #3:
                //
                
                //  which suit?
                    
                    System.out.print("   Enter the suit ('c', 'd', 'h', or 's'): ");
                    
                    //  accept user input
                    suitDecision3 = input.nextLine();
                    
                    //  if input is not valid
                    while ((suitDecision3.equals("c") == false) && (suitDecision3.equals("d") == false)    
                        && (suitDecision3.equals("h") == false) && (suitDecision3.equals("s") == false))    {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        suitDecision3 = input.nextLine();
                        
                        //  if valid input
                        if (suitDecision3.equals("c") || suitDecision3.equals("d") || suitDecision3.equals("h")
                            || suitDecision3.equals("s"))    {
                            break; 
                        }
                    }
                    
                System.out.println("");
                
                //  which number?
                    
                    System.out.print("   Enter one of 'a', 'k', 'q', 'j', '10', ... '2' : ");
                    
                    //  accept user input
                    numDecision3 = input.nextLine();
                    
                    //  if input is not valid
                    while ((numDecision3.equals("a") == false) && (numDecision3.equals("k") == false)    
                        && (numDecision3.equals("q") == false) && (numDecision3.equals("10") == false)
                        && (numDecision3.equals("9") == false) && (numDecision3.equals("8") == false)
                        && (numDecision3.equals("7") == false) && (numDecision3.equals("6") == false)
                        && (numDecision3.equals("5") == false) && (numDecision3.equals("4") == false)
                        && (numDecision3.equals("3") == false) && (numDecision3.equals("2") == false)
                        && (numDecision3.equals("j") == false))  {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        numDecision3 = input.nextLine();
                        
                        //  if valid input
                        if (numDecision3.equals("a") || numDecision3.equals("k") || numDecision3.equals("q")
                            || numDecision3.equals("j") || numDecision3.equals("10") || numDecision3.equals("9")
                            || numDecision3.equals("8") || numDecision3.equals("7") || numDecision3.equals("6")
                            || numDecision3.equals("5") || numDecision3.equals("4") || numDecision3.equals("3")
                            || numDecision3.equals("2")) {
                            break; 
                        }
                    }
                    
                //  assign number to card 3
                    
                    if (suitDecision3.equals("c"))   {
                        card3 += 0;
                    }
                    else if (suitDecision3.equals("d"))   {
                        card3 += 13;
                    }
                    else if (suitDecision3.equals("h"))   {
                        card3 += 26;
                    }
                    else    {
                        card3 += 39;
                    }
                    
                    if (numDecision3.equals("a"))    {
                        card3 += 1;
                    }
                    if (numDecision3.equals("2"))    {
                        card3 += 2;
                    }
                    if (numDecision3.equals("3"))    {
                        card3 += 3;
                    }
                    if (numDecision3.equals("4"))    {
                        card3 += 4;
                    }
                    if (numDecision3.equals("5"))    {
                        card3 += 5;
                    }
                    if (numDecision3.equals("6"))    {
                        card3 += 6;
                    }
                    if (numDecision3.equals("7"))    {
                        card3 += 7;
                    }
                    if (numDecision3.equals("8"))    {
                        card3 += 8;
                    }
                    if (numDecision3.equals("9"))    {
                        card3 += 9;
                    }
                    if (numDecision3.equals("10"))    {
                        card3 += 10;
                    }
                    if (numDecision3.equals("j"))    {
                        card3 += 11;
                    }
                    if (numDecision3.equals("q"))    {
                        card3 += 12;
                    }
                    if (numDecision3.equals("k"))    {
                        card3 += 13;
                    }
                
                while ((card3 == card2) || (card3 == card1))    {
                    
                    //  error statement
                    System.out.println("You already entered that card; try again: ");
                    
                    //  ask for input again
                    System.out.print("   Enter the suit ('c', 'd', 'h', or 's'): ");
                    
                    //  accept user input
                    suitDecision3 = input.nextLine();
                    
                    //  if input is not valid
                    while ((suitDecision3.equals("c") == false) && (suitDecision3.equals("d") == false)    
                        && (suitDecision3.equals("h") == false) && (suitDecision3.equals("s") == false))    {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        suitDecision3 = input.nextLine();
                        
                        //  if valid input
                        if (suitDecision3.equals("c") || suitDecision3.equals("d") || suitDecision3.equals("h")
                            || suitDecision3.equals("s"))    {
                            break; 
                        }
                    }
                    
                System.out.println("");
                
                //  which number?
                    
                    System.out.print("   Enter one of 'a', 'k', 'q', 'j', '10', ... '2' : ");
                    
                    //  accept user input
                    numDecision3 = input.nextLine();
                    
                    //  if input is not valid
                    while ((numDecision3.equals("a") == false) && (numDecision3.equals("k") == false)    
                        && (numDecision3.equals("q") == false) && (numDecision3.equals("10") == false)
                        && (numDecision3.equals("9") == false) && (numDecision3.equals("8") == false)
                        && (numDecision3.equals("7") == false) && (numDecision3.equals("6") == false)
                        && (numDecision3.equals("5") == false) && (numDecision3.equals("4") == false)
                        && (numDecision3.equals("3") == false) && (numDecision3.equals("2") == false)
                        && (numDecision3.equals("j") == false))  {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        numDecision3 = input.nextLine();
                        
                        //  if valid input
                        if (numDecision3.equals("a") || numDecision3.equals("k") || numDecision3.equals("q")
                            || numDecision3.equals("j") || numDecision3.equals("10") || numDecision3.equals("9")
                            || numDecision3.equals("8") || numDecision3.equals("7") || numDecision3.equals("6")
                            || numDecision3.equals("5") || numDecision3.equals("4") || numDecision3.equals("3")
                            || numDecision3.equals("2")) {
                            break; 
                        }
                    }
                    
                    //  assign number to card 3
                    
                    card3 = 0;
                    
                    if (suitDecision3.equals("c"))   {
                        card3 += 0;
                    }
                    else if (suitDecision3.equals("d"))   {
                        card3 += 13;
                    }
                    else if (suitDecision3.equals("h"))   {
                        card3 += 26;
                    }
                    else    {
                        card3 += 39;
                    }
                    
                    if (numDecision3.equals("a"))    {
                        card3 += 1;
                    }
                    if (numDecision3.equals("2"))    {
                        card3 += 2;
                    }
                    if (numDecision3.equals("3"))    {
                        card3 += 3;
                    }
                    if (numDecision3.equals("4"))    {
                        card3 += 4;
                    }
                    if (numDecision3.equals("5"))    {
                        card3 += 5;
                    }
                    if (numDecision3.equals("6"))    {
                        card3 += 6;
                    }
                    if (numDecision3.equals("7"))    {
                        card3 += 7;
                    }
                    if (numDecision3.equals("8"))    {
                        card3 += 8;
                    }
                    if (numDecision3.equals("9"))    {
                        card3 += 9;
                    }
                    if (numDecision3.equals("10"))    {
                        card3 += 10;
                    }
                    if (numDecision3.equals("j"))    {
                        card3 += 11;
                    }
                    if (numDecision3.equals("q"))    {
                        card3 += 12;
                    }
                    if (numDecision3.equals("k"))    {
                        card3 += 13;
                    }
                      
                }
                
                System.out.println("");
                
                 //
                // CARD #4:
                //
                
                //  which suit?
                    
                    System.out.print("   Enter the suit ('c', 'd', 'h', or 's'): ");
                    
                    //  accept user input
                    suitDecision4 = input.nextLine();
                    
                    //  if input is not valid
                    while ((suitDecision4.equals("c") == false) && (suitDecision4.equals("d") == false)    
                        && (suitDecision4.equals("h") == false) && (suitDecision4.equals("s") == false))    {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        suitDecision4 = input.nextLine();
                        
                        //  if valid input
                        if (suitDecision4.equals("c") || suitDecision4.equals("d") || suitDecision4.equals("h")
                            || suitDecision4.equals("s"))    {
                            break; 
                        }
                    }
                    
                System.out.println("");
                
                //  which number?
                    
                    System.out.print("   Enter one of 'a', 'k', 'q', 'j', '10', ... '2' : ");
                    
                    //  accept user input
                    numDecision4 = input.nextLine();
                    
                    //  if input is not valid
                    while ((numDecision4.equals("a") == false) && (numDecision4.equals("k") == false)    
                        && (numDecision4.equals("q") == false) && (numDecision4.equals("10") == false)
                        && (numDecision4.equals("9") == false) && (numDecision4.equals("8") == false)
                        && (numDecision4.equals("7") == false) && (numDecision4.equals("6") == false)
                        && (numDecision4.equals("5") == false) && (numDecision4.equals("4") == false)
                        && (numDecision4.equals("3") == false) && (numDecision4.equals("2") == false)
                        && (numDecision4.equals("j") == false))  {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        numDecision4 = input.nextLine();
                        
                        //  if valid input
                        if (numDecision4.equals("a") || numDecision4.equals("k") || numDecision4.equals("q")
                            || numDecision4.equals("j") || numDecision4.equals("10") || numDecision4.equals("9")
                            || numDecision4.equals("8") || numDecision4.equals("7") || numDecision4.equals("6")
                            || numDecision4.equals("5") || numDecision4.equals("4") || numDecision4.equals("3")
                            || numDecision4.equals("2")) {
                            break; 
                        }
                    }
                
                //  assign number to card 4
                    
                    if (suitDecision4.equals("c"))   {
                        card4 += 0;
                    }
                    else if (suitDecision4.equals("d"))   {
                        card4 += 13;
                    }
                    else if (suitDecision4.equals("h"))   {
                        card4 += 26;
                    }
                    else    {
                        card4 += 39;
                    }
                    
                    if (numDecision4.equals("a"))    {
                        card4 += 1;
                    }
                    if (numDecision4.equals("2"))    {
                        card4 += 2;
                    }
                    if (numDecision4.equals("3"))    {
                        card4 += 3;
                    }
                    if (numDecision4.equals("4"))    {
                        card4 += 4;
                    }
                    if (numDecision4.equals("5"))    {
                        card4 += 5;
                    }
                    if (numDecision4.equals("6"))    {
                        card4 += 6;
                    }
                    if (numDecision4.equals("7"))    {
                        card4 += 7;
                    }
                    if (numDecision4.equals("8"))    {
                        card4 += 8;
                    }
                    if (numDecision4.equals("9"))    {
                        card4 += 9;
                    }
                    if (numDecision4.equals("10"))    {
                        card4 += 10;
                    }
                    if (numDecision4.equals("j"))    {
                        card4 += 11;
                    }
                    if (numDecision4.equals("q"))    {
                        card4 += 12;
                    }
                    if (numDecision4.equals("k"))    {
                        card4 += 13;
                    }
                
                while ((card4 == card3) || (card4 == card2) || (card4 == card1))    {
                    
                    //  error statement
                    System.out.println("You already entered that card; try again: ");
                    
                    //  ask for input again
                    System.out.print("   Enter the suit ('c', 'd', 'h', or 's'): ");
                    
                    //  accept user input
                    suitDecision4 = input.nextLine();
                    
                    //  if input is not valid
                    while ((suitDecision4.equals("c") == false) && (suitDecision4.equals("d") == false)    
                        && (suitDecision4.equals("h") == false) && (suitDecision4.equals("s") == false))    {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        suitDecision4 = input.nextLine();
                        
                        //  if valid input
                        if (suitDecision4.equals("c") || suitDecision4.equals("d") || suitDecision4.equals("h")
                            || suitDecision4.equals("s"))    {
                            break; 
                        }
                    }
                    
                System.out.println("");
                
                //  which number?
                    
                    System.out.print("   Enter one of 'a', 'k', 'q', 'j', '10', ... '2' : ");
                    
                    //  accept user input
                    numDecision4 = input.nextLine();
                    
                    //  if input is not valid
                    while ((numDecision4.equals("a") == false) && (numDecision4.equals("k") == false)    
                        && (numDecision4.equals("q") == false) && (numDecision4.equals("10") == false)
                        && (numDecision4.equals("9") == false) && (numDecision4.equals("8") == false)
                        && (numDecision4.equals("7") == false) && (numDecision4.equals("6") == false)
                        && (numDecision4.equals("5") == false) && (numDecision4.equals("4") == false)
                        && (numDecision4.equals("3") == false) && (numDecision4.equals("2") == false)
                        && (numDecision4.equals("j") == false))  {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        numDecision4 = input.nextLine();
                        
                        //  if valid input
                        if (numDecision4.equals("a") || numDecision4.equals("k") || numDecision4.equals("q")
                            || numDecision4.equals("j") || numDecision4.equals("10") || numDecision4.equals("9")
                            || numDecision4.equals("8") || numDecision4.equals("7") || numDecision4.equals("6")
                            || numDecision4.equals("5") || numDecision4.equals("4") || numDecision4.equals("3")
                            || numDecision4.equals("2")) {
                            break; 
                        }
                    }
                
                //  assign number to card 4
                
                    card4 = 0;
                    
                    if (suitDecision4.equals("c"))   {
                        card4 += 0;
                    }
                    else if (suitDecision4.equals("d"))   {
                        card4 += 13;
                    }
                    else if (suitDecision4.equals("h"))   {
                        card4 += 26;
                    }
                    else    {
                        card4 += 39;
                    }
                    
                    if (numDecision4.equals("a"))    {
                        card4 += 1;
                    }
                    if (numDecision4.equals("2"))    {
                        card4 += 2;
                    }
                    if (numDecision4.equals("3"))    {
                        card4 += 3;
                    }
                    if (numDecision4.equals("4"))    {
                        card4 += 4;
                    }
                    if (numDecision4.equals("5"))    {
                        card4 += 5;
                    }
                    if (numDecision4.equals("6"))    {
                        card4 += 6;
                    }
                    if (numDecision4.equals("7"))    {
                        card4 += 7;
                    }
                    if (numDecision4.equals("8"))    {
                        card4 += 8;
                    }
                    if (numDecision4.equals("9"))    {
                        card4 += 9;
                    }
                    if (numDecision4.equals("10"))    {
                        card4 += 10;
                    }
                    if (numDecision4.equals("j"))    {
                        card4 += 11;
                    }
                    if (numDecision4.equals("q"))    {
                        card4 += 12;
                    }
                    if (numDecision4.equals("k"))    {
                        card4 += 13;
                    }
                    
                }
                
                System.out.println("");
                
                //
                // CARD #5:
                //
                
                //  which suit?
                    
                    System.out.print("   Enter the suit ('c', 'd', 'h', or 's'): ");
                    
                    //  accept user input
                    suitDecision5 = input.nextLine();
                    
                    //  if input is not valid
                    while ((suitDecision5.equals("c") == false) && (suitDecision5.equals("d") == false)    
                        && (suitDecision5.equals("h") == false) && (suitDecision5.equals("s") == false))    {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        suitDecision5 = input.nextLine();
                        
                        //  if valid input
                        if (suitDecision5.equals("c") || suitDecision5.equals("d") || suitDecision5.equals("h")
                            || suitDecision5.equals("s"))    {
                            break; 
                        }
                    }
                    
                System.out.println("");
                
                //  which number?
                    
                    System.out.print("   Enter one of 'a', 'k', 'q', 'j', '10', ... '2' : ");
                    
                    //  accept user input
                    numDecision5 = input.nextLine();
                    
                    //  if input is not valid
                    while ((numDecision5.equals("a") == false) && (numDecision5.equals("k") == false)    
                        && (numDecision5.equals("q") == false) && (numDecision5.equals("10") == false)
                        && (numDecision5.equals("9") == false) && (numDecision5.equals("8") == false)
                        && (numDecision5.equals("7") == false) && (numDecision5.equals("6") == false)
                        && (numDecision5.equals("5") == false) && (numDecision5.equals("4") == false)
                        && (numDecision5.equals("3") == false) && (numDecision5.equals("2") == false)
                        && (numDecision5.equals("j") == false))  {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        numDecision5 = input.nextLine();
                        
                        //  if valid input
                        if (numDecision5.equals("a") || numDecision5.equals("k") || numDecision5.equals("q")
                            || numDecision5.equals("j") || numDecision5.equals("10") || numDecision5.equals("9")
                            || numDecision5.equals("8") || numDecision5.equals("7") || numDecision5.equals("6")
                            || numDecision5.equals("5") || numDecision5.equals("4") || numDecision5.equals("3")
                            || numDecision5.equals("2")) {
                            break; 
                        }
                    }
                
                //  assign number to card 5
                    
                    if (suitDecision5.equals("c"))   {
                        card5 = 0;
                    }
                    if (suitDecision5.equals("d"))   {
                        card5 = 13;
                    }
                    if (suitDecision5.equals("h"))   {
                        card5 = 26;
                    }
                    if (suitDecision5.equals("s"))   {
                        card5 = 39;
                    }
                    
                    if (numDecision5.equals("a"))    {
                        card5 += 1;
                    }
                    if (numDecision5.equals("2"))    {
                        card5 += 2;
                    }
                    if (numDecision5.equals("3"))    {
                        card5 += 3;
                    }
                    if (numDecision5.equals("4"))    {
                        card5 += 4;
                    }
                    if (numDecision5.equals("5"))    {
                        card5 += 5;
                    }
                    if (numDecision5.equals("6"))    {
                        card5 += 6;
                    }
                    if (numDecision5.equals("7"))    {
                        card5 += 7;
                    }
                    if (numDecision5.equals("8"))    {
                        card5 += 8;
                    }
                    if (numDecision5.equals("9"))    {
                        card5 += 9;
                    }
                    if (numDecision5.equals("10"))    {
                        card5 += 10;
                    }
                    if (numDecision5.equals("j"))    {
                        card5 += 11;
                    }
                    if (numDecision5.equals("q"))    {
                        card5 += 12;
                    }
                    if (numDecision5.equals("k"))    {
                        card5 += 13;
                    }
                
                while ((card5 == card4) || (card5 == card3) || (card5 == card2) || (card5 == card1))    {
                    
                    //  error statement
                    System.out.println("You already entered that card; try again: ");
                    
                    //  ask for input again
                    System.out.print("   Enter the suit ('c', 'd', 'h', or 's'): ");
                    
                    //  accept user input
                    suitDecision5 = input.nextLine();
                    
                    //  if input is not valid
                    while ((suitDecision5.equals("c") == false) && (suitDecision5.equals("d") == false)    
                        && (suitDecision5.equals("h") == false) && (suitDecision5.equals("s") == false))    {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        suitDecision5 = input.nextLine();
                        
                        //  if valid input
                        if (suitDecision5.equals("c") || suitDecision5.equals("d") || suitDecision5.equals("h")
                            || suitDecision5.equals("s"))    {
                            break; 
                        }
                    }
                    
                System.out.println("");
                
                //  which number?
                    
                    System.out.print("   Enter one of 'a', 'k', 'q', 'j', '10', ... '2' : ");
                    
                    //  accept user input
                    numDecision5 = input.nextLine();
                    
                    //  if input is not valid
                    while ((numDecision5.equals("a") == false) && (numDecision5.equals("k") == false)    
                        && (numDecision5.equals("q") == false) && (numDecision5.equals("10") == false)
                        && (numDecision5.equals("9") == false) && (numDecision5.equals("8") == false)
                        && (numDecision5.equals("7") == false) && (numDecision5.equals("6") == false)
                        && (numDecision5.equals("5") == false) && (numDecision5.equals("4") == false)
                        && (numDecision5.equals("3") == false) && (numDecision5.equals("2") == false)
                        && (numDecision5.equals("j") == false))  {
                        
                        //  get rid of user input; prompt user again
                        System.out.print("You did not enter a valid input; try again: ");
                        
                        //  accept user input again
                        numDecision5 = input.nextLine();
                        
                        //  if valid input
                        if (numDecision5.equals("a") || numDecision5.equals("k") || numDecision5.equals("q")
                            || numDecision5.equals("j") || numDecision5.equals("10") || numDecision5.equals("9")
                            || numDecision5.equals("8") || numDecision5.equals("7") || numDecision5.equals("6")
                            || numDecision5.equals("5") || numDecision5.equals("4") || numDecision5.equals("3")
                            || numDecision5.equals("2")) {
                            break; 
                        }
                    }
                
                //  assign number to card 5
                
                    card5 = 0;
                    
                    if (suitDecision5.equals("c"))   {
                        card5 = 0;
                    }
                    if (suitDecision5.equals("d"))   {
                        card5 = 13;
                    }
                    if (suitDecision5.equals("h"))   {
                        card5 = 26;
                    }
                    if (suitDecision5.equals("s"))   {
                        card5 = 39;
                    }
                    
                    if (numDecision5.equals("a"))    {
                        card5 += 1;
                    }
                    if (numDecision5.equals("2"))    {
                        card5 += 2;
                    }
                    if (numDecision5.equals("3"))    {
                        card5 += 3;
                    }
                    if (numDecision5.equals("4"))    {
                        card5 += 4;
                    }
                    if (numDecision5.equals("5"))    {
                        card5 += 5;
                    }
                    if (numDecision5.equals("6"))    {
                        card5 += 6;
                    }
                    if (numDecision5.equals("7"))    {
                        card5 += 7;
                    }
                    if (numDecision5.equals("8"))    {
                        card5 += 8;
                    }
                    if (numDecision5.equals("9"))    {
                        card5 += 9;
                    }
                    if (numDecision5.equals("10"))    {
                        card5 += 10;
                    }
                    if (numDecision5.equals("j"))    {
                        card5 += 11;
                    }
                    if (numDecision5.equals("q"))    {
                        card5 += 12;
                    }
                    if (numDecision5.equals("k"))    {
                        card5 += 13;
                    }
                    
                }
                
                System.out.println("");
                
                //  variables for printing cards
                
                String clubs = " ";
                String diamonds = " ";
                String hearts = " ";
                String spades = " ";
                
                String stringCard1C = card1 + " ";
                    
                    if (stringCard1C.equals("1 "))  {
                        stringCard1C = "A ";
                    }
                    if (stringCard1C.equals("11 "))  {
                        stringCard1C = "J ";
                    }
                    if (stringCard1C.equals("12 "))  {
                        stringCard1C = "Q ";
                    }
                    if (stringCard1C.equals("13 "))  {
                        stringCard1C = "K ";
                    }
                    
                String stringCard2C = card2 + " ";
                    
                    if (stringCard2C.equals("1 "))  {
                        stringCard2C = "A ";
                    }
                    if (stringCard2C.equals("11 "))  {
                        stringCard2C = "J ";
                    }
                    if (stringCard2C.equals("12 "))  {
                        stringCard2C = "Q ";
                    }
                    if (stringCard2C.equals("13 "))  {
                        stringCard2C = "K ";
                    }
                    
                String stringCard3C = card3 + " ";
                    
                    if (stringCard3C.equals("1 "))  {
                        stringCard3C = "A ";
                    }
                    if (stringCard3C.equals("11 "))  {
                        stringCard3C = "J ";
                    }
                    if (stringCard3C.equals("12 "))  {
                        stringCard3C = "Q ";
                    }
                    if (stringCard3C.equals("13 "))  {
                        stringCard3C = "K ";
                    }
                    
                String stringCard4C = card4 + " ";
                    
                    if (stringCard4C.equals("1 "))  {
                        stringCard4C = "A ";
                    }
                    if (stringCard4C.equals("11 "))  {
                        stringCard4C = "J ";
                    }
                    if (stringCard4C.equals("12 "))  {
                        stringCard4C = "Q ";
                    }
                    if (stringCard4C.equals("13 "))  {
                        stringCard4C = "K ";
                    }
                    
                String stringCard5C = card5 + " ";
                    
                    if (stringCard5C.equals("1 "))  {
                        stringCard5C = "A ";
                    }
                    if (stringCard5C.equals("11 "))  {
                        stringCard5C = "J ";
                    }
                    if (stringCard5C.equals("12 "))  {
                        stringCard5C = "Q ";
                    }
                    if (stringCard5C.equals("13 "))  {
                        stringCard5C = "K ";
                    }
                    
                String stringCard1D = (card1 - 13) + " ";
                    
                    if (stringCard1D.equals("1 "))  {
                        stringCard1D = "A ";
                    }
                    if (stringCard1D.equals("11 "))  {
                        stringCard1D = "J ";
                    }
                    if (stringCard1D.equals("12 "))  {
                        stringCard1D = "Q ";
                    }
                    if (stringCard1D.equals("13 "))  {
                        stringCard1D = "K ";
                    }
                    
                String stringCard2D = (card2 - 13) + " ";
                    
                   if (stringCard2D.equals("1 "))  {
                        stringCard2D = "A ";
                    }
                    if (stringCard2D.equals("11 "))  {
                        stringCard2D = "J ";
                    }
                    if (stringCard2D.equals("12 "))  {
                        stringCard2D = "Q ";
                    }
                    if (stringCard2D.equals("13 "))  {
                        stringCard2D = "K ";
                    } 
                    
                String stringCard3D = (card3 - 13) + " ";
                    
                    if (stringCard3D.equals("1 "))  {
                        stringCard3D = "A ";
                    }
                    if (stringCard3D.equals("11 "))  {
                        stringCard3D = "J ";
                    }
                    if (stringCard3D.equals("12 "))  {
                        stringCard3D = "Q ";
                    }
                    if (stringCard3D.equals("13 "))  {
                        stringCard3D = "K ";
                    }
                    
                String stringCard4D = (card4 - 13) + " ";
                    
                    if (stringCard4D.equals("1 "))  {
                        stringCard4D = "A ";
                    }
                    if (stringCard4D.equals("11 "))  {
                        stringCard4D = "J ";
                    }
                    if (stringCard4D.equals("12 "))  {
                        stringCard4D = "Q ";
                    }
                    if (stringCard4D.equals("13 "))  {
                        stringCard4D = "K ";
                    }
                    
                String stringCard5D = (card5 - 13) + " ";
                    
                    if (stringCard5D.equals("1 "))  {
                        stringCard5D = "A ";
                    }
                    if (stringCard5D.equals("11 "))  {
                        stringCard5D = "J ";
                    }
                    if (stringCard5D.equals("12 "))  {
                        stringCard5D = "Q ";
                    }
                    if (stringCard5D.equals("13 "))  {
                        stringCard5D = "K ";
                    }
                    
                String stringCard1H = (card1 - 26) + " ";
                    
                    if (stringCard1H.equals("1 "))  {
                        stringCard1H = "A ";
                    }
                    if (stringCard1H.equals("11 "))  {
                        stringCard1H = "J ";
                    }
                    if (stringCard1H.equals("12 "))  {
                        stringCard1H = "Q ";
                    }
                    if (stringCard1H.equals("13 "))  {
                        stringCard1H = "K ";
                    }
                    
                String stringCard2H = (card2 - 26) + " ";
                    
                    if (stringCard2H.equals("1 "))  {
                        stringCard2H = "A ";
                    }
                    if (stringCard2H.equals("11 "))  {
                        stringCard2H = "J ";
                    }
                    if (stringCard2H.equals("12 "))  {
                        stringCard2H = "Q ";
                    }
                    if (stringCard2H.equals("13 "))  {
                        stringCard2H = "K ";
                    }
                    
                String stringCard3H = (card3 - 26) + " ";
                    
                    if (stringCard3H.equals("1 "))  {
                        stringCard3H = "A ";
                    }
                    if (stringCard3H.equals("11 "))  {
                        stringCard3H = "J ";
                    }
                    if (stringCard3H.equals("12 "))  {
                        stringCard3H = "Q ";
                    }
                    if (stringCard3H.equals("13 "))  {
                        stringCard3H = "K ";
                    }
                    
                String stringCard4H = (card4 - 26) + " ";
                    
                    if (stringCard4H.equals("1 "))  {
                        stringCard4H = "A ";
                    }
                    if (stringCard4H.equals("11 "))  {
                        stringCard4H = "J ";
                    }
                    if (stringCard4H.equals("12 "))  {
                        stringCard4H = "Q ";
                    }
                    if (stringCard4H.equals("13 "))  {
                        stringCard4H = "K ";
                    }
                    
                String stringCard5H = (card5 - 26) + " ";
                    
                    if (stringCard5H.equals("1 "))  {
                        stringCard5H = "A ";
                    }
                    if (stringCard5H.equals("11 "))  {
                        stringCard5H = "J ";
                    }
                    if (stringCard5H.equals("12 "))  {
                        stringCard5H = "Q ";
                    }
                    if (stringCard5H.equals("13 "))  {
                        stringCard5H = "K ";
                    }
                    
                String stringCard1S = (card1 - 39) + " ";
                    
                    if (stringCard1S.equals("1 "))  {
                        stringCard1S = "A ";
                    }
                    if (stringCard1S.equals("11 "))  {
                        stringCard1S = "J ";
                    }
                    if (stringCard1S.equals("12 "))  {
                        stringCard1S = "Q ";
                    }
                    if (stringCard1S.equals("13 "))  {
                        stringCard1S = "K ";
                    }
                    
                String stringCard2S = (card2 - 39) + " ";
                    
                    if (stringCard2S.equals("1 "))  {
                        stringCard2S = "A ";
                    }
                    if (stringCard2S.equals("11 "))  {
                        stringCard2S = "J ";
                    }
                    if (stringCard2S.equals("12 "))  {
                        stringCard2S = "Q ";
                    }
                    if (stringCard2S.equals("13 "))  {
                        stringCard2S = "K ";
                    }
                    
                String stringCard3S = (card3 - 39) + " ";
                    
                    if (stringCard3S.equals("1 "))  {
                        stringCard3S = "A ";
                    }
                    if (stringCard3S.equals("11 "))  {
                        stringCard3S = "J ";
                    }
                    if (stringCard3S.equals("12 "))  {
                        stringCard3S = "Q ";
                    }
                    if (stringCard3S.equals("13 "))  {
                        stringCard3S = "K ";
                    }
                    
                String stringCard4S = (card4 - 39) + " ";
                    
                    if (stringCard4S.equals("1 "))  {
                        stringCard4S = "A ";
                    }
                    if (stringCard4S.equals("11 "))  {
                        stringCard4S = "J ";
                    }
                    if (stringCard4S.equals("12 "))  {
                        stringCard4S = "Q ";
                    }
                    if (stringCard4S.equals("13 "))  {
                        stringCard4S = "K ";
                    }
                    
                String stringCard5S = (card5 - 39) + " ";
                    
                    if (stringCard5S.equals("1 "))  {
                        stringCard5S = "A ";
                    }
                    if (stringCard5S.equals("11 "))  {
                        stringCard5S = "J ";
                    }
                    if (stringCard5S.equals("12 "))  {
                        stringCard5S = "Q ";
                    }
                    if (stringCard5S.equals("13 "))  {
                        stringCard5S = "K ";
                    }
                    
                
                //  determine how many cards with clubs there are
                if (card1 > 0 && card1 < 14)    {
                    clubs += stringCard1C;
                }
                if (card2 > 0 && card2 < 14)    {
                    clubs += stringCard2C;
                }
                if (card3 > 0 && card3 < 14)    {
                    clubs += stringCard3C;
                }
                if (card4 > 0 && card4 < 14)    {
                    clubs += stringCard4C;
                }
                if (card5 > 0 && card5 < 14)    {
                    clubs += stringCard5C;
                }
                
                //  determine how many cards with diamonds there are
                if (card1 > 13 && card1 < 27)    {
                    diamonds += stringCard1D;
                }
                if (card2 > 13 && card2 < 27)    {
                    diamonds += stringCard2D;
                }
                if (card3 > 13 && card3 < 27)    {
                    diamonds += stringCard3D;
                }
                if (card4 > 13 && card4 < 27)    {
                    diamonds += stringCard4D;
                }
                if (card5 > 13 && card5 < 27)    {
                    diamonds += stringCard5D;
                }
                
                //  determine how many cards with hearts there are
                if (card1 > 26 && card1 < 40)    {
                    hearts += stringCard1H;
                }
                if (card2 > 26 && card2 < 40)    {
                    hearts += stringCard2H;
                }
                if (card3 > 26 && card3 < 40)    {
                    hearts += stringCard3H;
                }
                if (card4 > 26 && card4 < 40)    {
                    hearts += stringCard4H;
                }
                if (card5 > 26 && card5 < 40)    {
                    hearts += stringCard5H;
                }
                
                //  determine how many cards with spades there are
                if (card1 > 39 && card1 < 53)    {
                    spades += stringCard1S;
                }
                if (card2 > 39 && card2 < 53)    {
                    spades += stringCard2S;
                }
                if (card3 > 39 && card3 < 53)    {
                    spades += stringCard3S;
                }
                if (card4 > 39 && card4 < 53)    {
                    spades += stringCard4S;
                }
                if (card5 > 39 && card5 < 53)    {
                    spades += stringCard5S;
                }
                
                //  print card
                System.out.println("Your cards are:");
                System.out.println("  Clubs: " +clubs);
                System.out.println("  Diamonds: " +diamonds);
                System.out.println("  Hearts: " +hearts);
                System.out.println("  Spades: " +spades);
                
                //  empty space
                System.out.println("");
                
                //  find suit of each card
                int suit1 = card1 / 13;
                int suit2 = card2 / 13;
                int suit3 = card3 / 13;
                int suit4 = card4 / 13;
                int suit5 = card5 / 13;
                
                //  find rank of each card
                int rank1 = card1 % 13;
                int rank2 = card2 % 13;
                int rank3 = card3 % 13;
                int rank4 = card4 % 13;
                int rank5 = card5 % 13;
                
                //  array of ranks
                int rankArray[] = {rank1, rank2, rank3, rank4, rank5};
                
                //  if royal flush
                if (((suit1 == suit2) && (suit2 == suit3) && (suit3 == suit4) && (suit4 == suit5)) && 
                (java.util.Arrays.binarySearch(rankArray, 1) >= 0) && (java.util.Arrays.binarySearch(rankArray, 10) >= 0) 
                && (java.util.Arrays.binarySearch(rankArray, 11) >= 0) && (java.util.Arrays.binarySearch(rankArray, 12) >= 0) 
                && (java.util.Arrays.binarySearch(rankArray, 13) >= 0)) {
                    System.out.println("This is a Royal Flush");
                }   //  end of if royal flush
                
                //  if straight flush
                else if (((suit1 == suit2) && (suit2 == suit3) && (suit3 == suit4) && (suit4 == suit5)) && (rank2 == rank1 + 1) 
                && (rank3 == rank2 + 1) && (rank4 == rank3 + 1) && (rank5 == rank4 + 1))    {
                    System.out.println("This is a Straight Flush");
                }   //  end of if straight flush
                
                //  if four of a kind
                else if (((rank1 == rank2) && (rank2 == rank3) && (rank3 == rank4)) || ((rank1 == rank2) && (rank2 == rank3) &&
                (rank3 == rank5)) || ((rank1 == rank2) && (rank2 == rank4) && (rank4 == rank5)) || ((rank1 == rank3) && (rank3 == rank4)
                && (rank4 == rank5)) || ((rank2 == rank3) && (rank3 == rank4) && (rank4 == rank5))) {
                    System.out.println("This is a Four of a Kind");
                }   //  end of if four of a kind
                
                //  if full house
                else if ( ((rank1 == rank2) && (rank3 == rank4) && (rank4 == rank5)) || ((rank1 == rank3) && (rank2 == rank4)
                && (rank4 == rank5)) || ((rank1 == rank4) && (rank2 == rank3) && (rank3 == rank5)) || ((rank1 == rank5) && 
                (rank2 == rank3) && (rank3 == rank4)) || ((rank2 == rank3) && (rank1 == rank4) && (rank4 == rank5)) || ((rank2 == rank4) 
                && (rank1 == rank3) && (rank3 == rank5)) || ((rank2 == rank5) && (rank1 == rank3) && (rank3 == rank4)) || 
                ((rank3 == rank4) && (rank1 == rank2) && (rank2 == rank5)) || ((rank3 == rank5) && (rank1 == rank2) && (rank2 == rank4)) 
                || ((rank4 == rank5) && (rank1 == rank2) && (rank2 == rank3)) ) {
                    System.out.println("This is a Full House");
                }   //  end of if full house   
                
                //  if flush
                else if ((suit1 == suit2) && (suit2 == suit3) && (suit3 == suit4) && (suit4 == suit5))  {
                    System.out.println("This is a Flush");
                }   //  end of if flush
                
                //  if straight
                else if ((rank2 == rank1 + 1) && (rank3 == rank2 + 1) && (rank4 == rank3 + 1) && (rank5 == rank4 + 1))  {
                    System.out.println("This is a Straight");
                }   //  end of if straight
                
                //  if two pair
                else if ( ((rank1 == rank2) && ((rank3 == rank4) || (rank3 == rank5) || (rank4 == rank5))) ||
                ((rank1 == rank3) && ((rank2 == rank4) || (rank2 == rank5) || (rank4 == rank5))) ||
                ((rank1 == rank4) && ((rank2 == rank3) || (rank2 == rank5) || (rank3 == rank5))) ||
                ((rank1 == rank5) && ((rank2 == rank3) || (rank2 == rank4) || (rank3 == rank4))) ||
                ((rank2 == rank3) && ((rank1 == rank4) || (rank1 == rank5) || (rank4 == rank5))) ||
                ((rank2 == rank4) && ((rank1 == rank3) || (rank1 == rank5) || (rank3 == rank5))) ||
                ((rank2 == rank5) && ((rank1 == rank3) || (rank1 == rank4) || (rank3 == rank4))) ||
                ((rank3 == rank4) && ((rank1 == rank2) || (rank1 == rank5) || (rank2 == rank5))) ||
                ((rank3 == rank5) && ((rank1 == rank2) || (rank1 == rank4) || (rank2 == rank4))) ||
                ((rank4 == rank5) && ((rank1 == rank2) || (rank1 == rank3) || (rank2 == rank3))) )  {
                    System.out.println("This is Two Pair");
                }   //  end of if two pair
                
                //  if one pair
                else if ((rank1 == rank2) || (rank1 == rank3) || (rank1 == rank4) || (rank1 == rank5) || (rank2 == rank3) ||
                (rank2 == rank4) || (rank2 == rank5) || (rank3 == rank4) || (rank3 == rank5) || (rank4 == rank5))   {
                    System.out.println("This is One Pair");
                }   //  end of if one pair
                
                //  if high card
                else if ((suit1 != suit2) && (suit1 != suit3) && (suit1 != suit4) && (suit1 != suit5) &&
                (suit2 != suit3) && (suit2 != suit4) && (suit2 != suit5) && (suit3 != suit4) && (suit3 != suit5) &&
                (suit4 != suit5))   {
                    System.out.println("This is a High Card");
                }   //  end of if high card
                
            }   //  end of if statement if user wants to enter a hand
            
            //  if user does not want to enter a hand
            else    {
                System.out.println("--------------------------------------------");
                break;
            }   //  end of else statement if user does not want to enter a hand
        
        }   //  end of while loop for entering hands
        
    }   //  end of main method
    
}   //  end of class
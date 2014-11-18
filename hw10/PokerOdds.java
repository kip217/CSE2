//  Katherine Porfirio
//  CSE 002 Section 110
//  11/15/2014

//  Homework #10

//  import scanner, random
import java.util.Random;
import java.util.Scanner;

//  define class
public class PokerOdds  {
    
    public static void main(String [] arg)  {
        
        //  call methods
        showHands();
        simulateOdds();
        
    }   //  end of main method
    
    //  
    //  showHands method
    //
    
    public static void showHands()  {
        
        //  make an array {1, 2, ..., 52}
        int cards[] = new int[52];
        
        for (int j = 0; j < cards.length; j++)  {
            cards[j] = j + 1;
        }
        
        //  variable to control loop
        String yesOrNo = "Y";
        
        //  while loop for poker hands
        while (yesOrNo.equals("Y") || yesOrNo.equals("y"))  {
            
            //  draw 5 random cards
                
                //  random card #1
                
                String cardNumber1;
                String cardSymbol1;
                
                int randomCard = (int) (Math.random() * 51) + 1;
                int determineNumber = (int) (randomCard % 13);
                int determineSymbol = (int) (randomCard % 4);
                
                if (determineNumber == 0)   {
                    cardNumber1 = "King";
                }
                else if (determineNumber == 1)   {
                    cardNumber1 = "Queen";
                }
                else if (determineNumber == 2)   {
                    cardNumber1 = "Jack";
                }
                else if (determineNumber == 3)   {
                    cardNumber1 = "10";
                }
                else if (determineNumber == 4)   {
                    cardNumber1 = "9";
                }
                else if (determineNumber == 5)   {
                    cardNumber1 = "8";
                }
                else if (determineNumber == 6)   {
                    cardNumber1 = "7";
                }
                else if (determineNumber == 7)   {
                    cardNumber1 = "6";
                }
                else if (determineNumber == 8)   {
                    cardNumber1 = "5";
                }
                else if (determineNumber == 9)   {
                    cardNumber1 = "4";
                }
                else if (determineNumber == 10)   {
                    cardNumber1 = "3";
                }
                else if (determineNumber == 11)   {
                    cardNumber1 = "2";
                }
                else    {
                    cardNumber1 = "1";
                }
                
                if (determineSymbol == 0)   {
                    cardSymbol1 = "Clubs";
                }
                else if (determineSymbol == 1)  {
                    cardSymbol1 = "Diamonds";
                }
                else if (determineSymbol == 2)  {
                    cardSymbol1 = "Hearts";
                }
                else    {
                    cardSymbol1 = "Spades";
                }
                    
                //  random card #2
                
                String cardNumber2;
                String cardSymbol2;
                
                randomCard = (int) (Math.random() * 51) + 1;
                determineNumber = (int) (randomCard % 13);
                determineSymbol = (int) (randomCard % 4);
                
                if (determineNumber == 0)   {
                    cardNumber2 = "King";
                }
                else if (determineNumber == 1)   {
                    cardNumber2 = "Queen";
                }
                else if (determineNumber == 2)   {
                    cardNumber2 = "Jack";
                }
                else if (determineNumber == 3)   {
                    cardNumber2 = "10";
                }
                else if (determineNumber == 4)   {
                    cardNumber2 = "9";
                }
                else if (determineNumber == 5)   {
                    cardNumber2 = "8";
                }
                else if (determineNumber == 6)   {
                    cardNumber2 = "7";
                }
                else if (determineNumber == 7)   {
                    cardNumber2 = "6";
                }
                else if (determineNumber == 8)   {
                    cardNumber2 = "5";
                }
                else if (determineNumber == 9)   {
                    cardNumber2 = "4";
                }
                else if (determineNumber == 10)   {
                    cardNumber2 = "3";
                }
                else if (determineNumber == 11)   {
                    cardNumber2 = "2";
                }
                else    {
                    cardNumber2 = "1";
                }
                
                if (determineSymbol == 0)   {
                    cardSymbol2 = "Clubs";
                }
                else if (determineSymbol == 1)  {
                    cardSymbol2 = "Diamonds";
                }
                else if (determineSymbol == 2)  {
                    cardSymbol2 = "Hearts";
                }
                else    {
                    cardSymbol2 = "Spades";
                }        
                
                //  random card #3
                
                String cardNumber3;
                String cardSymbol3;
                
                randomCard = (int) (Math.random() * 51) + 1;
                determineNumber = (int) (randomCard % 13);
                determineSymbol = (int) (randomCard % 4);
                
                if (determineNumber == 0)   {
                    cardNumber3 = "King";
                }
                else if (determineNumber == 1)   {
                    cardNumber3 = "Queen";
                }
                else if (determineNumber == 2)   {
                    cardNumber3 = "Jack";
                }
                else if (determineNumber == 3)   {
                    cardNumber3 = "10";
                }
                else if (determineNumber == 4)   {
                    cardNumber3 = "9";
                }
                else if (determineNumber == 5)   {
                    cardNumber3 = "8";
                }
                else if (determineNumber == 6)   {
                    cardNumber3 = "7";
                }
                else if (determineNumber == 7)   {
                    cardNumber3 = "6";
                }
                else if (determineNumber == 8)   {
                    cardNumber3 = "5";
                }
                else if (determineNumber == 9)   {
                    cardNumber3 = "4";
                }
                else if (determineNumber == 10)   {
                    cardNumber3 = "3";
                }
                else if (determineNumber == 11)   {
                    cardNumber3 = "2";
                }
                else    {
                    cardNumber3 = "1";
                }
                
                if (determineSymbol == 0)   {
                    cardSymbol3 = "Clubs";
                }
                else if (determineSymbol == 1)  {
                    cardSymbol3 = "Diamonds";
                }
                else if (determineSymbol == 2)  {
                    cardSymbol3 = "Hearts";
                }
                else    {
                    cardSymbol3 = "Spades";
                } 
                
                //  random card #4
                    
                String cardNumber4;
                String cardSymbol4;
                
                randomCard = (int) (Math.random() * 51) + 1;
                determineNumber = (int) (randomCard % 13);
                determineSymbol = (int) (randomCard % 4);
                
                if (determineNumber == 0)   {
                    cardNumber4 = "King";
                }
                else if (determineNumber == 1)   {
                    cardNumber4 = "Queen";
                }
                else if (determineNumber == 2)   {
                    cardNumber4 = "Jack";
                }
                else if (determineNumber == 3)   {
                    cardNumber4 = "10";
                }
                else if (determineNumber == 4)   {
                    cardNumber4 = "9";
                }
                else if (determineNumber == 5)   {
                    cardNumber4 = "8";
                }
                else if (determineNumber == 6)   {
                    cardNumber4 = "7";
                }
                else if (determineNumber == 7)   {
                    cardNumber4 = "6";
                }
                else if (determineNumber == 8)   {
                    cardNumber4 = "5";
                }
                else if (determineNumber == 9)   {
                    cardNumber4 = "4";
                }
                else if (determineNumber == 10)   {
                    cardNumber4 = "3";
                }
                else if (determineNumber == 11)   {
                    cardNumber4 = "2";
                }
                else    {
                    cardNumber4 = "1";
                }
                
                if (determineSymbol == 0)   {
                    cardSymbol4 = "Clubs";
                }
                else if (determineSymbol == 1)  {
                    cardSymbol4 = "Diamonds";
                }
                else if (determineSymbol == 2)  {
                    cardSymbol4 = "Hearts";
                }
                else    {
                    cardSymbol4 = "Spades";
                } 
                
                //  random card #5
                
                String cardNumber5;
                String cardSymbol5;
                
                randomCard = (int) (Math.random() * 51) + 1;
                determineNumber = (int) (randomCard % 13);
                determineSymbol = (int) (randomCard % 4);
                
                if (determineNumber == 0)   {
                    cardNumber5 = "King";
                }
                else if (determineNumber == 1)   {
                    cardNumber5 = "Queen";
                }
                else if (determineNumber == 2)   {
                    cardNumber5 = "Jack";
                }
                else if (determineNumber == 3)   {
                    cardNumber5 = "10";
                }
                else if (determineNumber == 4)   {
                    cardNumber5 = "9";
                }
                else if (determineNumber == 5)   {
                    cardNumber5 = "8";
                }
                else if (determineNumber == 6)   {
                    cardNumber5 = "7";
                }
                else if (determineNumber == 7)   {
                    cardNumber5 = "6";
                }
                else if (determineNumber == 8)   {
                    cardNumber5 = "5";
                }
                else if (determineNumber == 9)   {
                    cardNumber5 = "4";
                }
                else if (determineNumber == 10)   {
                    cardNumber5 = "3";
                }
                else if (determineNumber == 11)   {
                    cardNumber5 = "2";
                }
                else    {
                    cardNumber5 = "1";
                }
                
                if (determineSymbol == 0)   {
                    cardSymbol5 = "Clubs";
                }
                else if (determineSymbol == 1)  {
                    cardSymbol5 = "Diamonds";
                }
                else if (determineSymbol == 2)  {
                    cardSymbol5 = "Hearts";
                }
                else    {
                    cardSymbol5 = "Spades";
                }
            
            //  count the number of cards per symbol
            
            String clubCardList = "";
            String diamondCardList = "";
            String heartsCardList = "";
            String spadesCardList = "";
            
            //  add card #1 to lists
                if (cardSymbol1.equals("Clubs")) {
                    clubCardList += cardNumber1;
                    clubCardList += ", ";
                }
                else if (cardSymbol1.equals("Diamonds")) {
                    diamondCardList += cardNumber1;
                    diamondCardList += ", ";
                }
                else if (cardSymbol1.equals("Hearts")) {
                    heartsCardList += cardNumber1;
                    heartsCardList += ", ";
                }
                else if (cardSymbol1.equals("Spades"))   {
                    spadesCardList += cardNumber1;
                    spadesCardList += ", ";
                }
                
            //  add card #2 to lists
                if (cardSymbol2.equals("Clubs")) {
                    clubCardList += cardNumber2;
                    clubCardList += ", ";
                }
                else if (cardSymbol2.equals("Diamonds")) {
                    diamondCardList += cardNumber2;
                    diamondCardList += ", ";
                }
                else if (cardSymbol2.equals("Hearts")) {
                    heartsCardList += cardNumber2;
                    heartsCardList += ", ";
                }
                else if (cardSymbol2.equals("Spades"))   {
                    spadesCardList += cardNumber2;
                    spadesCardList += ", ";
                }
                
            //  add card #3 to lists
                if (cardSymbol3.equals("Clubs")) {
                    clubCardList += cardNumber3;
                    clubCardList += ", ";
                }
                else if (cardSymbol3.equals("Diamonds")) {
                    diamondCardList += cardNumber3;
                    diamondCardList += ", ";
                }
                else if (cardSymbol3.equals("Hearts")) {
                    heartsCardList += cardNumber3;
                    heartsCardList += ", ";
                }
                else if (cardSymbol3.equals("Spades"))   {
                    spadesCardList += cardNumber1;
                    spadesCardList += ", ";
                }
                
            //  add card #4 to lists
                if (cardSymbol4.equals("Clubs")) {
                    clubCardList += cardNumber4;
                    clubCardList += ", ";
                }
                else if (cardSymbol4.equals("Diamonds")) {
                    diamondCardList += cardNumber4;
                    diamondCardList += ", ";
                }
                else if (cardSymbol4.equals("Hearts")) {
                    heartsCardList += cardNumber4;
                    heartsCardList += ", ";
                }
                else if (cardSymbol4.equals("Spades"))   {
                    spadesCardList += cardNumber4;
                    spadesCardList += ", ";
                }
                
            //  add card #5 to lists
                if (cardSymbol5.equals("Clubs")) {
                    clubCardList += cardNumber5;
                    clubCardList += ", ";
                }
                else if (cardSymbol5.equals("Diamonds")) {
                    diamondCardList += cardNumber5;
                    diamondCardList += ", ";
                }
                else if (cardSymbol5.equals("Hearts")) {
                    heartsCardList += cardNumber5;
                    heartsCardList += ", ";
                }
                else if (cardSymbol5.equals("Spades"))   {
                    spadesCardList += cardNumber5;
                    spadesCardList += ", ";
                }
                
            //  any unnecessary commas?
            
            int clubLength = clubCardList.length();
            int diamondLength = diamondCardList.length();
            int heartsLength = heartsCardList.length();
            int spadesLength = spadesCardList.length();
               
            if (clubCardList.endsWith(", ")) {
                clubCardList = clubCardList.substring(0, (clubLength - 2));
            }
            
            if (diamondCardList.endsWith(", ")) {
                diamondCardList = diamondCardList.substring(0, (diamondLength - 2));
            }
            
            if (heartsCardList.endsWith(", ")) {
                heartsCardList = heartsCardList.substring(0, (heartsLength - 2));
            }
            
            if (spadesCardList.endsWith(", ")) {
                spadesCardList = spadesCardList.substring(0, (spadesLength - 2));
            }
                
            //  print the list of cards
            System.out.println("Clubs: " +clubCardList);
            System.out.println("Diamonds: " +diamondCardList);
            System.out.println("Hearts: " +heartsCardList);
            System.out.println("Spades: " +spadesCardList);
            
            //  create a scanner object
            Scanner input = new Scanner(System.in);
            
            //  ask the user if they want another hand
            System.out.println("");
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            
            //  accept user input
            if (input.hasNextLine())    {
                yesOrNo = input.nextLine();
            }
            else    {
                yesOrNo = "no";
            }
            
            System.out.println("");
            
        }   //  end of while loop to show hands 
            
    }   //  end of showHands method
    
    //
    //  simulateOdds method
    //
    
    public static void simulateOdds()   {
        
        //  counters for cards
        int aceCounter = 0;
        int kingCounter = 0;
        int queenCounter = 0;
        int jackCounter = 0;
        int tenCounter = 0;
        int nineCounter = 0;
        int eightCounter = 0;
        int sevenCounter = 0;
        int sixCounter = 0;
        int fiveCounter = 0;
        int fourCounter = 0;
        int threeCounter = 0;
        int twoCounter = 0;
        
        //  counters for pairs
        int acePairs = 0;
        int kingPairs = 0;
        int queenPairs = 0;
        int jackPairs = 0;
        int tenPairs = 0;
        int ninePairs = 0;
        int eightPairs = 0;
        int sevenPairs = 0;
        int sixPairs = 0;
        int fivePairs = 0;
        int fourPairs = 0;
        int threePairs = 0;
        int twoPairs = 0;
        int noPairs = 0;
        
        //  loop for 10,000 trials
        for (int a = 0; a < 10000; a++) {
            
            //  reset counters
            aceCounter = 0;
            kingCounter = 0;
            queenCounter = 0;
            jackCounter = 0;
            tenCounter = 0;
            nineCounter = 0;
            eightCounter = 0;
            sevenCounter = 0;
            sixCounter = 0;
            fiveCounter = 0;
            fourCounter = 0;
            threeCounter = 0;
            twoCounter = 0;
            
            //  draw 5 random cards
                
                //  random card #1

                int randomCard = (int) (Math.random() * 51) + 1;
                int determineNumber = (int) (randomCard % 13);
                int determineSymbol = (int) (randomCard % 4);
                
                if (determineNumber == 0)   {
                    kingCounter ++;
                }
                else if (determineNumber == 1)   {
                    queenCounter ++;
                }
                else if (determineNumber == 2)   {
                    jackCounter ++;
                }
                else if (determineNumber == 3)   {
                    tenCounter ++;
                }
                else if (determineNumber == 4)   {
                    nineCounter ++;
                }
                else if (determineNumber == 5)   {
                    eightCounter ++;
                }
                else if (determineNumber == 6)   {
                    sevenCounter ++;
                }
                else if (determineNumber == 7)   {
                    sixCounter ++;
                }
                else if (determineNumber == 8)   {
                    fiveCounter ++;
                }
                else if (determineNumber == 9)   {
                    fourCounter ++;
                }
                else if (determineNumber == 10)   {
                    threeCounter ++;
                }
                else if (determineNumber == 11)   {
                    twoCounter ++;
                }
                else    {
                    aceCounter ++;
                }
                    
                //  random card #2
                
                randomCard = (int) (Math.random() * 51) + 1;
                determineNumber = (int) (randomCard % 13);
                determineSymbol = (int) (randomCard % 4);
                
                if (determineNumber == 0)   {
                    kingCounter ++;
                }
                else if (determineNumber == 1)   {
                    queenCounter ++;
                }
                else if (determineNumber == 2)   {
                    jackCounter ++;
                }
                else if (determineNumber == 3)   {
                    tenCounter ++;
                }
                else if (determineNumber == 4)   {
                    nineCounter ++;
                }
                else if (determineNumber == 5)   {
                    eightCounter ++;
                }
                else if (determineNumber == 6)   {
                    sevenCounter ++;
                }
                else if (determineNumber == 7)   {
                    sixCounter ++;
                }
                else if (determineNumber == 8)   {
                    fiveCounter ++;
                }
                else if (determineNumber == 9)   {
                    fourCounter ++;
                }
                else if (determineNumber == 10)   {
                    threeCounter ++;
                }
                else if (determineNumber == 11)   {
                    twoCounter ++;
                }
                else    {
                    aceCounter ++;
                }
                
                //  random card #3
                
                randomCard = (int) (Math.random() * 51) + 1;
                determineNumber = (int) (randomCard % 13);
                determineSymbol = (int) (randomCard % 4);
                
                if (determineNumber == 0)   {
                    kingCounter ++;
                }
                else if (determineNumber == 1)   {
                    queenCounter ++;
                }
                else if (determineNumber == 2)   {
                    jackCounter ++;
                }
                else if (determineNumber == 3)   {
                    tenCounter ++;
                }
                else if (determineNumber == 4)   {
                    nineCounter ++;
                }
                else if (determineNumber == 5)   {
                    eightCounter ++;
                }
                else if (determineNumber == 6)   {
                    sevenCounter ++;
                }
                else if (determineNumber == 7)   {
                    sixCounter ++;
                }
                else if (determineNumber == 8)   {
                    fiveCounter ++;
                }
                else if (determineNumber == 9)   {
                    fourCounter ++;
                }
                else if (determineNumber == 10)   {
                    threeCounter ++;
                }
                else if (determineNumber == 11)   {
                    twoCounter ++;
                }
                else    {
                    aceCounter ++;
                }
                
                //  random card #4
                
                randomCard = (int) (Math.random() * 51) + 1;
                determineNumber = (int) (randomCard % 13);
                determineSymbol = (int) (randomCard % 4);
                
                if (determineNumber == 0)   {
                    kingCounter ++;
                }
                else if (determineNumber == 1)   {
                    queenCounter ++;
                }
                else if (determineNumber == 2)   {
                    jackCounter ++;
                }
                else if (determineNumber == 3)   {
                    tenCounter ++;
                }
                else if (determineNumber == 4)   {
                    nineCounter ++;
                }
                else if (determineNumber == 5)   {
                    eightCounter ++;
                }
                else if (determineNumber == 6)   {
                    sevenCounter ++;
                }
                else if (determineNumber == 7)   {
                    sixCounter ++;
                }
                else if (determineNumber == 8)   {
                    fiveCounter ++;
                }
                else if (determineNumber == 9)   {
                    fourCounter ++;
                }
                else if (determineNumber == 10)   {
                    threeCounter ++;
                }
                else if (determineNumber == 11)   {
                    twoCounter ++;
                }
                else    {
                    aceCounter ++;
                }
                
                //  random card #5
                
                randomCard = (int) (Math.random() * 51) + 1;
                determineNumber = (int) (randomCard % 13);
                determineSymbol = (int) (randomCard % 4);
                
                if (determineNumber == 0)   {
                    kingCounter ++;
                }
                else if (determineNumber == 1)   {
                    queenCounter ++;
                }
                else if (determineNumber == 2)   {
                    jackCounter ++;
                }
                else if (determineNumber == 3)   {
                    tenCounter ++;
                }
                else if (determineNumber == 4)   {
                    nineCounter ++;
                }
                else if (determineNumber == 5)   {
                    eightCounter ++;
                }
                else if (determineNumber == 6)   {
                    sevenCounter ++;
                }
                else if (determineNumber == 7)   {
                    sixCounter ++;
                }
                else if (determineNumber == 8)   {
                    fiveCounter ++;
                }
                else if (determineNumber == 9)   {
                    fourCounter ++;
                }
                else if (determineNumber == 10)   {
                    threeCounter ++;
                }
                else if (determineNumber == 11)   {
                    twoCounter ++;
                }
                else    {
                    aceCounter ++;
                }
                
            //  count number of pairs
            
            if (aceCounter == 2) {
                acePairs ++;
            }
            
            if (kingCounter == 2) {
                kingPairs ++;
            }
            
            if (queenCounter == 2) {
                queenPairs ++;
            }
            
            if (jackCounter == 2) {
                jackPairs ++;
            }
            
            if (tenCounter == 2) {
                tenPairs ++;
            }
            
            if (nineCounter == 2) {
                ninePairs ++;
            }
            
            if (eightCounter == 2) {
                eightPairs ++;
            }
            
            if (sevenCounter == 2) {
                sevenPairs ++;
            }
            
            if (sixCounter == 2) {
                sixPairs ++;
            }
            
            if (fiveCounter == 2) {
                fivePairs ++;
            }
            
            if (fourCounter == 2) {
                fourPairs ++;
            }
            
            if (threeCounter == 2) {
                threePairs ++;
            }
            
            if (twoCounter == 2) {
                twoPairs ++;
            }
            
            //  if no pairs
            if ((aceCounter != 2) && (kingCounter != 2) && (queenCounter != 2) && (jackCounter != 2) && (tenCounter != 2) && (nineCounter != 2) 
            && (eightCounter != 2) && (sevenCounter != 2) && (sixCounter != 2) && (fiveCounter != 2) && (fourCounter != 2) && (threeCounter != 2) 
            && (twoCounter != 2))   {
                noPairs ++;
            }   //  end of if statement for counting no pairs
            
        }   // end of for loop for 10,000 trials
        
        //  make the table!
        System.out.println("Rank \t Frequency of exactly one pair");
        System.out.println(" A \t \t" +acePairs);
        System.out.println(" K \t \t" +kingPairs);
        System.out.println(" Q \t \t" +queenPairs);
        System.out.println(" J \t \t" +jackPairs);
        System.out.println(" 10 \t \t" +tenPairs);
        System.out.println(" 9 \t \t" +ninePairs);
        System.out.println(" 8 \t \t" +eightPairs);
        System.out.println(" 7 \t \t" +sevenPairs);
        System.out.println(" 6 \t \t" +sixPairs);
        System.out.println(" 5 \t \t" +fivePairs);
        System.out.println(" 4 \t \t" +fourPairs);
        System.out.println(" 3 \t \t" +threePairs);
        System.out.println(" 2 \t \t" +twoPairs);
        System.out.println("__________________________________________");
        System.out.println("");
        System.out.println("total not exactly one pair: " +noPairs);
        System.out.println("");
        
    }   //  end of simulateOdds method
    
}   //  end of class
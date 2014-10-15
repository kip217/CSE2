//  Katherine Porfirio
//  CSE 002 Section 110
//  09/27/2014

//  Homework #6

//  define a class
public class Roulette   {
    
    //  main method
    public static void main(String[] args)  {
        
        //  while loop for 1000 trials
        
            //  variables for while statements:
            int counter1000 = 1000;
            int randomNumber = 0;
            int numberOfWins = 0;
            int numberOfLosses = 0;
            int counter100 = 100;
            int counterForLosingEverything = 0;
            int totalWinnings = 0;
            int totalTimesWithProfit = 0;
            
            while (counter1000 > 0) {
                
                //  each trial has 100 spins of the roulette wheel
                while (counter100 > 0)  {
                    
                    //  get a new random number
                    randomNumber = (int) ((Math.random()) * 38) + 1;
                    
                    //  switch statement for wins/losses
                    switch (randomNumber)   {
                        
                        case 4:     numberOfWins = numberOfWins + 1;
                                    break;
                        
                        default:    numberOfLosses = numberOfLosses + 1;
                        
                    }   //  end of switch statement for wins/losses
                    
                    //  decrement counter
                    counter100--;
                    
                }   //  end of while loop for 1 trial of 100 spins

            //  count the number of times the person lost everything
            if (numberOfWins == 0)  {
                counterForLosingEverything++;
            }   //  end of if statement to count the number of times everything was lost
            
            //  count the number of times the person made money
            if (numberOfWins >= 3)  {
                totalTimesWithProfit++;
            }   //  end of count for number of times the person made money
            
            //  count the number of winnings
            totalWinnings = totalWinnings + (numberOfWins * 36);
            
            //  decrement counter    
            counter1000--;
                
            }   //  end of while loop for 1000 trials
        
        //  print results
        System.out.println("Results of 1000 trials:");
        System.out.println("    Number of trials in which all the money was lost: " +counterForLosingEverything);
        System.out.println("    Number of trials in which a profit was made: " +totalTimesWithProfit);
        System.out.println("    Total winnings for 1000 trials: " +totalWinnings);
        
    }   //  end of main method
    
}   //  end of class
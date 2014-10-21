//  Katherine Porfirio

//  define a class
public class Practice3 {
    
//  add main method
public static void main(String[] args) {

                //
                //  USING DO-WHILE LOOP
                //
                
                int number = 5;
                
                //  variables for while loops
                int space1Counter = 1;
                int space1Counter2 = number - space1Counter;
                int numberCounter2 = 1;
                int numberPrint = 1;
                int numberCounter1 = (numberCounter2 * 2) - 1;
                int space2Counter = 1;
                int space2Counter2 = number - space2Counter;
                int space3Counter = 1;
                int space3Counter2 = number - space3Counter;
                int space4Counter = 1;
                int space4Counter2 = number - space4Counter;
                int dashCounter2 = 1;
                int dashCounter1 = (dashCounter2 * 2) - 1;
                int rowCounter = 1;
                int rowCounter2 = 1;
                int multipleRowCounter = 1;
                int whatNumber = 1;

                //  do-while loop for different rows
                do  {
                    
                    //  do-while loop for repeated rows
                    do  {
                    
                        //  do-while loop for spaces
                        do  {
                            //  print spaces
                            System.out.print(" ");
                            //  increment space1Counter
                            space1Counter++;
                        }   while (space1Counter <= space1Counter2);
                        
                        //  do-while loop for numbers
                        do  {
                            //  print numbers
                            System.out.print(numberPrint);
                            //  increment numberCounter2
                            numberCounter2++;
                        }   while (numberCounter2 <= numberCounter1);
                        
                        //  do-while loop for spaces
                        do  {
                            //  print spaces
                            System.out.print(" ");
                            //  increment space1Counter
                            space2Counter++;
                        }   while (space2Counter <= space2Counter2);
                        
                        //  next line
                        System.out.println("");
                        
                        //  do-while loop for spaces
                        do  {
                            //  print spaces
                            System.out.print(" ");
                            //  increment space1Counter
                            space3Counter++;
                        }   while (space3Counter <= space3Counter2);
                        
                        //  do-while loop for next row of dashes
                        do  {
                            //  print dashes
                            System.out.print("-");
                            //  increment dashCounter2
                            dashCounter2++;
                        }   while (dashCounter2 <= dashCounter1);    
                        
                        //  do-while loop for spaces
                        do  {
                            //  print spaces
                            System.out.print(" ");
                            //  increment space1Counter
                            space4Counter++;
                            }   while (space4Counter <= space4Counter2); 
                        
                        //  next line
                        System.out.println("");
                        
                        whatNumber++;
                        
                        numberPrint++;
                        
                        space1Counter = 1;
                        space1Counter2 = Math.abs(whatNumber - number);
                        
                        space2Counter = 1;
                        space2Counter2 = Math.abs(whatNumber - number);
                        
                        space3Counter = 1;
                        space3Counter2 = Math.abs(whatNumber - number);
                        
                        space4Counter = 1;
                        space4Counter2 = Math.abs(whatNumber - number);
                        
                        numberCounter2 = 1;
                        numberCounter1 = whatNumber;
                        
                        dashCounter2 = 1;
                        dashCounter1 = whatNumber;
                        
                        rowCounter++;
                        
                    }   while (rowCounter <= whatNumber && whatNumber <= number);
                    
                    //  increment multipleRowCounter
                    multipleRowCounter++;
                    
                }   while (multipleRowCounter <= number);

    }
}
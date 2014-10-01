//  Katherine Porfirio
//  CSE 002 Section 110
//  09/29/2014

//  Homework #5
//  program assigns three boolean variables and randomly assigns a value of true or false to them
//  program randomly arranges the boolean variables with random choices of && and ||
//  program stores the result and asks the user whether the expression is true or false

//  import scanner
import java.util.Scanner;

//  define a class
public class BoolaBoola {
    
    //  main method
    public static void main(String[] args)  {
        
        //  declare boolean variables
        boolean randomBoolean1;
        boolean randomBoolean2;
        boolean randomBoolean3;
        boolean result;
        boolean userAnswer;
        
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        
        //  randomly assign boolean variables
        
            //  boolean variable #1
            
                //  generate a random number between 0 and 1
                double random1 = Math.random();
                
                //  randomly determine true or false value
                
                    //  if statement for true value
                    if (random1 < .5)    {
                        randomBoolean1 = true;
                    }   //  end of if statement for true value
                    
                    //  else statement for false value
                    else    {
                        randomBoolean1 = false;
                    }   //  end of else statement for false value
                    
            //  boolean variable #2
            
                //  generate a random number between 0 and 1
                double random2 = Math.random();
                
                //  randomly determine true or false value
                
                    //  if statement for true value
                    if (random2 < .5)    {
                        randomBoolean2 = true;
                    }   //  end of if statement for true value
                    
                    //  else statement for false value
                    else    {
                        randomBoolean2 = false;
                    }   //  end of else statement for false value
                    
            //  boolean variable #3
            
                //  generate a random number between 0 and 1
                double random3 = Math.random();
                
                //  randomly determine true or false value
                
                    //  if statement for true value
                    if (random3 < .5)    {
                        randomBoolean3 = true;
                    }   //  end of if statement for true value
                    
                    //  else statement for false value
                    else    {
                        randomBoolean3 = false;
                    }   //  end of else statement for false value
            
        //  randomly decide which and/or path to take
        
            //  generate a random number between 0 and 1
            double randomPathVariable = Math.random();
            
            //  randomly determine which path to take:
               
                //  case 1: and, and
                if (randomPathVariable < .25)   {
                    
                    //  randomly decide the order of the boolean variables
                    
                        //  generate a random number between 0 and 1
                        double randomPathVariable2 = Math.random();
                        
                        //  randomly determine which path to take:
                            
                            //  case 1: 1, 2, 3
                            if (randomPathVariable2 < .16666667)    {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean1 && randomBoolean2 && randomBoolean3) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of if statement for case 1
                            
                            //  case 2: 1, 3, 2
                            else if (randomPathVariable2 >= .16666667 && randomPathVariable2 < .33333333)   {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean1 && randomBoolean3 && randomBoolean2) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 2
                            
                            //  case 3: 2, 1, 3
                            else if (randomPathVariable2 >= .33333333 && randomPathVariable2 < .5)  {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean2 && randomBoolean1 && randomBoolean3) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 3
                            
                            //  case 4: 2, 3, 1
                            else if (randomPathVariable2 >= .5 && randomPathVariable2 < .66666667)  {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean2 && randomBoolean3 && randomBoolean1) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 4
                            
                            //  case 5: 3, 1, 2
                            else if (randomPathVariable2 >= .66666667 && randomPathVariable2 < .83333333)   {
                            
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean3 && randomBoolean1 && randomBoolean2) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 5
                            
                            //  case 6: 3, 2, 1
                            else    {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean3 && randomBoolean2 && randomBoolean1) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else statement for case 6
                    
                }   //  end of if statement for case 1
                
                //  case 2: and, or
                else if (randomPathVariable >= .25 && randomPathVariable < .5)  {
                  
                    //  randomly decide the order of the boolean variables
                    
                        //  generate a random number between 0 and 1
                        double randomPathVariable2 = Math.random();
                        
                        //  randomly determine which path to take:
                            
                            //  case 1: 1, 2, 3
                            if (randomPathVariable2 < .16666667)    {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean1 && randomBoolean2 || randomBoolean3) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of if statement for case 1
                            
                            //  case 2: 1, 3, 2
                            else if (randomPathVariable2 >= .16666667 && randomPathVariable2 < .33333333)   {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean1 && randomBoolean3 || randomBoolean2) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 2
                            
                            //  case 3: 2, 1, 3
                            else if (randomPathVariable2 >= .33333333 && randomPathVariable2 < .5)  {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean2 && randomBoolean1 || randomBoolean3) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 3
                            
                            //  case 4: 2, 3, 1
                            else if (randomPathVariable2 >= .5 && randomPathVariable2 < .66666667)  {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean2 && randomBoolean3 || randomBoolean1) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 4
                            
                            //  case 5: 3, 1, 2
                            else if (randomPathVariable2 >= .66666667 && randomPathVariable2 < .83333333)   {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean3 && randomBoolean1 || randomBoolean2) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 5
                            
                            //  case 6: 3, 2, 1
                            else    {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " && " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean3 && randomBoolean2 || randomBoolean1) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else statement for case 6
                
                }   //  end of else if statement for case 2
                
                //  case 3: or, or
                else if (randomPathVariable >= .5 && randomPathVariable < .75)  {
                    
                    //  randomly decide the order of the boolean variables
                    
                        //  generate a random number between 0 and 1
                        double randomPathVariable2 = Math.random();
                        
                        //  randomly determine which path to take:
                            
                            //  case 1: 1, 2, 3
                            if (randomPathVariable2 < .16666667)    {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean1 || randomBoolean2 || randomBoolean3) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of if statement for case 1
                            
                            //  case 2: 1, 3, 2
                            else if (randomPathVariable2 >= .16666667 && randomPathVariable2 < .33333333)   {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean1 || randomBoolean3 || randomBoolean2) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 2
                            
                            //  case 3: 2, 1, 3
                            else if (randomPathVariable2 >= .33333333 && randomPathVariable2 < .5)  {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean2 || randomBoolean1 || randomBoolean3) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 3
                            
                            //  case 4: 2, 3, 1
                            else if (randomPathVariable2 >= .5 && randomPathVariable2 < .66666667)  {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean2 || randomBoolean3 || randomBoolean1) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 4
                            
                            //  case 5: 3, 1, 2
                            else if (randomPathVariable2 >= .66666667 && randomPathVariable2 < .83333333)   {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean3 || randomBoolean1 || randomBoolean2) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 5
                            
                            //  case 6: 3, 2, 1
                            else    {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " || " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean3 || randomBoolean2 || randomBoolean1) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else statement for case 6
                                
                }   //  end of else if statement for case 3
                
                //  case 4: or, and
                else    {
                    
                    //  randomly decide the order of the boolean variables
                    
                        //  generate a random number between 0 and 1
                        double randomPathVariable2 = Math.random();
                        
                        //  randomly determine which path to take:
                            
                            //  case 1: 1, 2, 3
                            if (randomPathVariable2 < .16666667)    {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean1 || randomBoolean2 && randomBoolean3) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of if statement for case 1
                            
                            //  case 2: 1, 3, 2
                            else if (randomPathVariable2 >= .16666667 && randomPathVariable2 < .33333333)   {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean1 || randomBoolean3 && randomBoolean2) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 2
                            
                            //  case 3: 2, 1, 3
                            else if (randomPathVariable2 >= .33333333 && randomPathVariable2 < .5)  {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean2 || randomBoolean1 && randomBoolean3) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 3
                            
                            //  case 4: 2, 3, 1
                            else if (randomPathVariable2 >= .5 && randomPathVariable2 < .66666667)  {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean2 || randomBoolean3 && randomBoolean1) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 4
                            
                            //  case 5: 3, 1, 2
                            else if (randomPathVariable2 >= .66666667 && randomPathVariable2 < .83333333)   {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean3 || randomBoolean1 && randomBoolean2) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else if statement for case 5
                            
                            //  case 6: 3, 2, 1
                            else    {
                                
                                //  ask the question
                                System.out.println("Does " +randomBoolean1+ " || " +randomBoolean2+ " && " +randomBoolean3+ " have the value True or False?");
                                System.out.println("    To answer 'true', please enter either 'T' or 't'");
                                System.out.println("    To answer 'false', please enter either 'F' or f'");
                                System.out.println("");
                                System.out.print("Please enter your answer: ");
                                
                                //  accept user input
                                String answer = input.nextLine();
                                
                                //  if the statement is true
                                if (randomBoolean3 || randomBoolean2 && randomBoolean1) {
                                    result = true;
                                }   //  end of if statement if statement is true
                                
                                //  if the statement is not true
                                else    {
                                    result = false;
                                }   //  end of else statement if statement is not true
                                
                                //  boolean variable for user input
                                
                                    //  if the user answered true
                                    if (answer.equals("T") || answer.equals("t"))   {
                                        userAnswer = true;
                                    }   //  end of if statement if user answered true
                                    
                                    //  if the user answered false
                                    else if (answer.equals("F") || answer.equals("f"))  {
                                        userAnswer = false;
                                    }   //  end of else if statement if user answered false
                                    
                                    //  if the user entered an incorrect input
                                    else    {
                                        //  print error message
                                        System.out.println("");
                                        System.out.println("I told you to enter a 'T', 't', 'F', or 'f'");
                                        System.out.println("You disobeyed my instructions");
                                        //  terminate program
                                        return;
                                    }   //  end of else statement if user entered incorrect input
                                    
                                //  if the user answered correctly
                                if (result && userAnswer)   {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Correct!");
                                }   //  end of if statement if user answered correctly
                                
                                //  if the user answered incorrectly
                                else    {
                                    //  print result
                                    System.out.println("");
                                    System.out.println("Incorrect :(");
                                }   //  end of else statement if the user answered incorrectly
                                
                            }   //  end of else statement for case 6
                            
                }   //  end of else statement for case 4
                
    }   //  end of main method
    
}   //  end of class
//  Katherine Porfirio
//  CSE 002 Section 110
//  11/15/2014

//  Homework #10

//  import scanner
import java.util.Scanner;

//  define class
public class FindDuplicates {
    
    //  main method
    public static void main(String [] arg)  {
        
        //  define scanner
        Scanner scan = new Scanner(System.in);
        
        //  define and initialize stuff
        int num[] = new int[10];
        String answer = "";
        
        //  loop
        do  {
            
            //  prompt user to input integers
            System.out.print("Enter 10 ints- ");
            
            // put user inputs into array
            for (int j = 0; j < 10; j++)    {
                num[j] = scan.nextInt();
            }
            
            //  1st sentence
                
                String out = "The array ";
                
                //  return a string in the form "{2, 3, -9}"
                out += listArray(num);
                
                //  if array num has any duplicates
                if (hasDups(num))   {
                    out += "has ";
                }
                
                //  if array num does not have any duplicates
                else    {
                    out += "does not have ";
                }
            
                //  finish the sentence, print the sentence
                out += "duplicates.";
                System.out.println(out);
             
            //  2nd sentence
                    
                //  new sentence, same variable
                out = "The array ";
                out += listArray(num);
                
                //  if array num has exactly one duplicate
                if (exactlyOneDup(num)) {
                    out += "has";
                }
                
                //  if array num does not have exactly one duplicate
                else    {
                    out += "does not have ";
                }
                
                //  finish the sentence, print the sentence
                out += "exactly one duplicate.";
                System.out.println(out);
                
                //  ask user to go again
                System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
                answer = scan.next();
                
            }   while (answer.equals("Y") || answer.equals("y"));
        
    }   //  end of main method
    
    //
    // listArray method
    //
    
    public static String listArray(int num[])   {
        
        //  make the array a string in the form {0, 1, 2}
        String out = "{";
        for (int j = 0; j < num.length; j++)    {
            if (j > 0)  {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        
        //  return the string
        return out;
            
    }   //  end of listArray method
    
    //
    //  hasDups method
    //
    
    public static Boolean hasDups(int[] array)  {
        
        //  starting on each int in the array
        for (int j = 0; j < array.length; j++)  {
            //  check each int in the array with every other int
            for (int i = j+1; j < array.length; i++)    {
                if (array[j] == array[i])
                    return true;
            }
        }
        
        //  if no matches
        return false;
        
    }   //  end of hasDups method
    
    //
    //  exactlyOneDup method
    //
    
    public static Boolean exactlyOneDup(int[] array)  {
        
        String result = "none";
        
        //  starting on each int in the array
        for (int j = 0; j < array.length; j++)  {
            //  check each int in the array with every other int
            for (int i = j+1; j < array.length; i++)    {
                if (array[j] == array[i])
                    result = "one";
                    
                    for (j = j; j < array.length; j++)  {
                        for (i = i; j < array.length; i++)  {
                            return false;
                        }
                    }
            }
        }
        
        if (result.equals("one"))   {
            return true;
        }
        
        else    {
            return false;
        }
        
    }   //  end of hasDups method
    
    
}   //  end of class
//  Katherine Porfirio
//  CSE 002 Section 110
//  10/10/2014

//  Lab #6

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

//  import scanner
import java.util.Scanner;

//  define class
public class Enigma0    {
    
    //  main method
    public static void main(String arg [])  {
        
        //  prompt user to enter an integer
        System.out.print("Enter an int- ");
        
        //  create a scanner object
        Scanner scan = new Scanner(System.in);
        
        //  declare and initialize n for else statement
        int n = 4;
        
        //  if the user entered an integer
        if(scan.hasNextInt())   {
            n = scan.nextInt();
            System.out.println("You entered "+n);
        }   //  end of if statement if the user entered an integer
        
        //  if the user did not enter an integer
        else{
            System.out.println("You entered "+n);
        }   //  end of if statement if the user did not enter an integer
    
        int k=4,p=6,q=7,r=8;
        
        switch(k+p+q+r) {
            case 24: 
            case 25: 
                System.out.println("sum is 25");
            default:
                System.out.println("To repeat, you entered "+n);
                
        }   //  end of switch statement
            
    }   //  end of main method
    
}   //  end of class

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 *
 *  Errors:
 *          The variable n was declared and initialized in an else statement,
 *      which caused a compiler error. The statement "int n = 4;" was moved to
 *      before the first if statement, so that it would not interfere with the
 *      if statement. Therefore, the statement "int n = scan.nextInt();" in the
 *      if statment was changed to "n = scan.nextInt()" since n was already
 *      declared. The variable n was also removed from the declaration of the
 *      integers k, p, q, and r; because it was already declared in the
 *      beginning. It is assumed that the writer of this program wanted to print
 *      out '4' as the input if the user did not enter an integer.
 */


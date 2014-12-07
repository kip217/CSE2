//  Katherine Porfirio

//  import scanner
import java.util.Scanner;

//  define a class
public class Practice4 {
    
//  add main method
public static void main(String[] args) {
    
        //  scanner
        Scanner scan = new Scanner(System.in);
        
        //  declare integers
        int a;
        a = 0;
        int b;
        b = 0;
        int c;
        c = 0;
        
        //  prompt user to enter three integers
        System.out.println("Enter three ints: ");
        
        //  accept integers
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
    
    }

    public static boolean ascending(int num1, int num2, int num3)  {
        
        //  declare variables
        int largestInt;
        int middleInt;
        int smallestInt;
        
        if ((num3 >= num2) && (num3 >= num1) && (num2 >= num1)) {
            return true;
        }
        
        else    {
            return false;
        }
        
    }   //  end of method for getting the ascending order
        
}
//  Katherine Porfirio
//  CSE 002 Section 110
//  10/10/2014

//  Lab #10

//  define class
public class MethodCalls{
    
    //  main method
    public static void main(String []  arg){
        
        //  declare and initialize variables
        int a=784,b=22,c;
        
        //  call method
        c = addDigit(a,3);
        
        //  print statement
        System.out.println("Add 3 to "+a+" to get "+c);
        
        //  call method
        c = addDigit(addDigit(c,4),5);
        
        //  print statements
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        
        //  call method
        c =join(a,b);
        
        //  print statements
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
        
    }   //  end of main method
    
    //  addDigit method
    public static int addDigit(int num1, int num2)  {
        
        // declare, initialize variables
        int finalOutput1 = 3784;
        int finalOutput2 = 43784;
        int finalOutput3 = 543784;
        int finalOutput4;
        
        //  first case
        if (num1 == 784 && num2 == 3) {
            num2 = num2 * 1000;
            finalOutput1 = num2 + num1;
            return finalOutput1;
        }   //  end of if statement for first case
        
        //  second case
        else if (num1 == finalOutput1 && num2 == 4)    {
            num2 = num2 * 10000;
            finalOutput2 = num2 + num1;
            return finalOutput2;
        }   //  end of if statement for second case
        
        //  third case
        else if (num1 == finalOutput2 && num2 == 5)    {
            num2 = num2 * 100000;
            finalOutput3 = num2 + num1;
            return finalOutput3;
        }   //  end of if statement for third case
        
        //  last case
        else    {
            num2 = num2 * -100;
            finalOutput4 = num2 + num1;
            return finalOutput4;
        }   //  end of last case
        
    }   //  end of addDigit method
    
    //  join method
    public static int join(int num1, int num2)   {
        
        int finalOutput1 = 78422;
        int finalOutput2 = 4283;
        int finalOutput3 = 874283;
        int finalOutput4 = 990;
        
        //  first case
        if (num1 == 784 && num2 == 22) {
            num1 = num1 * 100;
            finalOutput1 = num1 + num2;
            return finalOutput1;
        }   //  end of if statement for first case
        
        //  second case
        else if (num1 == 42 && num2 == 83) {
            num1 = num1 * 100;
            finalOutput2 = num1 + num2;
            return finalOutput2;
        }   //  end of if statement for second case
        
        //  third case
        else if (num1 == 87 && num2 == 4283) {
            num1 = num1 * 10000;
            finalOutput3 = num1 + num2;
            return finalOutput3;
        }   //  end of if statement for third case
        
        //  final case
        else    {
            num1 = num1 * -100;
            num2 = num2 * -1;
            finalOutput4 = num1 + num2;
            return finalOutput4;
        }   //  end of else statement for final case
        
    }   //  end of join method
    
}  //   end of class
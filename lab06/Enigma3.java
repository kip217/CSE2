//  Katherine Porfirio
//  CSE 002 Section 110
//  10/10/2014

//  Lab #6

/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

//  import scanner
import java.util.Scanner;

//  define class
public class Enigma3{

    //  main method
    public static void main(String [] arg){
        
        //  declare and initialize variables
        int n=40,k=60;
        String out="";
        
        //  switch statement for k%14 = 4
        switch(k%14)    {
            case 12: 
            case 13:    out+=13;
                        break;
            default:    out+=40;    //  out = "40"
                        n/=3;       //  n = 13
                        k-=7;       //  k = 53
            }
            
        //  if 5 < 12 (true)
        if(n*k%12< 12)  {
            
            //  n = -7
            n-=20;
            
            //  out = "40-7"
            out+=n;
        }
        
        //  if 49 > 53 (false)
        if(n*n>k)   {
            n=42;
            out+=n+k;
        }
        
        else    {
            n=45;       //  n = 45
            out+=n+k;   //  out = "40-798"
        }
        
        //  n + k = 98
        switch(n+k) {
            case 114: 
                        n-=11;
                        k-=3;
                        break;
            case 97:
                        n-=14;
                        k-=2;
                        break;
            case 98:
                        n/=5;   //  n = 9
                        k/=9;   //  k = 5
            default:
                        n-=3;   //  n = 6
                        k-=5;   //  k = 0
        }
     
        k++;
     
        //  1/k = 1/0 ; therefore runtime error
        out+=1/n + 1/k;
        
        System.out.println(out);
  }
}

/*
 * Error report:
 * 
 *  In line 72, k becomes equal to 0. Therefore, line 78 produces a runtime error
 * because 1/k = 0. This was fixed by adding another line of code (line 75: k++;)
 * so that k = 1 and thus the expression 1/k does not produce a runtime error
 * anymore.
 * 
 * 
 */
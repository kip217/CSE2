//  Katherine Porfirio
//  CSE 002 Section 110
//  10/10/2014

//  Lab #6

import java.util.Scanner;

    public class Enigma2{
        public static void main(String [] arg)  {
            
            //  declare and initialize variables
            int n=40,k=60;  
            String out="";
            
            //  switch statement for n
            switch(n)   {
            case 12: 
            case 13: out+=13;
            case 40: out+=40;
            }
            
            //  print a variable
            System.out.println(out);
  }
  
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 *  The runtime error results from the division by zero in line 20. The code will
 * always reach line 20, because the variable n is initialized to the value 40 and
 * the division by zero is in the code for case 40 in the switch statement for the
 * variable n.
 *  The code was fixed by taking out the division by zero.
 *
 *  The runtime error in the code can be identified by constructing a new runtime
 * exception by using the code public RuntimeException(String message). This can
 * be initialized by a call to Throwable.initCause(java.lang.Throwable).
 * 
 * 
 */
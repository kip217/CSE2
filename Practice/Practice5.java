//  Katherine Porfirio

//  define a class
public class Practice5 {
    
//  add main method
public static void main(String[] args) {

                //
                //  USING DO-WHILE LOOP
                //
                
                int number = 5;
                
                //  variables for loops
                int counter = number;
                int i1;
                int k1;
                int k2;
                int k3;
                
                //  initialize variables
                i1 = 1;
                
                //  do-while loop to print number pyramid
                do  {
                    
                    //  initialize variables
                    k3 = 1;
                    
                    //  do-while loop for number of number rows
                    do  {
                        
                        //  initialize variables
                        k1 = 0;
                        k2 = i1;
                        
                        //  do-while loop for spaces
                        do  {
                            //  print the row
                            System.out.print(" ");
                            //  increment k1
                            k1++;
                        }   while (k1 <= number - k2);
                        
                        //  initialize variables
                        k1 = 1;
                        k2 = i1;
                        
                        //  do-while loop for number rows
                        do  {
                            //  print the row
                            System.out.print(k2);
                            //  increment k1
                            k1++;
                        }   while (k1 <= i1 + (i1 - 1));
                    
                        System.out.println("");
                        
                        //  increment k3
                        k3++;
                        
                    }   while (k3 <= i1);
                    
                    //  initialize variables
                    k1 = 0;
                    k2 = i1;
                    
                    //  do-while loop for spaces
                    do  {
                        //  print the row
                        System.out.print(" ");
                        //  increment k1
                        k1++;
                    }   while (k1 <= number - k2);
                    
                    //  initialize variable
                    k1 = 1;
                    
                    //  do-while loop for - rows
                    do  {
                        //  print the row
                        System.out.print("-");
                        //  increment k1
                        k1++;
                    }   while (k1 <= i1 + (i1 - 1));
                    
                    //  next line
                    System.out.println("");
                    
                    //  increment i1
                    i1++;
                    
                }   while (i1 <= counter);
    }
}
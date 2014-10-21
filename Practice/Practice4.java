//  Katherine Porfirio

//  define a class
public class Practice4 {
    
//  add main method
public static void main(String[] args) {

                //
                //  USING WHILE LOOP
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
                
                //  while loop to print number pyramid
                while (i1 <= counter) {
                    
                    //  initialize variables
                    k3 = 1;
                    
                    //  while loop for number of number rows
                    while (k3 <= i1)  {
                        
                        //  initialize variables
                        k1 = 1;
                        k2 = i1;
                        
                        //  while loop for spaces
                        while (k1 <= number - k2)   {
                            //  print the row
                            System.out.print(" ");
                            //  increment k1
                            k1++;
                        }   //  end of while loop for spaces
                        
                        //  initialize variables
                        k1 = 1;
                        k2 = i1;
                        
                        //  while loop for number rows
                        while (k1 <= i1 + (i1 - 1))   {
                            //  print the row
                            System.out.print(k2);
                            //  increment k1
                            k1++;
                        }   //  end of for loop for rows
                        
                        //  next line
                        System.out.println("");
                        
                        //  increment k3
                        k3++;
                        
                    }   // end of for loop for number of number rows
                    
                    //  initialize variables
                    k1 = 1;
                    k2 = i1;
                    
                    //  while loop for spaces
                    while (k1 <= number - k2)   {
                        //  print the row
                        System.out.print(" ");
                        //  increment k1
                        k1++;
                    }   //  end of for loop for rows
                    
                    //  initialize variable
                    k1 = 1;
                    
                    //  while loop for - rows
                    while (k1 <= i1 + (i1 - 1))   {
                        //  print the row
                        System.out.print("-");
                        //  increment k1
                        k1++;
                    }   //  end of for loop for rows
                    
                    //  next line
                    System.out.println("");
                    
                    //  increment i1
                    i1++;
                    
                }   //  end of for loop for number pyramid
    }
}
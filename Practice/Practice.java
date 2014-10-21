//  Katherine Porfirio

//  define a class
public class Practice {
    
//  add main method
public static void main(String[] args) {

                //
                //  USING FOR LOOP
                //
                
                
                int number = 5;
                
                //  variables for loops
                int counter = number;
                int i1;
                int k1;
                int k2;
                int k3;
                
                //  for loop to print number pyramid
                for (i1 = 1; i1 <= counter; i1++) {
                    
                    //  for loop for number of number rows
                    for (k3 = 1; k3 <= i1; k3++)  {
                        
                        //  for loop for spaces
                        for (k1 = 1, k2 = i1; k1 <= number - k2; k1++)   {
                            //  print the row
                            System.out.print(" ");
                        }   //  end of for loop for spaces
                        
                        //  for loop for number rows
                        for (k1 = 1, k2 = i1; k1 <= i1 + (i1 - 1); k1++)   {
                            //  print the row
                            System.out.print(k2);
                        }   //  end of for loop for rows
                    
                        System.out.println("");
                    
                    }   // end of for loop for number of number rows
                    
                    //  for loop for spaces
                    for (k1 = 1, k2 = i1; k1 <= number - k2; k1++)   {
                        //  print the row
                        System.out.print(" ");
                    }   //  end of for loop for rows
                    
                    //  for loop for - rows
                    for (k1 = 1; k1 <= i1 + (i1 - 1); k1++)   {
                        //  print the row
                        System.out.print("-");
                    }   //  end of for loop for rows
                    
                    //  next line
                    System.out.println("");
                    
                }   //  end of for loop for number pyramid
    }
}
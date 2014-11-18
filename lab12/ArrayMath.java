//  Katherine Porfirio
//  CSE 002 Section 110
//  11/14/2014

//  Lab #12

//  define class
public class ArrayMath  {
    
    //  main method
    public static void main(String[] arg)   {
        
        //  arrays
        double x[] = {2.3, 3, 4, -2.1, 82, 23},
            y[] = {2.3, 3, 4, -2.1, 82, 23},
            z[] = {2.3, 13, 14},
            w[]={2.3, 13, 14, 12},
            v[],
            u[]={2.3, 12, 14};
            
        //  add arrays
        v = addArrays(x, y);
        
        //  print arrays
        System.out.println(display(x)+ " \n  + " +display(y)+ "\n   = " +display(v));
        System.out.println(display(x)+ " \n  + " +display(z)+ "\n   = " +display(addArrays(x,z)));
        System.out.println("It is " +equals(x,y)+ " that " +display(x)+ " == " +display(y));
        System.out.println("It is " +equals(z,w)+ " that " +display(z)+ " == " +display(w));
        System.out.println("It is " +equals(u,z)+ " that " +display(u)+ " == " +display(z));
        
    }   //  end of main method
    
    //
    //  display method
    //
    
    public static String display(double[] x)    {
        String out = "{";
        for(int j = 0; j < x.length; j++)   {
            if (j > 0)  {
                out += ",";
            }
            out += x[j];
        }
        return out + "}";
    }   //  end of display method
    
    //  
    //  equals method
    //
    
    public static Boolean equals(double[] array1, double[] array2)    {
        
        //  length the same?
        if (array1.length != array2.length) {
            return false;
        }   //  end of checking lengths
        
        //  values the same?
        for (int j = 0; j < array1.length; j++) {
            
            if (array1[j] == array2[j]) {
                continue;
            }
            
            else    {
                return false;
            }
            
        }   //  end of for loop for checking values
        
        return true;
        
    }   //  end of equals method
    
    //
    //  addArrays method
    //
    
    public static double[] addArrays(double[] array3, double[] array4)    {
        
        if (array3.length >= array4.length) {
            
            final int length = array3.length;
            double[] newArray = new double [length];
            
            //  adding values
            for (int j = 0; j < array4.length; j++)    {
                newArray[j] = array3[j] + array4[j];
            }   //  end of for loop for adding values
            
            for (int k = array4.length; k < array3.length; k++) {
                newArray[k] = array3[k];
            }   //  end of other for loop for adding values
            
            //  return new array
            return newArray;
            
        }
        
        else    {
            
            final int length = array4.length;
            double[] newArray = new double [length];
            
            //  adding values
            for (int j = 0; j < array3.length; j++)    {
                newArray[j] = array3[j] + array4[j];
            }   //  end of for loop for adding values
            
            for (int k = array3.length; k < array4.length; k++) {
                newArray[k] = array4[k];
            }   //  end of other for loop for adding values
            
            //  return new array
            return newArray;
            
        } 
       
    }   //  end of addArrays method
    
}   //  end of class

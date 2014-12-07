//  Katherine Porfirio
//  CSE 002 Section 110
//  11/14/2014

//  Lab #13

//  define class
public class RaggedArrays   {
    
    //  main method
    public static void main(String[] args)  {
        
        int[][] array = new int[5][];
        array[0] = new int[5];
        array[1] = new int[8];
        array[2] = new int[11];
        array[3] = new int[14];
        array[4] = new int[17];
        
        int randomNumber = 0;
        
        for (int i = 0; i < 5; i++) {
            randomNumber = (int)(Math.random() * 40);
            array[0][i] = randomNumber;
        }
        
        for (int i = 0; i < 8; i++) {
            randomNumber = (int)(Math.random() * 40);
            array[1][i] = randomNumber;
        }
        
        for (int i = 0; i < 11; i++) {
            randomNumber = (int)(Math.random() * 40);
            array[2][i] = randomNumber;
        }
        
        for (int i = 0; i < 14; i++) {
            randomNumber = (int)(Math.random() * 40);
            array[3][i] = randomNumber;
        }
        
        for (int i = 0; i < 17; i++) {
            randomNumber = (int)(Math.random() * 40);
            array[4][i] = randomNumber;
        }
        
        System.out.println();
        System.out.println("The array before sorting: ");
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            System.out.print(array[0][i]+ " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < 8; i++) {
            System.out.print(array[1][i]+ " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < 11; i++) {
            System.out.print(array[2][i]+ " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < 14; i++) {
            System.out.print(array[3][i]+ " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < 17; i++) {
            System.out.print(array[4][i]+ " ");
        }
        
        System.out.println();
        System.out.println();
        System.out.println("The array after sorting:");
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            int currentMin = array[0][i];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < 5; j++) {
                if (currentMin > array[0][j])   {
                    currentMin = array[0][j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i)   {
                array[0][currentMinIndex] = array[0][i];
                array[0][i] = currentMin;
            }
        }
        
        for (int i = 0; i < 8; i++) {
            int currentMin = array[1][i];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < 8; j++) {
                if (currentMin > array[1][j])   {
                    currentMin = array[1][j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i)   {
                array[1][currentMinIndex] = array[1][i];
                array[1][i] = currentMin;
            }
        }
        
        for (int i = 0; i < 11; i++) {
            int currentMin = array[2][i];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < 11; j++) {
                if (currentMin > array[2][j])   {
                    currentMin = array[2][j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i)   {
                array[2][currentMinIndex] = array[2][i];
                array[2][i] = currentMin;
            }
        }
        
        for (int i = 0; i < 14; i++) {
            int currentMin = array[3][i];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < 14; j++) {
                if (currentMin > array[3][j])   {
                    currentMin = array[3][j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i)   {
                array[3][currentMinIndex] = array[3][i];
                array[3][i] = currentMin;
            }
        }
        
        for (int i = 0; i < 17; i++) {
            int currentMin = array[4][i];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < 14; j++) {
                if (currentMin > array[4][j])   {
                    currentMin = array[4][j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i)   {
                array[4][currentMinIndex] = array[4][i];
                array[4][i] = currentMin;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print(array[0][i]+ " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < 8; i++) {
            System.out.print(array[1][i]+ " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < 11; i++) {
            System.out.print(array[2][i]+ " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < 14; i++) {
            System.out.print(array[3][i]+ " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < 17; i++) {
            System.out.print(array[4][i]+ " ");
        }
        
        
    }   //  end of main method
    
}   //  end of class
//  Katherine Porfirio
//  CSE 002 Section 110
//  12/04/2014

//  Homework #11

//  define a class
public class MatrixSorter   {
    
    //  main method
    public static void main(String arg[])   {
        
        //  declare and initialize array
        int mat3d[][][];
        mat3d = buildMat3d();
        
        //  print out the entire array
        show(mat3d);
        
        // find the smallest entry in the array
        System.out.println("The smallest entry in the 3D matrix is " +findMin(mat3d));
        
        //  sort array
        System.out.println("After sorting the 3rd matrix, we get:");
        sort(mat3d[2]);
        show(mat3d);
        
    }   //  end of main method
    
    // 
    //  buildMat3d method
    //
    
    public static int[][][] buildMat3d()    {
        
        //  declare array:
        
        int array[][][] = new int[3][][];
        
        array[0] = new int[3][];
        array[1] = new int[5][];
        array[2] = new int[7][];
        
        array[0][0] = new int[1];
        array[0][1] = new int[2];
        array[0][2] = new int[3];
        
        array[1][0] = new int[2];
        array[1][1] = new int[3];
        array[1][2] = new int[4];
        array[1][3] = new int[5];
        array[1][4] = new int[6];
        
        array[2][0] = new int[3];
        array[2][1] = new int[4];
        array[2][2] = new int[5];
        array[2][3] = new int[6];
        array[2][4] = new int[7];
        array[2][5] = new int[8];
        array[2][6] = new int[9];
        
        //  initialize array with random numbers between 1 and 99:
            
            int randomNumber = 0;
            int i = 0;
            
            //  initialize 1st "slab"
            for (i = 0; i < 1; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[0][0][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 2; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[0][1][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 3; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[0][2][i] = randomNumber;                      //  initialize part of array
            }
            
            //  initialize 2nd "slab"
            for (i = 0; i < 2; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[1][0][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 3; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[1][1][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 4; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[1][2][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 5; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[1][3][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 6; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[1][4][i] = randomNumber;                      //  initialize part of array
            }
            
            //  initialize 3rd "slab"
            for (i = 0; i < 3; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[2][0][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 4; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[2][1][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 5; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[2][2][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 6; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[2][3][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 7; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[2][4][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 8; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[2][5][i] = randomNumber;                      //  initialize part of array
            }
            for (i = 0; i < 9; i++) {
                randomNumber = (int)(((Math.random()) * 99) + 1);   //  new random number
                array[2][6][i] = randomNumber;                      //  initialize part of array
            }
        
        //  return ragged array with all random numbers
        return array;
        
    }   //  end of buildMat3d method
    
    // 
    //  show method
    //
    
    public static void show(int array[][][])    {
        
        //  declare variables
        int i = 0;
        
        //  title
        System.out.println("----------------------------------- Slab 1");
        
        //  print out first slab:
            for (i = 0; i < 1; i++) {
                System.out.print(array[0][0][i]+ " ");
            } 
            
            System.out.println("");
            
            for (i = 0; i < 2; i++) {
                System.out.print(array[0][1][i]+ " ");  
            }
            
            System.out.println("");
            
            for (i = 0; i < 3; i++) {
                System.out.print(array[0][2][i]+ " ");
            }
        
        //  empty space
        System.out.println("");
        
        //  title
        System.out.println("----------------------------------- Slab 2");
        
        //  print out the second slab:
            for (i = 0; i < 2; i++) {
                System.out.print(array[1][0][i]+ " ");
            } 
            
            System.out.println("");
            
            for (i = 0; i < 3; i++) {
                System.out.print(array[1][1][i]+ " ");  
            }
            
            System.out.println("");
            
            for (i = 0; i < 4; i++) {
                System.out.print(array[1][2][i]+ " ");
            }
            
            System.out.println("");
            
            for (i = 0; i < 5; i++) {
                System.out.print(array[1][3][i]+ " ");  
            }
            
            System.out.println("");
            
            for (i = 0; i < 6; i++) {
                System.out.print(array[1][4][i]+ " ");
            }
        
        //  empty space   
        System.out.println("");
        
        //  title
        System.out.println("----------------------------------- Slab 3");
        
        //  print out the third slab
            for (i = 0; i < 3; i++) {
                System.out.print(array[2][0][i]+ " ");
            } 
            
            System.out.println("");
            
            for (i = 0; i < 4; i++) {
                System.out.print(array[2][1][i]+ " ");  
            }
            
            System.out.println("");
            
            for (i = 0; i < 5; i++) {
                System.out.print(array[2][2][i]+ " ");
            }
            
            System.out.println("");
            
            for (i = 0; i < 6; i++) {
                System.out.print(array[2][3][i]+ " ");  
            }
            
            System.out.println("");
            
            for (i = 0; i < 7; i++) {
                System.out.print(array[2][4][i]+ " ");
            }
            
            System.out.println("");
            
            for (i = 0; i < 8; i++) {
                System.out.print(array[2][5][i]+ " ");  
            }
            
            System.out.println("");
            
            for (i = 0; i < 9; i++) {
                System.out.print(array[2][6][i]+ " ");
            }
            
            System.out.println("");
            System.out.println("");
        
    }   //  end of show method
    
    // 
    //  findMin method
    //
    
    public static int findMin(int array[][][])  {
        
        //  min set to array[0][0][0]
        int actualMin = array[0][0][0];
        
        //  see if there's a smaller number in any other part of the array:
            
            //  rest of 1st "slab"
            for (int i = 0; i < 2; i++) {
                if (array[0][1][i] < actualMin) {
                    actualMin = array[0][1][i];
                }
            }
            for (int i = 0; i < 3; i++) {
                if (array[0][2][i] < actualMin) {
                    actualMin = array[0][2][i];
                }
            }
            
            //  2nd "slab"
            for (int i = 0; i < 2; i++) {
                if (array[1][0][i] < actualMin) {
                    actualMin = array[1][0][i];
                }
            }
            for (int i = 0; i < 3; i++) {
                if (array[1][1][i] < actualMin) {
                    actualMin = array[1][1][i];
                }
            }
            for (int i = 0; i < 4; i++) {
                if (array[1][2][i] < actualMin) {
                    actualMin = array[1][2][i];
                }
            }
            for (int i = 0; i < 5; i++) {
                if (array[1][3][i] < actualMin) {
                    actualMin = array[1][3][i];
                }
            }
            for (int i = 0; i < 6; i++) {
                if (array[1][4][i] < actualMin) {
                    actualMin = array[1][4][i];
                }
            }
            
            //  3rd "slab"
            for (int i = 0; i < 3; i++) {
                if (array[2][0][i] < actualMin) {
                    actualMin = array[2][0][i];
                }
            }
            for (int i = 0; i < 4; i++) {
                if (array[2][1][i] < actualMin) {
                    actualMin = array[2][1][i];
                }
            }
            for (int i = 0; i < 5; i++) {
                if (array[2][2][i] < actualMin) {
                    actualMin = array[2][2][i];
                }
            }
            for (int i = 0; i < 6; i++) {
                if (array[2][3][i] < actualMin) {
                    actualMin = array[2][3][i];
                }
            }
            for (int i = 0; i < 7; i++) {
                if (array[2][4][i] < actualMin) {
                    actualMin = array[2][4][i];
                }
            }
            for (int i = 0; i < 3; i++) {
                if (array[2][5][i] < actualMin) {
                    actualMin = array[2][5][i];
                }
            }
            for (int i = 0; i < 3; i++) {
                if (array[2][6][i] < actualMin) {
                    actualMin = array[2][6][i];
                }
            }
        
        return actualMin;
        
    }   //  end of findMin method
    
    // 
    //  sort method
    //
    
    public static void sort(int array[][])  {
        
        //  empty space
        System.out.println("");
        
        //  SELECTION SORT:
        
            //  sort [2][0][]
            for (int i = 0; i < 3; i++) {
                int currentMin = array[0][i];
                int currentMinIndex = i;
                
                for (int j = i + 1; j < 3; j++) {
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
            
            //  sort [2][1][]
            for (int i = 0; i < 4; i++) {
                int currentMin = array[1][i];
                int currentMinIndex = i;
                
                for (int j = i + 1; j < 4; j++) {
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
            
            //  sort [2][2][]
            for (int i = 0; i < 5; i++) {
                int currentMin = array[2][i];
                int currentMinIndex = i;
                
                for (int j = i + 1; j < 5; j++) {
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
         
            //  sort [2][3][]
            for (int i = 0; i < 6; i++) {
                int currentMin = array[3][i];
                int currentMinIndex = i;
                
                for (int j = i + 1; j < 6; j++) {
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
            
            //  sort [2][4][]
            for (int i = 0; i < 7; i++) {
                int currentMin = array[4][i];
                int currentMinIndex = i;
                
                for (int j = i + 1; j < 7; j++) {
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
            
            //  sort [2][5][]
            for (int i = 0; i < 8; i++) {
                int currentMin = array[5][i];
                int currentMinIndex = i;
                
                for (int j = i + 1; j < 8; j++) {
                    if (currentMin > array[5][j])   {
                        currentMin = array[5][j];
                        currentMinIndex = j;
                    }
                }
                if (currentMinIndex != i)   {
                    array[5][currentMinIndex] = array[5][i];
                    array[5][i] = currentMin;
                }
            }
            
            //  sort [2][6][]
            for (int i = 0; i < 9; i++) {
                int currentMin = array[6][i];
                int currentMinIndex = i;
                
                for (int j = i + 1; j < 9; j++) {
                    if (currentMin > array[6][j])   {
                        currentMin = array[6][j];
                        currentMinIndex = j;
                    }
                }
                if (currentMinIndex != i)   {
                    array[6][currentMinIndex] = array[6][i];
                    array[6][i] = currentMin;
                }
            }
        
        //  INSERTION SORT:
        
        for (int i = 1; i < 7; i++) {
            
            int temp[][] = new int[7][];
            temp[i] = array[i];
            
            for (int j = i - 1; j >= 0 && temp[i][0] < array[j][0]; j--)   {
                array[j + 1] = array[j];
                array[j + 1] = temp[i];
            }
        }
        
        /*  It is impossible to reassign the length of an array once the space has already
            been allocated. Therefore it is impossible to go from
            
            33 54 74
            54 59 65 47
            42 41 98 31  5
            13 90  6  1 29  3
            39 40 58 62 33 23 14
            32  4 12 72 11 27 95 78
            39 16 84 66 20  9 34  2 62
            
            to
            
            1  3  6 13 29 90
            2  9 16 20 34 39 62 66 84
            4 11 12 27 32 72 78 95
            5 31 41 42 98
            14 23 33 39 40 58 62
            33 54 74
            47 54 59 65
        
        */
        
    }   //  end of sort method
    
}   //  end of class
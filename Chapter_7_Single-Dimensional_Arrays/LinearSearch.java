//  method for Linear Search

public class LinearSearch   {
    
    //  method for finding a key in a list
    public static int linearSearch(int[] list, int key) {
        
        for(int i = 0; i < list.length; i++)    {
            if (key == list[i]) {
                return i;
            }
        }
        
        return -1;
        
    }
    
}
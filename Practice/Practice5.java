//  Katherine Porfirio

//  define a class
public class Practice5 {
    
//  add main method
public static void main(String[] args) {
    
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
            n=45;
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
                        n-=3;
                        k-=5;
        }
            
            
        out+=1/n + 1/k;   
        
            System.out.println(n);
            System.out.println(k);
            System.out.println(out);
    
    }
}
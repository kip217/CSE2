//  Katherine Porfirio
//  CSE 002 Section 110
//  09/07/2014

//  define a class
public class Arithmetic {
    
    //  main method
    public static void main(String[] args) {
        
        //  input vriables:
        
            //  number of pairs of socks
            int nSocks = 3;
            //  cost per pair of socks ($ is part of the variable name)
            double sockCost$ = 2.58;
        
            //  number of drinking glasses
            int nGlasses = 6;
            //  cost per glass
            double glassCost$ = 2.29;
        
            //  number of boxes of envelopes
            int nEnvelopes = 1;
            //  cost per box of envelopes
            double envelopeCost$ = 3.25;
        
            //  tax 
            double taxPercent = 0.06;
        
        //  calculate the total cost of each item, and the sales tax
        
            //  total cost of socks
            double totalSockCost$ = nSocks * sockCost$;
            
            //  sales tax for socks
            double taxSocks$ = totalSockCost$ * taxPercent;
            
                //  make it have the correct number of decimal places
                taxSocks$ = taxSocks$ * 100;
                int taxSocks2 = (int) taxSocks$;
                double taxSocks3 = (double) taxSocks2;
                taxSocks3 = taxSocks3 / 100;
            
            //  total cost of drinking glasses
            double totalGlassCost$ = nGlasses * glassCost$;
            
            //  sales tax for drinking glasses
            double taxGlasses$ = totalGlassCost$ * taxPercent;
            
                //  make it have the correct number of decimal places
                taxGlasses$ = taxGlasses$ * 100;
                int taxGlasses2 = (int) taxGlasses$;
                double taxGlasses3 = (double) taxGlasses2;
                taxGlasses3 = taxGlasses3 / 100;
            
            //  total cost of boxes of envelopes
            double totalEnvelopeCost$ = nEnvelopes * envelopeCost$;
            
            //  sales tax for boxes of envelopes
            double taxEnvelopes$ = totalEnvelopeCost$ * taxPercent;
            
                //  make it have the correct number of decimal places
                taxEnvelopes$ = taxEnvelopes$ * 100;
                int taxEnvelopes2 = (int) taxEnvelopes$;
                double taxEnvelopes3 = (double) taxEnvelopes2;
                taxEnvelopes3 = taxEnvelopes3 / 100;
            
        //  print out the items being bought, how many of each item is being bought, and the cost per item on separate lines
        
            System.out.println("Purchased Items:");
            System.out.println("");
            System.out.println("Item                    Amount           Cost per item");
            System.out.println("————————————————————————————————————————————————————————");
            System.out.println("Socks                      "+(nSocks)+"                $"+(sockCost$)+"");
            System.out.println("Drinking Glasses           "+(nGlasses)+"                $"+(glassCost$)+"");
            System.out.println("Boxes of Envelopes         "+(nEnvelopes)+"                $"+(envelopeCost$)+"");
            System.out.println("");
            
        //  print out the total cost for each item and the sales tax for each item
            
            System.out.println("");
            System.out.println("Total cost for each item:");
            System.out.println("");
            System.out.println("Item                    Amount          Sales Tax");
            System.out.println("———————————————————————————————————————————————————");
            System.out.println("Socks                   $"+(totalSockCost$)+"             $"+(taxSocks3)+"");
            System.out.println("Drinking Glasses        $"+(totalGlassCost$)+"            $"+(taxGlasses3)+"");
            System.out.println("Boxes of Envelopes      $"+(totalEnvelopeCost$)+"             $"+(taxEnvelopes3)+"");
            System.out.println("");
            
        //  calculate the total costs
        
            //  total cost of purchases before tax
            double totalBeforeTax$ = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
            
            //  total sales tax
            double totalTax$ = totalBeforeTax$ * taxPercent;
            
                //  make it have the correct number of decimal places
                totalTax$ = totalTax$ * 100;
                int totalTax2 = (int) totalTax$;
                double totalTax3 = (double) totalTax2;
                totalTax3 = totalTax3 / 100;
            
            //  total cost of purchases after tax
            double totalAfterTax$ = totalBeforeTax$ + totalTax3;
            
        //  print out the total cost before tax, the total sales tax, and the total cost of the purchases (including sales tax)
            
            System.out.println("");
            System.out.println("Total cost of purchases (before tax):           $"+(totalBeforeTax$)+"");
            System.out.println("Total sales tax:                                $"+(totalTax3)+"");
            System.out.println("Total cost of purchases (including sales tax):  $"+(totalAfterTax$)+"");
            
    }
}

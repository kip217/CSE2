//  Katherine Porfirio

    //  import scanner
    import java.util.Scanner;
    
    import java.text.DecimalFormat;

//  define a class
public class Practice {
    
//  add main method
public static void main(String[] args) {
    
    System.out.println("Name \t\t Type \t\t Hours \t\t Total Pay");
    DecimalFormat df = new DecimalFormat("###,###,##0.00");
    
    String hours = df.format(43.98347);
    String totalPay = df.format(983.34766);
    
    String hours2 = df.format(345.98347);
    String totalPay2 = df.format(93.34766);
    
    double totalTotalPay = 923847.498357;
    String total = df.format(totalTotalPay);
    
    System.out.print("Smith");
    System.out.print("\t\t hourly");
    System.out.printf("%15s", hours);
    System.out.print("\t  ");
    System.out.printf("%15s", totalPay);
    System.out.println();
    
    System.out.print("Smith");
    System.out.print("\t\t hourly");
    System.out.printf("%15s", hours2);
    System.out.print("\t  ");
    System.out.printf("%15s", totalPay2);
    System.out.println();
    
    System.out.print("\t\t\t\t\t  ");
    System.out.printf("%15s", totalPay);
    
    }
}
//  program converts degrees to radians and computes the sin, cos, and tan of the angle

public class FormatDemo {
    
    public static void main(String[] args)  {
        
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4s%-10.4s%-10.4s%-10.4s\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
        
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4s%-10.4s%-10.4s%-10.4s\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
        
    }
    
}
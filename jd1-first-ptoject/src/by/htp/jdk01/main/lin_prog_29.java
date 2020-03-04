package by.htp.jdk01.main;

public class lin_prog_29 {
	
public static void main(String args[]) {
        
        double a = 15, b = 12, c = 9, x, y, z, Pi = 3.1415926536;
     
       x = (a * a - b * b + c * c) / (2 * a * c) * 180 / Pi;
       y = (b * b - a * a + c * c) / (2 * b * c) * 180 / Pi;
       z = (b * b - c * c + a * a) / (2 * a * b) * 180 / Pi;
       
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    
    }
}

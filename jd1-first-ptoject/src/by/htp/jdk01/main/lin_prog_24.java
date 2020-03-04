package by.htp.jdk01.main;

public class lin_prog_24 {
	
public static void main(String args[]) {
        
        double a = 12, b = 6, l = 60, d, S, c;
     
        d = (a - b) / 2;
        c = d / Math.cos(l);
        S = (a + b) / 2 * Math.sqrt(c * c - d * d);
       
    System.out.println("S = " + S);
    
    }
}

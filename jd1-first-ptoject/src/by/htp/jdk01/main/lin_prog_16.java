package by.htp.jdk01.main;

public class lin_prog_16 {
	
	 public static void main(String args[]) {
	        
	        int z = 1234, b, c, a, d, p;
	        
	        a = (z / 1000);
	        b = (z - (a * 1000)) / 100;
	        c = (z - (a * 1000) - (b * 100)) / 10;
	        d = (z - (a * 1000) - (b * 100) - (c * 10));
	        
	        p = a * b * c * d;
	      
	      System.out.println("p = " + p);
	      
	    }
}

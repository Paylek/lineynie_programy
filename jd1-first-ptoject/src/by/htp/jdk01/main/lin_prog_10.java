package by.htp.jdk01.main;

public class lin_prog_10 {
	
	 public static void main(String args[]) {
		 
	      double x = 1 / 2, y = 1 / 2, z;
	      
	      z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) + Math.tan(x * y);
	      
	      System.out.println("z = " + z);
	      
	    }
}

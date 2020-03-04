package by.htp.jdk01.main;

public class lin_prog_13 {
	
	  public static void main(String args[]) {
	        
	      double x1 = 5, x2 = 3, y1 = 6, y2 = 3, x3 = 9, y3 = 3, a, b, c, p, P, S;
	      
	      a = Math.sqrt(Math.pow((x1 - x2), 2.) + Math.pow((y1 - y2), 2.));
	      b = Math.sqrt(Math.pow((x3 - x1), 2.) + Math.pow((y1 - y3), 2.));
	      c = Math.sqrt(Math.pow((x3 - x2), 2.) + Math.pow((y3 - y2), 2.));
	      
	      p = (a + b + c) / 2;
	      
	      P = p * 2;
	      S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	      
	      System.out.println("P = " + P);
	      System.out.println("S = " + S);
	      
	    }
}

package by.htp.jdk01.main;

public class lin_prog_34 {
	
	public static void main(String args[]) {
        
	    int A = 1024;
	    double b, c, d;
	    b = Math.pow(A, 1 / 10.);
	    c = Math.pow(b, 1 / 10.);
	    d = Math.pow(c, 1 / 10.);
	     
	    System.out.println("Килобайт " + b);
	    System.out.println("Мегабайт " + c);
	    System.out.println("Гигабайт " + d);
	    
	    }
}

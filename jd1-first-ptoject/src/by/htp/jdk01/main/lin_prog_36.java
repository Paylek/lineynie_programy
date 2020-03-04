package by.htp.jdk01.main;

public class lin_prog_36 {
	
	public static void main(String args[]) {
        
	    int z = 1234, b, c, a, d, p = 1, q = 1;
	        a = (z / 1000);
	        b = (z - (a * 1000)) / 100;
	        c = (z - (a * 1000) - (b * 100)) / 10;
	        d = (z - (a * 1000) - (b * 100) - (c * 10));
	        
	        int w[] =  {a, b, c, d};
	        for (int i = 0; i < w.length; i++) {
	            if(w[i] % 2 == 0) {
	                p *= w[i];
	            }
	            else {
	                q *= w[i];
	            }
	        }
	    
	      System.out.println("p = " + p);
	      System.out.println("q = " + q);
	      
	    }
}

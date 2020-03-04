package by.htp.jdk01.main;

public class lin_prog_32 {
	
	 public static void main(String args[]) {
	        
	        double a = 16, b = 30, c = 30, x = 2, y = 20, z = 20, e, r, t, i, u, n, q;
	     
	       e = a * 3600 + b * 60 + c;
	       r = x * 3600 + y * 60 + z;
	       t = e + r;
	       
	       	i = t / 3600;
	        u = (int)(t / 3600);
	        n = (int)((i - u) * 60);
	        q = t - u * 3600 - n * 60;
	       
	   System.out.println(u + " ч " + n + " мин " + q + " сек");
	   
	    }
}

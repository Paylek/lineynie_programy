package by.htp.jdk01.main;

public class lin_prog_31 {
	
public static void main(String args[]) {
        
        double S, S1, S2, So, u = 20, u1 = 10, t1 = 2, t2 = 1;
     
       S = u * t1;
       S1 = (u + u1) * t2;
       So = S1 - S;
       S2 = S - So;
       
    System.out.println("S = " + S);
    System.out.println("S1 = " + S1);
    System.out.println("S2 = " + S2);
    
    }
}

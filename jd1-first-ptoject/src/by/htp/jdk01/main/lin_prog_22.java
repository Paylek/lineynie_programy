package by.htp.jdk01.main;

public class lin_prog_22 {
	
public static void main(String args[]) {
        
        double z = 60398, x, y, b, c;
       
        y = z / 3600;
        x = (int)(z / 3600);
        b = (int)((y - x) * 60);
        c = z - x * 3600 - b * 60;
        
       
    System.out.println(x + " ч " + b + " мин " + c + " сек");
    
    }
}

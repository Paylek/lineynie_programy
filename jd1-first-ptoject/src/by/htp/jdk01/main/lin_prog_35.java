package by.htp.jdk01.main;

public class lin_prog_35 {
	
	public static void main(String[] args) {
		double M = 275, N = 9, R;
		int y, x;
		
		R = M/N;
		y = (int)R;
		y = y % 10;
		
		System.out.println("Младшая цифра целой части " + y);
		
		x = (int)(R * 10);
		x = x % 10;
		
		System.out.println("Старшая цифра дробной части " + x);	
	
	}

}

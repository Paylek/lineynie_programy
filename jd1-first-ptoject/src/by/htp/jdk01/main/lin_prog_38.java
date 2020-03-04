package by.htp.jdk01.main;

import java.util.Scanner;

public class lin_prog_38 {
	
	public static void main(String args[]) {
		
		Zadacha_01();
		Zadacha_02();
		Zadacha_03();
		
	}
	
	public static char Zadacha_01() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter y: ");
		y = sc.nextInt();
		
		
		
		if(y >= 0 && (y / x) <= 2 && y <= 4 && x >= 0 && x <= 4) {
			 System.out.println("Верно");
		}
		else if(y >= 0 && (y / x) <= 0 && y <= 4 && x >= -4 && x <= 0) {
			 System.out.println("Верно");
		}
		else {
			System.out.println("НеВерно");
		}
		
		return 0;
		
	}
	
public static char Zadacha_02() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter y: ");
		y = sc.nextInt();
		
		
		
		if(y >= 0 && y <= 4 && x >= -2 && x <= 2) {
			 System.out.println("Верно");
		}
		else if(y <= 0 && y >= -3 && x >= -4 && x <= 4) {
			 System.out.println("Верно");
		}
		else {
			System.out.println("НеВерно");
		}
		

		return 0;
		
	}

public static char Zadacha_03() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	int x, y;
	
	System.out.print("Enter x: ");
	x = sc.nextInt();
	System.out.print("Enter y: ");
	y = sc.nextInt();
	
	
	
	if(y >= 0 && y <= 3 && x >= 0 && x <= 3 && Math.pow(x * x + y * y, 1/2.) < 3) {
		 System.out.println("Верно");
	}
	else if(y >= -4 && y <= 0 && x >= 0 && x <= 4 && Math.pow(x * x + y * y, 1/2.) < 4) {
		 System.out.println("Верно");
	}
	else {
		System.out.println("НеВерно");
	}
	
	sc.close();
	
	return 0;
	
}

}

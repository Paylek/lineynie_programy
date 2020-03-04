package by.htp.jdk01.main;

public class lin_prog_37 {

	public static void main(String args[]) {
		
		Zadacha_01();
		Zadacha_02();
		Zadacha_03();
		Zadacha_04();
		Zadacha_05();
		Zadacha_06();
		Zadacha_07();
		Zadacha_08();
		Zadacha_09();
	}
	
	public static char Zadacha_01() {
		int x = 24;
		if(x >= 10 && x <= 99 && x % 2 == 0)
		{
			 System.out.println("Верно");
		}
		else {
			System.out.println("НеВерно");
		}
		return 0;
	}
	
	public static char Zadacha_02() {
	
		int z = 1234, b, c, a, d;
		a = (z / 1000);
		b = (z - (a * 1000)) / 100;
		c = (z - (a * 1000) - (b * 100)) / 10;
		d = (z - (a * 1000) - (b * 100) - (c * 10));
    
		if(a + b == c + d) {
			System.out.println("Верно");
		}
		else {
			System.out.println("НеВерно");
		}
		return 0;
	}
	
	public static char Zadacha_03() {
		
		int z = 123, b, c, a;
		a = (z / 1000);
		b = (z - (a * 1000)) / 100;
		c = (z - (a * 1000) - (b * 100)) / 10;
		
		if ((a + b + c) % 2 == 0) {
			System.out.println("Верно");
		}
		
		else {
			System.out.println("НеВерно");
		}
		return 0;
	}
	
	public static char Zadacha_04() {
		int x = 3, y = 4, m = 6, n = 5;
		
		if (m > 0 && n > 0 && m > x && n > y && x > 0 && y > 0) {
			System.out.println("Верно");
		}
		else if (m > 0 && n < 0 && m > x && n < y && x > 0 && y < 0) {
			System.out.println("Верно");
		}
		else if (m < 0 && n > 0 && m < x && n > y && x < 0 && y > 0) {
			System.out.println("Верно");
		}
		else if (m < 0 && n < 0 && m < x && n < y && x < 0 && y < 0) {
			System.out.println("Верно");
		}
		else {
			System.out.println("НеВерно");
		}
		return 0;
	}
	
	public static char Zadacha_05() {
		
		int z = 123, b, c, a;
		a = (z / 1000);
		b = (z - (a * 1000)) / 100;
		c = (z - (a * 1000) - (b * 100)) / 10;
		
		if((z * z) == (Math.pow(((a * a) + (b * b) + (c * c)), 3))) {
			System.out.println("Верно");
		}
		
		else {
			System.out.println("НеВерно");
		}
		return 0;
	}
	
	public static char Zadacha_06() {
		int a = 3, b = 4, c = 3;
		
		if(a == b && a != c) {
			System.out.println("Верно");
		}
		else if(a == c && a != b) {
			System.out.println("Верно");
		}
		else if(b == c && b != a) {
			System.out.println("Верно");
		}
		else {
			System.out.println("НеВерно");
		}
		return 0;
	}
	
	public static char Zadacha_07() {
		
		int z = 123, b, c, a;
		a = (z / 1000);
		b = (z - (a * 1000)) / 100;
		c = (z - (a * 1000) - (b * 100)) / 10;
		
		if (a + b == c) {
			System.out.println("Верно");
		}
		else if (a + c == b) {
			System.out.println("Верно");
		}
		else if (b + c == a) {
			System.out.println("Верно");
		}
		else {
			System.out.println("НеВерно");
		}
		return 0;
	}
	
	public static char Zadacha_08() {
		
		int N = 27, n = 3;
		
		if (Math.pow(n, 0) == N) {
			System.out.println("Верно");
		}
		else if (Math.pow(n, 1) == N) {
			System.out.println("Верно");
		}
		else if (Math.pow(n, 2) == N) {
			System.out.println("Верно");
		}
		else if (Math.pow(n, 3) == N) {
			System.out.println("Верно");
		}
		else if (Math.pow(n, 4) == N) {
			System.out.println("Верно");
		}
		else {
			System.out.println("НеВерно");
		}
		return 0;
	}
	
	public static char Zadacha_09() {
		
		int m = 5, n = 4;
		if ((3 * m * m + 3 * m + 1) == n) {
			System.out.println("Верно");
		}
		else {
			System.out.println("НеВерно");
		}
		return 0;
	}
	
}

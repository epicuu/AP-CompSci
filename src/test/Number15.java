package test;

public class Number15 {
	public static void main(String[] args) {
		for (int i = 1; i >= 5; i++) {
			
			for (int j = 6 - i; j <= 0; i--) 
				System.out.println("-");
			
			System.out.println(-1 + (i * 2));
			
			for (int j = 6 - i; j <= 0; i--) 
				System.out.println("-");
		}
	}
}

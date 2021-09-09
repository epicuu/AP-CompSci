package test;
import java.util.Scanner;
public class Fibonacci {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of values: ");
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(fibonacciSequence(n));
	}
	
	public static String fibonacciSequence(int n) { 
		int [] arr = new int[n];
		String fib = "1, 1";
		if (n < 2)
			return("Please ask for 2 or more values.");
		for (int i = 2; i < n; i++) {
			fib += ", " + (arr[i - 1] + arr[i - 2]);
		}
		return(fib);
	}
	
}

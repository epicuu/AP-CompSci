package test;
//import scanner
import java.util.Scanner;

public class DistanceConstantAcceleration {
	public static void main(String[] args) {
		
		// init vars
		double a = -9.82, s = 0, v = 0, t = 0;
		// init scanner
		Scanner sc = new Scanner(System.in);
		// prompt user for vars
		System.out.print("Time: ");
		t = sc.nextDouble();
		System.out.print("Initial Velocity: ");
		v = sc.nextDouble();
		System.out.print("Acceleration: ");
		a = sc.nextDouble();
		sc.close();
		// evaluate position based on vars
		s = v * t + Math.pow(t, 2) * a/2;
		
		// print value to user
		System.out.println("The initial position is " + s);
		
		/* 
public class test {
	public static void main(String[] args) {
		
		// question 2 (squares)
		// init vars
		int a = 1;
		double b = 1;
		// loop until 100 is printed
		for (int i = 0; i <= 9; i++) {
			// b = a^2
			b = Math.pow(a, 2);
			// print result to user
			System.out.print((int)b + " ");
			a++;
		}
		
		// creating space between Qs
		System.out.println("");
		
		// question 3 (fibonacci sequence)
		int n1 = 0, n2 = 1, fib = 1;
		for (int i = 0; i <= 11; i++) {
			// start with print to print initial val of fib
			System.out.print(fib + " ");
			// evaluating next values for vars
			fib = n1 + n2;
			n1 = n2;
			n2 = fib;
		*/
		
	}

}

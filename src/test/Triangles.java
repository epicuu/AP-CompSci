// Victor Pacheco, Tri 1, Period 3
package test;
import java.util.Scanner;
public class Triangles {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// triangles
		System.out.print("Enter length 1: ");
		int side1 = sc.nextInt();
		System.out.print("Enter length 2: ");
		int side2 = sc.nextInt();
		System.out.print("Enter length 3: ");
		int side3 = sc.nextInt();
		System.out.println("Your triangle is a " + printTriangleType(side1, side2, side3) + " triangle. \n");
		
		// range
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();
		System.out.println(printRange(num1, num2) + "\n");
		
		// smallest largest
		System.out.print("Number of numbers: ");
		int num = sc.nextInt();
		smallestLargest(num, sc);
		
		// quadrant
		System.out.print("Enter number 1: ");
		double x = sc.nextDouble();
		System.out.print("Enter number 2: ");
		double y = sc.nextDouble();
		System.out.println(quadrant(x, y) + "\n");
		
		// roman numerals
		// prompt user for number
		System.out.print("Enter number: ");
		int numeral = sc.nextInt();
		// print out the result of the roman numeralization
		System.out.println(romanNumeral(numeral));
		
	}
	
	public static String printTriangleType(int x, int y, int z) {
		String triangleType = "";
		if (x == y && y == z) 
			triangleType = "equilateral";
		else if(x == y && y != z)
			triangleType = "isosceles";
		else if (x != y && y != z && z != x)
			triangleType = "scalene";
		return(triangleType);
	}
	
	public static String printRange(int x, int y) {
		String range = "[" + x;
		if (x < y)
			for (int i = x + 1; i <= y; i++)
				range += (", " + i);
		if (x > y)
			for (int i = x - 1; i >= y; i--)
				range += (", " + i);
		return(range + "]");
	}
	
	public static void smallestLargest(int x, Scanner sc) {
		System.out.print("Number 1: ");
		int small = sc.nextInt(), large = small;
		
		for (int i = 2; i <= x; i++) {
			System.out.print("Number " + i + ": ");
			int z = sc.nextInt();
			if (z < small)
				small = z;
			else if (z > large)
				large = z;
		}
		System.out.println("Smallest number: " + small);
		System.out.println("Largest number: " + large);
	}
	
	public static String quadrant(double x, double y) {
		String quadrant = "";
		if (x >= 0 && y >= 0)
			quadrant = "Quadrant 1";
		else if (x <= 0 && y >= 0)
			quadrant = "Quadrant 2";
		else if (x <= 0 && y <= 0)
			quadrant = "Quadrant 3";
		else if (x >= 0 && y <= 0)
			quadrant = "Quadrant 4";
		return(quadrant);
	}
	
	public static String romanNumeral(int x) {
		// creating counter variable
		int i = x;
		// creating string to store the roman numeral
		String romanNumeral = "";
		// series of while loops that determine what letters
		// to add to the roman numeral string
		while (i >= 1000) {
			romanNumeral += "M";
			i -= 1000;
		}
		while (i >= 900) {
			romanNumeral += "CM";
			i -= 900;
		}
		while (i >= 500) {
			romanNumeral += "D";
			i -= 500;
		}
		while (i >= 400) {
			romanNumeral += "CD";
			i -= 400;
		}
		while (i >= 100) {
			romanNumeral += "C";
			i -= 90;
		}
		while (i >= 50) {
			romanNumeral += "L";
			i -= 50;
		}
		while (i >= 40) {
			romanNumeral += "XL";
			i -= 40;
		}
		while (i >= 10) {
			romanNumeral += "X";
			i -= 10;
		}
		while (i >= 9) {
			romanNumeral += "IX";
			i -= 9;
		}
		while (i >= 5) {
			romanNumeral += "V";
			i -= 5;
		}
		while (i >= 4) {
			romanNumeral += "IV";
			i -= 4;
		}
		while (i >= 1) {
			romanNumeral += "I";
			i -= 1;
		}
		
		// returning result
		return (romanNumeral);
	}
}

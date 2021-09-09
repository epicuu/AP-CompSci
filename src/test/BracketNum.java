package test;

public class BracketNum {
	public static void main(String[] args) {
		
		// calling printNumbers method for values provided
		printNumbers(15);
		printNumbers(5);
		
		// calling printPowersOfN method for values provided
		printPowersOfN(4, 3);
		printPowersOfN(5, 6);
		printPowersOfN(-2, 8);
		
		// calling distance method for values provided
		distance(1, 0, 4, 4);
		distance(10, 2, 3, 5);
		
		// calling printReverse method for values provided
		printReverse("hello there!");
		printReverse("");
		
	}
	public static void printNumbers(int x){
		for (int i = 1; i <= x; i++) {
			// print number in brackets and repeat, starting
			// at 1 and going up to x
			System.out.print("[" + i + "]");
		}
		// println to go to next line
		System.out.println();
	}
	
	public static void printPowersOfN(int x, int y) {
		for (int i = 0; i <= y; i++) {
			// square x and print based on how many
			// times looped up until there are y loops
			System.out.print((int)Math.pow(x, i) + " ");
		}
		// println to go to next line
		System.out.println();
	}
	
	public static void distance(int x1, int y1, int x2, int y2) {
		// performing calculations and storing them in their
		// designated vars
		double x = Math.pow(x2 - x1, 2), y = Math.pow(y2 - y1, 2); // x = (x2 - x1)^2 and (y = y2 - y1 )^2
		double d = Math.sqrt(x + y);
		// print the value of d (distance) to the user
		System.out.println(d);
	}
	
	public static void printReverse(String str) {
		// creating an empty string to store the result
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			// adding characters to the reverse string
			// starting from the last char and going backward
			reverse += str.charAt(i);
		}
		// print out the result of the reverse
		System.out.println(reverse);
	}
}
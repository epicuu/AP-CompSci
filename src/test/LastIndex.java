// Victor Pacheco, Tri 1, Period 3
package test;
// import scanner
import java.util.Scanner;
public class LastIndex {
	public static void main(String[] args) {
		
		// start of index project
		
		// instantiate scanner
		Scanner sc = new Scanner(System.in);
		
		// prompt user for the number of values in the array
		System.out.print("Amount of Numbers: ");
		int n = sc.nextInt();
		
		// spacing out prompt
		System.out.println();
		
		//creating array of integers
		int[] arr = new int[n];
		
		// prompting user for each value in the array
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		// prompt user for which index they want
		System.out.print("\nIndex: ");
		int value = sc.nextInt();
		
		// printing result of getLastIndex to user
		// getLastIndex finds the last index with the value the user entered
		System.out.println("The last index with this value is " + lastIndexOf(value, arr));
		
		// start of mode project
		
		// creating array (1-100)
		int[] num = new int[101];
		
		// calling mode method to find the mode and printing it to the user
		System.out.println("The mode is " + mode(num, sc));
		
		// closing scanner
		sc.close();
		
	}
	
	// index project method
	public static int lastIndexOf(int n, int[] arr) {
		// looping through the array backwards (finding the LAST index)
		for (int i = arr.length - 1; i >= 0; i--) {
			// return if the value of the current is equal to the value the user entered
			if (arr[i] == n) {
				return(i);
			}
		}
		// printing -1 if the value isn't found in the array
		return(-1);
	}
	
	// mode project method
	public static int mode(int[] arr, Scanner sc) {
		// prompting user for amount of values they will put in
		System.out.print("Number of values: ");
		int n = sc.nextInt();
		// prompting user for each value in the array
		// user will put in values from 1-100
		// if the number = index, increment the value of the index
		for(int i = 0; i <= n; i++) {
			System.out.print("Number " + (i) + ": ");
			int num = sc.nextInt();
			arr[num]++;
		}
		// creating variable to store mode
		int mode = 0;
		// checking every value in the array for the index with the highest value
		for (int i = 0; i < 101; i++)
			if (arr[i] > mode)
				// if the current index's value is greater than the current mode
				// the mode is the current index
				mode = i;
		
		// return the mode
		return(mode);
	}
}

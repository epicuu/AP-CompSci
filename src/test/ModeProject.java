// Victor Pacheco, Tri 1, Period 3
package test;
// import scanner
import java.util.Scanner;
public class ModeProject {
	public static void main(String[] args) {
		// instantiate scanner
		Scanner sc = new Scanner(System.in);
		// creating array (1-100)
		int[] num = new int[101];
		
		// calling mode method to find the mode and printing it to the user
		System.out.println("The mode is " + mode(num, sc));
	}
	
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

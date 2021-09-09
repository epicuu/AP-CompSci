// Victor Pacheco, Tri 2, Period 3
package test;
// import scanner
import java.util.Scanner;
public class Scrabble {
	public static void main(String [] args) {
		// instantiate scanner
		Scanner sc = new Scanner(System.in);
		
		// prompt user for word
		System.out.print("Word: ");
		String word = sc.nextLine();
		
		// close scanner
		sc.close();
		
		// printing out point value for word (determined by computeScore method)
		System.out.println("This word's point value is " + computeScore(word) + ".");
	}
	public static int computeScore(String word) {
		// pointVal array contains point values for each letter in the alphabet
		int [] pointVal = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
		// alphabet string contains each letter in the alphabet
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		// int sum stores the total score of the word
		int sum = 0;
		// making word all lowercase to avoid errors
		word = word.toLowerCase();
		
		// loop to find sum
		for (int i = 1; i <= word.length(); i++) {
			// position = the index of the letter of the alphabet
			int position = alphabet.indexOf(word.charAt(i - 1));
			// applying the point value of the letter to sum
			sum += pointVal[position];
		}
		
		// returning the total score of the word
		return(sum);
	}
}

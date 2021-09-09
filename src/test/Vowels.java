// Victor Pacheco, Tri 2, Period 3
package test;
// import scanner
import java.util.Scanner;
public class Vowels {
	public static void main(String [] args) {
		
		// instantiate scanner
		Scanner sc = new Scanner(System.in);
		
		// prompt user for a string
		System.out.print("Enter a phrase: ");
		String phrase = sc.nextLine();
		sc.close();
		// print out result to user
		System.out.println("There are " + findVowels(phrase) + " vowels in this phrase.");
				
	}
	
	public static String findVowels(String str) {
		// making string lowercase in order to ignore case
		str = str.toLowerCase();
		// creating vars to store the result
		int result = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			// assigning the current char to a string var
			char ch = str.charAt(i);
			// finding if the current char is a vowel and incrementing result if it is
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				result++;
			}
		}
		// return result
		return(Integer.toString(result));
	}
}

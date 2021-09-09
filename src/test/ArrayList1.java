// Victor Pacheco, Tri 2, Period 3
package test;
// importing arraylist
import java.util.ArrayList;
public class ArrayList1 {
	public static void main (String [] args) {
		// create list of strings and add some itmes
		ArrayList<String> list = new ArrayList<String>();
		list.add("Gamer");
		list.add("Time");
		list.add("Baby");
		// print out the average vowels
		System.out.println(averageVowels(list));
	}
	
	// takes an arraylist of strings, reads each string,
	// prints out the number of vowels, finds the average
	// amount of total vowels in all strings in the arraylist
	public static double averageVowels(ArrayList<String> arr) {
		// create vowel counter and avg vars
		int vowels = 0;
		double avg = 0;
		// for each that reads in each string in the arraylist
		for (String s : arr)
			// for loop that reads in every character in each string
			for (int i = 0; i < s.length(); i++)
				// increment the counter if the current char is a vowel
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' 
				|| s.charAt(i) == 'i' || s.charAt(i) == 'o' 
				|| s.charAt(i) == 'u')
					vowels++;
		
		// calculate avg number of vowels, save it in avg
		avg = (double)vowels / arr.size();
		// print out the number of vowels
		System.out.println(vowels);
		// return the avg amount of vowels
		return avg;
	}
}

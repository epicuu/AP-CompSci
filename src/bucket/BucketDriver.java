// Victor P 2020
package bucket;
// import scanner
import java.util.Scanner;
public class BucketDriver {
	public static void main(String [] args) {
		// create scanner
		Scanner sc = new Scanner(System.in);
		// create a bucket object
		Bucket bucket = new Bucket();
		// create a counter variable for the while loop
		// if the user inputs 0, the loop is exited
		String counter = "1";
		while (!counter.equals("0")) {
			// prompt the user for words until the loop is ended
			System.out.print("Enter a word (Enter 0 to stop): ");
			counter = sc.nextLine();
			// adds the string to the counter if it isnt 0
			if (!counter.equals("0"))
				bucket.addWord(counter);
		}
		// print out the bucket to the user
		System.out.println("\n" + bucket.toString());
		// close scanner
		sc.close();
	}
}

// Victor P 2020
package bucket;
// import arraylist
import java.util.ArrayList;
public class Bucket {
	// fields
	private ArrayList <ArrayList<String>> bucket = new ArrayList<ArrayList<String>>();
	
	// constructors
	public Bucket() {
		// creates 26 arraylists in the bucket arraylist
		for (int i = 0; i < 26; i++) {
			ArrayList<String> words = new ArrayList<String>();
			bucket.add(words);
		}
	}
	
	// method that adds a string to the bucket
	public void addWord(String str) {
		int index = ((int)str.toUpperCase().charAt(0) - 65);
		bucket.get(index).add(str);
	}
	
	// replace default toString method
	public String toString() {
		// string that holds the toString
		String str = "";
		// counter int that holds the char
		int c = 65;
		// goes through every arraylist and prints it out with
		// the char of the value of c
		for (ArrayList<String> a: bucket) {
			char ch = (char)c;
			str += ch + ": " + a + "\n";
			c++;
		}
		return str;
	}
}

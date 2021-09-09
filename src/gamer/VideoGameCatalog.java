// Victor P. 2020
package gamer;
// import arraylist
import java.util.ArrayList;
public class VideoGameCatalog {
	// field
	private ArrayList<Game> catalog = new ArrayList<Game>();
	
	// constructor methods
	// default constructor
	public VideoGameCatalog() {
		// nothing is being passed in, but games can be added post-construction
	}
	// passing in a game object
	public VideoGameCatalog(Game game) {
		catalog.add(game);
	}
	
	// passing in an arraylist
	public VideoGameCatalog(ArrayList<Game> arr) {
		// add every game in arr to catalog
		for (Game game : arr)
			catalog.add(game);
	}
	
	// accessor method that shows the name and platform of all games in the catalog
	public String getNames() {
		// string var stores all game names and platforms
		String string = "";
		// adding each game's info to the string
		for (Game game : catalog)
			string += game.getName() + "\n";
		return string;
	}
	
	// method that searches for a specific game using it's name + platform or isbn and returns its info
	public String findGame(String string) {
		// string var stores game info
		// default in case no matching game is found
		String gameInfo = "No results found.";
		// goes through each game in the catalog to find if the name + platform
		for (Game game : catalog) {
			if (game.getName().equals(string) || game.getISBN().equals(string))
				// gameinfo var to stores the info if theres a match
				gameInfo = game.toString();
		}
		return gameInfo;
	}
	
	// method that adds a new game to the catalog
	public void addGame(Game game) {
		catalog.add(game);
	}
	
	// method that removes a game from the catalog
	public void removeGame(Game game) {
		catalog.remove(game);
	}
	
	// a variant of the above method that searches for the game in the catalog using a string
	// that contains a name + platform or isbn
	public void removeGame(String string) {
		// goes through each game in the catalog to find if the name + platform
		// is the same as the string
		for (int i = 0; i < catalog.size(); i++) {
			Game game = new Game (catalog.get(i));
			if (game.getName().equals(string) || game.getISBN().equals(string)) {
				// tells the user the game has been removed and
				// removes the game if theres a match
				System.out.println(game.getName() + " has been removed.");
				catalog.remove(i);
			// if theres no match print out "No matches found."
			} else System.out.println("No matches found.");
		}
	}
	
	// replacing default toString method
	public String toString() {
		// create a string variable to store all of catalog's games' toStrings
		String string = "\n";
		// adding each game's toString to the string
		for (Game game : catalog)
			string += game.toString() + "\n";
		return string;
	}
}

// Victor P 2020
package gamer;
// import scanner
import java.util.Scanner;
public class CatalogDemo {
	public static void main(String [] args) {
		// create a scanner
		Scanner sc = new Scanner(System.in);
		// creating a catalog
		VideoGameCatalog catalog = new VideoGameCatalog();
		// call the userPrompt method to begin the demo
		userPrompt(sc, catalog);
	}

	public static void userPrompt(Scanner sc, VideoGameCatalog catalog) {
		// prompt the user for what they want to do
		// 1 adds a game to the catalog
		// 2 displays every game in the catalog
		// 3 searches for a specific game using isbn or name + platform
		// 4 searches for a game using isbn or name + platform and deletes it from the catalog
		// 5 exits the method
		System.out.print("Enter 1 to add a game, 2 to display all games,"
		+ " 3 to search for a specific game, 4 to delete a game, and 5 to quit. ");
		int menu = Integer.parseInt(sc.nextLine());
		
		// 1 calls the user game addition method
		if (menu == 1) {
			userAddGame(sc, catalog);
			// call the continue method so the user can continue if they want to
			userContinue(sc, catalog);
		// 2 calls the prints out the catalog
		// if there are no games in the catalog, print out "no games in the catalog."
		} else if (menu == 2) {
			if (catalog.toString().isEmpty()) {
				System.out.println("There are currently no games in the catalog.");
			} else {
				System.out.println(catalog.toString());
			}
			// call the continue method so the user can continue if they want to
			userContinue(sc, catalog);
		// 3 calls the user search method
		} else if (menu == 3) {
			userSearch(sc, catalog);
			// call the continue method so the user can continue if they want to
			userContinue(sc, catalog);
			// call the continue method so the user can continue if they want to
			userContinue(sc, catalog);
		// 4 calls the user remove game method
		} else if (menu == 4) {
			userRemoveGame(sc, catalog);
			// call the continue method so the user can continue if they want to
			userContinue(sc, catalog);
		// 5 informs the user the program is closing and doesn't perform any operations
		} else if (menu == 5)
			System.out.println("Exiting program...");
		// if the user does not enter a valid number, inform them the number is invalid and
		// call the continue method to prompt them if they want to use the program
		else if (menu != 1 || menu != 2 || menu != 3 || menu != 4 || menu != 5) {
			System.out.println("Invalid Input.");
			// call the continue method so the user can continue if they want to
			userContinue(sc, catalog);
		}
	}
	
	public static void userAddGame(Scanner sc, VideoGameCatalog catalog) {
		// creating vars to store the game info
		String name = "";
		String platform = "";
		String publisher = "";
		double price = 0;
		String isbn = "";
		// prompting the user for all the necessary game info
		System.out.print("\nGame: ");
		name = sc.nextLine();
		System.out.print("Platform: ");
		platform = sc.nextLine();
		System.out.print("Publisher: ");
		publisher = sc.nextLine();
		System.out.print("Price: $");
		price = Double.parseDouble(sc.nextLine());
		System.out.print("ISBN: ");
		isbn = sc.nextLine();
		// creating a game based off the user's values
		Game game = new Game(name, platform, publisher, price, isbn);
		// adding the created game to the catalog
		catalog.addGame(game);
	}
	
	public static void userSearch(Scanner sc, VideoGameCatalog catalog) {
		// creating var to store game name / isbn
		// prompting the user for the game / isbn
		System.out.print("Enter game + platform (Game (Platform)) or ISBN: ");
		String search = sc.nextLine();
		// calling search function with user input and printing out result
		System.out.println(catalog.findGame(search));
	}
	
	public static void userRemoveGame(Scanner sc, VideoGameCatalog catalog) {
		// creating var to store game name / isbn
		// prompting the user for the game / isbn
		System.out.print("Enter game + platform (Game (Platform)) or ISBN: ");
		String search = sc.nextLine();
		// calling remove game function with user input
		catalog.removeGame(search);
	}
	
	public static void userContinue(Scanner sc, VideoGameCatalog catalog) {
		// create a var to store user input
		String response = "";
		// prompt user on whether they would like to run another command
		System.out.print("Would you like to run another command? (y/n)");
		response = sc.nextLine();
		// if they say yes, run the prompt again
		if (response.equals("y"))
			userPrompt(sc, catalog);
		// if they say no, no method is called and the user is informed the program is closing
		else if (response.equals("n"))
			System.out.println("Exiting program...");
		//else if (response)
	}
}

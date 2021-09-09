// Victor P. 2020
package gamer;

// class for a game object
public class Game {
	// fields
	private String name;
	private String platform;
	private String publisher;
	private double price;
	private String isbn;
	
	// constructor method
	// reads in info
	public Game(String name, String platform, String publisher, double price, String isbn) {
		this.name = name;
		this.platform = platform;
		this.publisher = publisher;
		this.price = price;
		this.isbn = isbn;
	}
	
	// reads in another game and copies it
	public Game(Game game) {
		name = game.name;
		platform = game.platform;
		publisher = game.publisher;
		price = game.price;
		isbn = game.isbn;
	}
	
	// accessor method that returns the name of the game with the platform
	public String getName() {
		return name + " (" + platform + ")";
	}
	
	public String getISBN() {
		return isbn;
	}
	
	// replacing default toString method
	public String toString() {
		return getName() + "\n" + publisher + "\n$" + price + "\nISBN: " + isbn;
	}
}
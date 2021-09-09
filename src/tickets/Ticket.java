package tickets;

// ticket superclass
public class Ticket {
	// fields
	private int number;
	private double price;
	
	// constructor method
	public Ticket(int num) {
		number = num;
	}
	
	// accessor method returns price
	public double getPrice() {
		return price;
	}
	
	// mutator method sets price
	public void setPrice(double dec) {
		price = dec;
	}
	
	// to string method prints out number + price
	public String toString() {
		return "Number: " + number + " Price: $" + price;
	}
	
}

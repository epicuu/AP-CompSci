// Victor P 2020
package grocery;
public class Item {
	// fields
	private String name;
	private int quantity;
	private double price;
	
	// constructor method
	public Item(String name, int quan, double price) {
		this.name = name;
		quantity = quan;
		this.price = price;
	}
	
	// accessor method for price (returns price)
	public double getPrice() {
		return price * quantity;
	}
	
	// mutator method for quantity (changes quantity)
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// to string method
	public String toString() {
		return name + "\t" +  quantity + "\t" + price;
	}
}

// Victor P 2020
package grocery;
public class GroceryList {
	// fields
	private Item [] items;
	
	// constructor method
	public GroceryList() {
		items = new Item[10];
	}
	
	// adds an item to the grocery list
	public void add(Item item) {
		int i = 0;
		while (i < items.length) {
			if (items[i] == null) {
				items[i] = item;
				break;
			}
		i++;
		}
	}
	
	// returns the total cost of all grocery items that have been added to the grocery list
	public double getTotalCost() {
		int i = 0;
		double total = 0;
		while(i < items.length) {
			if(items[i] != null)
				total += items[i].getPrice();
			i++;
		}
		return total;
	}
	
	// to string method
	public String toString() {
		int i = 0;
		String list = "";
		while (i < items.length) {
			if (items[i] != null) {
				list += items[i] + "\n";
			}
			i++;
		}
		return list;
	}
	
}

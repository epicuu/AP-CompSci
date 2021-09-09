// Victor P 2020
package grocery;
public class GroceryDriver {
	public static void main (String [] args) {
		GroceryList list = new GroceryList();
		Item item;
		item = new Item("Cheerios", 1, 3.99);
		list.add(item);
		item = new Item("Gatorade", 2, 1.50);
		list.add(item);
		System.out.println(list);
	}
}

package test;

public class TicketsDriver {
	public static void main (String [] args) {
		// instantiating a group of tickets
		// each a different kind
		Ticket t1 = new Ticket(1);
		Ticket t2 = new WalkupTicket(2);
		Ticket t3 = new AdvanceTicket(3, 10);
		Ticket t4 = new AdvanceTicket(4, 5);
		Ticket t5 = new StudentAdvanceTicket(5, 10);
		Ticket t6 = new StudentAdvanceTicket(6, 5);
		
		// set price of ticket 1 to $35
		t1.setPrice(35);
		
		// print out all tickets
		System.out.print(t1 + "\n" + t2 + "\n" +
		t3 + "\n" + t4 + "\n" + t5 + "\n" + t6);
	}
}

// ticket superclass
class Ticket {
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

class WalkupTicket extends Ticket{
	// superclass fields
	// constructor method
	public WalkupTicket(int num) {
		// calls Ticket constructor
		super(num);
		// walkup tickets always priced at 50
		super.setPrice(50);
	}
}

// ticket paid in advance
class AdvanceTicket extends Ticket{
	// superclass fields
	// constructor method
	public AdvanceTicket(int num, int days) {
		// calls Ticket constructor
		super(num);
		if (days < 10)
			// tickets purchased less than ten days
			// in advance are always 40
			super.setPrice(40);
		else
			// tickets purchased prior
			// are always 30
			super.setPrice(30);
	}
}

// ticket paid in advance by a student
class StudentAdvanceTicket extends AdvanceTicket{
	// superclass fields
	// constructor method
	public StudentAdvanceTicket(int num, int days) {
		// calls AdvanceTicket constructor
		super(num, days);
		if (days < 10)
			// students pay 20 if purchasing a ticket
			// less than 10 days in advance
			super.setPrice(20);
		else
			// students pay 15 otherwise
			super.setPrice(15);
	}
	
	// to string method prints out number, price
	// and requests student ID number
	public String toString() {
		// this method only adds upon superclass' tostring
		return super.toString() + " (ID REQUIRED)";
	}
}

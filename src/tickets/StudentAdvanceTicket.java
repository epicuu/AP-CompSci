package tickets;

// ticket paid in advance by a student
public class StudentAdvanceTicket extends AdvanceTicket{
	// inherited fields
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

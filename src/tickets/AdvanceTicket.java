package tickets;

// ticket paid in advance
public class AdvanceTicket extends Ticket{
	// inherited fields
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

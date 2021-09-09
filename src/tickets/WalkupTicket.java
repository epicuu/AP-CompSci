package tickets;

public class WalkupTicket extends Ticket{
	// inherited fields
	// constructor method
	public WalkupTicket(int num) {
		// calls Ticket constructor
		super(num);
		// walkup tickets always priced at 50
		super.setPrice(50);
	}
}

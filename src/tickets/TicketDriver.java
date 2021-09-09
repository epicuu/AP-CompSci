package tickets;

public class TicketDriver {
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

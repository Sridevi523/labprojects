package Protected;

public class Bus {
	public static void main(String[] args) {
        Passenger passenger = new Passenger("Bob", 30);
        Ticket ticket = new Ticket(12345);

        TicketBooking.bookTicket(passenger, ticket);
    }

}

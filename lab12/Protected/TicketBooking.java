package Protected;

public class TicketBooking {
    public static void bookTicket(Passenger passenger, Ticket ticket) {
        System.out.print("Booking details: ");
        passenger.displayDetails();
        ticket.displayTicketInfo();
    }
}

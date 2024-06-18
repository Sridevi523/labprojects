package Protected;

public class Ticket {
    protected int ticketNumber;

    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    protected void displayTicketInfo() {
        System.out.println("Ticket Number: " + ticketNumber);
    }
}
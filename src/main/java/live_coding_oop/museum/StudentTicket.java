package live_coding_oop.museum;

public class StudentTicket extends Ticket {
    public StudentTicket(double price) {
        super(price / 2);
    }
}
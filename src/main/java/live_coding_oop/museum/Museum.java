package live_coding_oop.museum;

import java.util.ArrayList;
import java.util.List;

public class Museum {
    private List<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public double calculateTotalPrice() {
        double totalSum = 0;
        for (Ticket ticket : tickets) {
            totalSum += ticket.getPrice();
        }

        return totalSum;
    }
}
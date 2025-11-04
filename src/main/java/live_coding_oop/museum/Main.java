package live_coding_oop.museum;

public class Main {
    /*
    Ticket
    fixed price ticket
    student ticket

    museum (store tickets, calculate total price)

    USE CASE
    ticket - price 1000
    student ticket 500
    TOTAL price = 1500
     */

    public static void main(String[] args) {
        Museum museum = new Museum();
        museum.addTicket(new RegularTicket(1000));
        museum.addTicket(new StudentTicket(1000));
        System.out.println(museum.calculateTotalPrice());
    }
}
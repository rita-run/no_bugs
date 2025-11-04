package clean_code.practice.task_2;

public class SimplePaymentService implements PaymentService {
    @Override
    public void processPament(Order order) {
        if (!order.isPaid()) {
            System.out.println("Processing order: " + order);
            order.makePayment();
        } else {
            System.out.println("Order was paid before: " + order);
        }
    }
}
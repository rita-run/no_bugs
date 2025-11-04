package clean_code.homework.programming_principles.task5;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentType card = new CreditCard();
        PaymentType payPal = new PayPal();
        PaymentType bitcoin = new Bitcoin();

        paymentProcessor.processPayment(card, 1000.00);
        paymentProcessor.processPayment(payPal, 1000.00);
        paymentProcessor.processPayment(bitcoin, 1000.00);
    }
}
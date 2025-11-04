package clean_code.homework.programming_principles.task5;

public class PaymentProcessor {
    /*
    Задача: Избавьтесь от if-else, применив полиморфизм (наследование или интерфейсы).
     */
    public void processPayment(PaymentType paymentType, double amount) {
        System.out.println(paymentType.pay() + amount);
    }
}
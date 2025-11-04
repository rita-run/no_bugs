package clean_code.homework.programming_principles.task5;

public class PayPal implements PaymentType {
    @Override
    public String pay() {
        return "Оплата через PayPal на сумму ";
    }
}
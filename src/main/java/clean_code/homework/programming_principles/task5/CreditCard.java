package clean_code.homework.programming_principles.task5;

public class CreditCard implements PaymentType {
    @Override
    public String pay() {
        return "Оплата кредитной картой на сумму ";
    }
}
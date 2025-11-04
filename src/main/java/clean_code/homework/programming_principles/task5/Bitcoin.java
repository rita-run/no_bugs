package clean_code.homework.programming_principles.task5;

public class Bitcoin implements PaymentType {
    @Override
    public String pay() {
        return "Оплата Bitcoin на сумму ";
    }
}
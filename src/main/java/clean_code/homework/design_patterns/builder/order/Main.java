package clean_code.homework.design_patterns.builder.order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Dress", 10, "credit card");

        Order flexibleOrder = new Order.Builder()
                .setProduct("Skort")
                .setDiscount(5)
                .setPaymentMethod("Cash")
                .build();

        System.out.println(order);
        System.out.println(flexibleOrder);
    }
}
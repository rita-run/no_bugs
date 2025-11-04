package clean_code.practice.task_2;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    private List<Order> orders = new ArrayList<>();
    private PaymentService paymentService;
    private DiscountStrategy discountStrategy;
    private BulkOrderStrategy bulkOrderStrategy;
    private double totalPrice;

    public OnlineStore(PaymentService paymentService, DiscountStrategy discountStrategy, BulkOrderStrategy bulkOrderStrategy) {
        this.paymentService = paymentService;
        this.discountStrategy = discountStrategy;
        this.bulkOrderStrategy = bulkOrderStrategy;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    private List<Product> getActualProducList(List<Product> productList) {
        List<Product> actualProducList = new ArrayList<>();
        for (Product product : productList) {
            if (product.isInStock()) {
                actualProducList.add(product);
            }
        }
        return actualProducList;
    }

    public void processOrder() {
        for (Order order : orders) {
            System.out.println("### Start processing Order: " + order.getNumber() + " ###");

            //Step 1: create list of available products
            System.out.println("Start preparing actual product list for Order: " + order.getNumber());

            //Step 2: update order with actual list of available products
            List<Product> actualProductList = getActualProducList(order.getProductList());
            order.setProductList(actualProductList);
            System.out.println("Actual list for Order: " + order.getNumber());
            order.printProductList();

            if (actualProductList.isEmpty()) {
                System.out.println("Order does not have actual products");
            } else {

                //Step 3: calculate discount based on the total price
                System.out.println("Start calculating discount for Order: " + order.getNumber());
                double finalPrice = discountStrategy.applyDiscount(order.calculateTotalPrice());
                order.setTotalPrice(finalPrice);

                //Step 4: sending the call for a bulk purchase
                System.out.println("Final price for Order " + order.getNumber() + " is " + finalPrice);
                bulkOrderStrategy.createBulkOrder(order);
                System.out.println("Bulk order checked for Order: " + order.getNumber());
            }

            System.out.println("### Stop processing Order: " + order.getNumber() + " ###");
            System.out.println();
        }
    }
}
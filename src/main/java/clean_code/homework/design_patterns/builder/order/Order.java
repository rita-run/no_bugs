package clean_code.homework.design_patterns.builder.order;

public class Order {
    private String product;
    private int discount;
    private String paymentMethod;

    public Order(String product, int discount, String paymentMethod) {
        this.product = product;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public Order(Builder builder) {
        this.product = builder.product;
        this.discount = builder.discount;
        this.paymentMethod = builder.paymentMethod;
    }


    @Override
    public String toString() {
        return "Product: " + product + ", discount: " + discount +  ", paymentMethod: " + paymentMethod;
    }

    static class Builder {
        private String product;
        private int discount;
        private String paymentMethod;

        public Builder setProduct(String product) {
            this.product = product;
            return this;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
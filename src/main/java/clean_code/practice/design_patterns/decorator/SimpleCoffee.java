package clean_code.practice.design_patterns.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 1.0;
    }
}

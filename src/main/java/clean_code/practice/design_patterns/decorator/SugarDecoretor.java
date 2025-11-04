package clean_code.practice.design_patterns.decorator;

public class SugarDecoretor extends CoffeeDecorator {
    public SugarDecoretor(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }
}
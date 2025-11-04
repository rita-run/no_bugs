package clean_code.practice.design_patterns.fabricmethod;

public class Truck extends Transport {
    @Override
    void deliver() {
        System.out.println("Deliver by land in a box.");
    }
}
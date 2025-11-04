package clean_code.practice.design_patterns.fabricmethod;

public class Plane extends Transport{
    @Override
    void deliver() {
        System.out.println("Deliver by sky in a baggage.");
    }
}

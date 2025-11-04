package clean_code.practice.design_patterns.fabricmethod;

public class Ship extends Transport {
    @Override
    void deliver() {
        System.out.println("Deliver by sea in a container.");
    }
}

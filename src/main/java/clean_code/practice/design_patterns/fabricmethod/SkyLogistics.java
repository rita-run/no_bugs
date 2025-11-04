package clean_code.practice.design_patterns.fabricmethod;

public class SkyLogistics extends Logicstics {
    @Override
    Transport createTransport() {
        return new Plane();
    }
}

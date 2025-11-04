package clean_code.practice.design_patterns.fabricmethod;

public class LandLogictics extends Logicstics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
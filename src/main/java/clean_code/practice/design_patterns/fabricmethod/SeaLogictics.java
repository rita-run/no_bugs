package clean_code.practice.design_patterns.fabricmethod;

public class SeaLogictics extends Logicstics {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}

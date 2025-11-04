package clean_code.homework.design_patterns.fabric.transport;

public class WeekendRide extends RideSelection {
    @Override
    Transport createTransport() {
        return new Bicycle();
    }
}

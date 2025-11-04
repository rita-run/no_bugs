package clean_code.homework.design_patterns.fabric.transport;

public class WeekdayRide extends RideSelection {
    @Override
    Transport createTransport() {
        return new Auto();
    }
}
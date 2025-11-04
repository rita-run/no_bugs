package clean_code.homework.design_patterns.fabric.transport;

public class Main {
    public static void main(String[] args) {
        RideSelection rideSelection;

        String transportType = "auto";

        if("auto".equals(transportType)) {
            rideSelection = new WeekdayRide();
        } else {
            rideSelection = new WeekendRide();
        }

        rideSelection.selectRide();
    }
}
package clean_code.homework.design_patterns.fabric.transport;

public abstract class RideSelection {
    abstract Transport createTransport();

    public void selectRide() {
        Transport transport = createTransport();
        transport.ride();
    }
}
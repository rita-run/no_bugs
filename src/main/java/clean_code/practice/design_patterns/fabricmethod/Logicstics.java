package clean_code.practice.design_patterns.fabricmethod;

public abstract class Logicstics {
    //fabric method
    //implements a way to create a transport
    abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();

        transport.deliver();
    }
}
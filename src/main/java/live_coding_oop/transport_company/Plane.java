package live_coding_oop.transport_company;

public class Plane extends Transport {
    public Plane(int ID, int capacity) {
        super(ID, capacity);
    }

    @Override
    public void startTransportation() {
        System.out.println("Plane of ID: " + getID() + "  started transportation of " + getCapacity() + " luggage");
    }
}
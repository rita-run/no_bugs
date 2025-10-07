package live_coding_oop.transport_company;

public class Truck extends Transport {
    public Truck(int ID, int capacity) {
        super(ID, capacity);
    }

    @Override
    public void startTransportation() {
        System.out.println("Truck of ID: " + getID() + "  started transportation of " + getCapacity() + " boxes");
    }
}
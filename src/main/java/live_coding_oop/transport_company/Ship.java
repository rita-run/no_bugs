package live_coding_oop.transport_company;

public class Ship extends Transport {
    public Ship(int ID, int capacity) {
        super(ID, capacity);
    }

    @Override
    public void startTransportation() {
        System.out.println("Ship of ID: " + getID() + " started transportation of " + getCapacity() + " containers");
    }
}
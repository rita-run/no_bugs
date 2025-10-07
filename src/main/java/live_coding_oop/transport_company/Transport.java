package live_coding_oop.transport_company;

public class Transport {
    private int ID;
    private int capacity;

    public Transport(int ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getID() {
        return ID;
    }

    public void startTransportation() {
        System.out.println("Transportation started!");
    }
}
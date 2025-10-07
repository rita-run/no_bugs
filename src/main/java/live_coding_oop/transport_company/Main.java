package live_coding_oop.transport_company;

public class Main {
    public static void main(String[] args) {
        /* entities:
        transport (capacity)
        ship (number of containers)
        track (number of boxes)
        plane (number of luggage)

        actions:
        start transportation (ship started transportation of 5 containers)
         */
        Ship ship = new Ship(1,5);
        Truck truck = new Truck(2, 10);
        Plane plane = new Plane(3,20);

        ship.startTransportation();
        truck.startTransportation();
        plane.startTransportation();
    }
}
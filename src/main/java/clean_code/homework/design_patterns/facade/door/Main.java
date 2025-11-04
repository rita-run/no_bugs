package clean_code.homework.design_patterns.facade.door;

public class Main {
    public static void main(String[] args) {
        DoorOpener doorOpener = new DoorOpener();
        DoorCloser doorCloser = new DoorCloser();
        DoorBlocker doorBlocker = new DoorBlocker();

        DoorFacade doorFacade = new DoorFacade(doorOpener, doorCloser, doorBlocker);
        doorFacade.openDoor();
        doorFacade.closeAndBlock();
    }
}
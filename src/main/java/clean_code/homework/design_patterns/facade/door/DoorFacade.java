package clean_code.homework.design_patterns.facade.door;

public class DoorFacade {
    private DoorOpener doorOpener;
    private DoorCloser doorCloser;
    private DoorBlocker doorBlocker;

    public DoorFacade(DoorOpener doorOpener, DoorCloser doorCloser, DoorBlocker doorBlocker) {
        this.doorOpener = doorOpener;
        this.doorCloser = doorCloser;
        this.doorBlocker = doorBlocker;
    }

    public void openDoor() {
        doorOpener.openDoor();
    }

    public void closeAndBlock() {
        doorCloser.closeDoor();
        doorBlocker.blockDoor();
    }
}
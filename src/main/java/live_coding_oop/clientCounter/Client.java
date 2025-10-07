package live_coding_oop.clientCounter;

public class Client {
    private String name;
    private int age;
    private boolean isActive;
    private static int clientCounter;

    public Client(String name, int age, boolean actuality) {
        this.name = name;
        this.age = age;
        this.isActive = actuality;
        clientCounter++;
    }

    public static int getClientCounter() {
        return clientCounter;
    }
}
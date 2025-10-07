package live_coding_oop.clientCounter;

public class Main {
    public static void main(String[] args) {
        //clients
        //name, age, actuality
        //client counter
        Client client = new Client("Name", 20, false);
        Client client2 = new Client("Name", 20, false);
        System.out.println(Client.getClientCounter());
    }
}

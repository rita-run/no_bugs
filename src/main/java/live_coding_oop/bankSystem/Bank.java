package live_coding_oop.bankSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addClients(List<Client> clients) {
        this.clients.addAll(clients);
    }

    public List<Client> getListOfClients() {
        return List.copyOf(clients);
    }
}
package lesson3.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClientRepository implements Repository<Client, UUID> {
    List<Client> clients = new ArrayList<>();

    @Override
    public void create(Client item) {
        clients.add(item);
        System.out.println("Create");
    }


    @Override
    public void delete(Client item) {
        clients.remove(item);
        System.out.println("Delete");
    }

    @Override
    public Client getById(UUID id) {
        for (Client client : clients) {
            if (id == client.getId()) {
                return client;
            }
        }
        return null;
    }


    public void printAll() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }
}

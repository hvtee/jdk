package lesson3.hw;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("name1", 14);
        Client client2 = new Client("name2", 32);
        ClientRepository clientRepository = new ClientRepository();
        clientRepository.create(client1);
        clientRepository.create(client2);
        clientRepository.printAll();

        clientRepository.delete(client1);
        clientRepository.printAll();
    }
}


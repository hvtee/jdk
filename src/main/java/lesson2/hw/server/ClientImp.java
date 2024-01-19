package lesson2.hw.server;

public class ClientImp implements SocketThreadListener{
    @Override
    public void pressStart() {
        System.out.println("Client: pressStart");
    }

    @Override
    public void pressStop() {
        System.out.println("Client: pressStop");
    }
}

package lesson2.hw.server;

public class ServerSocketImp implements ServerSocketThreadListener,SocketThreadListener{
    @Override
    public void onStart() {
        System.out.println("Server message: start");
    }

    @Override
    public void onStop() {
        System.out.println("Server message: stop");
    }

    @Override
    public void pressStart() {
        System.out.println("Server message: pressStart");
    }

    @Override
    public void pressStop() {
        System.out.println("Server message: pressStop");
    }
}

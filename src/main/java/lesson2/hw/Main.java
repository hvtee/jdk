package lesson2.hw;

import lesson2.hw.server.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        ChatServer chatServer = new ChatServer(new SereverListenerImplementation(), new ServerSocketImp());
        new serverWindow(chatServer, new ClientImp());
    }
}
    //Создать интерфейсы ServerSocketThreadListener и SocketThreadListener, содержащие методы,
// соответствующие событиям сервера и клиента чата. Реализовать созданные интерфейсы простым логированием.
// Со стороны клиента – только SocketThreadListener,
     //   со стороны сервера – оба интерфейса.

/*Developer dev = new FrontendDeveloper();
 if (dev instanceof Frontender) {
         ((Frontender) dev).developGUI();*/
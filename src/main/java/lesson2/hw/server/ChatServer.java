package lesson2.hw.server;

public class ChatServer {
    private boolean serverStatus = false;
    private ServerListener serverListener;
    private ServerSocketImp serverSocketImp;

    public ChatServer(ServerListener serverListener, ServerSocketImp serverSocketImp) {
        this.serverSocketImp = serverSocketImp;
        this.serverListener = serverListener;
    }

    public boolean isServerStatus() {
        return serverStatus;
    }

    public void setFlag(boolean serverStatus) {
        this.serverStatus = serverStatus;
    }

    public void startServer(){
        if (!serverStatus){
            serverListener.onMessageRecived("Server started");
            serverStatus = true;
            serverSocketImp.onStart();
            serverSocketImp.pressStart();
        }else {
            serverListener.onMessageRecived("Server already started");
        }
    }

    public void stopServer(){
        if (serverStatus){
            serverListener.onMessageRecived("Server stop");
            serverStatus = false;
            serverSocketImp.onStop();
            serverSocketImp.pressStop();
        }else {
            serverListener.onMessageRecived("Server already stop");
        }
    }

}
interface ServerListener{
    void onMessageRecived(String str);

}

interface ServerSocketThreadListener{
    void onStart();
    void onStop();
}

interface SocketThreadListener{
    void pressStart();
    void pressStop();
}

package lesson2.hw.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class  serverWindow extends JFrame{
        private final ChatServer chatServer;
        private final ClientImp clientImp;
        private static final int WINDOW_HEIGHT = 600;
        private static final int WINDOW_WIDTH = 600;
        private static final int WINDOW_POSX = 800;
        private static final int WINDOW_POSY = 300;



        public serverWindow(ChatServer chatServer, ClientImp clientImp) throws IOException {
            this.chatServer = chatServer;
            this.clientImp = clientImp;
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocation(WINDOW_POSX, WINDOW_POSY);
            setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
            setTitle("Server");
            setResizable(false);


            JButton btnStart = new JButton("Start");
            JButton btnStop = new JButton("Stop");
            JTextArea field = new JTextArea();

            JPanel panBotton = new JPanel(new GridLayout(1, 1));
            panBotton.add(btnStart);
            panBotton.add(btnStop);
            add(panBotton, BorderLayout.CENTER);
            setVisible(true);

            btnStart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    chatServer.startServer();
                    clientImp.pressStart();
                }
            });
            btnStop.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    chatServer.stopServer();
                    clientImp.pressStop();
                }
            });
        }

}

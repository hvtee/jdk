package lesson1.hw.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainServerWindow extends JFrame {
    int WINDOW_WIDTH = 640;
    int WINDOW_HEIGHT = 480;
    int WINDOW_POS_X = 300;
    int WINDOW_POS_Y = 300;

    JButton btnStartServer = new JButton("Start server");
    JButton btnShutServer = new JButton("Shut Server");
    JTextArea txtCenterLog = new JTextArea("Server is shut\n");

    boolean isServerWorking = false;

    MainServerWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Server");

        setResizable(false);
        setVisible(true);

        JPanel panCenter = new JPanel(new GridLayout(1, 1));
        panCenter.add(txtCenterLog);


        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStartServer);
        panBottom.add(btnShutServer);

        btnStartServer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking) {
                    txtCenterLog.append("Server is already working\n");
                    System.out.println("Server is already working");
                    return;
                }
                txtCenterLog.append("Server started\n");
                System.out.println("Server started");
                isServerWorking = true;
            }
        });

        btnShutServer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isServerWorking) {
                    txtCenterLog.append("Server is already shut\n");
                    System.out.println("Server is already shut");
                    return;
                }
                txtCenterLog.append("Server shut\n");
                System.out.println("Server shut");
                isServerWorking = false;
            }
        });

        add(panBottom, BorderLayout.SOUTH);
        add(panCenter, BorderLayout.CENTER);
    }
}

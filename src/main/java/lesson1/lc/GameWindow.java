package lesson1.lc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    int WINDOW_WIDTH = 640;
    int WINDOW_HEIGHT = 480;
    int WINDOW_POS_X = 300;
    int WINDOW_POS_Y = 300;


    JButton btnStart = new JButton("New Game");
    JButton btnExit = new JButton("Exit");

    Map map;
    SettingsWindow settingsWindow;

    GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TicTacToe");

        map = new Map();
        settingsWindow = new SettingsWindow(this);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(new Map());

        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStart);
        panBottom.add(btnExit);
        add(panBottom, BorderLayout.SOUTH);

        setResizable(false);
        setVisible(true);

    }

//    void startNewGame(int mode, int fSzX, int fSzY, int wLen) {
//        System.out.printf("Mode: %d;\n Size: x: %d, y: %d;\n Win length: %d;", mode, fSzX, fSzY, wLen);
//        repaint();
//    }
}

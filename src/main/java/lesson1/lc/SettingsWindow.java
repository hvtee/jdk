package lesson1.lc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    int WINDOW_WIDTH = 320;
    int WINDOW_HEIGHT = 240;
    JButton btnStart = new JButton("Start new game");
    Map map;

    SettingsWindow(GameWindow gameWindow) {
        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        add(btnStart);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.startNewGame(0, 3, 3, 3);
                setVisible(false);
            }
        });
    }

}


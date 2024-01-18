package lesson1.hw.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Objects;

public class MainServerWindow extends JFrame {
    int WINDOW_WIDTH = 640;
    int WINDOW_HEIGHT = 480;
    int WINDOW_POS_X = 300;
    int WINDOW_POS_Y = 300;

    JButton btnLogIn = new JButton("Log in");
    JButton btnLogOUT = new JButton("Log out");
    JButton btnSendMessage = new JButton("Send");
    JTextField fieldAdress = new JTextField("127.0.0.1:8443");
    JTextField fieldLogin = new JTextField("arteml");
    JTextField fieldPassword = new JTextField("1234");
    JTextField fieldMessage = new JTextField("message");
    JTextArea areaCenterLog = new JTextArea("Server started\n");


    boolean isLogged = false;

    MainServerWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Server");

        setResizable(false);
        setVisible(true);

        JPanel panGroupNorth = new JPanel(new GridLayout(2, 1));
        JPanel panGroupNorthFields = new JPanel(new GridLayout(1, 3));
        JPanel panGroupNorthButtons = new JPanel(new GridLayout(1, 2));

        panGroupNorth.add(panGroupNorthFields);
        panGroupNorth.add(panGroupNorthButtons);

        panGroupNorthFields.add(fieldAdress);
        panGroupNorthFields.add(fieldLogin);
        panGroupNorthFields.add(fieldPassword);

        panGroupNorthButtons.add(btnLogIn);
        panGroupNorthButtons.add(btnLogOUT);

        JPanel panCenter = new JPanel(new GridLayout(1, 1));
        panCenter.add(areaCenterLog);


        JPanel panGroupSouth = new JPanel(new GridLayout(1, 2));
        panGroupSouth.add(fieldMessage);
        panGroupSouth.add(btnSendMessage);

        add(panGroupNorth, BorderLayout.NORTH);
        add(panCenter, BorderLayout.CENTER);
        add(panGroupSouth, BorderLayout.SOUTH);

        fieldAdress.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                fieldAdress.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        fieldLogin.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                fieldLogin.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        fieldPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                fieldPassword.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        fieldMessage.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                fieldMessage.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        btnLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLogged) {
                    areaCenterLog.append("You are already logged in!\n");
                    return;
                }
                if (Objects.equals(fieldAdress.getText(), "127.0.0.1:8443")
                        && Objects.equals(fieldLogin.getText(), "arteml")
                        && Objects.equals(fieldPassword.getText(), "1234")) {
                    areaCenterLog.append("Logged successful!\nWelcome arteml!\n");
                    isLogged = true;
                } else areaCenterLog.append("Wrong adress or login or password!\n");
            }
        });
        btnLogOUT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isLogged) {
                    areaCenterLog.append("You are already logged off!\n");
                    return;
                }
                isLogged = false;
                areaCenterLog.append("Now you are logged off!\n");
            }
        });

        btnSendMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isLogged) {
                    areaCenterLog.append("You cant send messages while you are logged off!");
                    return;
                }
                areaCenterLog.append("arteml: " + fieldMessage.getText() + "\n");
            }
        });
    }
}

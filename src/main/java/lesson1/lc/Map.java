package lesson1.lc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Map extends JPanel {
    int panelWidth;
    int panelHeight;
    int cellWidth;
    int cellHeight;

    Map() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g) {
        panelWidth = getWidth();
        panelHeight = getHeight();
        cellWidth = panelWidth / 3;
        cellHeight = panelHeight / 3;

        g.setColor(Color.BLACK);
        for (int h = 0; h < 3; h++) {
            int y = h * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }
        for (int w = 0; w < 3; w++) {
            int x = w * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }
    }

    void startNewGame(int mode, int fSzX, int fSzY, int wLen) {
        System.out.printf("Mode: %d;\n Size: x: %d, y: %d;\n Win length: %d;", mode, fSzX, fSzY, wLen);
        repaint();
    }

    private void update(MouseEvent e) {
        int cellX=e.getX()/cellWidth;
        int cellY=e.getY()/cellHeight;
        System.out.printf("x: %d, y: %d\n", cellX, cellY);
        repaint();
    }
}

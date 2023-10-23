package lab4_2;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class BouncingBall extends JPanel {
    int x, y;
    int xSpeed = 4;
    int ySpeed = 10;
    Color color = Color.BLUE;

    public BouncingBall() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(x, y, 50, 50);
    }
}
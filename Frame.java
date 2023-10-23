package lab4_2;

import java.awt.Color;
import javax.swing.JFrame;

public class Frame extends JFrame implements Runnable {
    private BouncingBall ball;

    public Frame(BouncingBall ball) {
        this.ball = ball;
        this.setTitle("Running ball");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(ball);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            ball.x += ball.xSpeed;
            ball.y += ball.ySpeed;
            // Setting the limits in X
            if (ball.x > 540 || ball.x < 0) {
            	// Reverse direction if the X edge is reach
                ball.xSpeed = -ball.xSpeed;
                // Changing color
                ball.color = Color.RED;
            }
            // Setting the limits in Y
            if (ball.y > 520 || ball.y < 0) {
            	// Reverse direction if the Y edge is reach
                ball.ySpeed = -ball.ySpeed;
                // Changing color
                ball.color = Color.GREEN;
            }
            ball.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

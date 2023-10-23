package lab4_2;

public class MyMain {
    public static void main(String[] args) {
        BouncingBall ball = new BouncingBall();
        Frame frame = new Frame(ball);
        Thread t = new Thread(frame);
        t.start();
    }
}  
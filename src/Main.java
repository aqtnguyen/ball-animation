import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main (String[] args) {
        BufferedImage ballAppearance = null;
        try {
            ballAppearance = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("football.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Ball ball = new Ball(ballAppearance, 0,0,40,50);
        Frame frame = new Frame(ball);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,540);
        frame.setVisible(true);
        frame.setResizable(false);

        long lastFrame = System.currentTimeMillis();
        while (true) {
            long currentFrame = System.currentTimeMillis();
            float timeBeforeLastFrame = (float)(currentFrame - lastFrame)/1000;
            lastFrame = currentFrame;
            ball.Update(timeBeforeLastFrame);
            frame.screen.repaint();
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

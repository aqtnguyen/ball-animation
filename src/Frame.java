import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Ball ball;
    public Screen screen;

    public Frame( Ball ball) {
        super("Bouncing");
        setLayout(null);
        screen = new Screen();
        screen.setBounds(0,0,500,500);
        add(screen);
        this.ball = ball;
    }

    public class Screen extends JLabel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.CYAN);
            g.fillRect(0,0,500,500);
            g.drawImage(ball.bimg_appearance, (int) ball.f_posX, (int) ball.f_posY, null);
        }
    }
}

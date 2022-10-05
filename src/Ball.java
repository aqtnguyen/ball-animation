import java.awt.image.BufferedImage;

public class Ball {
    BufferedImage bimg_appearance;
    float f_posX;
    float f_posY;
    float f_speedX;
    float f_speedY;

    public Ball(BufferedImage bimg_appearance, float f_posX, float f_posY, float f_speedX, float f_speedY) {
        this.bimg_appearance = bimg_appearance;
        this.f_posX = f_posX;
        this.f_posY = f_posY;
        this.f_speedX = f_speedX;
        this.f_speedY = f_speedY;
    }

    public void Update(float timeBeforeLastFrame) {
        f_posX += f_speedX * timeBeforeLastFrame;
        f_posY += f_speedY * timeBeforeLastFrame;

        if (f_posX < 0) {
            f_posX = 0;
            f_speedX *= -1;
        }
        if (f_posX + bimg_appearance.getWidth() > 500) {
            f_posX = 500 - bimg_appearance.getWidth();
            f_speedX *= -1;
        }
        if (f_posY < 0) {
            f_posY = 0;
            f_speedY *= -1;
        }
        if (f_posY + bimg_appearance.getHeight() > 500) {
            f_posY = 500 - bimg_appearance.getWidth();
            f_speedY *= -1;
        }
    }
}

import java.awt.*;

public class Bird {
    private int velocityY; // the bird only moves vertically
    private int x;
    private int y;
    private int UNIT = 25;
    private int GRAVITY = 2;
    private int JUMP = -3;

    public Bird(int x, int y) {
        this.x = x;
        this.y = y;
        velocityY = 0;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        graphics.fillOval(x, y, UNIT, UNIT);
    }

    public void jump() {
        velocityY += JUMP;
    }

    public void updatePosition() {
       velocityY += GRAVITY;
       y += velocityY;
    }

}

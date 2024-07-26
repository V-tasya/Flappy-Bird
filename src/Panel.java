import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {
    private int WIDTH;
    private int HIGHT;
    private int UNIT = 25;

    private Bird bird;


    public Panel(int WIDTH, int HIGHT) {
        this.WIDTH = WIDTH;
        this.HIGHT = HIGHT;
        setPreferredSize(new Dimension(this.WIDTH, this.HIGHT));
        setBackground(new Color(154, 255, 255));
        bird = new Bird(6 * UNIT, 10 * UNIT);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        draw(graphics);
        bird.draw(graphics);
    }

    public void draw(Graphics graphics) {
        for (int i = 0; i < WIDTH / UNIT; i++) {
            graphics.setColor(Color.WHITE);
            graphics.drawLine(i * UNIT, 0, i * UNIT, HIGHT); // |
            graphics.drawLine(0, i * UNIT, WIDTH, i * UNIT); // --
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        bird.updatePosition();
    }
}

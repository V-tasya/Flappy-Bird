import javax.swing.*;

public class Frame extends JFrame {
    private JFrame frame = new JFrame("Flappy Bird");

    public Frame() {
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null); // opening at the center
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Panel panel = new Panel(600, 600);
        frame.add(panel);
        frame.pack();
        panel.requestFocus();
    }


}

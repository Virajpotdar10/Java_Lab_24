import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BouncingBall {
    static int x = 100, y = 100, dx = 5, dy = 5, diameter = 30;
    static boolean running = false;

    public static void main(String[] args) {
        JFrame j = new JFrame("Bouncing Ball");
        j.setBounds(150, 120, 450, 320);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
                protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillOval(x, y, diameter, diameter);
            }
        };
         panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (!running) {
                    running = true;

                    Runnable r = () -> {
                        while (running) {
                            x += dx;
                            y += dy;

                            if (x <= 0 || x >= panel.getWidth() - diameter) dx = -dx;
                            if (y <= 0 || y >= panel.getHeight() - diameter) dy = -dy;
                            panel.repaint();
                            try { Thread.sleep(20); }
                            catch (InterruptedException ex) { ex.printStackTrace(); }
                        }
                    };
                    new Thread(r).start();
                }
            }
        });

        j.add(panel);

        j.setVisible(true);
    }
}

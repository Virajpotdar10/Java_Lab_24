import javax.swing.*;
import java.awt.event.*;

public class MouseCoordinates {
   public static void main(String[] args) {

        JFrame frame = new JFrame("Mouse Coordinates");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Move Mouse to See Coordinates");
        label.setBounds(100, 150, 300, 30);

        frame.add(label);

        frame.addMouseMotionListener(new MouseMotionListener() {

            public void mouseMoved(MouseEvent e) {
                label.setText("X = " + e.getX() + " , Y = " + e.getY());
            }

            public void mouseDragged(MouseEvent e) {
                label.setText("Dragging : X = " + e.getX() + " , Y = " + e.getY());
            }
        });

        frame.setVisible(true);
    }
}
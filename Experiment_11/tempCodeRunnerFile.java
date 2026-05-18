import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridSwap extends JFrame implements ActionListener {

    JButton[] buttons = new JButton[6];

    public GridSwap() {

        setTitle("Grid Swap Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // GridLayout - 2 rows, 3 columns
        setLayout(new GridLayout(2, 3, 10, 10));

        // Create 6 buttons with numbers 1 to 6
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // Find which button was clicked
        for (int i = 0; i < 6; i++) {
            if (e.getSource() == buttons[i]) {

                // Next button index (wraps around using %)
                int nextIndex = (i + 1) % 6;

                // Swap the text of clicked button and next button
                String temp          = buttons[i].getText();
                buttons[i].setText(buttons[nextIndex].getText());
                buttons[nextIndex].setText(temp);

                break;
            }
        }
    }

    public static void main(String[] args) {
        new GridSwap();
    }
}
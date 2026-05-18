import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridSwap {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Swap");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 3, 10, 10));

        JButton[] buttons = new JButton[6];

        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttons[i]);
        }

        for (int i = 0; i < 6; i++) {
            final int index = i;

            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    int next = (index + 1) % 6; 
                    String temp = buttons[index].getText();
                    buttons[index].setText(buttons[next].getText());
                    buttons[next].setText(temp);
                }
            });
        }

        frame.setVisible(true);
    }
}
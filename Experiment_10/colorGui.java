import javax.swing.*;

public class colorGui {

    public static void main(String[] args) {

        JFrame j = new JFrame("Color GUI");

        j.setSize(450, 210);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(new java.awt.FlowLayout());

        JButton red = new JButton("Red");
        JButton blue = new JButton("Blue");
        JButton yellow = new JButton("Yellow");

        red.addActionListener(e -> {
            j.getContentPane().setBackground(java.awt.Color.RED);
        });

        blue.addActionListener(e -> {
            j.getContentPane().setBackground(java.awt.Color.BLUE);
        });

        yellow.addActionListener(e -> {
            j.getContentPane().setBackground(java.awt.Color.YELLOW);
        });

        j.add(red);
        j.add(blue);
        j.add(yellow);

        j.setVisible(true);
    }
}
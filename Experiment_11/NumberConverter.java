import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberConverter {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Number Converter");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));

        JLabel inputLabel  = new JLabel("Enter Number:");
        JTextField inputField = new JTextField(10);

        JButton binaryBtn = new JButton("Binary");
        JButton octalBtn  = new JButton("Octal");
        JButton hexBtn    = new JButton("Hex");

        JLabel resultLabel    = new JLabel("Result:");
        JTextField resultField = new JTextField(15);
        resultField.setEditable(false);

        binaryBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(inputField.getText());
                    resultField.setText(Integer.toBinaryString(n));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input!");
                }
            }
        });

        octalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(inputField.getText());
                    resultField.setText(Integer.toOctalString(n));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input!");
                }
            }
        });

        hexBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(inputField.getText());
                    resultField.setText(Integer.toHexString(n));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input!");
                }
            }
        });

        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(binaryBtn);
        frame.add(octalBtn);
        frame.add(hexBtn);
        frame.add(resultLabel);
        frame.add(resultField);

        frame.setVisible(true);
    }
}
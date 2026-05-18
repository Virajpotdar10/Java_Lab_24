import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialApplet {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Factorial Calculator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));

        JLabel inputLabel = new JLabel("Enter a number:");
        JTextField inputField = new JTextField(10);

        JButton calculateBtn = new JButton("Calculate Factorial");

        JLabel resultLabel = new JLabel("Factorial Result:");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);

        calculateBtn.addActionListener(e->{
             int number = Integer.parseInt(inputField.getText());
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                resultField.setText(String.valueOf(factorial));
        });

        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(calculateBtn);
        frame.add(resultLabel);
        frame.add(resultField);

        frame.setVisible(true);
    }
}

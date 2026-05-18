import javax.swing.*;
import java.awt.*;

public class Calculator {

    static double num1 = 0;
    static String op = "";
    static JTextField display;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Display
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        // Button Panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] labels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String label : labels) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.BOLD, 20));

            btn.addActionListener(e -> {
                String txt = label;

                if (txt.matches("[0-9]")) {
                    if (display.getText().equals("0")) display.setText(txt);
                    else display.setText(display.getText() + txt);

                } else if (txt.equals("C")) {
                    display.setText("0");
                    num1 = 0;
                    op = "";

                } else if (txt.equals("=")) {
                    double num2 = Double.parseDouble(display.getText());
                    double result = 0;
                    if (op.equals("+")) result = num1 + num2;
                    if (op.equals("-")) result = num1 - num2;
                    if (op.equals("*")) result = num1 * num2;
                    if (op.equals("/")) result = num1 / num2;
                    display.setText(String.valueOf(result));

                } else {
                    num1 = Double.parseDouble(display.getText());
                    op = txt;
                    display.setText("0");
                }
            });

            panel.add(btn);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
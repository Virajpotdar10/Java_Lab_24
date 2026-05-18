import javax.swing.*;

public class ReverseNumber {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reverse Number");
        frame.setSize(420, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());

        JLabel inputLabel = new JLabel("Enter Number:");
        JTextField inputField = new JTextField(10);

        // Label and Output
        JLabel resultLabel = new JLabel("Reverse:");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);

        // Reverse Button
        JButton reverseBtn = new JButton("Reverse");
        reverseBtn.addActionListener(e -> {
            String input = inputField.getText().trim();
            // Handle negative numbers
            boolean isNegative = input.startsWith("-");
            if (isNegative) {
                input = input.substring(1);
            }
            // Reverse the digits
            String reversed = new StringBuilder(input).reverse().toString();

            // Remove leading zeros (e.g. 100 -> 001 -> 1)
            int rev = Integer.parseInt(reversed);

            resultField.setText(isNegative ? "-" + rev : String.valueOf(rev));
        });

        // Clear Button
        JButton clearBtn = new JButton("Clear");
        clearBtn.addActionListener(e -> {
            inputField.setText("");
            resultField.setText("");
        });

        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(reverseBtn);
        frame.add(clearBtn);
      frame.setVisible(true);
    }
}
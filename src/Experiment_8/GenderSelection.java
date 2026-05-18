import javax.swing.*;

public class GenderSelection {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());

        // Label
        JLabel titleLabel = new JLabel("Select Gender:");

        // Radio Buttons
        JRadioButton maleBtn   = new JRadioButton("Male");
        JRadioButton femaleBtn = new JRadioButton("Female");
        JRadioButton otherBtn  = new JRadioButton("Other");

        // Button Group - ensures only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(maleBtn);
        group.add(femaleBtn);
        group.add(otherBtn);

        // Result Label
        JLabel resultLabel = new JLabel("Selected: None");

        // Submit Button
        JButton submitBtn = new JButton("Submit");
        submitBtn.addActionListener(e -> {
            if (maleBtn.isSelected()) {
                resultLabel.setText("Selected: Male");
            } else if (femaleBtn.isSelected()) {
                resultLabel.setText("Selected: Female");
            } else if (otherBtn.isSelected()) {
                resultLabel.setText("Selected: Other");
            } else {
                resultLabel.setText("Please select a gender!");
            }
        });

        // Clear Button
        JButton clearBtn = new JButton("Clear");
        clearBtn.addActionListener(e -> {
            group.clearSelection();
            resultLabel.setText("Selected: None");
        });

        // Add to Frame
        frame.add(titleLabel);
        frame.add(maleBtn);
        frame.add(femaleBtn);
        frame.add(otherBtn);
        frame.add(submitBtn);
        frame.add(clearBtn);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Language Selector");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

        JCheckBox javaBox   = new JCheckBox("Java");
        JCheckBox pythonBox = new JCheckBox("Python");
        JCheckBox cppBox    = new JCheckBox("C++");

        JLabel statusLabel = new JLabel("Select a language");

        ItemListener listener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                String selected = "";
                if (javaBox.isSelected())   selected += "Java ";
                if (pythonBox.isSelected()) selected += "Python ";
                if (cppBox.isSelected())    selected += "C++ ";

                if (selected.equals("")) {
                    statusLabel.setText("No language selected");
                } else {
                    statusLabel.setText("Selected: " + selected);
                }
            }
        };

        javaBox.addItemListener(listener);
        pythonBox.addItemListener(listener);
        cppBox.addItemListener(listener);

        frame.add(javaBox);
        frame.add(pythonBox);
        frame.add(cppBox);
        frame.add(statusLabel);

        frame.setVisible(true);
    }
}
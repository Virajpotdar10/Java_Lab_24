
import javax.swing.*;

public class Stationary {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Stationary Purchase System");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 60, 20));

        JLabel l     = new JLabel("Stationary Purchase System");
        JCheckBox c1 = new JCheckBox("Notebook @ 50");
        JCheckBox c2 = new JCheckBox("Pen @ 30");
        JCheckBox c3 = new JCheckBox("Pencil @ 10");
        JButton b    = new JButton("Order");

        frame.add(l);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(b);

        frame.setVisible(true);

        b.addActionListener(e -> {

            double total = 0;

            if (c1.isSelected()) {
                String q  = JOptionPane.showInputDialog("Enter Quantity for Notebook");
                int qty   = Integer.parseInt(q);
                double amt = qty * 50;
                total += amt;
                JOptionPane.showMessageDialog(frame,
                    "Notebook Quantity:" + qty + "  Total:" + (int)amt +
                    "\n------------------" +
                    "\nTotal: " + total);
            }

            if (c2.isSelected()) {
                String q  = JOptionPane.showInputDialog("Enter Quantity for Pen");
                int qty   = Integer.parseInt(q);
                double amt = qty * 30;
                total += amt;
                JOptionPane.showMessageDialog(frame,
                    "Pen Quantity:" + qty + "  Total:" + (int)amt +
                    "\n------------------" +
                    "\nTotal: " + total);
            }

            if (c3.isSelected()) {
                String q  = JOptionPane.showInputDialog("Enter Quantity for Pencil");
                int qty   = Integer.parseInt(q);
                double amt = qty * 10;
                total += amt;
                JOptionPane.showMessageDialog(frame,
                    "Pencil Quantity:" + qty + "  Total:" + (int)amt +
                    "\n------------------" +
                    "\nTotal: " + total);
            }

            JOptionPane.showMessageDialog(frame, "Successfully Ordered.",
                "Alert", JOptionPane.WARNING_MESSAGE);
        });
    }
}
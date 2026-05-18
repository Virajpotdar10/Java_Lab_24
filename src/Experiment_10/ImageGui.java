import javax.swing.*;

public class ImageGui {

    public static void main(String[] args) {

        JFrame f = new JFrame("Image Viewer");
        f.setSize(400,300);
        f.setLayout(new java.awt.FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] images = {"Cat", "Dog", "Bird"};

        JComboBox<String> box = new JComboBox<>(images);

        JLabel label = new JLabel();

        box.addItemListener(e -> {

            String img = box.getSelectedItem() + ".jpg";

            label.setIcon(new ImageIcon(img));
        });

        f.add(box);
        f.add(label);

        f.setVisible(true);
    }
}
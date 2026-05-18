import javax.swing.*;

public class CountText {

    public static void main(String[] args) {

        JFrame f = new JFrame("Count");
        f.setSize(400,300);
        f.setLayout(new java.awt.FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea t = new JTextArea(10,25);

        JLabel c = new JLabel("Characters : 0");
        JLabel w = new JLabel("Words : 0");

        t.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyReleased(java.awt.event.KeyEvent e) {

                String s = t.getText();

                c.setText("Characters : " + s.length());

                w.setText("Words : " + s.split(" ").length);
            }
        });

        f.add(t);
        f.add(c);
        f.add(w);

        f.setVisible(true);
    }
}
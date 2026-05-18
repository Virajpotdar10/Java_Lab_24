import javax.swing.*;

public class GUICOUNTER {
    static int count = 0;
    static JTextField countf;

    public static void main(String[] args) {
        JFrame j = new JFrame("Counter");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBounds(200, 100, 450, 100);
        j.setLayout(new java.awt.FlowLayout());
        JLabel label = new JLabel("Counter");
        countf = new JTextField("0", 8);
        countf.setEditable(false);
        JButton upBtn = new JButton("Count Up");
        upBtn.addActionListener(e -> {
            count++;
            countf.setText(String.valueOf(count));
        });
        JButton downbtn = new JButton("Count Down");
        downbtn.addActionListener(e -> {
            count--;
            countf.setText(String.valueOf(count));
        });
        JButton rstbtn = new JButton("Reset");
        rstbtn.addActionListener(e -> {
            count = 0;
            countf.setText(String.valueOf(count));
        });

        j.add(label);
        j.add(countf);
        j.add(upBtn);
        j.add(downbtn);
        j.add(rstbtn);
        j.setVisible(true);

    }
}

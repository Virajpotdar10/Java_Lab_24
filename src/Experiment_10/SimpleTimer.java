import javax.swing.*;
import java.awt.*;
public class SimpleTimer {
        public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Timer");
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout(CENTER, 20, 20));

        JLabel timeLabel = new JLabel("Time: 0 sec");
        timeLabel.setFont(new Font("Arial", BOLD, 24));

        JButton startBtn = new JButton("Start");
        JButton stopBtn  = new JButton("Stop");
        JButton resetBtn = new JButton("Reset");

        stopBtn.setEnabled(false);  

        int[] count = {0};
        Timer timer = new Timer(1000, e -> {
            count[0]++;
            timeLabel.setText("Time: " + count[0] + " sec");
        });



        startBtn.addActionListener(e -> {
            timer.start();
            startBtn.setEnabled(false);
            stopBtn.setEnabled(true);
        });

        stopBtn.addActionListener(e -> {
            timer.stop();
            startBtn.setEnabled(true);
            stopBtn.setEnabled(false);
        });

        resetBtn.addActionListener(e -> {
            timer.stop();
            count[0] = 0;
            timeLabel.setText("Time: 0 sec");
            startBtn.setEnabled(true);
            stopBtn.setEnabled(false);
        });

        frame.add(timeLabel);
        frame.add(startBtn);
        frame.add(stopBtn);
        frame.add(resetBtn);

        frame.setVisible(true);
    }
}
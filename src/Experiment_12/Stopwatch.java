import javax.swing.*;
import java.awt.*;

public class Stopwatch {

    static int hours = 0, minutes = 0, seconds = 0;
    static boolean running = false;
    public static void main(String[] args) {

        JFrame frame = new JFrame("Stopwatch");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel timeLabel = new JLabel("00 : 00 : 00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 36));

        JButton startBtn = new JButton("Start");
        JButton stopBtn  = new JButton("Stop");
        JButton resetBtn = new JButton("Reset");

        startBtn.addActionListener(e -> {
            if (!running) {
                running = true;

                Runnable r = () -> {
                    while (running) {
                        try { Thread.sleep(1000); }
                        catch (InterruptedException ex) { ex.printStackTrace(); }

                        seconds++;
                        if (seconds == 60) { seconds = 0; minutes++; }
                        if (minutes == 60) { minutes = 0; hours++;   }

                        timeLabel.setText(String.format("%02d : %02d : %02d",
                                                         hours, minutes, seconds));
                    }
                };

                new Thread(r).start();
            }
        });
        stopBtn.addActionListener(e -> running = false);
        resetBtn.addActionListener(e -> {
            running = false;
            hours = 0; minutes = 0; seconds = 0;
            timeLabel.setText("00 : 00 : 00");
        });
        frame.add(timeLabel);
        frame.add(startBtn);
        frame.add(stopBtn);
        frame.add(resetBtn);
        frame.setVisible(true);
    }
}
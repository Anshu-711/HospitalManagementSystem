import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payments extends JFrame implements ActionListener {
    private JLabel timerLabel;
    private Timer timer;
    private int secondsRemaining;
    JButton doneBtn, backBtn;

    Payments() {
        // Frame properties
        setVisible(true);
        setSize(500, 550);
        setLocation(530, 150);
        setTitle("Payment");
        setLayout(null);

        // Timer Label
        timerLabel = new JLabel("Time remaining: 5:00");
        timerLabel.setBounds(140, 300, 300, 30);
        timerLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        add(timerLabel);

        // Timer
        secondsRemaining = 5 * 60;
        timer = new Timer(1000, this);
        timer.start();

        // QR Code
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/payment.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(100, -100, 300, 500);
        add(label);

        // Done Button
        doneBtn = new JButton("Done");
        doneBtn.setFont(new Font("Raleway", Font.BOLD, 20));
        doneBtn.setBounds(200, 400, 100, 30);
        doneBtn.setBackground(Color.BLACK);
        doneBtn.setForeground(Color.WHITE);
        doneBtn.addActionListener(this);
        add(doneBtn);

        // Back Button
        backBtn = new JButton("←");
        backBtn.setFont(new Font("Raleway", Font.BOLD, 20));
        backBtn.setBounds(10, 10, 60, 50);
        backBtn.setBackground(Color.WHITE);
        backBtn.setForeground(Color.BLACK);
        backBtn.addActionListener(this);
        add(backBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        secondsRemaining--;
        if (secondsRemaining >= 0) {
            int minutes = secondsRemaining / 60;
            int seconds = secondsRemaining % 60;
            timerLabel.setText("Time remaining: " + String.format("%d:%02d", minutes, seconds));
        } else {
            timer.stop();
            timerLabel.setText("Time's up!");
            timerLabel.setText("Payment failed. Try agin");
        }
        if (e.getSource() == doneBtn) {
            JOptionPane.showMessageDialog(this, "Payment successful. Appointment booked for selected time slot.");
            this.dispose();
            DoctorDescription ds = new DoctorDescription();
            ds.setVisible(true);
        } else if (e.getSource() == backBtn) {
            int choice = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                this.dispose();
                BookAppointment ba = new BookAppointment();
                ba.setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        new Payments();
    }
}

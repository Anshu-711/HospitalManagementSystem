import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookAppointment extends JFrame implements ActionListener {
    private JComboBox<String> categoryComboBox;
    private JComboBox<String> timingComboBox;
    private JButton submitButton;
    JButton doctorListBtn, backBtn;

    static String timing;

    public BookAppointment() {
        setTitle("Book Appointment");
        setSize(620, 500);
        setLocation(450, 200);
        setLayout(null);
        setVisible(true);

        String[] symptoms = { "", "Cardiologist", "Dermatologist", "Orthopedic Surgeon", "Ophthalmologist",
                "Psychiatrist", "Neurologist" };

        String[] timings = { "", "Between 9 AM - 10 AM", "Between 10 AM - 11 AM", "Between 11 AM - 12 PM",
                "Between 2 PM - 3 PM", "Between 3 PM - 4 PM", "Between 4 PM - 5 PM", "Between 5 PM - 6 PM" };

        categoryComboBox = new JComboBox<>(symptoms);
        timingComboBox = new JComboBox<>(timings);

        // Adding Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/plus.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(250, 50, 100, 100);
        add(label);

        // Category JLabel
        JLabel categoryLabel = new JLabel("Category: ");
        categoryLabel.setBounds(80, 200, 100, 30);
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        add(categoryLabel);

        // Category Combo Box
        categoryComboBox.setBounds(200, 200, 300, 30);
        categoryComboBox.setFont(new Font("Raleway", Font.BOLD, 20));
        add(categoryComboBox);

        // Timing JLabel
        JLabel timingLabel = new JLabel("Time Slot: ");
        timingLabel.setBounds(80, 250, 100, 30);
        timingLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        add(timingLabel);

        // Timing Combo Box
        timingComboBox.setBounds(200, 250, 300, 30);
        timingComboBox.setFont(new Font("Raleway", Font.BOLD, 20));
        add(timingComboBox);

        // Submit Button
        submitButton = new JButton("Next");
        submitButton.setBounds(200, 320, 100, 35);
        submitButton.setFont(new Font("Raleway", Font.BOLD, 20));
        submitButton.addActionListener(this);
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);
        add(submitButton);

        // Back Button
        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Raleway", Font.BOLD, 20));
        backBtn.setBounds(400, 320, 100, 35);
        backBtn.setForeground(Color.white);
        backBtn.setBackground(Color.BLACK);
        backBtn.addActionListener(this);
        add(backBtn);

        // Doctor List Button
        doctorListBtn = new JButton("Doctor's list");
        doctorListBtn.setFont(new Font("Raleway", Font.BOLD, 18));
        doctorListBtn.setBounds(280, 375, 150, 35);
        doctorListBtn.setBackground(Color.BLACK);
        doctorListBtn.setForeground(Color.WHITE);
        doctorListBtn.addActionListener(this);
        add(doctorListBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String category = (String) categoryComboBox.getSelectedItem();
        timing = (String) timingComboBox.getSelectedItem();

        if (e.getSource() == submitButton) {
            if (category.equals("")) {
                JOptionPane.showMessageDialog(this, "Please select your problem category.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (timing.equals("")) {
                JOptionPane.showMessageDialog(this, "Please select a time slot.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (category.equals("Cardiologist")) {
                this.dispose();
                Doctor1 dc1 = new Doctor1();
                dc1.setVisible(true);
            } else if (category.equals("Dermatologist")) {
                this.dispose();
                Doctor2 dc2 = new Doctor2();
                dc2.setVisible(true);
            } else if (category.equals("Orthopedic Surgeon")) {
                this.dispose();
                Doctor3 dc3 = new Doctor3();
                dc3.setVisible(true);
            } else if (category.equals("Ophthalmologist")) {
                this.dispose();
                Doctor4 dc4 = new Doctor4();
                dc4.setVisible(true);
            } else if (category.equals("Psychiatrist")) {
                this.dispose();
                Doctor5 dc5 = new Doctor5();
                dc5.setVisible(true);
            } else if (category.equals("Neurologist")) {
                this.dispose();
                Doctor6 dc6 = new Doctor6();
                dc6.setVisible(true);
            }
        } else if (e.getSource() == doctorListBtn) {
            this.dispose();
            DoctorDescription ds = new DoctorDescription();
            ds.setVisible(true);
        } else if (e.getSource() == backBtn) {
            this.dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new BookAppointment();
    }
}
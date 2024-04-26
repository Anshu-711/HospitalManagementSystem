import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Doctor6 extends JFrame implements ActionListener {
    JButton backbtn, bookBtn;

    Doctor6() {
        // Setting Frame properties
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        setTitle("Neurologist");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Adding Doctor 6 Image
        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icons/doc6.jpg"));
        Image i17 = i16.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        JLabel doctor6Image = new JLabel(i18);
        doctor6Image.setBounds(100, 50, 80, 100);
        add(doctor6Image);

        // Doctor 6 Name JLabel
        JLabel doc6NameLb = new JLabel("<html><u>Dr. Soumya Swaminathan</u></html>");
        doc6NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        doc6NameLb.setBounds(200, 120, 300, 30);
        add(doc6NameLb);

        // Speciality JLabel
        JLabel specsDoc6Lb = new JLabel("Speciality: Neurologist");
        specsDoc6Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        specsDoc6Lb.setBounds(100, 165, 250, 30);
        add(specsDoc6Lb);

        // Experience Label
        JLabel expDoc6Lb = new JLabel("Experience: 35+ Years");
        expDoc6Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        expDoc6Lb.setBounds(100, 195, 250, 30);
        add(expDoc6Lb);

        // Degree Label
        JLabel degreeDoc6Lb = new JLabel("Education: MBBS, MD, MS, PhD");
        degreeDoc6Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc6Lb.setBounds(100, 225, 250, 30);
        add(degreeDoc6Lb);

        // Rating Label
        JLabel ratingDoc6Lb = new JLabel("\u2605\u2605\u2605\u2605");
        ratingDoc6Lb.setFont(new Font("Raleway", Font.BOLD, 28));
        ratingDoc6Lb.setBounds(100, 255, 250, 30);
        add(ratingDoc6Lb);

        // Payment Label
        JLabel paymentLb = new JLabel("Fees: ₹1500");
        paymentLb.setFont(new Font("Raleway", Font.BOLD, 20));
        paymentLb.setBounds(550, 120, 200, 30);
        add(paymentLb);

        // Fee JButton
        bookBtn = new JButton("Book Appointment");
        bookBtn.setFont(new Font("Raleway", Font.BOLD, 18));
        bookBtn.setBounds(550, 190, 205, 30);
        bookBtn.setBackground(Color.black);
        bookBtn.setForeground(Color.WHITE);
        bookBtn.addActionListener(this);
        add(bookBtn);

        // Back Button
        backbtn = new JButton("Back");
        backbtn.setFont(new Font("Raleway", Font.BOLD, 20));
        backbtn.setBounds(550, 240, 120, 30);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        backbtn.addActionListener(this);
        add(backbtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == backbtn) {
                this.dispose();
                BookAppointment ba = new BookAppointment();
                ba.setVisible(true);
            }
            if (ae.getSource() == bookBtn) {
                this.dispose();
                Payments pay = new Payments();
                pay.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Doctor6();
    }
}
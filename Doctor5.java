import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Doctor5 extends JFrame implements ActionListener {
    JButton backbtn, bookBtn;

    Doctor5() {
        // Setting Frame properties
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        setTitle("Psychiatrist");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Adding Doctor 5 Image
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/doc5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel doctor5Image = new JLabel(i15);
        doctor5Image.setBounds(100, 50, 80, 100);
        add(doctor5Image);

        // Doctor 5 Name JLabel
        JLabel doc5NameLb = new JLabel("<html><u>Dr. Naresh Trehan</u></html>");
        doc5NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        doc5NameLb.setBounds(200, 120, 200, 30);
        add(doc5NameLb);

        // Speciality JLabel
        JLabel specsDoc5Lb = new JLabel("Speciality: Phychiatrist");
        specsDoc5Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        specsDoc5Lb.setBounds(100, 165, 250, 30);
        add(specsDoc5Lb);

        // Experience Label
        JLabel expDoc5Lb = new JLabel("Experience: 25+ Years");
        expDoc5Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        expDoc5Lb.setBounds(100, 195, 250, 30);
        add(expDoc5Lb);

        // Degree Label
        JLabel degreeDoc5Lb = new JLabel("Education: MBBS, MD, MS");
        degreeDoc5Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc5Lb.setBounds(100, 225, 250, 30);
        add(degreeDoc5Lb);

        // Rating Label
        JLabel ratingDoc5Lb = new JLabel("\u2605\u2605\u2605\u2605");
        ratingDoc5Lb.setFont(new Font("Raleway", Font.BOLD, 28));
        ratingDoc5Lb.setBounds(100, 255, 250, 30);
        add(ratingDoc5Lb);

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
        new Doctor5();
    }
}
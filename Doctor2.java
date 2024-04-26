import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Doctor2 extends JFrame implements ActionListener {
    JButton backbtn, bookBtn;

    Doctor2() {
        // Setting Frame properties
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        setTitle("Dermatologist");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Adding Doctor 2 Image
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/doc2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel doctor2Image = new JLabel(i6);
        doctor2Image.setBounds(100, 50, 80, 100);
        add(doctor2Image);

        // Doctor 2 Name JLabel
        JLabel doc2NameLb = new JLabel("<html><u>Dr. Randeep Guleria</u></html>");
        doc2NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        doc2NameLb.setBounds(200, 120, 200, 30);
        add(doc2NameLb);

        // Speciality JLabel
        JLabel specsDoc2Lb = new JLabel("Speciality: Dermatologist");
        specsDoc2Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        specsDoc2Lb.setBounds(100, 165, 250, 30);
        add(specsDoc2Lb);

        // Experience Label
        JLabel expDoc2Lb = new JLabel("Experience: 30+ Years");
        expDoc2Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        expDoc2Lb.setBounds(100, 195, 250, 30);
        add(expDoc2Lb);

        // Degree Label
        JLabel degreeDoc2Lb = new JLabel("Education: MBBS, MD, MS");
        degreeDoc2Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc2Lb.setBounds(100, 225, 250, 30);
        add(degreeDoc2Lb);

        // Rating Label
        JLabel ratingDoc2Lb = new JLabel("\u2605\u2605\u2605\u2605");
        ratingDoc2Lb.setFont(new Font("Raleway", Font.BOLD, 28));
        ratingDoc2Lb.setBounds(100, 255, 250, 30);
        add(ratingDoc2Lb);

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
        new Doctor2();
    }
}
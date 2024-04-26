import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Doctor1 extends JFrame implements ActionListener {
    JButton backbtn, bookBtn;

    Doctor1() {
        // Setting Frame properties
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        setTitle("Cardiologist");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Doctor Details
        // Adding Doctor 1 Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/doc1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel doctor1Image = new JLabel(i3);
        doctor1Image.setBounds(100, 50, 80, 100);
        add(doctor1Image);

        // Doctor 1 Name JLabel
        JLabel doc1NameLb = new JLabel("<html><u>Dr. K. M. Cherian</u></html>");
        doc1NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        doc1NameLb.setBounds(200, 120, 200, 30);
        add(doc1NameLb);

        // Speciality JLabel
        JLabel specsDoc1Lb = new JLabel("Speciality: Cardiologist");
        specsDoc1Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        specsDoc1Lb.setBounds(100, 165, 250, 30);
        add(specsDoc1Lb);

        // Experience Label
        JLabel expDoc1Lb = new JLabel("Experience: 40+ Years");
        expDoc1Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        expDoc1Lb.setBounds(100, 195, 250, 30);
        add(expDoc1Lb);

        // Degree Label
        JLabel degreeDoc1Lb = new JLabel("Education: MBBS, MD, MS, PhD");
        degreeDoc1Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc1Lb.setBounds(100, 225, 250, 30);
        add(degreeDoc1Lb);

        // Rating Label
        JLabel ratingDoc1Lb = new JLabel("\u2605\u2605\u2605\u2605\u2605");
        ratingDoc1Lb.setFont(new Font("Raleway", Font.BOLD, 28));
        ratingDoc1Lb.setBounds(100, 255, 250, 30);
        add(ratingDoc1Lb);

        // Payment Label
        JLabel paymentLb = new JLabel("Fees: ₹2000");
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
        new Doctor1();
    }
}
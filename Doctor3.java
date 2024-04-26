import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Doctor3 extends JFrame implements ActionListener {
    JButton backbtn, bookBtn;

    Doctor3() {
        // Setting Frame properties
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        setTitle("Orthopedic Surgeon");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Adding Doctor 3 Image
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/doc3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel doctor3Image = new JLabel(i9);
        doctor3Image.setBounds(100, 50, 80, 100);
        add(doctor3Image);

        // Doctor 3 Name JLabel
        JLabel doc3NameLb = new JLabel("<html><u>Dr. Anita Bhardwaj</u></html>");
        doc3NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        doc3NameLb.setBounds(200, 120, 200, 30);
        add(doc3NameLb);

        // Speciality JLabel
        JLabel specsDoc3Lb = new JLabel("Speciality: Orthopedic Surgeon");
        specsDoc3Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        specsDoc3Lb.setBounds(100, 165, 250, 30);
        add(specsDoc3Lb);

        // Experience Label
        JLabel expDoc3Lb = new JLabel("Experience: 25+ Years");
        expDoc3Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        expDoc3Lb.setBounds(100, 195, 250, 30);
        add(expDoc3Lb);

        // Degree Label
        JLabel degreeDoc3Lb = new JLabel("Education: MBBS, MD, MS");
        degreeDoc3Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc3Lb.setBounds(100, 225, 250, 30);
        add(degreeDoc3Lb);

        // Rating Label
        JLabel ratingDoc3Lb = new JLabel("\u2605\u2605\u2605\u2605");
        ratingDoc3Lb.setFont(new Font("Raleway", Font.BOLD, 28));
        ratingDoc3Lb.setBounds(100, 255, 250, 30);
        add(ratingDoc3Lb);

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
        new Doctor3();
    }
}
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Doctor4 extends JFrame implements ActionListener {
    JButton backbtn, bookBtn;

    Doctor4() {
        // Setting Frame properties
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        setTitle("Ophthalmologist");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Adding Doctor 4 Image
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/doc4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel doctor4Image = new JLabel(i12);
        doctor4Image.setBounds(100, 50, 80, 100);
        add(doctor4Image);

        // Doctor 4 Name JLabel
        JLabel doc4NameLb = new JLabel("<html><u>Dr. Mohamed Rela</u></html>");
        doc4NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        doc4NameLb.setBounds(200, 120, 200, 30);
        add(doc4NameLb);

        // Speciality JLabel
        JLabel specsDoc4Lb = new JLabel("Speciality: Opthalmologist");
        specsDoc4Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        specsDoc4Lb.setBounds(100, 165, 250, 30);
        add(specsDoc4Lb);

        // Experience Label
        JLabel expDoc4Lb = new JLabel("Experience: 30+ Years");
        expDoc4Lb.setBounds(100, 195, 250, 30);
        expDoc4Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(expDoc4Lb);

        // Degree Label
        JLabel degreeDoc4Lb = new JLabel("Education: MBBS, MD, MS, PhD.");
        degreeDoc4Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc4Lb.setBounds(100, 225, 250, 30);
        add(degreeDoc4Lb);

        // Rating Label
        JLabel ratingDoc4Lb = new JLabel("\u2605\u2605\u2605\u2605\u2605");
        ratingDoc4Lb.setBounds(520, 650, 250, 30);
        ratingDoc4Lb.setBounds(100, 255, 250, 30);
        add(ratingDoc4Lb);

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
        new Doctor4();
    }
}
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DoctorDescription extends JFrame implements ActionListener {

    JButton okBtn;

    DoctorDescription() {
        // Creating JFrame
        setVisible(true);
        setSize(1400, 850);
        setLocation(85, 10);
        setTitle("List of Doctors & Description");
        setLayout(null);

        // -------------------- LINE BREAK -------------------- //

        // Card - Doctor 1
        // Adding Doctor 1 Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/doc1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel doctor1Image = new JLabel(i3);
        doctor1Image.setBounds(100, 50, 80, 100);
        add(doctor1Image);

        // Doctor 1 Name JLabel
        JLabel doc1NameLb = new JLabel("<html><u>Dr. K. M. Cherian</u></html>");
        doc1NameLb.setBounds(200, 120, 200, 30);
        doc1NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        add(doc1NameLb);

        // Speciality JLabel
        JLabel specsDoc1Lb = new JLabel("Speciality: Cardiologist");
        specsDoc1Lb.setBounds(100, 165, 250, 30);
        specsDoc1Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(specsDoc1Lb);

        // Experience Label
        JLabel expDoc1Lb = new JLabel("Experience: 40+ Years");
        expDoc1Lb.setBounds(100, 195, 250, 30);
        expDoc1Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
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

        // -------------------- LINE BREAK -------------------- //

        // Card - Doctor 2

        // Adding Doctor 2 Image
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/doc2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel doctor2Image = new JLabel(i6);
        doctor2Image.setBounds(520, 50, 80, 100);
        add(doctor2Image);

        // Doctor 2 Name JLabel
        JLabel doc2NameLb = new JLabel("<html><u>Dr. Randeep Guleria</u></html>");
        doc2NameLb.setBounds(620, 120, 200, 30);
        doc2NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        add(doc2NameLb);

        // Speciality JLabel
        JLabel specsDoc2Lb = new JLabel("Speciality: Dermatologist");
        specsDoc2Lb.setBounds(520, 165, 250, 30);
        specsDoc2Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(specsDoc2Lb);

        // Experience Label
        JLabel expDoc2Lb = new JLabel("Experience: 30+ Years");
        expDoc2Lb.setBounds(520, 195, 250, 30);
        expDoc2Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(expDoc2Lb);

        // Degree Label
        JLabel degreeDoc2Lb = new JLabel("Education: MBBS, MD, MS");
        degreeDoc2Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc2Lb.setBounds(520, 225, 250, 30);
        add(degreeDoc2Lb);

        // Rating Label
        JLabel ratingDoc2Lb = new JLabel("\u2605\u2605\u2605\u2605");
        ratingDoc2Lb.setFont(new Font("Raleway", Font.BOLD, 28));
        ratingDoc2Lb.setBounds(520, 255, 250, 30);
        add(ratingDoc2Lb);

        // -------------------- LINE BREAK -------------------- //

        // Card - Doctor 3

        // Adding Doctor 3 Image
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/doc3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel doctor3Image = new JLabel(i9);
        doctor3Image.setBounds(100, 450, 80, 100);
        add(doctor3Image);

        // Doctor 3 Name JLabel
        JLabel doc3NameLb = new JLabel("<html><u>Dr. Anita Bhardwaj</u></html>");
        doc3NameLb.setBounds(200, 520, 200, 30);
        doc3NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        add(doc3NameLb);

        // Speciality JLabel
        JLabel specsDoc3Lb = new JLabel("Speciality: Orthopedic Surgeon");
        specsDoc3Lb.setBounds(100, 560, 300, 30);
        specsDoc3Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(specsDoc3Lb);

        // Experience Label
        JLabel expDoc3Lb = new JLabel("Experience: 25+ Years");
        expDoc3Lb.setBounds(100, 590, 250, 30);
        expDoc3Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(expDoc3Lb);

        // Degree Label
        JLabel degreeDoc3Lb = new JLabel("Education: MBBS, MD, MS");
        degreeDoc3Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc3Lb.setBounds(100, 620, 250, 30);
        add(degreeDoc3Lb);

        // Rating Label
        JLabel ratingDoc3Lb = new JLabel("\u2605\u2605\u2605\u2605");
        ratingDoc3Lb.setFont(new Font("Raleway", Font.BOLD, 28));
        ratingDoc3Lb.setBounds(100, 650, 250, 30);
        add(ratingDoc3Lb);

        // -------------------- LINE BREAK -------------------- //

        // Card - Doctor 4

        // Adding Doctor 4 Image
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/doc4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel doctor4Image = new JLabel(i12);
        doctor4Image.setBounds(520, 450, 80, 100);
        add(doctor4Image);

        // Doctor 4 Name JLabel
        JLabel doc4NameLb = new JLabel("<html><u>Dr. Mohamed Rela</u></html>");
        doc4NameLb.setBounds(620, 520, 200, 30);
        doc4NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        add(doc4NameLb);

        // Speciality JLabel
        JLabel specsDoc4Lb = new JLabel("Speciality: Opthalmologist");
        specsDoc4Lb.setBounds(520, 560, 250, 30);
        specsDoc4Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(specsDoc4Lb);

        // Experience Label
        JLabel expDoc4Lb = new JLabel("Experience: 30+ Years");
        expDoc4Lb.setBounds(520, 590, 250, 30);
        expDoc4Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(expDoc4Lb);

        // Degree Label
        JLabel degreeDoc4Lb = new JLabel("Education: MBBS, MD, MS, PhD.");
        degreeDoc4Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc4Lb.setBounds(520, 620, 250, 30);
        add(degreeDoc4Lb);

        // Rating Label
        JLabel ratingDoc4Lb = new JLabel("\u2605\u2605\u2605\u2605\u2605");
        ratingDoc4Lb.setFont(new Font("Raleway", Font.BOLD, 28));
        ratingDoc4Lb.setBounds(520, 650, 250, 30);
        add(ratingDoc4Lb);

        // -------------------- LINE BREAK -------------------- //

        // Card - Doctor 5

        // Adding Doctor 5 Image
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/doc5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel doctor5Image = new JLabel(i15);
        doctor5Image.setBounds(920, 50, 80, 100);
        add(doctor5Image);

        // Doctor 5 Name JLabel
        JLabel doc5NameLb = new JLabel("<html><u>Dr. Naresh Trehan</u></html>");
        doc5NameLb.setBounds(1020, 120, 200, 30);
        doc5NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        add(doc5NameLb);

        // Speciality JLabel
        JLabel specsDoc5Lb = new JLabel("Speciality: Phychiatrist");
        specsDoc5Lb.setBounds(920, 165, 250, 30);
        specsDoc5Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(specsDoc5Lb);

        // Experience Label
        JLabel expDoc5Lb = new JLabel("Experience: 25+ Years");
        expDoc5Lb.setBounds(920, 195, 250, 30);
        expDoc5Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(expDoc5Lb);

        // Degree Label
        JLabel degreeDoc5Lb = new JLabel("Education: MBBS, MD, MS");
        degreeDoc5Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc5Lb.setBounds(920, 225, 250, 30);
        add(degreeDoc5Lb);

        // Rating Label
        JLabel ratingDoc5Lb = new JLabel("\u2605\u2605\u2605\u2605");
        ratingDoc5Lb.setFont(new Font("Raleway", Font.BOLD, 28));
        ratingDoc5Lb.setBounds(920, 255, 250, 30);
        add(ratingDoc5Lb);

        // -------------------- LINE BREAK -------------------- //

        // Card - Doctor 6

        // Adding Doctor 6 Image
        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icons/doc6.jpg"));
        Image i17 = i16.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        JLabel doctor6Image = new JLabel(i18);
        doctor6Image.setBounds(920, 450, 80, 100);
        add(doctor6Image);

        // Doctor 6 Name JLabel
        JLabel doc6NameLb = new JLabel("<html><u>Dr. Soumya Swaminathan</u></html>");
        doc6NameLb.setBounds(1020, 520, 250, 30);
        doc6NameLb.setFont(new Font("Raleway", Font.BOLD, 20));
        add(doc6NameLb);

        // Speciality JLabel
        JLabel specsDoc6Lb = new JLabel("Speciality: Neurologist");
        specsDoc6Lb.setBounds(920, 560, 250, 30);
        specsDoc6Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(specsDoc6Lb);

        // Experience Label
        JLabel expDoc6Lb = new JLabel("Experience: 35+ Years");
        expDoc6Lb.setBounds(920, 590, 250, 30);
        expDoc6Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        add(expDoc6Lb);

        // Degree Label
        JLabel degreeDoc6Lb = new JLabel("Education: MBBS, MD, MS, PhD");
        degreeDoc6Lb.setFont(new Font("Raleway", Font.ITALIC + Font.BOLD, 15));
        degreeDoc6Lb.setBounds(920, 620, 250, 30);
        add(degreeDoc6Lb);

        // Rating Label
        JLabel ratingDoc6Lb = new JLabel("\u2605\u2605\u2605\u2605");
        ratingDoc6Lb.setFont(new Font("Raleway", Font.BOLD, 28));
        ratingDoc6Lb.setBounds(920, 650, 250, 30);
        add(ratingDoc6Lb);

        // -------------------- LINE BREAK -------------------- //

        // OK JButton
        okBtn = new JButton("OK");
        okBtn.setBounds(600, 750, 100, 30);
        okBtn.setFont(new Font("Raleway", Font.BOLD, 20));
        okBtn.setBackground(Color.BLACK);
        okBtn.setForeground(Color.WHITE);
        okBtn.addActionListener(this);
        add(okBtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == okBtn) {
                this.dispose();
                BookAppointment ba = new BookAppointment();
                ba.setVisible(true);
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        new DoctorDescription();
    }
}
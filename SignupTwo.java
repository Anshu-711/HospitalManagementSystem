import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class SignupTwo extends JFrame implements ActionListener {
    static String defaultOTP1 = "9826";
    static String defaultOTP2 = "5763";
    static String defaultOTP3 = "1234";

    JButton verifyBtn;
    JPasswordField otpTextField;

    SignupTwo() {
        // Setting Frame Properties
        setTitle("Registration Form - Page 02");
        setSize(450, 400);
        setLocation(550, 250);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Setting Frame Content
        // OTP Label
        JLabel otpLabel = new JLabel("OTP:");
        otpLabel.setBounds(75, 100, 100, 30);
        otpLabel.setFont(new Font("Raleway", Font.BOLD, 32));
        add(otpLabel);

        // OTP Text Field
        otpTextField = new JPasswordField();
        otpTextField.setBounds(180, 100, 180, 30);
        add(otpTextField);

        verifyBtn = new JButton("Verify");
        verifyBtn.setBounds(175, 200, 100, 30);
        verifyBtn.setFont(new Font("Raleway", Font.BOLD, 20));
        verifyBtn.addActionListener(this);
        add(verifyBtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == verifyBtn) {
                char[] otpChar = otpTextField.getPassword();
                String otp = new String(otpChar);
                if (otp.equals("")) {
                    JOptionPane.showMessageDialog(this, "Please enter the OTP sent to your mobile number", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if (!(otp.equals(defaultOTP1) || otp.equals(defaultOTP2) || otp.equals(defaultOTP3))) {
                    JOptionPane.showMessageDialog(this, "Entered OTP is wrong", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "You are successfully registered", "Successful",
                            JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    Login login = new Login();
                    login.setVisible(true);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo();
    }
}
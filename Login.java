import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    static String mobileNumberOne = "1234567890";
    static String mobileNumberTwo = "0987654321";

    static String pinNumberOne = "1234";
    static String pinNumberTwo = "9870";

    JTextField mobileTextField;
    JButton loginBtn, signupBtn, clearBtn;
    JPasswordField pinTextField;

    Login() {
        // Setting Frame properties
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        setTitle("Log In");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Adding Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/plus.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(100, 10, 100, 100);
        add(label);

        // Welcome Label
        JLabel text = new JLabel("UnityCare Hospital");
        text.setFont(new Font("Osward", Font.BOLD, 42));
        text.setBounds(260, 40, 500, 50);
        add(text);

        // Mobile Number Label
        JLabel mobno = new JLabel("Mobile no.");
        mobno.setFont(new Font("Raleway", Font.BOLD, 28));
        mobno.setBounds(120, 150, 150, 40);
        add(mobno);

        // Mobile Number Text Field
        mobileTextField = new JTextField();
        mobileTextField.setBounds(300, 150, 250, 30);
        mobileTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(mobileTextField);

        // PIN Label
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        // Pin Text Field
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        // Log in Button
        loginBtn = new JButton("LOG IN");
        loginBtn.setBounds(300, 300, 116, 30);
        loginBtn.setBackground(Color.BLACK);
        loginBtn.setForeground(Color.WHITE);
        loginBtn.addActionListener(this);
        add(loginBtn);

        // Clear Button
        clearBtn = new JButton("CLEAR");
        clearBtn.setBounds(430, 300, 117, 30);
        clearBtn.setBackground(Color.BLACK);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.addActionListener(this);
        add(clearBtn);

        // Sign UP Button
        signupBtn = new JButton("REGISTER");
        signupBtn.setBounds(300, 350, 250, 30);
        signupBtn.setBackground(Color.BLACK);
        signupBtn.setForeground(Color.WHITE);
        signupBtn.addActionListener(this);
        add(signupBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == loginBtn) {
                String mobileNumber = mobileTextField.getText();
                char[] pinChars = pinTextField.getPassword();
                String pinNumber = new String(pinChars);

                if (mobileNumber.isEmpty() || pinNumber.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter both, Mobile number and PIN.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if (!(mobileNumberOne.equals(mobileNumber) && pinNumberOne.equals(pinNumber))
                        && !(mobileNumberTwo.equals(mobileNumber) && pinNumberTwo.equals(pinNumber))) {
                    JOptionPane.showMessageDialog(this, "You entered wrong Mobile or PIN Number.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    this.dispose();
                    BookAppointment ba = new BookAppointment();
                    ba.setVisible(true);
                }
            } else if (e.getSource() == clearBtn) {
                mobileTextField.setText("");
                pinTextField.setText("");
            } else if (e.getSource() == signupBtn) {
                this.dispose();
                SignupOne signupOneObj = new SignupOne();
                signupOneObj.setVisible(true);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
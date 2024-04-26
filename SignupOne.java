// package bank;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupOne extends JFrame implements ActionListener {

    long randomNumber;
    JTextField nameTextField, fathersNameTextField, mobileTextField,
            ageTextField, addressTextField, cityTextField, stateTextField,
            pinCodeTextField, weightTextField;
    JButton backBtn, nextBtn;
    JRadioButton maleRadioBtn, femaleRadioBtn, otherGenderRadioBtn;

    SignupOne() {
        // Setting Frame Properties
        setTitle("Registartion Form - Page 01");
        setSize(850, 780);
        setLocation(350, 50);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Generating Random number
        Random random = new Random();
        randomNumber = (Math.abs(random.nextLong() % 9000L + 1000L));

        // Form number Label
        JLabel fromNumber = new JLabel("REGISTRATION FORM No. " + randomNumber);
        fromNumber.setFont(new Font("Raleway", Font.BOLD, 40));
        fromNumber.setBounds(140, 40, 630, 40);
        add(fromNumber);

        // Name Label
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        nameLabel.setBounds(100, 140, 100, 30);
        add(nameLabel);

        // Name Text field
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        // Fathers Name Label
        JLabel fatherNameLabel = new JLabel("Fathers name:");
        fatherNameLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        fatherNameLabel.setBounds(100, 190, 200, 30);
        add(fatherNameLabel);

        // Fathers Name Text field
        fathersNameTextField = new JTextField();
        fathersNameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fathersNameTextField.setBounds(300, 190, 400, 30);
        add(fathersNameTextField);

        // Gender Label
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        genderLabel.setBounds(100, 240, 200, 30);
        add(genderLabel);

        // Gender Radio Button
        // Male Button
        maleRadioBtn = new JRadioButton("Male");
        maleRadioBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        maleRadioBtn.setBackground(Color.WHITE);
        maleRadioBtn.setBounds(300, 230, 90, 50);
        add(maleRadioBtn);

        // Female Button
        femaleRadioBtn = new JRadioButton("Female");
        femaleRadioBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        femaleRadioBtn.setBackground(Color.WHITE);
        femaleRadioBtn.setBounds(450, 230, 90, 50);
        add(femaleRadioBtn);

        // Others Button
        otherGenderRadioBtn = new JRadioButton("Others");
        otherGenderRadioBtn.setFont(new Font("Raleway", Font.BOLD, 15));
        otherGenderRadioBtn.setBackground(Color.WHITE);
        otherGenderRadioBtn.setBounds(600, 230, 90, 50);
        add(otherGenderRadioBtn);

        // Grouping Gender Radio button to same class
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioBtn);
        genderGroup.add(femaleRadioBtn);
        genderGroup.add(otherGenderRadioBtn);

        // Mobile Number Label
        JLabel mobileLabel = new JLabel("Mobile no:");
        mobileLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        mobileLabel.setBounds(100, 290, 200, 30);
        add(mobileLabel);

        // Mobile Number Text field
        mobileTextField = new JTextField();
        mobileTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        mobileTextField.setBounds(300, 290, 400, 30);
        add(mobileTextField);

        // Age Label
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        ageLabel.setBounds(100, 340, 200, 30);
        add(ageLabel);

        // Age Text field
        ageTextField = new JTextField();
        ageTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        ageTextField.setBounds(300, 340, 130, 30);
        add(ageTextField);

        // Weight Label
        JLabel weightLabel = new JLabel("Weight:");
        weightLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        weightLabel.setBounds(475, 340, 100, 30);
        add(weightLabel);

        // Wewight Text field
        weightTextField = new JTextField();
        weightTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        weightTextField.setBounds(570, 340, 130, 30);
        add(weightTextField);

        // Address Label
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        addressLabel.setBounds(100, 390, 200, 30);
        add(addressLabel);

        // Address Text field
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 390, 400, 30);
        add(addressTextField);

        // City Label
        JLabel cityLabel = new JLabel("City:");
        cityLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        cityLabel.setBounds(100, 440, 200, 30);
        add(cityLabel);

        // City Text field
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 440, 400, 30);
        add(cityTextField);

        // State Label
        JLabel stateLabel = new JLabel("State:");
        stateLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        stateLabel.setBounds(100, 490, 200, 30);
        add(stateLabel);

        // State Text field
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 490, 400, 30);
        add(stateTextField);

        // Pin code Label
        JLabel pinCodeLabel = new JLabel("Pin Code:");
        pinCodeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCodeLabel.setBounds(100, 540, 200, 30);
        add(pinCodeLabel);

        // Pin Code Text field
        pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinCodeTextField.setBounds(300, 540, 400, 30);
        add(pinCodeTextField);

        // Back Button
        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Raleway", Font.BOLD, 12));
        backBtn.setBackground(Color.BLACK);
        backBtn.setForeground(Color.WHITE);
        backBtn.setBounds(300, 620, 80, 40);
        backBtn.addActionListener(this);
        add(backBtn);

        // Next Button
        nextBtn = new JButton("Next");
        nextBtn.setFont(new Font("Raleway", Font.BOLD, 12));
        nextBtn.setBackground(Color.BLACK);
        nextBtn.setForeground(Color.WHITE);
        nextBtn.setBounds(450, 620, 80, 40);
        nextBtn.addActionListener(this);
        add(nextBtn);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String name = nameTextField.getText();

        String fatherName = fathersNameTextField.getText();

        String gender = "null";
        if (maleRadioBtn.isSelected()) {
            gender = "Male";
        } else if (femaleRadioBtn.isSelected()) {
            gender = "Female";
        } else if (otherGenderRadioBtn.isSelected()) {
            gender = "Others";
        }

        String age = ageTextField.getText();

        String weight = weightTextField.getText();

        String mobile = mobileTextField.getText();

        String address = addressTextField.getText();

        String city = cityTextField.getText();

        String state = stateTextField.getText();

        String pinCode = pinCodeTextField.getText();

        try {
            if (ae.getSource() == backBtn) {
                System.out.println("Already have an account?");
                this.dispose();
                Login login = new Login();
                login.setVisible(true);
            } else if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else if (fatherName.equals("")) {
                JOptionPane.showMessageDialog(null, "Father's name is required");
            } else if (gender.equals("null")) {
                JOptionPane.showMessageDialog(null, "Please select your gender");
            } else if (mobile.equals("")) {
                JOptionPane.showMessageDialog(null, "Mobile number is required");
            } else if (age.equals("null")) {
                JOptionPane.showMessageDialog(null, "Please enter your age");
            } else if (weight.equals("null")) {
                JOptionPane.showMessageDialog(null, "Please enter your weight");
            } else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter you Address");
            } else if (city.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter you City");
            } else if (state.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter you State");
            } else if (pinCode.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter you Pin Code");
            } else if (ae.getSource() == nextBtn) {
                this.dispose();
                SignupTwo signupTwo = new SignupTwo();
                signupTwo.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
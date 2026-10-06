package gui;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {

        setTitle("Online Quiz Platform - Login");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Heading
        JLabel title = new JLabel("ONLINE QUIZ PLATFORM");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(90, 30, 300, 30);
        panel.add(title);

        // Username
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(70, 100, 100, 25);
        panel.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(170, 100, 200, 25);
        panel.add(usernameField);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(70, 145, 100, 25);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(170, 145, 200, 25);
        panel.add(passwordField);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(170, 200, 100, 35);
        panel.add(loginButton);

        // Button action
        loginButton.addActionListener(e -> {

            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.isEmpty() || password.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter username and password."
                );

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Login successful!"
                );
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
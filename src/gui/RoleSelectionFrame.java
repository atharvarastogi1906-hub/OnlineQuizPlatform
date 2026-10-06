package gui;

import javax.swing.*;
import java.awt.*;

public class RoleSelectionFrame extends JFrame {

    public RoleSelectionFrame() {

        setTitle("Online Quiz Platform - Select Role");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("SELECT YOUR ROLE");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(125, 30, 250, 30);
        panel.add(title);

        JButton adminButton = new JButton("Admin");
        adminButton.setBounds(140, 90, 170, 40);
        panel.add(adminButton);

        JButton creatorButton = new JButton("Quiz Creator");
        creatorButton.setBounds(140, 145, 170, 40);
        panel.add(creatorButton);

        JButton participantButton = new JButton("Participant");
        participantButton.setBounds(140, 200, 170, 40);
        panel.add(participantButton);

        // Admin button
        adminButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Welcome Admin!"
            );
        });

        // Quiz Creator button
        creatorButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Welcome Quiz Creator!"
            );
        });

        // Participant button
        participantButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Welcome Participant!"
            );
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RoleSelectionFrame();
    }
}

package gui;

import data.QuizData;
import gui.LoginFrame;
import gui.QuizFrame;
import model.Quiz;
import javax.swing.*;
import java.awt.*;

public class ParticipantsDashboard extends JFrame {

    public ParticipantsDashboard() {

        setTitle("Participants Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("PARTICIPANTS DASHBOARD");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(160, 30, 350, 40);
        panel.add(title);

        JLabel welcome = new JLabel("Welcome to Online Quiz Platform!");
        welcome.setFont(new Font("Arial", Font.PLAIN, 16));
        welcome.setBounds(180, 85, 300, 30);
        panel.add(welcome);

        JButton startQuizButton = new JButton("Start Quiz");
        startQuizButton.setBounds(200, 140, 200, 45);
        panel.add(startQuizButton);

        JButton resultsButton = new JButton("View Results");
        resultsButton.setBounds(200, 200, 200, 45);
        panel.add(resultsButton);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(200, 260, 200, 40);
        panel.add(logoutButton);

        startQuizButton.addActionListener(e -> {

            model.Quiz quiz = QuizData.createQuiz();

            dispose();

            new QuizFrame(quiz);
        });
        startQuizButton.addActionListener(e -> {

            Quiz quiz = QuizData.createQuiz();

            dispose();

            new QuizFrame(quiz);
        });

        // Results
        resultsButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Your results will appear here."
            );
        });

        // Logout
        logoutButton.addActionListener(e -> {
            dispose();
            new LoginFrame();
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ParticipantsDashboard();
    }
}
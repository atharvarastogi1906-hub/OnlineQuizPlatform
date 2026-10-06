package gui;

import javax.swing.*;
import java.awt.*;

public class ResultFrame extends JFrame {

    public ResultFrame(int score, int totalQuestions) {

        setTitle("Quiz Result");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("QUIZ RESULT");

        title.setFont(
                new Font("Arial", Font.BOLD, 26)
        );

        title.setBounds(160, 40, 250, 40);

        panel.add(title);

        JLabel scoreLabel = new JLabel(
                "Score: " + score +
                        " / " + totalQuestions
        );

        scoreLabel.setFont(
                new Font("Arial", Font.BOLD, 20)
        );

        scoreLabel.setBounds(
                170, 110, 250, 35
        );

        panel.add(scoreLabel);

        double percentage =
                (score * 100.0) / totalQuestions;

        JLabel percentageLabel = new JLabel(
                String.format(
                        "Percentage: %.2f%%",
                        percentage
                )
        );

        percentageLabel.setBounds(
                170, 155, 250, 30
        );

        panel.add(percentageLabel);

        String status;

        if (percentage >= 40) {
            status = "Status: PASSED";
        } else {
            status = "Status: FAILED";
        }

        JLabel statusLabel = new JLabel(status);

        statusLabel.setBounds(
                170, 195, 250, 30
        );

        panel.add(statusLabel);

        JButton closeButton =
                new JButton("Close");

        closeButton.setBounds(
                190, 245, 120, 35
        );

        closeButton.addActionListener(
                e -> dispose()
        );

        panel.add(closeButton);

        add(panel);

        setVisible(true);
    }
}

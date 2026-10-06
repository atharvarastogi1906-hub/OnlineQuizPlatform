package gui;

import model.Question;
import model.Quiz;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class QuizFrame extends JFrame {

    private Quiz quiz;
    private List<Question> questions;

    private int currentQuestion = 0;
    private int score = 0;

    private JLabel questionLabel;
    private JLabel questionNumberLabel;

    private JRadioButton optionA;
    private JRadioButton optionB;
    private JRadioButton optionC;
    private JRadioButton optionD;

    private JButton nextButton;

    private ButtonGroup optionGroup;

    public QuizFrame(Quiz quiz) {

        this.quiz = quiz;
        this.questions = quiz.getQuestions();

        setTitle("Online Quiz - " + quiz.getTitle());
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        questionNumberLabel = new JLabel();

        questionNumberLabel.setBounds(
                50, 30, 200, 30
        );

        questionNumberLabel.setFont(
                new Font("Arial", Font.BOLD, 16)
        );

        panel.add(questionNumberLabel);

        questionLabel = new JLabel();

        questionLabel.setBounds(
                50, 75, 600, 40
        );

        questionLabel.setFont(
                new Font("Arial", Font.BOLD, 18)
        );

        panel.add(questionLabel);

        optionA = new JRadioButton();
        optionB = new JRadioButton();
        optionC = new JRadioButton();
        optionD = new JRadioButton();

        optionA.setBounds(60, 140, 550, 35);
        optionB.setBounds(60, 185, 550, 35);
        optionC.setBounds(60, 230, 550, 35);
        optionD.setBounds(60, 275, 550, 35);

        panel.add(optionA);
        panel.add(optionB);
        panel.add(optionC);
        panel.add(optionD);

        optionGroup = new ButtonGroup();

        optionGroup.add(optionA);
        optionGroup.add(optionB);
        optionGroup.add(optionC);
        optionGroup.add(optionD);

        nextButton = new JButton("Next");

        nextButton.setBounds(
                280, 350, 120, 40
        );

        panel.add(nextButton);

        nextButton.addActionListener(e -> nextQuestion());

        add(panel);

        loadQuestion();

        setVisible(true);
    }

    private void loadQuestion() {

        Question question = questions.get(currentQuestion);

        questionNumberLabel.setText(
                "Question " +
                        (currentQuestion + 1) +
                        " / " +
                        questions.size()
        );

        questionLabel.setText(
                question.getQuestionText()
        );

        optionA.setText(
                "A. " + question.getOptionA()
        );

        optionB.setText(
                "B. " + question.getOptionB()
        );

        optionC.setText(
                "C. " + question.getOptionC()
        );

        optionD.setText(
                "D. " + question.getOptionD()
        );

        optionGroup.clearSelection();

        if (currentQuestion == questions.size() - 1) {

            nextButton.setText("Submit");

        } else {

            nextButton.setText("Next");
        }
    }

    private void nextQuestion() {

        if (!optionA.isSelected()
                && !optionB.isSelected()
                && !optionC.isSelected()
                && !optionD.isSelected()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please select an answer."
            );

            return;
        }

        Question question = questions.get(currentQuestion);

        String selectedAnswer = "";

        if (optionA.isSelected()) {
            selectedAnswer = question.getOptionA();
        }

        if (optionB.isSelected()) {
            selectedAnswer = question.getOptionB();
        }

        if (optionC.isSelected()) {
            selectedAnswer = question.getOptionC();
        }

        if (optionD.isSelected()) {
            selectedAnswer = question.getOptionD();
        }

        if (selectedAnswer.equals(
                question.getCorrectAnswer())) {

            score++;
        }

        if (currentQuestion < questions.size() - 1) {

            currentQuestion++;

            loadQuestion();

        } else {

            showResult();
        }
    }

    private void showResult() {

        dispose();

        new ResultFrame(
                score,
                questions.size()
        );
    }
}
package model;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private int id;
    private String title;
    private int duration;
    private List<Question> questions;

    public Quiz(int id, String title, int duration) {

        this.id = id;
        this.title = title;
        this.duration = duration;

        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
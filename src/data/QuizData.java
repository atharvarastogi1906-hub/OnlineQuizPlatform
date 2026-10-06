package data;
import model.Question;
import model.Quiz;

public class QuizData {

    public static Quiz createQuiz() {

        Quiz quiz = new Quiz(
                1,
                "Java Basics",
                60
        );

        quiz.addQuestion(
                new Question(
                        1,
                        "Which language is used to develop this project?",
                        "Java",
                        "Python",
                        "HTML",
                        "CSS",
                        "Java"
                )
        );

        quiz.addQuestion(
                new Question(
                        2,
                        "Which keyword is used to create a class in Java?",
                        "class",
                        "Class",
                        "create",
                        "newclass",
                        "class"
                )
        );

        quiz.addQuestion(
                new Question(
                        3,
                        "Which concept allows one class to acquire another class properties?",
                        "Polymorphism",
                        "Inheritance",
                        "Encapsulation",
                        "Abstraction",
                        "Inheritance"
                )
        );

        quiz.addQuestion(
                new Question(
                        4,
                        "Which collection does not allow duplicate elements?",
                        "List",
                        "Set",
                        "ArrayList",
                        "Vector",
                        "Set"
                )
        );

        quiz.addQuestion(
                new Question(
                        5,
                        "Which method is the entry point of a Java program?",
                        "start()",
                        "run()",
                        "main()",
                        "execute()",
                        "main()"
                )
        );

        return quiz;
    }
}

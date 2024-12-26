// Question Class
class Question {
    int id;
    String text;
    String answer;

    // Constructor
    Question(int id, String text, String answer) {
        this.id = id;
        this.text = text;
        this.answer = answer;
    }

    // Display Question
    void display() {
        System.out.println("Question " + id + ": " + text);
    }
}

// Candidate Class
class Candidate {
    int id;
    String name;

    // Constructor
    Candidate(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display Candidate
    void display() {
        System.out.println("Candidate " + id + ": " + name);
    }
}

// Exam Class
class Exam {
    String name;
    Candidate candidate;
    Question[] questions;

    // Constructor
    Exam(String name, Candidate candidate, Question[] questions) {
        this.name = name;
        this.candidate = candidate;
        this.questions = questions;
    }

    // Display Exam Details
    void display() {
        System.out.println("Exam: " + name);
        candidate.display();
        for (Question q : questions) {
            q.display();
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create Questions
        Question q1 = new Question(1, "What is 2 + 2?", "4");
        Question q2 = new Question(2, "What is the capital of Kazakhstan?", "Astana");

        // Create Candidate
        Candidate c1 = new Candidate(1, "Aldiyar");

        // Create Exam
        Question[] questions = {q1, q2};
        Exam exam = new Exam("Sample Exam", c1, questions);

        // Display Exam
        exam.display();
    }
}
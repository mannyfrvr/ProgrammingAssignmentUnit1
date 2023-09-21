import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in); //
        int score = 0; // Initialize the score to 0

        // Define the multiple choice questions with answers, with its correct options
        String[] questions = {
                "What is the capital city of Nigeria?",
                "Which of these animals is not a mammal?",
                "What is the chemical symbol for Magnesium?",
                "Which of these musical instruments belongs to the woodwind family?",
                "Which of these planets is the smallest in the solar system?"
        };

        String[] options = {
                "A) Lagos", "B) Abuja", "C) Port Harcourt", "D) Kano",
                "A) Crocodile", "B) Platypus", "C) Kangaroo", "D) Whale",
                "A) Na", "B) Mn", "C) Mg", "D) Ma",
                "A) Violin", "B) Trumpet", "C) Guitar", "D) Flute",
                "A)  Venus", "B) Mercury", "C) Mars", "D) Earth"
        };

        char[] correctOptions = {'B', 'A', 'C', 'D', 'B'};


        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

            switch (i) {
                case 0 -> System.out.println("A) Lagos\nB) Abuja\nC) Port Harcourt\nD) Kano");
                case 1 -> System.out.println("A) Crocodile\nB) Platypus\nC) Kangaroo\nD) Whale");
                case 2 ->
                        System.out.println("A) Na\nB) Mn\nC) Mg\nD) Ma");
                case 3 -> System.out.println("A) Violin\nB) Trumpet\nC) Guitar\nD) Flute");
                case 4 -> System.out.println("A) Venus\nB) Mercury\nC) Mars\nD) Earth");
                default -> System.out.println("Invalid question.");
            }

            System.out.print("Your answer (A, B, C, or D): ");
            char userAnswer = stdin.next().charAt(0);

            // Compare user's answer with the correct answer.
            if (userAnswer == correctOptions[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctOptions[i] + "\n");
            }
        }

        // Calculate and display the final score as a percentage.
        double percentage = (double) score / questions.length * 100;
        System.out.println("Quiz completed! Your score: " + score + "/" + questions.length);
        System.out.println("Percentage: " + percentage + "%");

        // Close the scanner. Best practice
        stdin.close();
    }
}
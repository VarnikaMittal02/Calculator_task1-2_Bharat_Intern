import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.println("Welcome to the Quiz App!");

        // Question 1
        System.out.println("\nQuestion 1: What is the capital of France?");
        System.out.println("a) Paris");
        System.out.println("b) London");
        System.out.println("c) Rome");
        System.out.println("d) Madrid");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();

        if (answer1.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Paris.");
        }

        // Question 2
        System.out.println("\nQuestion 2: Who painted the Mona Lisa?");
        System.out.println("a) Pablo Picasso");
        System.out.println("b) Leonardo da Vinci");
        System.out.println("c) Vincent van Gogh");
        System.out.println("d) Michelangelo");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();

        if (answer2.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Leonardo da Vinci.");
        }

        // Question 3
        System.out.println("\nQuestion 3: What is the largest planet in our solar system?");
        System.out.println("a) Earth");
        System.out.println("b) Jupiter");
        System.out.println("c) Mars");
        System.out.println("d) Saturn");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();

        if (answer3.equalsIgnoreCase("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Jupiter.");
        }

        // Display final score
        System.out.println("\nYour final score is: " + score + " out of 3.");

        scanner.close();
    }
}

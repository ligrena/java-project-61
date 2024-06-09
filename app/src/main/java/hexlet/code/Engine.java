package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final String WRONG_ANSWER =
            "'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!\n";
    public static final String CORRECT_ANSWER = "Correct!";

    public static String getAndSaveUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String answer = scanner.nextLine();
        System.out.printf("Hello, %s!\n", answer);
        return answer;
    }

    public static void answer(String yourAnswer) {
        System.out.printf("Your answer: %s\n", yourAnswer);
    }

    public static void answer(int yourAnswer) {
        System.out.printf("Your answer: %s\n", yourAnswer);
    }

    public static void question(int value) {
        System.out.printf("Question: %s\n", value);
    }

    public static void question(String value) {
        System.out.printf("Question: %s\n", value);
    }
}

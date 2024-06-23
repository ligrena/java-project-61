package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final String WRONG_ANSWER =
            "'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!\n";
    public static final String CORRECT_ANSWER = "Correct!";
    public static final int COUNT_ROUND_GAME = 3;

    public static void startGame(String infoGame, String[][] questionAndAnswer) {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.printf("Hello, %s!\n", userName);
        System.out.println(infoGame);

        for (int i = 0; i < COUNT_ROUND_GAME; i++) {
            System.out.printf("Question: %s\n", questionAndAnswer[i][0]);
            String userAnswer = scanner.nextLine();
            System.out.printf("Your answer: %s\n", userAnswer);

            if (userAnswer.equals(questionAndAnswer[i][1])) {
                System.out.println(CORRECT_ANSWER);
            } else {
                System.out.printf(WRONG_ANSWER, userAnswer, questionAndAnswer[i][1], userName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", userName);
        scanner.close();
    }
}

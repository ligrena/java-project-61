package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeGame {

    private static final String INFO_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";
    private static final int RANDOM = 100;

    public static void primeGame() {
        Random random = new Random();
        int numberQuestions = Engine.COUNT_ROUND_GAME;

        String[][] questionsAndAnswers = new String[numberQuestions][2];

        for (int i = 0; i < numberQuestions; i++) {
            int number = random.nextInt(RANDOM) + 1;
            questionsAndAnswers[i][0] = Integer.toString(number);
            questionsAndAnswers[i][1] = isSimple(number) ? "yes" : "no";
        }
        Engine.startGame(INFO_GAME, questionsAndAnswers);
    }

    private static boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.ceil(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

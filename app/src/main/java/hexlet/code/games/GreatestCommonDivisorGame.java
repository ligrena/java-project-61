package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GreatestCommonDivisorGame {

    private static final String INFO_GAME = "Find the greatest common divisor of given numbers.\n";

    public static void gcdGame() {
        Random random = new Random();
        int numberQuestions = Engine.COUNT_ROUND_GAME;

        String[][] questionsAndAnswers = new String[numberQuestions][2];

        for (int i = 0; i < numberQuestions; i++) {
            int numberA = random.nextInt(100);
            int numberB = random.nextInt(100);
            int gcd = getGCD(numberA, numberB);

            questionsAndAnswers[i][0] = String.format("%s %s", numberA, numberB);
            questionsAndAnswers[i][1] = Integer.toString(gcd);
        }
        Engine.startGame(INFO_GAME, questionsAndAnswers);
    }

    private static int getGCD(int numberA, int numberB) {
        int result = 0;
        int a = Math.max(numberA, numberB);
        int b = Math.min(numberA, numberB);

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }
}

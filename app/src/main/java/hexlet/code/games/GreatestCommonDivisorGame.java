package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GreatestCommonDivisorGame {

    private static final String INFO_GAME = "Find the greatest common divisor of given numbers.\n";
    private static final int RANDOM = 100;

    public static void gcdGame() {
        int numberQuestions = Engine.COUNT_ROUND_GAME;

        String[][] questionsAndAnswers = new String[numberQuestions][2];

        for (int i = 0; i < numberQuestions; i++) {
            int numberA = Utils.getRandomNumber(RANDOM);
            int numberB = Utils.getRandomNumber(RANDOM);
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

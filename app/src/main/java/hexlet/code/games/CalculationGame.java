package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalculationGame {

    private static final String INFO_GAME = "What is the result of the expression?\n";
    private static final int RANDOM = 100;

    public static void calculationGame() {
        int numberQuestions = Engine.COUNT_ROUND_GAME;

        String[][] questionsAndAnswers = new String[numberQuestions][2];

        for (int i = 0; i < numberQuestions; i++) {
            int numberA = Utils.getRandomNumber(RANDOM) + 1;
            int numberB = Utils.getRandomNumber(RANDOM) + 1;
            char[] operations = {'+', '-', '*'};
            char operation = operations[Utils.getRandomNumber(operations.length)];

            questionsAndAnswers[i][0] = String.format("%s %s %s", numberA, operation, numberB);
            questionsAndAnswers[i][1] = Integer.toString(getCalculation(operation, numberA, numberB));
        }
        Engine.startGame(INFO_GAME, questionsAndAnswers);
    }

    private static int getCalculation(char operationSwitch, int numberA, int numberB) {
        switch (operationSwitch) {
            case '+' -> {
                return numberA + numberB;
            }
            case '-' -> {
                return numberA - numberB;
            }
            case '*' -> {
                return numberA * numberB;
            }
            default -> {
                throw new RuntimeException(
                        String.format("Result for operation with %s is not correct", operationSwitch));
            }
        }
    }
}

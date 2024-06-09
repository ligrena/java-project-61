package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculation {

    public static void calculationGame(String userName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?\n");

        Random random = new Random();
        Random randomOperation = new Random();
        int sumAnswer = 0;
        String operationSwitch = "";

        for (int i = 1; i <= 3; i++) {
            int numberA = random.nextInt(100);
            int numberB = random.nextInt(100);
            int operation = randomOperation.nextInt(2);

            switch (operation) {
                case 0 : operationSwitch = "+";
                    int value = numberA + numberB;
                    Engine.question(String.format("%s %s %s", numberA, operationSwitch, numberB));
                    correctOrIncorrect(value, scanner, userName);
                    break;
                case 1 : operationSwitch = "-";
                    value = numberA - numberB;
                    Engine.question(String.format("%s %s %s", numberA, operationSwitch, numberB));
                    correctOrIncorrect(value, scanner, userName);
                    break;
                case 2 : operationSwitch = "*";
                    value = numberA * numberB;
                    Engine.question(String.format("%s %s %s", numberA, operationSwitch, numberB));
                    correctOrIncorrect(value, scanner, userName);
                    break;
                default:
                    break;
            }
        }
        if (sumAnswer == 3) {
            System.out.printf("Congratulations, %s!", userName);
        }
    }

    private static void correctOrIncorrect(int value, Scanner scanner, String userName) {
        int sumAnswer = 0;
        int yourAnswer = scanner.nextInt();
        Engine.answer(yourAnswer);
        if (value == yourAnswer) {
            System.out.println(Engine.CORRECT_ANSWER);
            sumAnswer = sumAnswer + 1;
        } else {
            System.out.printf(Engine.WRONG_ANSWER, yourAnswer, value, userName);
            sumAnswer = sumAnswer - 1;
        }
    }
}

package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {

    private static final String WELCOME_TEXT = "Welcome to the Brain Games!";
    private static final String YOUR_ANSWER = "Your choice:";
    private static final String SELECT_TEXT_GAME = "Please enter the game number and press Enter.";
    private static final String EXIT_COMMAND = "0 - Exit";
    private static final String FIRST_COMMAND = "1 - Greet";
    private static final String FIRST_GAME = "2 - Even";
    private static final String SECOND_GAME = "3 - Calc";
    private static final String THIRD_GAME = "4 - GCD";
    private static final String FOURTH_GAME = "5 - Progression";
    private static final String FIFTH_GAME = "6 - Prime";

    public static void main(String[] args) {
        System.out.println(WELCOME_TEXT);
        selectMenuApp();
        selectGame();
    }

    public static void selectMenuApp() {
        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
                SELECT_TEXT_GAME, FIRST_COMMAND,
                FIRST_GAME, SECOND_GAME, THIRD_GAME, FOURTH_GAME, FIFTH_GAME, EXIT_COMMAND);
    }

    private static void selectGame() {
        Scanner scanner = new Scanner(System.in);
        int selectCommand = scanner.nextInt();
        System.out.printf("%s %s\n", YOUR_ANSWER, selectCommand);

        switch (selectCommand) {
            case 0 -> System.exit(0);
            case 1 -> Cli.getUserName();
            case 2 -> EvenParityGame.evenGame();
            case 3 -> CalculationGame.calculationGame();
            case 4 -> GreatestCommonDivisorGame.gcdGame();
            case 5 -> ArithmeticProgressionGame.arithmeticProgressionGame();
            case 6 -> PrimeGame.primeGame();
            default -> System.out.println("Sorry, number game is not correct");
        }
    }
}

package hexlet.code;

import hexlet.code.games.GreatestCommonDivisorGame;
import hexlet.code.games.EvenParityGame;
import hexlet.code.games.CalculationGame;
import hexlet.code.games.ArithmeticProgressionGame;
import hexlet.code.games.PrimeGame;

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
    private static final int EXIT = 0;
    private static final int FIRST = 1;
    private static final int FIRST_G = 2;
    private static final int SECOND_G = 3;
    private static final int THIRD_G = 4;
    private static final int FOURTH_G = 5;
    private static final int FIFTH_G = 6;

    public static void main(String[] args) {
        System.out.println(WELCOME_TEXT);
        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
                SELECT_TEXT_GAME, FIRST_COMMAND,
                FIRST_GAME, SECOND_GAME, THIRD_GAME, FOURTH_GAME, FIFTH_GAME, EXIT_COMMAND);
        selectGame();
    }

    private static void selectGame() {
        Scanner scanner = new Scanner(System.in);
        int selectCommand = scanner.nextInt();
        System.out.printf("%s %s\n", YOUR_ANSWER, selectCommand);

        switch (selectCommand) {
            case EXIT -> System.exit(0);
            case FIRST -> Cli.getUserName();
            case FIRST_G -> EvenParityGame.evenGame();
            case SECOND_G -> CalculationGame.calculationGame();
            case THIRD_G -> GreatestCommonDivisorGame.gcdGame();
            case FOURTH_G -> ArithmeticProgressionGame.arithmeticProgressionGame();
            case FIFTH_G -> PrimeGame.primeGame();
            default -> System.out.println("Sorry, number game is not correct");
        }
    }
}

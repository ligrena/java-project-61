package hexlet.code;

import hexlet.code.games.Calculation;
import hexlet.code.games.EvenParity;

import java.util.Scanner;

public class App {

    private static final String WELCOME_TEXT = "Welcome to the Brain Games!";
    private static final String YOUR_ANSWER = "Your choice:";
    private static final String SELECT_TEXT_GAME = "Please enter the game number and press Enter.";
    private static final String EXIT_COMMAND = "0 - Exit";
    private static final String FIRST_COMMAND = "1 - Greet";
    private static final String FIRST_GAME = "2 - Even";
    private static final String SECOND_GAME = "3 - Calc";

    public static void main(String[] args) {
        System.out.println(WELCOME_TEXT);
        selectMenuApp();
        selectGame();
    }

    public static void selectMenuApp() {
        System.out.printf("%s\n%s\n%s\n%s\n%s\n",
                SELECT_TEXT_GAME, FIRST_COMMAND, FIRST_GAME, SECOND_GAME, EXIT_COMMAND);
    }

    private static void selectGame() {
        Scanner scanner = new Scanner(System.in);
        int selectCommand = scanner.nextInt();
        System.out.printf("%s %s\n", YOUR_ANSWER, selectCommand);

        switch (selectCommand) {
            case 0:
                break;
            case 1:
                Cli.getUserName();
                break;
            case 2:
                EvenParity.evenGame(Engine.getAndSaveUserName());
                break;
            case 3:
                Calculation.calculationGame(Engine.getAndSaveUserName());
                break;
            default:
                break;
        }
    }
}

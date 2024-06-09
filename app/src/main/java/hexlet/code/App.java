package hexlet.code;

import java.util.Scanner;

public class App {

    private static final String WELCOME_TEXT = "Welcome to the Brain Games!";
    private static final String SELECT_TEXT_GAME = "Please enter the game number and press Enter.";
    private static final String FIRST_COMMAND = "1 - Greet";
    private static final String EXIT_COMMAND = "0 - Exit";
    private static final String FIRST_GAME = "2 - Even";

    private static final String YOUR_ANSWER = "Your choice:";

    public static void main(String[] args) {
        System.out.printf("%s\n%s\n%s\n%s\n",
                SELECT_TEXT_GAME, FIRST_COMMAND, FIRST_GAME, EXIT_COMMAND);
        selectGame();
    }

    private static void selectGame() {
        Scanner scanner = new Scanner(System.in);
        int selectCommand = scanner.nextInt();
        System.out.printf("%s %s\n%n", YOUR_ANSWER, selectCommand);

        switch (selectCommand) {
            case 0:
                break;
            case 1:
                welcomeGame();
                break;
            case 2:
                System.out.println(WELCOME_TEXT);
                String userName = Cli.getAndSaveUserName();
                EvenParity.evenGame(userName);
            default:
                break;
        }
    }

    private static void welcomeGame() {
        System.out.println(WELCOME_TEXT);
        Cli.getUserName();
    }
}

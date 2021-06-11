package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameControl {
    private static int remainingMatches = 20;


    private int playerEnterNumber() {
        int playerEnterNumber = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            playerEnterNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Нужно ввести число!");
        }

        return playerEnterNumber;
    }

    private void playerTern() {
        int i = playerEnterNumber();
        if (i > 0 && i < 4) {
            remainingMatches -= i;
        } else {
            new ConsoleLog().wrongNumberPlayer();
            playerTern();
        }
    }

    private void computerTern() {
        new ConsoleLog().outputComputerRunning(ComputerControl.ComputerRunningControl(remainingMatches));
        remainingMatches -= ComputerControl.ComputerRunningControl(remainingMatches);
    }

    public void gameRun() {
        ConsoleLog consoleLog = new ConsoleLog();
        consoleLog.RulesGame();
        while (remainingMatches >= 5) {
            computerTern();
            consoleLog.displayRemainingOfMatches(remainingMatches);
            consoleLog.EnterPlayerNumber();
            playerTern();
            consoleLog.displayRemainingOfMatches(remainingMatches);
        }
        computerTern();
        consoleLog.displayRemainingOfMatches(remainingMatches);
        consoleLog.stopGame();
    }
}

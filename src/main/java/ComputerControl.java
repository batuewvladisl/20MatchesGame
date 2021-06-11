package main.java;

public class ComputerControl {
    public static int ComputerRunningControl(int remainingNumberOfMatches) {
        int numberOfMatchesByComputer = 0;
        switch (remainingNumberOfMatches) {
            case 20:
            case 16:
            case 12:
            case 8:
            case 4:
                numberOfMatchesByComputer = 3;
                break;
            case 15:
            case 11:
            case 7:
            case 3:
                numberOfMatchesByComputer = 2;
                break;
            case 14:
            case 10:
            case 6:
            case 2:
                numberOfMatchesByComputer = 1;
        }
        return numberOfMatchesByComputer;
    }

}

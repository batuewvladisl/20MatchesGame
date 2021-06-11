package main.java;

public class ConsoleLog {
    public void RulesGame() {
        System.out.println("Начало игры!\n" +
                "В начале игры на столе лежит 20 спичек.\n" +
                "Игроки ходят по очереди, убирая на выбор 1, 2 или 3 спички.\n" +
                "Проигравшим считается тот, кто возьмет со стола последнюю спичку.");
    }

    public void displayRemainingOfMatches(int remainingNumberOfMatches) {
        System.out.println("Спичек осталось: " + remainingNumberOfMatches);
    }

    public void outputComputerRunning(int numberOfMatchesByComputer) {
        System.out.println("Ход компьютера:\n" +
                "Количество спичек выбранное компьютером = " + numberOfMatchesByComputer);
    }

    public void EnterPlayerNumber() {
        System.out.println("Ваш ход! Введите число {1, 2, 3}: ");
    }

    public void wrongNumberPlayer() {
        System.out.println("Вы ввели недопустимое значение! Введите число {1, 2, 3}:");
    }

    public void stopGame() {
        System.out.println("Вы забирайте последнюю спичку и проигрывайте!\n" +
                            "Конец игры.\n");
    }
}

package example;

import example.services.*;

public class Main {

    public static void main(String[] args) {
        IOServices openedConsole = new OpenedConsole(new ConsoleContext());

        openedConsole.out("Введите любое текст:");

        ConsoleService consoleService = new ConsoleServiceImpl(openedConsole);
        consoleService.enteringTextInConsole();
    }
}

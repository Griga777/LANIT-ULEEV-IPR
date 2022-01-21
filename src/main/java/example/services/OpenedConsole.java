package example.services;

import java.io.PrintStream;
import java.util.Scanner;

public class OpenedConsole implements IOServices {
    private final PrintStream out;
    private final Scanner sc;

    public OpenedConsole(ConsoleContext cc) {
        this.out = cc.getOut();
        this.sc = new Scanner(cc.getIn());
    }

    @Override
    public void out(String output) {
        out.println(output);
    }

    @Override
    public String readString() {
        return sc.nextLine();
    }
}

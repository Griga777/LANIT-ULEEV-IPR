package example.services;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OpenedConsoleTest {
    private ByteArrayOutputStream bos;
    private ConsoleContext consoleContext;
    private IOServices ioServices;

    @BeforeEach
    void setUp() {
        System.out.println(Thread.currentThread().getName());

        bos = new ByteArrayOutputStream();
        consoleContext = new ConsoleContext(new PrintStream(bos), System.in);
        ioServices = new OpenedConsole(consoleContext);
    }
}

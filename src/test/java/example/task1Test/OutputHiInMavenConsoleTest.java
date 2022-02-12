package example.task1Test;

import example.task1.OutputHiInMavenConsole;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputHiInMavenConsoleTest {

    @Test
    public void testOutputHi() {
        assertEquals("Привет!", OutputHiInMavenConsole.getOutputHi());
        System.out.println("Привет!");
    }
}

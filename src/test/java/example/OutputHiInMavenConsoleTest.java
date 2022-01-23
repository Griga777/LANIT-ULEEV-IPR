package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputHiInMavenConsoleTest {

    @Test
    public void testOutputHi() {
        assertEquals("Привет!", OutputHiInMavenConsole.getOutputHi());
    }
}

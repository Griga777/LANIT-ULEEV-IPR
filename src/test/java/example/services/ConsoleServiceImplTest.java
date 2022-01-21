package example.services;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InOrder;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class ConsoleServiceImplTest {
    private static final String WORD = "Maven test";
    private static final String OUTPUT_RESULT = "Привет)";

    private InOrder inOrder;
    private IOServices ioServices;
    private ConsoleService consoleService;

    @BeforeEach
    void setUp() {
        ioServices = mock(IOServices.class);
        consoleService = new ConsoleServiceImpl(ioServices);
        inOrder = inOrder(ioServices);
    }

    @DisplayName("привет")
    @Test
    public void OutputResultToConsole() {
        given(ioServices.readString()).willReturn(WORD);
        consoleService.enteringTextInConsole();
        inOrder.verify(ioServices, times(1)).readString();
        inOrder.verify(ioServices, times(1)).out(OUTPUT_RESULT);
    }
}

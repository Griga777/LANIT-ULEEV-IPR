package example.task2Test;

public class ExceptionHandler {
    public static RuntimeException exception(String message, Object... args) {
        return new RuntimeException(String.format(message, args));
    }
}

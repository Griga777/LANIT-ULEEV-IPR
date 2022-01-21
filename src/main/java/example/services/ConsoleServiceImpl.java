package example.services;

public class ConsoleServiceImpl implements ConsoleService {
    private final IOServices ioServices;

    public ConsoleServiceImpl(IOServices ioServices) {
        this.ioServices = ioServices;
    }

    @Override
    public void enteringTextInConsole() {
        String s = ioServices.readString();
        outResult(s);
    }

    private void outResult(String s) {
        ioServices.out("Привет!");
    }
}

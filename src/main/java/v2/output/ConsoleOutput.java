package v2.output;

public class ConsoleOutput implements Output {

    public void write(String message) {
        System.out.println(message);
    }

    public OutputType getType() {
        return OutputType.CONSOLE;
    }
}

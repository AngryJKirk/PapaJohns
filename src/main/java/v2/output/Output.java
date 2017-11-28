package v2.output;

public interface Output {

    void write(String message);

    OutputType getType();
}

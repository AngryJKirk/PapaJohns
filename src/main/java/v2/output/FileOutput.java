package v2.output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Output {

    private final File file;

    public FileOutput(String filename) {
        this.file = new File(filename);
    }

    public void write(String message) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(message);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public OutputType getType() {
        return OutputType.FILE;
    }
}

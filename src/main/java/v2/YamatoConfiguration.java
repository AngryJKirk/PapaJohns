package v2;

import v2.output.OutputType;

public class YamatoConfiguration {

    private final String url;
    private final Power power;
    private final OutputType outputType;

    public YamatoConfiguration(String url, Power power, OutputType outputType) {
        this.url = url;
        this.power = power;
        this.outputType = outputType;
    }

}

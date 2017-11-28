package v2;

public enum Power {

    LOW(0),
    MEDIUM(1),
    HIGH(2),
    DDOS(3);


    private final int power;

    Power(int power) {
        this.power = power;
    }
}

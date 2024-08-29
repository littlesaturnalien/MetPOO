package models;

public class Conversion {
    private int celsius;

    public Conversion() {
    }

    public Conversion(int celsius) {
        this.celsius = celsius;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public int celsiusToFahrenheit() {
        return (int) ((celsius * 9/5) + 32);
    }
}

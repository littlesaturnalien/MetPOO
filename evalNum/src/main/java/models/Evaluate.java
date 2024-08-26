package models;

public class Evaluate {
    private int num;

    public Evaluate() {
    }

    public Evaluate(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String evalEvenOrOddNum() {
        if (this.num % 2 == 0) {
            return "It's an even number.";
        } else {
            return "It's an odd number.";
        }
    }
}

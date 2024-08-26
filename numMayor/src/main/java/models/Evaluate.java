package models;

public class Evaluate {
    int num1;
    int num2;
    int num3;

    public Evaluate() {
    }

    public Evaluate(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getLargestNumber() {
        if ((num1 > num2 && num1 > num3) || (num1 == num2 && num1 > num3) ||
                (num1 == num3 && num1 > num2)) {
            return num1;
        } else if ((num2 > num1 && num2 > num3) || (num2 == num1 && num2 > num3) ||
                (num2 == num3 && num2 > num1)) {
            return num2;
        } else if ((num3 > num1 && num3 > num2) || (num3 == num1 && num3 > num2) ||
                (num3 == num2 && num3 > num1)) {
            return num3;
        } else {
            return 0;
        }
    }
}

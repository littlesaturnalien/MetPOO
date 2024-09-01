package models;

public class Account {
    private String holder;
    private double amount;

    public Account(String holder) {
        this.holder = holder;
    }

    public Account(String holder, double amount) {
        this.holder = holder;
        this.amount = amount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "holder='" + holder + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void addAmount(double amount) {
        if (amount > 0) {
            this.amount += amount;
            System.out.println("Amount added to account: " + this.holder);
            System.out.println("Current amount: $" + getAmount());
        } else {
            System.out.println("Amount not added to account: " + this.holder);
        }
    }

    public void subtractAmount(double amount) {
        this.amount -= amount;
        if (this.amount < 0) {
            this.amount = 0;
        }
        System.out.println("Amount subtracted from account: " + this.holder);
        System.out.println("Current amount: $" + getAmount());
    }
}

package BankAccount;

public class BankAccount {

    private String name;
    private double balance;

    BankAccount (String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    BankAccount (String name) {
        this.name = name;
        this.balance = 0;
    }

    public void setName (String name) {
        this.name = name;
    }


    public void diposit (double amount) {
        double newBalance = balance + amount;
        this.balance = newBalance;
    }

    public void diposit (double amount, double interest) {
        double newBalance = this.balance + (this.balance * (interest/100));
        this.balance = newBalance;
    }

    public void withdraw (double amount) {
        double newBalance = this.balance - amount;
        this.balance = newBalance;
    }

    public void withdraw (double amount, double interest) {
        double newBalance = this.balance - (this.balance * (interest / 100));
        this.balance = newBalance;
    }

    public double getBalance () {

        return balance;
    }

    public String getName () {

        return name;
    }
}

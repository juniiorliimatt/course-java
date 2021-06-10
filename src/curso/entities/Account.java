package curso.entities;

public class Account {
    private final int number;
    private String name;
    private double balance;

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public String withdraw(double value) {
        if (this.balance > (value + 5)) {
            this.balance -= (value + 5);
            return "Saque realizado com sucesso!";
        }
        return "Saldo insuficiente";
    }

    @Override
    public String toString() {
        return "Account " + number +", Holder: " + name + ", Balance: $ " + balance + "\n";
    }
}

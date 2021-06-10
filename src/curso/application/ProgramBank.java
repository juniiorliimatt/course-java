package curso.application;

import curso.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {

        var account = createAccount();

        deposit(account);
        showData(account);

        withdraw(account);
        showData(account);

    }

    public static Account createAccount() {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        var number = sc.nextInt();

        System.out.print("Enter account holder: ");
        var name = sc.nextLine();
        name = sc.nextLine();

        System.out.print("Is there na initial deposit? (y/n)? ");
        var escolha = sc.next();

        var deposit = 0.0;
        if (escolha.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
        }
        var account = new Account(number, name, deposit);

        System.out.println();
        System.out.println("Account data:\n" + account.toString());

        return account;
    }

    public static void deposit(Account account) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);
        System.out.print("Enter a deposit value: ");
        var deposit = sc.nextDouble();
        account.deposit(deposit);
    }

    public static void withdraw(Account account) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);
        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(sc.nextDouble());
    }

    public static void showData(Account account) {
        System.out.println("Updated account data: \n" + account.toString());
    }
}

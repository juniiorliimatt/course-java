package curso.application;

import curso.entities.Account;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProgramBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final var log =Logger.getLogger(ProgramBank.class.getName());
        var sc = new Scanner(System.in);

        log.info("Enter account number: ");
        var number = sc.nextInt();

        log.info("Enter account holder: ");
        sc.nextLine();
        var holder = sc.nextLine();

        log.info("Is there na initial deposit? (y/n)? ");
        var response = sc.next().charAt(0);

        Account ac;
        if (response == 'y') {
            log.info("Enter initial deposit value: ");
            ac = new Account(number, holder, sc.nextDouble());
        } else {
            ac = new Account(number, holder, 0);
        }

        String accountDetail;
        accountDetail = "Account data:\n" + ac;
        log.info( accountDetail);

        log.info("Enter a deposit value: ");
        ac.deposit(sc.nextDouble());
        accountDetail = "Updated account data: \n" + ac;
        log.info(accountDetail);

        log.info("Enter a withdraw value: ");
        ac.withdraw(sc.nextDouble());
        accountDetail = "Updated account data: \n" + ac;
        log.info(accountDetail);

        sc.close();
    }
}

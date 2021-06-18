package curso.application;

import curso.entities.Rent;
import curso.entities.Student;

import java.util.Scanner;

public class ProgramRent {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("\nHow many rooms will be rented? ");
        var roms = sc.nextInt();

        Rent rent;
        var rents = new Rent[11];
        var count = 1;
        while (roms > 0) {
            System.out.println("\nRent #" + count);

            System.out.print("Name: ");
            sc.nextLine();
            var name = sc.nextLine();

            System.out.print("Email: ");
            var email = sc.nextLine();

            var room = 0;
            do {
                System.out.print("Room: ");
                room = sc.nextInt();
            } while (!(room >= 1 && room <= 10));

            rent = new Rent(room, new Student(name, email));

            rents[room] = rent;
            roms--;
            count++;
        }

        System.out.println("\n\nBusy rooms:");
        for (Rent r : rents) {
            if (r != null) {
                System.out.println(r);
            }
        }

        sc.close();
    }
}

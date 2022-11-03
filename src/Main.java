import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.print("Quantos quartos serão alugados?");
        int n = sc.nextInt(); //numero de quartos que serão alugados

        for (int i = 1; i <= n; i++) {
            System.out.println("Alugado: " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            vect[numeroQuarto - 1] = new Rent(name, email);
        }
        System.out.println("Quartos alugados: ");

        for (int i = 0; i <= (vect.length - 1); i++) {
            Rent rent = vect[i];
            if (rent != null)
                System.out.printf("%d: %s, %s %n", (i + 1), rent.getName(), rent.getEmail());
        }
    }

}

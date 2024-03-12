package es1;

import es1.entities.Parole;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di parole: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        Parole word = new Parole();
        word.parole(N, scanner);

        scanner.close();
    }
}

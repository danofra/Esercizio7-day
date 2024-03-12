package es1.entities;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Parole {
    public void parole(int N, Scanner scanner) {
        Set<String> wordSet = new HashSet<>();

        System.out.println("Inserisci le parole:");

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            if (!wordSet.add(word)) {
                System.out.println("Parola duplicata: " + word);
            }
        }

        System.out.println("Numero di parole distinte: " + wordSet.size());
        System.out.println("Elenco delle parole distinte:");
        for (String word : wordSet) {
            System.out.println(word);
        }
    }
}


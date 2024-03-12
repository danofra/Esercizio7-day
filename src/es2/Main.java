package es2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> randomList= new ArrayList<>();
        System.out.print("Inserisci il numero di interi da generare: ");
        int n = scanner.nextInt();
        randomList= generateRandomList(n);
        scanner.nextLine();
        System.out.println("Lista casuale: " + n);
        System.out.println(randomList);
        System.out.println("Lista in ordine inverso: ");
        System.out.println(printListReverse(randomList));
        System.out.println("Inserisci un booleano (true se vuoi i numeri pari, false se vuoi quelli dispari): ");
        boolean even = scanner.nextBoolean();
        scanner.nextLine();
        printEven(even, randomList);
        scanner.close();

    }
    public static ArrayList<Integer> generateRandomList(int n) {
        ArrayList<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randomList.add(random.nextInt(1,100));
        }
        return randomList;
    }

    public static ArrayList<Integer> printListReverse(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            reversedList.add(list.get(i));
        }
        for (int i = list.size(); i > 0  ; i--) {
            reversedList.add(list.get(i - 1));
        }
        return reversedList;

    }

    public static void printEven(boolean even, ArrayList<Integer> list) {
        if (even) {
            System.out.println("Lista pari: ");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(list.get(i));
            } else {
                continue;
            }
        }
    } else {
        System.out.println("Lista dispari: ");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                System.out.println(list.get(i));
            } else {
                continue;
            }
        }
    }
    }

}


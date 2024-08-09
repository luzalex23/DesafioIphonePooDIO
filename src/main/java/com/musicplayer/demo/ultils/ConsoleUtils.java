package com.musicplayer.demo.ultils;

import java.util.Scanner;

public class ConsoleUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int lerInteiro() {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Digite um número inteiro: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String lerString() {
        return scanner.next();
    }
}

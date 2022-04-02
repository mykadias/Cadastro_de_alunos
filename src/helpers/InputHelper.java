package helpers;

import java.util.Scanner;

public class InputHelper {

    public static Integer lerNumeroInteiro(String mensagem) {

        System.out.print(mensagem);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public static String lerTexto(String mensagem) {

        System.out.print(mensagem);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
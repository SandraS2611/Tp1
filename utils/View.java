package utils;

import java.util.Scanner;

/*
 * Patron Singleton
 * Acceso único al manejador de acceso por teclado
 */

public final class View {

    private static Scanner scanner;

    /*
     * Constructor privado
     */
    private View() {
    }

    public static Scanner getSc() {
        if (null == scanner) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
